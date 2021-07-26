package br.com.marvel.model;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * Series
 */
@Validated
@javax.annotation.Generated(value = "br.com.marvel.codegen.languages.SpringCodegen", date = "2021-07-20T00:05:39.997Z")


public class Series   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("resourceURI")
  private String resourceURI = null;

  @JsonProperty("collectionURI")
  private String collectionURI = null;

  public Series name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "FREE COMIC BOOK DAY 2013 1 (2013)", value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Series resourceURI(String resourceURI) {
    this.resourceURI = resourceURI;
    return this;
  }

  /**
   * Get resourceURI
   * @return resourceURI
  **/
  @ApiModelProperty(example = "http://gateway.marvel.com/v1/public/series/17765", value = "")


  public String getResourceURI() {
    return resourceURI;
  }

  public void setResourceURI(String resourceURI) {
    this.resourceURI = resourceURI;
  }

  public Series collectionURI(String collectionURI) {
    this.collectionURI = collectionURI;
    return this;
  }

  /**
   * Get collectionURI
   * @return collectionURI
  **/
  @ApiModelProperty(example = "http://gateway.marvel.com/v1/public/series/17765", value = "")


  public String getCollectionURI() {
    return collectionURI;
  }

  public void setCollectionURI(String collectionURI) {
    this.collectionURI = collectionURI;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Series series = (Series) o;
    return Objects.equals(this.name, series.name) &&
        Objects.equals(this.resourceURI, series.resourceURI) &&
        Objects.equals(this.collectionURI, series.collectionURI);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, resourceURI, collectionURI);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Series {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    resourceURI: ").append(toIndentedString(resourceURI)).append("\n");
    sb.append("    collectionURI: ").append(toIndentedString(collectionURI)).append("\n");
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

