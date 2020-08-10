/*
 * Kadaster - BRK-Kadasterpersonen-Bevragen API
 * Deze API verstrekt informatie over bij het kadaster registreerde personen die (als het goed is) niet zijn geregistreerd in het Handelsregister of de Basisregistratie Personen (inclusief de Registratie Niet Ingezetenen). Het gaat meestal over personen die in het buitenland verblijven of organisaties die in het buitenland gevestigd zijn, en een zakelijk recht hebben op een kadastraal onroerende zaak. Personen in de basisregistratie kadaster worden niet geactualiseerd. De API verstrekt gegevens van personen op het moment van vestiging van het zakelijk recht.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiCallback;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;
import org.openapitools.client.ProgressRequestBody;
import org.openapitools.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.openapitools.client.model.BadRequestFoutbericht;
import org.openapitools.client.model.Foutbericht;
import org.openapitools.client.model.KadasterNatuurlijkPersoonHal;
import org.openapitools.client.model.KadasterNatuurlijkPersoonHalCollectie;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KadasterNatuurlijkPersonenApi {
    private ApiClient localVarApiClient;

    public KadasterNatuurlijkPersonenApi() {
        this(Configuration.getDefaultApiClient());
    }

    public KadasterNatuurlijkPersonenApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for getKadasterPersonen
     * @param q Free query parameter. Dit endpoint evolueert naar free query zoeken. In deze versie kan alleen een combinatie van (het begin van) de geslachtsnaam en geboortedatum [YYYY-mm-dd] worden opgegeven. (required)
     * @param fields Hiermee kun je de inhoud van de resource naar behoefte aanpassen door een door komma&#39;s gescheiden lijst van property namen op te geven. Bij opgave van niet-bestaande properties wordt een 400 Bad Request teruggegeven. Wanneer de fields parameter niet is opgegeven, worden alle properties met een waarde teruggegeven. Zie [functionele specificaties](https://github.com/VNG-Realisatie/Haal-Centraal-common/blob/v1.0.0/features/fields.feature) (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Zoekactie geslaagd </td><td>  * api-version -  <br>  * warning -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 406 </td><td> Not Acceptable </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 410 </td><td> Gone </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  * api-version -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call getKadasterPersonenCall(String q, String fields, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/kadasternatuurlijkpersonen";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (fields != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("fields", fields));
        }

        if (q != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("q", q));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/hal+json", "application/problem+json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "apiKeyAuth" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getKadasterPersonenValidateBeforeCall(String q, String fields, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'q' is set
        if (q == null) {
            throw new ApiException("Missing the required parameter 'q' when calling getKadasterPersonen(Async)");
        }
        

        okhttp3.Call localVarCall = getKadasterPersonenCall(q, fields, _callback);
        return localVarCall;

    }

    /**
     * 
     * Het zoeken van bij het kadaster geregistreerde natuurlijke personen die niet in de basisregistratie personen (BRP) zijn ingeschreven (of wel zijn ingeschreven maar niet zijn _gematched_ bij het inschrijven van de akte). Kadasternatuurlijkpersonen worden niet geactualiseerd. 
     * @param q Free query parameter. Dit endpoint evolueert naar free query zoeken. In deze versie kan alleen een combinatie van (het begin van) de geslachtsnaam en geboortedatum [YYYY-mm-dd] worden opgegeven. (required)
     * @param fields Hiermee kun je de inhoud van de resource naar behoefte aanpassen door een door komma&#39;s gescheiden lijst van property namen op te geven. Bij opgave van niet-bestaande properties wordt een 400 Bad Request teruggegeven. Wanneer de fields parameter niet is opgegeven, worden alle properties met een waarde teruggegeven. Zie [functionele specificaties](https://github.com/VNG-Realisatie/Haal-Centraal-common/blob/v1.0.0/features/fields.feature) (optional)
     * @return KadasterNatuurlijkPersoonHalCollectie
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Zoekactie geslaagd </td><td>  * api-version -  <br>  * warning -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 406 </td><td> Not Acceptable </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 410 </td><td> Gone </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  * api-version -  <br>  </td></tr>
     </table>
     */
    public KadasterNatuurlijkPersoonHalCollectie getKadasterPersonen(String q, String fields) throws ApiException {
        ApiResponse<KadasterNatuurlijkPersoonHalCollectie> localVarResp = getKadasterPersonenWithHttpInfo(q, fields);
        return localVarResp.getData();
    }

    /**
     * 
     * Het zoeken van bij het kadaster geregistreerde natuurlijke personen die niet in de basisregistratie personen (BRP) zijn ingeschreven (of wel zijn ingeschreven maar niet zijn _gematched_ bij het inschrijven van de akte). Kadasternatuurlijkpersonen worden niet geactualiseerd. 
     * @param q Free query parameter. Dit endpoint evolueert naar free query zoeken. In deze versie kan alleen een combinatie van (het begin van) de geslachtsnaam en geboortedatum [YYYY-mm-dd] worden opgegeven. (required)
     * @param fields Hiermee kun je de inhoud van de resource naar behoefte aanpassen door een door komma&#39;s gescheiden lijst van property namen op te geven. Bij opgave van niet-bestaande properties wordt een 400 Bad Request teruggegeven. Wanneer de fields parameter niet is opgegeven, worden alle properties met een waarde teruggegeven. Zie [functionele specificaties](https://github.com/VNG-Realisatie/Haal-Centraal-common/blob/v1.0.0/features/fields.feature) (optional)
     * @return ApiResponse&lt;KadasterNatuurlijkPersoonHalCollectie&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Zoekactie geslaagd </td><td>  * api-version -  <br>  * warning -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 406 </td><td> Not Acceptable </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 410 </td><td> Gone </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  * api-version -  <br>  </td></tr>
     </table>
     */
    public ApiResponse<KadasterNatuurlijkPersoonHalCollectie> getKadasterPersonenWithHttpInfo(String q, String fields) throws ApiException {
        okhttp3.Call localVarCall = getKadasterPersonenValidateBeforeCall(q, fields, null);
        Type localVarReturnType = new TypeToken<KadasterNatuurlijkPersoonHalCollectie>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Het zoeken van bij het kadaster geregistreerde natuurlijke personen die niet in de basisregistratie personen (BRP) zijn ingeschreven (of wel zijn ingeschreven maar niet zijn _gematched_ bij het inschrijven van de akte). Kadasternatuurlijkpersonen worden niet geactualiseerd. 
     * @param q Free query parameter. Dit endpoint evolueert naar free query zoeken. In deze versie kan alleen een combinatie van (het begin van) de geslachtsnaam en geboortedatum [YYYY-mm-dd] worden opgegeven. (required)
     * @param fields Hiermee kun je de inhoud van de resource naar behoefte aanpassen door een door komma&#39;s gescheiden lijst van property namen op te geven. Bij opgave van niet-bestaande properties wordt een 400 Bad Request teruggegeven. Wanneer de fields parameter niet is opgegeven, worden alle properties met een waarde teruggegeven. Zie [functionele specificaties](https://github.com/VNG-Realisatie/Haal-Centraal-common/blob/v1.0.0/features/fields.feature) (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Zoekactie geslaagd </td><td>  * api-version -  <br>  * warning -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 406 </td><td> Not Acceptable </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 410 </td><td> Gone </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  * api-version -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call getKadasterPersonenAsync(String q, String fields, final ApiCallback<KadasterNatuurlijkPersoonHalCollectie> _callback) throws ApiException {

        okhttp3.Call localVarCall = getKadasterPersonenValidateBeforeCall(q, fields, _callback);
        Type localVarReturnType = new TypeToken<KadasterNatuurlijkPersoonHalCollectie>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getKadasterPersoon
     * @param kadasternatuurlijkpersoonidentificatie  (required)
     * @param fields Hiermee kun je de inhoud van de resource naar behoefte aanpassen door een door komma&#39;s gescheiden lijst van property namen op te geven. Bij opgave van niet-bestaande properties wordt een 400 Bad Request teruggegeven. Wanneer de fields parameter niet is opgegeven, worden alle properties met een waarde teruggegeven. Zie [functionele specificaties](https://github.com/VNG-Realisatie/Haal-Centraal-common/blob/v1.0.0/features/fields.feature) (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Zoekactie geslaagd </td><td>  * api-version -  <br>  * warning -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 406 </td><td> Not Acceptable </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 410 </td><td> Gone </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  * api-version -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call getKadasterPersoonCall(String kadasternatuurlijkpersoonidentificatie, String fields, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/kadasternatuurlijkpersonen/{kadasternatuurlijkpersoonidentificatie}"
            .replaceAll("\\{" + "kadasternatuurlijkpersoonidentificatie" + "\\}", localVarApiClient.escapeString(kadasternatuurlijkpersoonidentificatie.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (fields != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("fields", fields));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/hal+json", "application/problem+json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "apiKeyAuth" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getKadasterPersoonValidateBeforeCall(String kadasternatuurlijkpersoonidentificatie, String fields, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'kadasternatuurlijkpersoonidentificatie' is set
        if (kadasternatuurlijkpersoonidentificatie == null) {
            throw new ApiException("Missing the required parameter 'kadasternatuurlijkpersoonidentificatie' when calling getKadasterPersoon(Async)");
        }
        

        okhttp3.Call localVarCall = getKadasterPersoonCall(kadasternatuurlijkpersoonidentificatie, fields, _callback);
        return localVarCall;

    }

    /**
     * 
     * Het raadplegen van een bij het kadaster geregistreerde natuurlijke persoon die niet in de basisregistratie personen (BRP) is ingeschreven (of wel is ingeschreven maar niet is gekoppeld bij het inschrijven van de akte). Kadasternatuurlijkpersonen worden niet geactualiseerd.
     * @param kadasternatuurlijkpersoonidentificatie  (required)
     * @param fields Hiermee kun je de inhoud van de resource naar behoefte aanpassen door een door komma&#39;s gescheiden lijst van property namen op te geven. Bij opgave van niet-bestaande properties wordt een 400 Bad Request teruggegeven. Wanneer de fields parameter niet is opgegeven, worden alle properties met een waarde teruggegeven. Zie [functionele specificaties](https://github.com/VNG-Realisatie/Haal-Centraal-common/blob/v1.0.0/features/fields.feature) (optional)
     * @return KadasterNatuurlijkPersoonHal
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Zoekactie geslaagd </td><td>  * api-version -  <br>  * warning -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 406 </td><td> Not Acceptable </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 410 </td><td> Gone </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  * api-version -  <br>  </td></tr>
     </table>
     */
    public KadasterNatuurlijkPersoonHal getKadasterPersoon(String kadasternatuurlijkpersoonidentificatie, String fields) throws ApiException {
        ApiResponse<KadasterNatuurlijkPersoonHal> localVarResp = getKadasterPersoonWithHttpInfo(kadasternatuurlijkpersoonidentificatie, fields);
        return localVarResp.getData();
    }

    /**
     * 
     * Het raadplegen van een bij het kadaster geregistreerde natuurlijke persoon die niet in de basisregistratie personen (BRP) is ingeschreven (of wel is ingeschreven maar niet is gekoppeld bij het inschrijven van de akte). Kadasternatuurlijkpersonen worden niet geactualiseerd.
     * @param kadasternatuurlijkpersoonidentificatie  (required)
     * @param fields Hiermee kun je de inhoud van de resource naar behoefte aanpassen door een door komma&#39;s gescheiden lijst van property namen op te geven. Bij opgave van niet-bestaande properties wordt een 400 Bad Request teruggegeven. Wanneer de fields parameter niet is opgegeven, worden alle properties met een waarde teruggegeven. Zie [functionele specificaties](https://github.com/VNG-Realisatie/Haal-Centraal-common/blob/v1.0.0/features/fields.feature) (optional)
     * @return ApiResponse&lt;KadasterNatuurlijkPersoonHal&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Zoekactie geslaagd </td><td>  * api-version -  <br>  * warning -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 406 </td><td> Not Acceptable </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 410 </td><td> Gone </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  * api-version -  <br>  </td></tr>
     </table>
     */
    public ApiResponse<KadasterNatuurlijkPersoonHal> getKadasterPersoonWithHttpInfo(String kadasternatuurlijkpersoonidentificatie, String fields) throws ApiException {
        okhttp3.Call localVarCall = getKadasterPersoonValidateBeforeCall(kadasternatuurlijkpersoonidentificatie, fields, null);
        Type localVarReturnType = new TypeToken<KadasterNatuurlijkPersoonHal>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Het raadplegen van een bij het kadaster geregistreerde natuurlijke persoon die niet in de basisregistratie personen (BRP) is ingeschreven (of wel is ingeschreven maar niet is gekoppeld bij het inschrijven van de akte). Kadasternatuurlijkpersonen worden niet geactualiseerd.
     * @param kadasternatuurlijkpersoonidentificatie  (required)
     * @param fields Hiermee kun je de inhoud van de resource naar behoefte aanpassen door een door komma&#39;s gescheiden lijst van property namen op te geven. Bij opgave van niet-bestaande properties wordt een 400 Bad Request teruggegeven. Wanneer de fields parameter niet is opgegeven, worden alle properties met een waarde teruggegeven. Zie [functionele specificaties](https://github.com/VNG-Realisatie/Haal-Centraal-common/blob/v1.0.0/features/fields.feature) (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Zoekactie geslaagd </td><td>  * api-version -  <br>  * warning -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 406 </td><td> Not Acceptable </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 410 </td><td> Gone </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  * api-version -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call getKadasterPersoonAsync(String kadasternatuurlijkpersoonidentificatie, String fields, final ApiCallback<KadasterNatuurlijkPersoonHal> _callback) throws ApiException {

        okhttp3.Call localVarCall = getKadasterPersoonValidateBeforeCall(kadasternatuurlijkpersoonidentificatie, fields, _callback);
        Type localVarReturnType = new TypeToken<KadasterNatuurlijkPersoonHal>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
