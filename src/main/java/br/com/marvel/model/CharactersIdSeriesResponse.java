package br.com.marvel.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * CharactersIdSeriesResponse
 */
@Validated
@javax.annotation.Generated(value = "br.com.marvel.codegen.languages.SpringCodegen", date = "2021-07-20T00:05:39.997Z")


public class CharactersIdSeriesResponse   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("desccription")
  private String desccription = null;

  @JsonProperty("resourceURI")
  private String resourceURI = null;

  @JsonProperty("urls")
  @Valid
  private List<Urls> urls = null;

  @JsonProperty("startYear")
  private Long startYear = null;

  @JsonProperty("endYear")
  private Long endYear = null;

  @JsonProperty("rating")
  private String rating = null;

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

  @JsonProperty("stories")
  private GenericObject stories = null;

  @JsonProperty("comics")
  private GenericObject comics = null;

  @JsonProperty("events")
  private GenericObject events = null;

  @JsonProperty("next")
  private Item next = null;

  @JsonProperty("previous")
  private Item previous = null;

  public CharactersIdSeriesResponse id(Long id) {
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

  public CharactersIdSeriesResponse title(String title) {
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

  public CharactersIdSeriesResponse desccription(String desccription) {
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

  public CharactersIdSeriesResponse resourceURI(String resourceURI) {
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

  public CharactersIdSeriesResponse urls(List<Urls> urls) {
    this.urls = urls;
    return this;
  }

  public CharactersIdSeriesResponse addUrlsItem(Urls urlsItem) {
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

  public CharactersIdSeriesResponse startYear(Long startYear) {
    this.startYear = startYear;
    return this;
  }

  /**
   * Get startYear
   * @return startYear
  **/
  @ApiModelProperty(example = "2013", value = "")


  public Long getStartYear() {
    return startYear;
  }

  public void setStartYear(Long startYear) {
    this.startYear = startYear;
  }

  public CharactersIdSeriesResponse endYear(Long endYear) {
    this.endYear = endYear;
    return this;
  }

  /**
   * Get endYear
   * @return endYear
  **/
  @ApiModelProperty(example = "2013", value = "")


  public Long getEndYear() {
    return endYear;
  }

  public void setEndYear(Long endYear) {
    this.endYear = endYear;
  }

  public CharactersIdSeriesResponse rating(String rating) {
    this.rating = rating;
    return this;
  }

  /**
   * Get rating
   * @return rating
  **/
  @ApiModelProperty(example = "T", value = "")


  public String getRating() {
    return rating;
  }

  public void setRating(String rating) {
    this.rating = rating;
  }

  public CharactersIdSeriesResponse type(String type) {
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

  public CharactersIdSeriesResponse modified(String modified) {
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

  public CharactersIdSeriesResponse thumbnail(Thumbnail thumbnail) {
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

  public CharactersIdSeriesResponse creators(List<GenericObject> creators) {
    this.creators = creators;
    return this;
  }

  public CharactersIdSeriesResponse addCreatorsItem(GenericObject creatorsItem) {
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

  public CharactersIdSeriesResponse characters(List<GenericObject> characters) {
    this.characters = characters;
    return this;
  }

  public CharactersIdSeriesResponse addCharactersItem(GenericObject charactersItem) {
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

  public CharactersIdSeriesResponse stories(GenericObject stories) {
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

  public CharactersIdSeriesResponse comics(GenericObject comics) {
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

  public CharactersIdSeriesResponse events(GenericObject events) {
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

  public CharactersIdSeriesResponse next(Item next) {
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

  public CharactersIdSeriesResponse previous(Item previous) {
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
    CharactersIdSeriesResponse charactersIdSeriesResponse = (CharactersIdSeriesResponse) o;
    return Objects.equals(this.id, charactersIdSeriesResponse.id) &&
        Objects.equals(this.title, charactersIdSeriesResponse.title) &&
        Objects.equals(this.desccription, charactersIdSeriesResponse.desccription) &&
        Objects.equals(this.resourceURI, charactersIdSeriesResponse.resourceURI) &&
        Objects.equals(this.urls, charactersIdSeriesResponse.urls) &&
        Objects.equals(this.startYear, charactersIdSeriesResponse.startYear) &&
        Objects.equals(this.endYear, charactersIdSeriesResponse.endYear) &&
        Objects.equals(this.rating, charactersIdSeriesResponse.rating) &&
        Objects.equals(this.type, charactersIdSeriesResponse.type) &&
        Objects.equals(this.modified, charactersIdSeriesResponse.modified) &&
        Objects.equals(this.thumbnail, charactersIdSeriesResponse.thumbnail) &&
        Objects.equals(this.creators, charactersIdSeriesResponse.creators) &&
        Objects.equals(this.characters, charactersIdSeriesResponse.characters) &&
        Objects.equals(this.stories, charactersIdSeriesResponse.stories) &&
        Objects.equals(this.comics, charactersIdSeriesResponse.comics) &&
        Objects.equals(this.events, charactersIdSeriesResponse.events) &&
        Objects.equals(this.next, charactersIdSeriesResponse.next) &&
        Objects.equals(this.previous, charactersIdSeriesResponse.previous);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, desccription, resourceURI, urls, startYear, endYear, rating, type, modified, thumbnail, creators, characters, stories, comics, events, next, previous);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CharactersIdSeriesResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    desccription: ").append(toIndentedString(desccription)).append("\n");
    sb.append("    resourceURI: ").append(toIndentedString(resourceURI)).append("\n");
    sb.append("    urls: ").append(toIndentedString(urls)).append("\n");
    sb.append("    startYear: ").append(toIndentedString(startYear)).append("\n");
    sb.append("    endYear: ").append(toIndentedString(endYear)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    thumbnail: ").append(toIndentedString(thumbnail)).append("\n");
    sb.append("    creators: ").append(toIndentedString(creators)).append("\n");
    sb.append("    characters: ").append(toIndentedString(characters)).append("\n");
    sb.append("    stories: ").append(toIndentedString(stories)).append("\n");
    sb.append("    comics: ").append(toIndentedString(comics)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
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

