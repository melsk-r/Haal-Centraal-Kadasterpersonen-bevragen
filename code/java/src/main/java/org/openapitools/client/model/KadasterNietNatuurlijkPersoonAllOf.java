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


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.openapitools.client.model.Waardelijst;

/**
 * Een bij het kadaster geregistreerde niet natuurlijke persoon, al dan niet ingeschreven in het handelsregister. Kadasternietnatuurlijkpersonen worden niet geactualiseerd.  Waardelijst in deze component : [beschikkingsbevoegdheid](http://www.kadaster.nl/schemas/waardelijsten/Beschikkingsbevoegdheid/) en [rechtsvorm](http://www.kadaster.nl/schemas/waardelijsten/Rechtsvorm/)
 */
@ApiModel(description = "Een bij het kadaster geregistreerde niet natuurlijke persoon, al dan niet ingeschreven in het handelsregister. Kadasternietnatuurlijkpersonen worden niet geactualiseerd.  Waardelijst in deze component : [beschikkingsbevoegdheid](http://www.kadaster.nl/schemas/waardelijsten/Beschikkingsbevoegdheid/) en [rechtsvorm](http://www.kadaster.nl/schemas/waardelijsten/Rechtsvorm/)")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-08-07T13:57:37.444+02:00[Europe/Amsterdam]")
public class KadasterNietNatuurlijkPersoonAllOf {
  public static final String SERIALIZED_NAME_STATUTAIRE_NAAM = "statutaireNaam";
  @SerializedName(SERIALIZED_NAME_STATUTAIRE_NAAM)
  private String statutaireNaam;

  public static final String SERIALIZED_NAME_STATUTAIRE_ZETEL = "statutaireZetel";
  @SerializedName(SERIALIZED_NAME_STATUTAIRE_ZETEL)
  private String statutaireZetel;

  public static final String SERIALIZED_NAME_RECHTSVORM = "rechtsvorm";
  @SerializedName(SERIALIZED_NAME_RECHTSVORM)
  private Waardelijst rechtsvorm;

  public static final String SERIALIZED_NAME_KVK_NUMMER = "kvkNummer";
  @SerializedName(SERIALIZED_NAME_KVK_NUMMER)
  private String kvkNummer;

  public static final String SERIALIZED_NAME_RSIN = "rsin";
  @SerializedName(SERIALIZED_NAME_RSIN)
  private String rsin;


  public KadasterNietNatuurlijkPersoonAllOf statutaireNaam(String statutaireNaam) {
    
    this.statutaireNaam = statutaireNaam;
    return this;
  }

   /**
   * Get statutaireNaam
   * @return statutaireNaam
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStatutaireNaam() {
    return statutaireNaam;
  }


  public void setStatutaireNaam(String statutaireNaam) {
    this.statutaireNaam = statutaireNaam;
  }


  public KadasterNietNatuurlijkPersoonAllOf statutaireZetel(String statutaireZetel) {
    
    this.statutaireZetel = statutaireZetel;
    return this;
  }

   /**
   * Get statutaireZetel
   * @return statutaireZetel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStatutaireZetel() {
    return statutaireZetel;
  }


  public void setStatutaireZetel(String statutaireZetel) {
    this.statutaireZetel = statutaireZetel;
  }


  public KadasterNietNatuurlijkPersoonAllOf rechtsvorm(Waardelijst rechtsvorm) {
    
    this.rechtsvorm = rechtsvorm;
    return this;
  }

   /**
   * Get rechtsvorm
   * @return rechtsvorm
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Waardelijst getRechtsvorm() {
    return rechtsvorm;
  }


  public void setRechtsvorm(Waardelijst rechtsvorm) {
    this.rechtsvorm = rechtsvorm;
  }


  public KadasterNietNatuurlijkPersoonAllOf kvkNummer(String kvkNummer) {
    
    this.kvkNummer = kvkNummer;
    return this;
  }

   /**
   * Get kvkNummer
   * @return kvkNummer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getKvkNummer() {
    return kvkNummer;
  }


  public void setKvkNummer(String kvkNummer) {
    this.kvkNummer = kvkNummer;
  }


  public KadasterNietNatuurlijkPersoonAllOf rsin(String rsin) {
    
    this.rsin = rsin;
    return this;
  }

   /**
   * Get rsin
   * @return rsin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRsin() {
    return rsin;
  }


  public void setRsin(String rsin) {
    this.rsin = rsin;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KadasterNietNatuurlijkPersoonAllOf kadasterNietNatuurlijkPersoonAllOf = (KadasterNietNatuurlijkPersoonAllOf) o;
    return Objects.equals(this.statutaireNaam, kadasterNietNatuurlijkPersoonAllOf.statutaireNaam) &&
        Objects.equals(this.statutaireZetel, kadasterNietNatuurlijkPersoonAllOf.statutaireZetel) &&
        Objects.equals(this.rechtsvorm, kadasterNietNatuurlijkPersoonAllOf.rechtsvorm) &&
        Objects.equals(this.kvkNummer, kadasterNietNatuurlijkPersoonAllOf.kvkNummer) &&
        Objects.equals(this.rsin, kadasterNietNatuurlijkPersoonAllOf.rsin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statutaireNaam, statutaireZetel, rechtsvorm, kvkNummer, rsin);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KadasterNietNatuurlijkPersoonAllOf {\n");
    sb.append("    statutaireNaam: ").append(toIndentedString(statutaireNaam)).append("\n");
    sb.append("    statutaireZetel: ").append(toIndentedString(statutaireZetel)).append("\n");
    sb.append("    rechtsvorm: ").append(toIndentedString(rechtsvorm)).append("\n");
    sb.append("    kvkNummer: ").append(toIndentedString(kvkNummer)).append("\n");
    sb.append("    rsin: ").append(toIndentedString(rsin)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

