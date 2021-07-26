package br.com.marvel.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * CharactersIdEventsResponse
 */
@Validated
@javax.annotation.Generated(value = "br.com.marvel.codegen.languages.SpringCodegen", date = "2021-07-20T00:05:39.997Z")


public class CharactersIdEventsResponse   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("resourceURI")
  private String resourceURI = null;

  @JsonProperty("urls")
  @Valid
  private List<Urls> urls = null;

  @JsonProperty("modified")
  private String modified = null;

  @JsonProperty("start")
  private String start = null;

  @JsonProperty("end")
  private String end = null;

  @JsonProperty("thumbnail")
  @Valid
  private List<Thumbnail> thumbnail = null;

  @JsonProperty("creators")
  @Valid
  private List<GenericObject> creators = null;

  @JsonProperty("characters")
  @Valid
  private List<GenericObject> characters = null;

  @JsonProperty("stories")
  private GenericObject stories = null;

  @JsonProperty("comics")
  private GenericObject comics = null;

  @JsonProperty("series")
  private GenericObject series = null;

  @JsonProperty("next")
  private Item next = null;

  @JsonProperty("previous")
  private Item previous = null;

  public CharactersIdEventsResponse id(Long id) {
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

  public CharactersIdEventsResponse title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
  **/
  @ApiModelProperty(example = "3-D Man", value = "")


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public CharactersIdEventsResponse description(String description) {
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

  public CharactersIdEventsResponse resourceURI(String resourceURI) {
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

  public CharactersIdEventsResponse urls(List<Urls> urls) {
    this.urls = urls;
    return this;
  }

  public CharactersIdEventsResponse addUrlsItem(Urls urlsItem) {
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

  public CharactersIdEventsResponse modified(String modified) {
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

  public CharactersIdEventsResponse start(String start) {
    this.start = start;
    return this;
  }

  /**
   * Get start
   * @return start
  **/
  @ApiModelProperty(example = "2008-06-02 00:00:00", value = "")


  public String getStart() {
    return start;
  }

  public void setStart(String start) {
    this.start = start;
  }

  public CharactersIdEventsResponse end(String end) {
    this.end = end;
    return this;
  }

  /**
   * Get end
   * @return end
  **/
  @ApiModelProperty(example = "2008-06-02 00:00:00", value = "")


  public String getEnd() {
    return end;
  }

  public void setEnd(String end) {
    this.end = end;
  }

  public CharactersIdEventsResponse thumbnail(List<Thumbnail> thumbnail) {
    this.thumbnail = thumbnail;
    return this;
  }

  public CharactersIdEventsResponse addThumbnailItem(Thumbnail thumbnailItem) {
    if (this.thumbnail == null) {
      this.thumbnail = new ArrayList<Thumbnail>();
    }
    this.thumbnail.add(thumbnailItem);
    return this;
  }

  /**
   * Get thumbnail
   * @return thumbnail
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Thumbnail> getThumbnail() {
    return thumbnail;
  }

  public void setThumbnail(List<Thumbnail> thumbnail) {
    this.thumbnail = thumbnail;
  }

  public CharactersIdEventsResponse creators(List<GenericObject> creators) {
    this.creators = creators;
    return this;
  }

  public CharactersIdEventsResponse addCreatorsItem(GenericObject creatorsItem) {
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

  public CharactersIdEventsResponse characters(List<GenericObject> characters) {
    this.characters = characters;
    return this;
  }

  public CharactersIdEventsResponse addCharactersItem(GenericObject charactersItem) {
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

  public CharactersIdEventsResponse stories(GenericObject stories) {
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

  public CharactersIdEventsResponse comics(GenericObject comics) {
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

  public CharactersIdEventsResponse series(GenericObject series) {
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

  public CharactersIdEventsResponse next(Item next) {
    this.next = next;
    return this;
  }

  /**
   * Get next
   * @return next
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Item getNext() {
    return next;
  }

  public void setNext(Item next) {
    this.next = next;
  }

  public CharactersIdEventsResponse previous(Item previous) {
    this.previous = previous;
    return this;
  }

  /**
   * Get previous
   * @return previous
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Item getPrevious() {
    return previous;
  }

  public void setPrevious(Item previous) {
    this.previous = previous;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CharactersIdEventsResponse charactersIdEventsResponse = (CharactersIdEventsResponse) o;
    return Objects.equals(this.id, charactersIdEventsResponse.id) &&
        Objects.equals(this.title, charactersIdEventsResponse.title) &&
        Objects.equals(this.description, charactersIdEventsResponse.description) &&
        Objects.equals(this.resourceURI, charactersIdEventsResponse.resourceURI) &&
        Objects.equals(this.urls, charactersIdEventsResponse.urls) &&
        Objects.equals(this.modified, charactersIdEventsResponse.modified) &&
        Objects.equals(this.start, charactersIdEventsResponse.start) &&
        Objects.equals(this.end, charactersIdEventsResponse.end) &&
        Objects.equals(this.thumbnail, charactersIdEventsResponse.thumbnail) &&
        Objects.equals(this.creators, charactersIdEventsResponse.creators) &&
        Objects.equals(this.characters, charactersIdEventsResponse.characters) &&
        Objects.equals(this.stories, charactersIdEventsResponse.stories) &&
        Objects.equals(this.comics, charactersIdEventsResponse.comics) &&
        Objects.equals(this.series, charactersIdEventsResponse.series) &&
        Objects.equals(this.next, charactersIdEventsResponse.next) &&
        Objects.equals(this.previous, charactersIdEventsResponse.previous);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, description, resourceURI, urls, modified, start, end, thumbnail, creators, characters, stories, comics, series, next, previous);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CharactersIdEventsResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    resourceURI: ").append(toIndentedString(resourceURI)).append("\n");
    sb.append("    urls: ").append(toIndentedString(urls)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    thumbnail: ").append(toIndentedString(thumbnail)).append("\n");
    sb.append("    creators: ").append(toIndentedString(creators)).append("\n");
    sb.append("    characters: ").append(toIndentedString(characters)).append("\n");
    sb.append("    stories: ").append(toIndentedString(stories)).append("\n");
    sb.append("    comics: ").append(toIndentedString(comics)).append("\n");
    sb.append("    series: ").append(toIndentedString(series)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
    sb.append("    previous: ").append(toIndentedString(previous)).append("\n");
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

