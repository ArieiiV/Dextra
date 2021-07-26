package br.com.marvel.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * GenericObjectEntity
 */
@Validated
@javax.annotation.Generated(value = "br.com.marvel.codegen.languages.SpringCodegen", date = "2021-07-20T00:05:39.997Z")


public class GenericObject   {
  @JsonProperty("available")
  private Integer available = null;

  @JsonProperty("collectionURI")
  private String collectionURI = null;

  @JsonProperty("items")
  @Valid
  private List<Item> items = null;

  @JsonProperty("returned")
  private Integer returned = null;

  public GenericObject available(Integer available) {
    this.available = available;
    return this;
  }

  /**
   * Get available
   * @return available
  **/
  @ApiModelProperty(example = "12", value = "")


  public Integer getAvailable() {
    return available;
  }

  public void setAvailable(Integer available) {
    this.available = available;
  }

  public GenericObject collectionURI(String collectionURI) {
    this.collectionURI = collectionURI;
    return this;
  }

  /**
   * Get collectionURI
   * @return collectionURI
  **/
  @ApiModelProperty(example = "http://gateway.marvel.com/v1/public/characters/1011334/comics", value = "")


  public String getCollectionURI() {
    return collectionURI;
  }

  public void setCollectionURI(String collectionURI) {
    this.collectionURI = collectionURI;
  }

  public GenericObject items(List<Item> items) {
    this.items = items;
    return this;
  }

  public GenericObject addItemsItem(Item itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<Item>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Get items
   * @return items
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Item> getItems() {
    return items;
  }

  public void setItems(List<Item> items) {
    this.items = items;
  }

  public GenericObject returned(Integer returned) {
    this.returned = returned;
    return this;
  }

  /**
   * Get returned
   * @return returned
  **/
  @ApiModelProperty(example = "11", value = "")


  public Integer getReturned() {
    return returned;
  }

  public void setReturned(Integer returned) {
    this.returned = returned;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenericObject genericObject = (GenericObject) o;
    return Objects.equals(this.available, genericObject.available) &&
        Objects.equals(this.collectionURI, genericObject.collectionURI) &&
        Objects.equals(this.items, genericObject.items) &&
        Objects.equals(this.returned, genericObject.returned);
  }

  @Override
  public int hashCode() {
    return Objects.hash(available, collectionURI, items, returned);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenericObjectEntity {\n");
    
    sb.append("    available: ").append(toIndentedString(available)).append("\n");
    sb.append("    collectionURI: ").append(toIndentedString(collectionURI)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    returned: ").append(toIndentedString(returned)).append("\n");
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

