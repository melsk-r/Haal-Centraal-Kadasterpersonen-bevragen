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
import org.openapitools.client.model.Adres;
import org.openapitools.client.model.PostadresAllOf;
import org.openapitools.client.model.Waardelijst;

/**
 * Postadres
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-08-07T13:57:37.444+02:00[Europe/Amsterdam]")
public class Postadres {
  public static final String SERIALIZED_NAME_NUMMERAANDUIDING_IDENTIFICATIE = "nummeraanduidingIdentificatie";
  @SerializedName(SERIALIZED_NAME_NUMMERAANDUIDING_IDENTIFICATIE)
  private String nummeraanduidingIdentificatie;

  public static final String SERIALIZED_NAME_HUISNUMMER = "huisnummer";
  @SerializedName(SERIALIZED_NAME_HUISNUMMER)
  private Integer huisnummer;

  public static final String SERIALIZED_NAME_HUISLETTER = "huisletter";
  @SerializedName(SERIALIZED_NAME_HUISLETTER)
  private String huisletter;

  public static final String SERIALIZED_NAME_HUISNUMMERTOEVOEGING = "huisnummertoevoeging";
  @SerializedName(SERIALIZED_NAME_HUISNUMMERTOEVOEGING)
  private String huisnummertoevoeging;

  public static final String SERIALIZED_NAME_STRAAT = "straat";
  @SerializedName(SERIALIZED_NAME_STRAAT)
  private String straat;

  public static final String SERIALIZED_NAME_POSTCODE = "postcode";
  @SerializedName(SERIALIZED_NAME_POSTCODE)
  private String postcode;

  public static final String SERIALIZED_NAME_WOONPLAATS = "woonplaats";
  @SerializedName(SERIALIZED_NAME_WOONPLAATS)
  private String woonplaats;

  public static final String SERIALIZED_NAME_ADRESREGEL1 = "adresregel1";
  @SerializedName(SERIALIZED_NAME_ADRESREGEL1)
  private String adresregel1;

  public static final String SERIALIZED_NAME_ADRESREGEL2 = "adresregel2";
  @SerializedName(SERIALIZED_NAME_ADRESREGEL2)
  private String adresregel2;

  public static final String SERIALIZED_NAME_ADRESREGEL3 = "adresregel3";
  @SerializedName(SERIALIZED_NAME_ADRESREGEL3)
  private String adresregel3;

  public static final String SERIALIZED_NAME_LAND = "land";
  @SerializedName(SERIALIZED_NAME_LAND)
  private Waardelijst land;

  public static final String SERIALIZED_NAME_POSTBUSNUMMER = "postbusnummer";
  @SerializedName(SERIALIZED_NAME_POSTBUSNUMMER)
  private Integer postbusnummer;


  public Postadres nummeraanduidingIdentificatie(String nummeraanduidingIdentificatie) {
    
    this.nummeraanduidingIdentificatie = nummeraanduidingIdentificatie;
    return this;
  }

   /**
   * identificatie van het adres in het geval dit adres in BAG geregistreerd is.
   * @return nummeraanduidingIdentificatie
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "identificatie van het adres in het geval dit adres in BAG geregistreerd is.")

  public String getNummeraanduidingIdentificatie() {
    return nummeraanduidingIdentificatie;
  }


  public void setNummeraanduidingIdentificatie(String nummeraanduidingIdentificatie) {
    this.nummeraanduidingIdentificatie = nummeraanduidingIdentificatie;
  }


  public Postadres huisnummer(Integer huisnummer) {
    
    this.huisnummer = huisnummer;
    return this;
  }

   /**
   * URI https://bag.basisregistraties.overheid.nl/doc/begrip/Huisnummer
   * @return huisnummer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "URI https://bag.basisregistraties.overheid.nl/doc/begrip/Huisnummer")

  public Integer getHuisnummer() {
    return huisnummer;
  }


  public void setHuisnummer(Integer huisnummer) {
    this.huisnummer = huisnummer;
  }


  public Postadres huisletter(String huisletter) {
    
    this.huisletter = huisletter;
    return this;
  }

   /**
   * URI https://bag.basisregistraties.overheid.nl/doc/begrip/Huisletter
   * @return huisletter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "A", value = "URI https://bag.basisregistraties.overheid.nl/doc/begrip/Huisletter")

  public String getHuisletter() {
    return huisletter;
  }


  public void setHuisletter(String huisletter) {
    this.huisletter = huisletter;
  }


  public Postadres huisnummertoevoeging(String huisnummertoevoeging) {
    
    this.huisnummertoevoeging = huisnummertoevoeging;
    return this;
  }

   /**
   * URI https://bag.basisregistraties.overheid.nl/doc/begrip/Huisnummertoevoeging
   * @return huisnummertoevoeging
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3", value = "URI https://bag.basisregistraties.overheid.nl/doc/begrip/Huisnummertoevoeging")

  public String getHuisnummertoevoeging() {
    return huisnummertoevoeging;
  }


  public void setHuisnummertoevoeging(String huisnummertoevoeging) {
    this.huisnummertoevoeging = huisnummertoevoeging;
  }


  public Postadres straat(String straat) {
    
    this.straat = straat;
    return this;
  }

   /**
   * Get straat
   * @return straat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Laan van de landinrichtingscommissie Duiven-Westervoort", value = "")

  public String getStraat() {
    return straat;
  }


  public void setStraat(String straat) {
    this.straat = straat;
  }


  public Postadres postcode(String postcode) {
    
    this.postcode = postcode;
    return this;
  }

   /**
   * Get postcode
   * @return postcode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1234AA", value = "")

  public String getPostcode() {
    return postcode;
  }


  public void setPostcode(String postcode) {
    this.postcode = postcode;
  }


  public Postadres woonplaats(String woonplaats) {
    
    this.woonplaats = woonplaats;
    return this;
  }

   /**
   * Get woonplaats
   * @return woonplaats
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Nootdorp", value = "")

  public String getWoonplaats() {
    return woonplaats;
  }


  public void setWoonplaats(String woonplaats) {
    this.woonplaats = woonplaats;
  }


  public Postadres adresregel1(String adresregel1) {
    
    this.adresregel1 = adresregel1;
    return this;
  }

   /**
   * Het eerste deel van een adres is een combinatie van de straat en huisnummer.
   * @return adresregel1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Laan van de landinrichtingscommissie Duiven-Westervoort 26A-3", value = "Het eerste deel van een adres is een combinatie van de straat en huisnummer.")

  public String getAdresregel1() {
    return adresregel1;
  }


  public void setAdresregel1(String adresregel1) {
    this.adresregel1 = adresregel1;
  }


  public Postadres adresregel2(String adresregel2) {
    
    this.adresregel2 = adresregel2;
    return this;
  }

   /**
   * Het tweede deel van een adres is een combinatie van woonplaats eventueel in combinatie met de postcode
   * @return adresregel2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1234AA Nootdorp", value = "Het tweede deel van een adres is een combinatie van woonplaats eventueel in combinatie met de postcode")

  public String getAdresregel2() {
    return adresregel2;
  }


  public void setAdresregel2(String adresregel2) {
    this.adresregel2 = adresregel2;
  }


  public Postadres adresregel3(String adresregel3) {
    
    this.adresregel3 = adresregel3;
    return this;
  }

   /**
   * Het derde deel van een adres is optioneel een of meer geografische gebieden van het adres in het buitenland
   * @return adresregel3
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Selangor", value = "Het derde deel van een adres is optioneel een of meer geografische gebieden van het adres in het buitenland")

  public String getAdresregel3() {
    return adresregel3;
  }


  public void setAdresregel3(String adresregel3) {
    this.adresregel3 = adresregel3;
  }


  public Postadres land(Waardelijst land) {
    
    this.land = land;
    return this;
  }

   /**
   * Get land
   * @return land
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Waardelijst getLand() {
    return land;
  }


  public void setLand(Waardelijst land) {
    this.land = land;
  }


  public Postadres postbusnummer(Integer postbusnummer) {
    
    this.postbusnummer = postbusnummer;
    return this;
  }

   /**
   * Get postbusnummer
   * @return postbusnummer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getPostbusnummer() {
    return postbusnummer;
  }


  public void setPostbusnummer(Integer postbusnummer) {
    this.postbusnummer = postbusnummer;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Postadres postadres = (Postadres) o;
    return Objects.equals(this.nummeraanduidingIdentificatie, postadres.nummeraanduidingIdentificatie) &&
        Objects.equals(this.huisnummer, postadres.huisnummer) &&
        Objects.equals(this.huisletter, postadres.huisletter) &&
        Objects.equals(this.huisnummertoevoeging, postadres.huisnummertoevoeging) &&
        Objects.equals(this.straat, postadres.straat) &&
        Objects.equals(this.postcode, postadres.postcode) &&
        Objects.equals(this.woonplaats, postadres.woonplaats) &&
        Objects.equals(this.adresregel1, postadres.adresregel1) &&
        Objects.equals(this.adresregel2, postadres.adresregel2) &&
        Objects.equals(this.adresregel3, postadres.adresregel3) &&
        Objects.equals(this.land, postadres.land) &&
        Objects.equals(this.postbusnummer, postadres.postbusnummer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nummeraanduidingIdentificatie, huisnummer, huisletter, huisnummertoevoeging, straat, postcode, woonplaats, adresregel1, adresregel2, adresregel3, land, postbusnummer);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Postadres {\n");
    sb.append("    nummeraanduidingIdentificatie: ").append(toIndentedString(nummeraanduidingIdentificatie)).append("\n");
    sb.append("    huisnummer: ").append(toIndentedString(huisnummer)).append("\n");
    sb.append("    huisletter: ").append(toIndentedString(huisletter)).append("\n");
    sb.append("    huisnummertoevoeging: ").append(toIndentedString(huisnummertoevoeging)).append("\n");
    sb.append("    straat: ").append(toIndentedString(straat)).append("\n");
    sb.append("    postcode: ").append(toIndentedString(postcode)).append("\n");
    sb.append("    woonplaats: ").append(toIndentedString(woonplaats)).append("\n");
    sb.append("    adresregel1: ").append(toIndentedString(adresregel1)).append("\n");
    sb.append("    adresregel2: ").append(toIndentedString(adresregel2)).append("\n");
    sb.append("    adresregel3: ").append(toIndentedString(adresregel3)).append("\n");
    sb.append("    land: ").append(toIndentedString(land)).append("\n");
    sb.append("    postbusnummer: ").append(toIndentedString(postbusnummer)).append("\n");
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

