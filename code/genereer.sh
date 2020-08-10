#!/bin/bash

# genereerscript BRK Kadasterpersonen bevragen

# met dit script kan vanuit de openapi.yaml de
# resolved specificaties, client SDKs en een postman collectie worden genereerd.
# wanneer als parameter ook de api key is meegegeven, worden ook sheets met
# testgevallen gegenereerd.

# deze is gemaakt en getest op een Mac computer, maar kan en direct of met
# minimale aanpassingen ook op Linux werken. Ik vermoed dat er met een aantal
# kleine aanpassingen ook een Windows variant van gemaakt kan worden.

# precondities:
# swagger-cli (https://www.npmjs.com/package/swagger-cli)
# swagger-codegen (https://swagger.io/tools/swagger-codegen/)
# openapi-generator (https://openapi-generator.tech/docs/usage)
# openapi2postmanv2 (https://www.npmjs.com/package/openapi-to-postmanv2)
# python is geïnstalleerd


source_yaml=../specificatie/openapi.yaml
target_resolved=../specificatie/genereervariant
target_postman=../test/Kadasterpersonen-Bevragen-postman-collection.json
target_testcases=../test/cases

base_path=$( cd "$(dirname "${BASH_SOURCE[0]}")" ; pwd -P )
cd "$base_path"

if swagger-cli validate $source_yaml | tee /dev/stderr | grep -q "is valid"; then
  # Controleer tegen ontwerpregels (style guide)
  python validate_yaml.py "$source_yaml"

  # maak resolved yaml:
  swagger-codegen generate -i "$source_yaml" -l openapi-yaml -o "$target_resolved"
  # maak resolved json:
  swagger-codegen generate -i "$source_yaml" -l openapi -o "$target_resolved"
  # verwijder door codegen toegevoegde dingen die niet nodig zijn:
  rm -R "$target_resolved"/.swagger-codegen
  rm "$target_resolved"/.swagger-codegen-ignore
  rm "$target_resolved"/README.md

  # genereer client SDKs:
  rm -R java
  mkdir java
  #swagger-codegen generate -i "$target_resolved"/openapi.yaml -l java -o java
  npx @openapitools/openapi-generator-cli generate -i "$target_resolved"/openapi.yaml -o java -g java --global-property=modelTests=false,apiTests=false,modelDocs=false,apiDocs=false --additional-properties=dateLibrary=java8,java8=true,optionalProjectFile=false,optionalAssemblyInfo=false

  rm -R csharp-netcore
  mkdir csharp-netcore
  npx @openapitools/openapi-generator-cli generate -i "$target_resolved"/openapi.yaml -o csharp-netcore -g csharp-netcore --global-property=modelTests=false,apiTests=false,modelDocs=false,apiDocs=false --additional-properties=optionalProjectFile=false,optionalAssemblyInfo=false

  rm -R csharp
  mkdir csharp
  npx @openapitools/openapi-generator-cli generate -i "$target_resolved"/openapi.yaml -o csharp -g csharp --global-property=modelTests=false,apiTests=false,modelDocs=false,apiDocs=false --additional-properties=optionalProjectFile=false,optionalAssemblyInfo=false

  rm -R python
  mkdir python
  npx @openapitools/openapi-generator-cli generate -i "$target_resolved"/openapi.yaml -o python -g python --global-property=modelTests=false,apiTests=false,modelDocs=false,apiDocs=false --additional-properties=optionalProjectFile=false,optionalAssemblyInfo=false
  #swagger-codegen generate -i "$target_resolved"/openapi.yaml -l python -o python

  # genereer Postman collectie voor deze API
  openapi2postmanv2 -s "$target_resolved"/openapi.yaml -o "$target_postman" --pretty
fi
