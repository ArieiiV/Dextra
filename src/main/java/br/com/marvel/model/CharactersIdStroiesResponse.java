package br.com.marvel.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * CharactersIdStroiesResponse
 */
@Validated
@javax.annotation.Generated(value = "br.com.marvel.codegen.languages.SpringCodegen", date = "2021-07-20T00:05:39.997Z")


public class CharactersIdStroiesResponse   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("desccription")
  private String desccription = null;

  @JsonProperty("resourceURI")
  private String resourceURI = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("modified")
  private String modified = null;

  @JsonProperty("thumbnail")
  private Thumbnail thumbnail = null;

  @JsonProperty("creators")
  @Valid
  private List<GenericObject> creators = null;

  @JsonProperty("characters")
  @Valid
  private List<GenericObject> characters = null;

  @JsonProperty("series")
  private GenericObject series = null;

  @JsonProperty("comics")
  private GenericObject comics = null;

  @JsonProperty("events")
  private GenericObject events = null;

  @JsonProperty("originalIssue")
  private Item originalIssue = null;

  public CharactersIdStroiesResponse id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "1011334", value = "")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public CharactersIdStroiesResponse title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
  **/
  @ApiModelProperty(example = "FREE COMIC BOOK DAY 2013 1 (2013)", value = "")


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public CharactersIdStroiesResponse desccription(String desccription) {
    this.desccription = desccription;
    return this;
  }

  /**
   * Get desccription
   * @return desccription
  **/
  @ApiModelProperty(example = "", value = "")


  public String getDesccription() {
    return desccription;
  }

  public void setDesccription(String desccription) {
    this.desccription = desccription;
  }

  public CharactersIdStroiesResponse resourceURI(String resourceURI) {
    this.resourceURI = resourceURI;
    return this;
  }

  /**
   * Get resourceURI
   * @return resourceURI
  **/
  @ApiModelProperty(example = "http://gateway.marvel.com/v1/public/comics/21366", value = "")


  public String getResourceURI() {
    return resourceURI;
  }

  public void setResourceURI(String resourceURI) {
    this.resourceURI = resourceURI;
  }

  public CharactersIdStroiesResponse type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(example = "one shot", value = "")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public CharactersIdStroiesResponse modified(String modified) {
    this.modified = modified;
    return this;
  }

  /**
   * Get modified
   * @return modified
  **/
  @ApiModelProperty(example = "2014-04-29T14:18:17-0400", value = "")


  public String getModified() {
    return modified;
  }

  public void setModified(String modified) {
    this.modified = modified;
  }

  public CharactersIdStroiesResponse thumbnail(Thumbnail thumbnail) {
    this.thumbnail = thumbnail;
    return this;
  }

  /**
   * Get thumbnail
   * @return thumbnail
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Thumbnail getThumbnail() {
    return thumbnail;
  }

  public void setThumbnail(Thumbnail thumbnail) {
    this.thumbnail = thumbnail;
  }

  public CharactersIdStroiesResponse creators(List<GenericObject> creators) {
    this.creators = creators;
    return this;
  }

  public CharactersIdStroiesResponse addCreatorsItem(GenericObject creatorsItem) {
    if (this.creators == null) {
      this.creators = new ArrayList<GenericObject>();
    }
    this.creators.add(creatorsItem);
    return this;
  }

  /**
   * Get creators
   * @return creators
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<GenericObject> getCreators() {
    return creators;
  }

  public void setCreators(List<GenericObject> creators) {
    this.creators = creators;
  }

  public CharactersIdStroiesResponse characters(List<GenericObject> characters) {
    this.characters = characters;
    return this;
  }

  public CharactersIdStroiesResponse addCharactersItem(GenericObject charactersItem) {
    if (this.characters == null) {
      this.characters = new ArrayList<GenericObject>();
    }
    this.characters.add(charactersItem);
    return this;
  }

  /**
   * Get characters
   * @return characters
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<GenericObject> getCharacters() {
    return characters;
  }

  public void setCharacters(List<GenericObject> characters) {
    this.characters = characters;
  }

  public CharactersIdStroiesResponse series(GenericObject series) {
    this.series = series;
    return this;
  }

  /**
   * Get series
   * @return series
  **/
  @ApiModelProperty(value = "")

  @Valid

  public GenericObject getSeries() {
    return series;
  }

  public void setSeries(GenericObject series) {
    this.series = series;
  }

  public CharactersIdStroiesResponse comics(GenericObject comics) {
    this.comics = comics;
    return this;
  }

  /**
   * Get comics
   * @return comics
  **/
  @ApiModelProperty(value = "")

  @Valid

  public GenericObject getComics() {
    return comics;
  }

  public void setComics(GenericObject comics) {
    this.comics = comics;
  }

  public CharactersIdStroiesResponse events(GenericObject events) {
    this.events = events;
    return this;
  }

  /**
   * Get events
   * @return events
  **/
  @ApiModelProperty(value = "")

  @Valid

  public GenericObject getEvents() {
    return events;
  }

  public void setEvents(GenericObject events) {
    this.events = events;
  }

  public CharactersIdStroiesResponse originalIssue(Item originalIssue) {
    this.originalIssue = originalIssue;
    return this;
  }

  /**
   * Get originalIssue
   * @return originalIssue
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Item getOriginalIssue() {
    return originalIssue;
  }

  public void setOriginalIssue(Item originalIssue) {
    this.originalIssue = originalIssue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CharactersIdStroiesResponse charactersIdStroiesResponse = (CharactersIdStroiesResponse) o;
    return Objects.equals(this.id, charactersIdStroiesResponse.id) &&
        Objects.equals(this.title, charactersIdStroiesResponse.title) &&
        Objects.equals(this.desccription, charactersIdStroiesResponse.desccription) &&
        Objects.equals(this.resourceURI, charactersIdStroiesResponse.resourceURI) &&
        Objects.equals(this.type, charactersIdStroiesResponse.type) &&
        Objects.equals(this.modified, charactersIdStroiesResponse.modified) &&
        Objects.equals(this.thumbnail, charactersIdStroiesResponse.thumbnail) &&
        Objects.equals(this.creators, charactersIdStroiesResponse.creators) &&
        Objects.equals(this.characters, charactersIdStroiesResponse.characters) &&
        Objects.equals(this.series, charactersIdStroiesResponse.series) &&
        Objects.equals(this.comics, charactersIdStroiesResponse.comics) &&
        Objects.equals(this.events, charactersIdStroiesResponse.events) &&
        Objects.equals(this.originalIssue, charactersIdStroiesResponse.originalIssue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, desccription, resourceURI, type, modified, thumbnail, creators, characters, series, comics, events, originalIssue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CharactersIdStroiesResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    desccription: ").append(toIndentedString(desccription)).append("\n");
    sb.append("    resourceURI: ").append(toIndentedString(resourceURI)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    thumbnail: ").append(toIndentedString(thumbnail)).append("\n");
    sb.append("    creators: ").append(toIndentedString(creators)).append("\n");
    sb.append("    characters: ").append(toIndentedString(characters)).append("\n");
    sb.append("    series: ").append(toIndentedString(series)).append("\n");
    sb.append("    comics: ").append(toIndentedString(comics)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    originalIssue: ").append(toIndentedString(originalIssue)).append("\n");
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

