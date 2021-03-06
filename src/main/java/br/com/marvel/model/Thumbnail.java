package br.com.marvel.model;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * Thumbnail
 */
@Validated
@javax.annotation.Generated(value = "br.com.marvel.codegen.languages.SpringCodegen", date = "2021-07-20T00:05:39.997Z")


public class Thumbnail   {
  @JsonProperty("path")
  private String path = null;

  @JsonProperty("extension")
  private String extension = null;

  public Thumbnail path(String path) {
    this.path = path;
    return this;
  }

  /**
   * Get path
   * @return path
  **/
  @ApiModelProperty(example = "http://i.annihil.us/u/prod/marvel/i/mg/c/e0/535fecbbb9784", value = "")


  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public Thumbnail extension(String extension) {
    this.extension = extension;
    return this;
  }

  /**
   * Get extension
   * @return extension
  **/
  @ApiModelProperty(example = "jpg", value = "")


  public String getExtension() {
    return extension;
  }

  public void setExtension(String extension) {
    this.extension = extension;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Thumbnail thumbnail = (Thumbnail) o;
    return Objects.equals(this.path, thumbnail.path) &&
        Objects.equals(this.extension, thumbnail.extension);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, extension);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Thumbnail {\n");
    
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
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

