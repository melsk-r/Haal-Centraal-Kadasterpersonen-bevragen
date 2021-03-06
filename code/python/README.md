# openapi-client
Deze API verstrekt informatie over bij het kadaster registreerde personen die (als het goed is) niet zijn geregistreerd in het Handelsregister of de Basisregistratie Personen (inclusief de Registratie Niet Ingezetenen). Het gaat meestal over personen die in het buitenland verblijven of organisaties die in het buitenland gevestigd zijn, en een zakelijk recht hebben op een kadastraal onroerende zaak. Personen in de basisregistratie kadaster worden niet geactualiseerd. De API verstrekt gegevens van personen op het moment van vestiging van het zakelijk recht.

This Python package is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: 1.0.0
- Package version: 1.0.0
- Build package: org.openapitools.codegen.languages.PythonClientCodegen
For more information, please visit [https://github.com/VNG-Realisatie/Haal-Centraal-BRK-Bevragen](https://github.com/VNG-Realisatie/Haal-Centraal-BRK-Bevragen)

## Requirements.

Python 2.7 and 3.4+

## Installation & Usage
### pip install

If the python package is hosted on a repository, you can install directly using:

```sh
pip install git+https://github.com/GIT_USER_ID/GIT_REPO_ID.git
```
(you may need to run `pip` with root permission: `sudo pip install git+https://github.com/GIT_USER_ID/GIT_REPO_ID.git`)

Then import the package:
```python
import openapi_client
```

### Setuptools

Install via [Setuptools](http://pypi.python.org/pypi/setuptools).

```sh
python setup.py install --user
```
(or `sudo python setup.py install` to install the package for all users)

Then import the package:
```python
import openapi_client
```

## Getting Started

Please follow the [installation procedure](#installation--usage) and then run the following:

```python
from __future__ import print_function

import time
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://virtserver.swaggerhub.com/VNG-sandbox/Kadasterpersonen-bevragen/1.0.0
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://virtserver.swaggerhub.com/VNG-sandbox/Kadasterpersonen-bevragen/1.0.0"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apiKeyAuth
configuration = openapi_client.Configuration(
    host = "https://virtserver.swaggerhub.com/VNG-sandbox/Kadasterpersonen-bevragen/1.0.0",
    api_key = {
        'X-Api-Key': 'YOUR_API_KEY'
    }
)
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['X-Api-Key'] = 'Bearer'


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.KadasterNatuurlijkPersonenApi(api_client)
    q = 'q_example' # str | Free query parameter. Dit endpoint evolueert naar free query zoeken. In deze versie kan alleen een combinatie van (het begin van) de geslachtsnaam en geboortedatum [YYYY-mm-dd] worden opgegeven.
fields = 'fields_example' # str | Hiermee kun je de inhoud van de resource naar behoefte aanpassen door een door komma's gescheiden lijst van property namen op te geven. Bij opgave van niet-bestaande properties wordt een 400 Bad Request teruggegeven. Wanneer de fields parameter niet is opgegeven, worden alle properties met een waarde teruggegeven. Zie [functionele specificaties](https://github.com/VNG-Realisatie/Haal-Centraal-common/blob/v1.0.0/features/fields.feature) (optional)

    try:
        api_response = api_instance.get_kadaster_personen(q, fields=fields)
        pprint(api_response)
    except ApiException as e:
        print("Exception when calling KadasterNatuurlijkPersonenApi->get_kadaster_personen: %s\n" % e)
    
```

## Documentation for API Endpoints

All URIs are relative to *https://virtserver.swaggerhub.com/VNG-sandbox/Kadasterpersonen-bevragen/1.0.0*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*KadasterNatuurlijkPersonenApi* | [**get_kadaster_personen**](docs/KadasterNatuurlijkPersonenApi.md#get_kadaster_personen) | **GET** /kadasternatuurlijkpersonen | 
*KadasterNatuurlijkPersonenApi* | [**get_kadaster_persoon**](docs/KadasterNatuurlijkPersonenApi.md#get_kadaster_persoon) | **GET** /kadasternatuurlijkpersonen/{kadasternatuurlijkpersoonidentificatie} | 
*KadasterNietNatuurlijkPersonenApi* | [**get_kadaster_niet_natuurlijk_personen**](docs/KadasterNietNatuurlijkPersonenApi.md#get_kadaster_niet_natuurlijk_personen) | **GET** /kadasternietnatuurlijkpersonen | 
*KadasterNietNatuurlijkPersonenApi* | [**get_kadaster_niet_natuurlijk_persoon**](docs/KadasterNietNatuurlijkPersonenApi.md#get_kadaster_niet_natuurlijk_persoon) | **GET** /kadasternietnatuurlijkpersonen/{kadasternietnatuurlijkpersoonidentificatie} | 


## Documentation For Models

 - [Adres](docs/Adres.md)
 - [BadRequestFoutbericht](docs/BadRequestFoutbericht.md)
 - [BadRequestFoutberichtAllOf](docs/BadRequestFoutberichtAllOf.md)
 - [DatumOnvolledig](docs/DatumOnvolledig.md)
 - [Foutbericht](docs/Foutbericht.md)
 - [Geboorte](docs/Geboorte.md)
 - [GeslachtEnum](docs/GeslachtEnum.md)
 - [HalCollectionLinks](docs/HalCollectionLinks.md)
 - [HalLink](docs/HalLink.md)
 - [HeeftPartnerschap](docs/HeeftPartnerschap.md)
 - [InvalidParams](docs/InvalidParams.md)
 - [KadasterNatuurlijkPersoon](docs/KadasterNatuurlijkPersoon.md)
 - [KadasterNatuurlijkPersoonAllOf](docs/KadasterNatuurlijkPersoonAllOf.md)
 - [KadasterNatuurlijkPersoonHal](docs/KadasterNatuurlijkPersoonHal.md)
 - [KadasterNatuurlijkPersoonHalAllOf](docs/KadasterNatuurlijkPersoonHalAllOf.md)
 - [KadasterNatuurlijkPersoonHalCollectie](docs/KadasterNatuurlijkPersoonHalCollectie.md)
 - [KadasterNatuurlijkPersoonHalCollectieEmbedded](docs/KadasterNatuurlijkPersoonHalCollectieEmbedded.md)
 - [KadasterNietNatuurlijkPersoon](docs/KadasterNietNatuurlijkPersoon.md)
 - [KadasterNietNatuurlijkPersoonAllOf](docs/KadasterNietNatuurlijkPersoonAllOf.md)
 - [KadasterNietNatuurlijkPersoonHal](docs/KadasterNietNatuurlijkPersoonHal.md)
 - [KadasterNietNatuurlijkPersoonHalCollectie](docs/KadasterNietNatuurlijkPersoonHalCollectie.md)
 - [KadasterNietNatuurlijkPersoonHalCollectieEmbedded](docs/KadasterNietNatuurlijkPersoonHalCollectieEmbedded.md)
 - [KadasterPersoon](docs/KadasterPersoon.md)
 - [KadasterPersoonAllOf](docs/KadasterPersoonAllOf.md)
 - [KadasterPersoonLinks](docs/KadasterPersoonLinks.md)
 - [Naam](docs/Naam.md)
 - [Overlijden](docs/Overlijden.md)
 - [PersoonBasis](docs/PersoonBasis.md)
 - [Postadres](docs/Postadres.md)
 - [PostadresAllOf](docs/PostadresAllOf.md)
 - [Waardelijst](docs/Waardelijst.md)


## Documentation For Authorization


## apiKeyAuth

- **Type**: API key
- **API key parameter name**: X-Api-Key
- **Location**: HTTP header


## Author




