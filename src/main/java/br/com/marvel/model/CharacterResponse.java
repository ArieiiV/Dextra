package br.com.marvel.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * CharacterResponse
 */
@Validated
@javax.annotation.Generated(value = "br.com.marvel.codegen.languages.SpringCodegen", date = "2021-07-20T00:05:39.997Z")


public class CharacterResponse   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("modified")
  private String modified = null;

  @JsonProperty("thumbnail")
  private Thumbnail thumbnail = null;

  @JsonProperty("resourceURI")
  private String resourceURI = null;

  @JsonProperty("comics")
  private GenericObject comics = null;

  @JsonProperty("series")
  private GenericObject series = null;

  @JsonProperty("stories")
  private GenericObject stories = null;

  @JsonProperty("events")
  private GenericObject events = null;

  @JsonProperty("urls")
  @Valid
  private List<Urls> urls = null;

  public CharacterResponse id(Long id) {
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

  public CharacterResponse name(String name) {
    this.name = name;
    return this;
  } 

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "3-D Man", value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CharacterResponse description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(example = "", value = "")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CharacterResponse modified(String modified) {
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

  public CharacterResponse thumbnail(Thumbnail thumbnail) {
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

  public CharacterResponse resourceURI(String resourceURI) {
    this.resourceURI = resourceURI;
    return this;
  }

  /**
   * Get resourceURI
   * @return resourceURI
  **/
  @ApiModelProperty(example = "http://gateway.marvel.com/v1/public/characters/1011334", value = "")


  public String getResourceURI() {
    return resourceURI;
  }

  public void setResourceURI(String resourceURI) {
    this.resourceURI = resourceURI;
  }

  public CharacterResponse comics(GenericObject comics) {
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

  public CharacterResponse series(GenericObject series) {
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

  public CharacterResponse stories(GenericObject stories) {
    this.stories = stories;
    return this;
  }

  /**
   * Get stories
   * @return stories
  **/
  @ApiModelProperty(value = "")

  @Valid

  public GenericObject getStories() {
    return stories;
  }

  public void setStories(GenericObject stories) {
    this.stories = stories;
  }

  public CharacterResponse events(GenericObject events) {
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

  public CharacterResponse urls(List<Urls> urls) {
    this.urls = urls;
    return this;
  }

  public CharacterResponse addUrlsItem(Urls urlsItem) {
    if (this.urls == null) {
      this.urls = new ArrayList<Urls>();
    }
    this.urls.add(urlsItem);
    return this;
  }

  /**
   * Get urls
   * @return urls
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Urls> getUrls() {
    return urls;
  }

  public void setUrls(List<Urls> urls) {
    this.urls = urls;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CharacterResponse characterResponse = (CharacterResponse) o;
    return Objects.equals(this.id, characterResponse.id) &&
        Objects.equals(this.name, characterResponse.name) &&
        Objects.equals(this.description, characterResponse.description) &&
        Objects.equals(this.modified, characterResponse.modified) &&
        Objects.equals(this.thumbnail, characterResponse.thumbnail) &&
        Objects.equals(this.resourceURI, characterResponse.resourceURI) &&
        Objects.equals(this.comics, characterResponse.comics) &&
        Objects.equals(this.series, characterResponse.series) &&
        Objects.equals(this.stories, characterResponse.stories) &&
        Objects.equals(this.events, characterResponse.events) &&
        Objects.equals(this.urls, characterResponse.urls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, modified, thumbnail, resourceURI, comics, series, stories, events, urls);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CharacterResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    thumbnail: ").append(toIndentedString(thumbnail)).append("\n");
    sb.append("    resourceURI: ").append(toIndentedString(resourceURI)).append("\n");
    sb.append("    comics: ").append(toIndentedString(comics)).append("\n");
    sb.append("    series: ").append(toIndentedString(series)).append("\n");
    sb.append("    stories: ").append(toIndentedString(stories)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    urls: ").append(toIndentedString(urls)).append("\n");
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

