---
layout: page-with-side-nav
title: Getting Started
---
# Getting Started - BRK Bevragen API
De 'BRK Kadasterpersonen Bevragen' API is gespecificeerd met behulp van de OpenAPI Specifications (OAS3).

Om aan te sluiten kun je de volgende stappen doorlopen:
1. [Meld je aan bij het kadaster om toegang te krijgen](#Aanmelden-om-aan-te-sluiten)
2. [Bekijk de functionaliteit en specificaties](#Functionaliteit)
3. [Probeer en test de API](#Probeer-en-test-de-API)
4. [Sluit aan op productie](#Aansluiten-op-productie)

## Aanmelden om aan te sluiten
Meld je aan bij het kadaster om [aan te sluiten en voor toegang tot de testomgeving](https://formulieren.kadaster.nl/aanmelden_brk_bevragen). Je ontvangt dan o.a. een API-key die nodig is voor toegang tot de testomgeving.

## Functionaliteit
U kunt de Open API Specificaties (OAS3) van de API bekijken in [Swagger-formaat](https://petstore.swagger.io/?url=https://raw.githubusercontent.com/VNG-Realisatie/Haal-Centraal-Kadasterpersonen-bevragen/master/specificatie/genereervariant/openapi.yaml).

De (resolved) OAS3 is hier te downloaden:
[openapi.yaml](../specificatie/genereervariant/openapi.yaml).

### Beschikbare resources
De volgende Basis Registratie Kadaster gegevens kunnen opgevraagd worden:
- [Kadaster natuurlijk persoon](#KadasterNatuurlijkPersoon)
- [Kadaster niet-natuurlijk persoon](#KadasterNietNatuurlijkPersoon)

#### KadasterNatuurlijkPersoon
- Opvragen van 1 specifiek kadaster natuurlijk persoon resource o.b.v. een kadasterpersoonidentificatie.
- Opvragen van een collectie kadaster natuurlijkpersoon resources o.b.v. een zoekterm. (Zie feature [zoeken kadasternatuurlijkpersoon](../features/zoeken-kadasternatuurlijkpersoon.feature))

#### KadasterNietNatuurlijkPersoon
- Opvragen van 1 specifiek kadaster nietnatuurlijk persoon resource o.b.v. kadasterpersoonidentificatie.
- Opvragen van een collectie kadaster nietnatuurlijk persoon resources o.b.v. een zoekterm. (Zie feature [zoeken kadasternietnatuurlijkpersoon](../features/zoeken-kadasternietnatuurlijkpersoon.feature))

### Algemeen
Verder zijn er nog een paar algemene functies die gelden voor alle bovenstaande aanvragen:
- Gebruik van de fields parameter om de response te filteren. (Voor werking, zie feature [fields](https://github.com/VNG-Realisatie/Haal-Centraal-common/blob/v1.0.0/features/fields.feature))
- Velden die altijd worden geleverd. (Voor werking, zie feature [levering velden](https://github.com/VNG-Realisatie/Haal-Centraal-BRK-bevragen/blob/master/features/levering-velden.feature))

|Resource                           |Velden                         |
|-----                              |------                         |
|KadasterNatuurlijkPersoon          |identificatie, _links.self |
|KadasterNietNatuurlijkPersoon      |identificatie, _links.self |

- [HAL links](https://tools.ietf.org/html/draft-kelly-json-hal-08), die soms [templated](https://github.com/VNG-Realisatie/Haal-Centraal-common/blob/v1.0.0/features/uri-templating.feature) worden geleverd.

## Probeer en test de API
De werking van de API is het makkelijkst te testen met behulp van [Postman](https://www.getpostman.com/).
De [openapi.yaml](../specificatie/genereervariant/openapi.yaml) kun je importeren als project, waarna de verschillende requests worden ingeladen die deze API ondersteunt.
We hebben al een project voor je gemaakt die je kan gebruiken: [BRK-Bevragen-postman-collection.json](../test/Kadasterpersonen-Bevragen-postman-collection.json). Hierin moet je alleen de endpoints en authenticatie (API-key) nog invullen.

### URLs
De testomgeving van de API is te benaderen via de volgende urls:
- _Beveiligde verbinding met alleen API-key: https://api.brk.kadaster.nl/esd-eto-apikey/bevragen/v1/_
    - Voor deze connectie met de testomgeving van deze API is vereist:
        - Een geldige API-key. Deze wordt bij de request opgenomen in request header "X-Api-Key". Wanneer je je aanmeldt voor het gebruiken van de API ontvang je de API-key.

- _Beveiligde verbinding met API-key & mTLS: https://api.brk.kadaster.nl/esd-eto/bevragen/v1/_
    - Voor deze connectie met de testomgeving van deze API is vereist:
        - Een geldige API-key. Deze wordt bij de request opgenomen in request header "X-Api-Key". Wanneer je je aanmeldt voor het gebruiken van de API ontvang je de API-key.
        - Internet toegang tot het Kadaster endpoint via IPv4 of IPv6 en met het TLS 1.2 protocol.
        - Een Staat der Nederlanden root CA - G3 certificaat in de truststore, zie hiervoor: https://www.pkioverheid.nl/
        - Een geldig PKIoverheid client certificaat met SERIALNUMMER=<eigen-OIN-nummer> in de keystore dat deel uitmaakt van de Staat der Nederlanden - G3 hiërarchie,
zie hiervoor: https://www.logius.nl/diensten/pkioverheid
        - Een mutual TLS endpoint configuratie, waarbij de TLS verbinding met het Kadaster alleen tot stand mag en kan komen als er bij het opzetten van de verbinding een wederzijds vertrouwen op basis van de PKIoverheid certificaten hiërarchie bestaat.

### Testgevallen
Onderstaande tabellen bevatten testgevallen voor specifieke situaties waarmee de werking van de API kan worden getest op de test omgeving.

#### Natuurlijke Personen
Naam                    |Geboortedatum    |Type                                 |KadasterPersoonIdentificatie   | Burgerservicenummer |Bijzonderheden        |
----------------        |:-------         |:------                              |:------                        |:------              |:------              |
Willem Jansens          |1971-11-01       |Kadaster Natuurlijk Persoon          |70882239      |                     |<ul><li>alle velden gevuld</li><li>woonadres is niet bekend in BAG</li></ul> |
Sidonia Jansens         |1950-01-01       |Kadaster Natuurlijk Persoon          |50550743      |                     |<ul><li>buitenlands woonadres</li></ul> |
Christaan Goede         |1971-11-01       |Kadaster Natuurlijk Persoon          |71303564      |                     |<ul><li>woonadres is wel bekend in BAG</li></ul> |
Linda Haglund           |                 |Ingeschreven Natuurlijk Persoon      |                               |999991905            ||
Lisanty do Livramento...|                 |Ingeschreven Natuurlijk Persoon      |                               |999990482            ||
Merel Kooyman           |                 |Ingeschreven Natuurlijk Persoon      |                               |999993847            ||
Suzanne van der Stappen |                 |Ingeschreven Natuurlijk Persoon      |                               |999993653            ||
Mirjam Heijn            |                 |Ingeschreven Natuurlijk Persoon      |                               |999991292            ||
Jael de Jager           |                 |Ingeschreven Natuurlijk Persoon      |                               |999992740            ||
Wladyslaw Kwasniewski   |                 |Ingeschreven Natuurlijk Persoon      |                               |999995017            ||
Żáïŀëñøŕ Åłéèç Ðëļŧå Streeveld   |        |Ingeschreven Natuurlijk Persoon      |                               |999994669            ||
Adrianus Hendrikus Holthuizen  |          |Ingeschreven Natuurlijk Persoon      |                               |999990421            ||
Peter-Jan Meijden  |                      |Ingeschreven Natuurlijk Persoon      |                               |999993872            ||
Paul Man          |                       |Ingeschreven Natuurlijk Persoon      |                               |999990883            ||

#### Niet Natuurlijke Personen
Statutaire Naam         |Zetel        |Type                                 |KadasterPersoonIdentificatie   |Bijzonderheden |
----------------        |:------      |:------                              |:------                        |:------        |
Bankbedrijf             |ROTTERDAM    |Kadaster Niet Natuurlijk Persoon     |71291440      |<ul><li>postadres is postbus</li></ul> |
Bankbedrijf van vrucht  |GRAVE        |Ingeschreven Niet Natuurlijk Persoon |71291493      |<ul><li>heeft niks op naam</li></ul>  |
Gasunie Test BV         |GRONINGEN    |Ingeschreven Niet Natuurlijk Persoon |440650207     |  |
Gemeente Den Testland   |'S-GRAVENHAGE    |Kadaster Niet Natuurlijk Persoon |71291441     |<ul><li>kan niet op gezocht worden via /kadasternietnatuurlijkpersonen?q=</li></ul> |
Woningstichting Den Testland |'S-GRAVENHAGE    |Kadaster Niet Natuurlijk Persoon |71291442     |<ul><li>kan niet op gezocht worden /kadasternietnatuurlijkpersonen?q=</li></ul>  |


## Aansluiten op productie
Voor de connectie met de productieomgeving van deze API is vereist:
- Een geldige API-key. Deze wordt bij de request opgenomen in request header "X-Api-Key". Wanneer je je aanmeldt voor het gebruiken van de API ontvang je de API-key.
- Internet toegang tot het Kadaster endpoint via IPv4 of IPv6 en met het TLS 1.2 protocol.
- Een Staat der Nederlanden root CA - G3 certificaat in de truststore, zie hiervoor: https://www.pkioverheid.nl/
- Een geldig PKIoverheid client certificaat met SERIALNUMMER=<eigen-OIN-nummer> in de keystore dat deel uitmaakt van de Staat der Nederlanden - G3 hiërarchie,
zie hiervoor: https://www.logius.nl/diensten/pkioverheid
- Een mutual TLS endpoint configuratie, waarbij de TLS verbinding met het Kadaster alleen tot stand mag en kan komen als er bij het opzetten van de verbinding een wederzijds vertrouwen op basis van de PKIoverheid certificaten hiërarchie bestaat.

### URL
De productieomgeving van de API is te benaderen via de volgende url: https://api.brk.kadaster.nl/esd/bevragen/v1/
