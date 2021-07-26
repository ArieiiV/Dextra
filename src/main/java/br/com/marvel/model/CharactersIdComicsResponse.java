package br.com.marvel.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * CharactersIdComicsResponse
 */
@Validated
@javax.annotation.Generated(value = "br.com.marvel.codegen.languages.SpringCodegen", date = "2021-07-20T00:05:39.997Z")


public class CharactersIdComicsResponse   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("digitalId")
  private Long digitalId = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("issueNumber")
  private Long issueNumber = null;

  @JsonProperty("variantDescription")
  private String variantDescription = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("modified")
  private String modified = null;

  @JsonProperty("isbn")
  private String isbn = null;

  @JsonProperty("upc")
  private String upc = null;

  @JsonProperty("diamondCode")
  private String diamondCode = null;

  @JsonProperty("ean")
  private String ean = null;

  @JsonProperty("issn")
  private String issn = null;

  @JsonProperty("format")
  private String format = null;

  @JsonProperty("pageCount")
  private Long pageCount = null;

  @JsonProperty("textObjects")
  @Valid
  private List<TextObjects> textObjects = null;

  @JsonProperty("resourceURI")
  private String resourceURI = null;

  @JsonProperty("urls")
  @Valid
  private List<Urls> urls = null;

  @JsonProperty("series")
  private Series series = null;

  @JsonProperty("variants")
  @Valid
  private List<String> variants = null;

  @JsonProperty("collections")
  @Valid
  private List<String> collections = null;

  @JsonProperty("collectedIssues")
  @Valid
  private List<String> collectedIssues = null;

  @JsonProperty("dates")
  @Valid
  private List<Dates> dates = null;

  @JsonProperty("prices")
  @Valid
  private List<Prices> prices = null;

  @JsonProperty("images")
  @Valid
  private List<Thumbnail> images = null;

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

  @JsonProperty("events")
  private GenericObject events = null;

  public CharactersIdComicsResponse id(Long id) {
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

  public CharactersIdComicsResponse digitalId(Long digitalId) {
    this.digitalId = digitalId;
    return this;
  }

  /**
   * Get digitalId
   * @return digitalId
  **/
  @ApiModelProperty(example = "1011334", value = "")


  public Long getDigitalId() {
    return digitalId;
  }

  public void setDigitalId(Long digitalId) {
    this.digitalId = digitalId;
  }

  public CharactersIdComicsResponse title(String title) {
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

  public CharactersIdComicsResponse issueNumber(Long issueNumber) {
    this.issueNumber = issueNumber;
    return this;
  }

  /**
   * Get issueNumber
   * @return issueNumber
  **/
  @ApiModelProperty(example = "1", value = "")


  public Long getIssueNumber() {
    return issueNumber;
  }

  public void setIssueNumber(Long issueNumber) {
    this.issueNumber = issueNumber;
  }

  public CharactersIdComicsResponse variantDescription(String variantDescription) {
    this.variantDescription = variantDescription;
    return this;
  }

  /**
   * Get variantDescription
   * @return variantDescription
  **/
  @ApiModelProperty(example = "", value = "")


  public String getVariantDescription() {
    return variantDescription;
  }

  public void setVariantDescription(String variantDescription) {
    this.variantDescription = variantDescription;
  }

  public CharactersIdComicsResponse description(String description) {
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

  public CharactersIdComicsResponse modified(String modified) {
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

  public CharactersIdComicsResponse isbn(String isbn) {
    this.isbn = isbn;
    return this;
  }

  /**
   * Get isbn
   * @return isbn
  **/
  @ApiModelProperty(example = "", value = "")


  public String getIsbn() {
    return isbn;
  }

  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

  public CharactersIdComicsResponse upc(String upc) {
    this.upc = upc;
    return this;
  }

  /**
   * Get upc
   * @return upc
  **/
  @ApiModelProperty(example = "75960607889900111", value = "")


  public String getUpc() {
    return upc;
  }

  public void setUpc(String upc) {
    this.upc = upc;
  }

  public CharactersIdComicsResponse diamondCode(String diamondCode) {
    this.diamondCode = diamondCode;
    return this;
  }

  /**
   * Get diamondCode
   * @return diamondCode
  **/
  @ApiModelProperty(example = "", value = "")


  public String getDiamondCode() {
    return diamondCode;
  }

  public void setDiamondCode(String diamondCode) {
    this.diamondCode = diamondCode;
  }

  public CharactersIdComicsResponse ean(String ean) {
    this.ean = ean;
    return this;
  }

  /**
   * Get ean
   * @return ean
  **/
  @ApiModelProperty(example = "", value = "")


  public String getEan() {
    return ean;
  }

  public void setEan(String ean) {
    this.ean = ean;
  }

  public CharactersIdComicsResponse issn(String issn) {
    this.issn = issn;
    return this;
  }

  /**
   * Get issn
   * @return issn
  **/
  @ApiModelProperty(example = "", value = "")


  public String getIssn() {
    return issn;
  }

  public void setIssn(String issn) {
    this.issn = issn;
  }

  public CharactersIdComicsResponse format(String format) {
    this.format = format;
    return this;
  }

  /**
   * Get format
   * @return format
  **/
  @ApiModelProperty(example = "Comic", value = "")


  public String getFormat() {
    return format;
  }

  public void setFormat(String format) {
    this.format = format;
  }

  public CharactersIdComicsResponse pageCount(Long pageCount) {
    this.pageCount = pageCount;
    return this;
  }

  /**
   * Get pageCount
   * @return pageCount
  **/
  @ApiModelProperty(example = "32", value = "")


  public Long getPageCount() {
    return pageCount;
  }

  public void setPageCount(Long pageCount) {
    this.pageCount = pageCount;
  }

  public CharactersIdComicsResponse textObjects(List<TextObjects> textObjects) {
    this.textObjects = textObjects;
    return this;
  }

  public CharactersIdComicsResponse addTextObjectsItem(TextObjects textObjectsItem) {
    if (this.textObjects == null) {
      this.textObjects = new ArrayList<TextObjects>();
    }
    this.textObjects.add(textObjectsItem);
    return this;
  }

  /**
   * Get textObjects
   * @return textObjects
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<TextObjects> getTextObjects() {
    return textObjects;
  }

  public void setTextObjects(List<TextObjects> textObjects) {
    this.textObjects = textObjects;
  }

  public CharactersIdComicsResponse resourceURI(String resourceURI) {
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

  public CharactersIdComicsResponse urls(List<Urls> urls) {
    this.urls = urls;
    return this;
  }

  public CharactersIdComicsResponse addUrlsItem(Urls urlsItem) {
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

  public CharactersIdComicsResponse series(Series series) {
    this.series = series;
    return this;
  }

  /**
   * Get series
   * @return series
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Series getSeries() {
    return series;
  }

  public void setSeries(Series series) {
    this.series = series;
  }

  public CharactersIdComicsResponse variants(List<String> variants) {
    this.variants = variants;
    return this;
  }

  public CharactersIdComicsResponse addVariantsItem(String variantsItem) {
    if (this.variants == null) {
      this.variants = new ArrayList<String>();
    }
    this.variants.add(variantsItem);
    return this;
  }

  /**
   * Get variants
   * @return variants
  **/
  @ApiModelProperty(value = "")


  public List<String> getVariants() {
    return variants;
  }

  public void setVariants(List<String> variants) {
    this.variants = variants;
  }

  public CharactersIdComicsResponse collections(List<String> collections) {
    this.collections = collections;
    return this;
  }

  public CharactersIdComicsResponse addCollectionsItem(String collectionsItem) {
    if (this.collections == null) {
      this.collections = new ArrayList<String>();
    }
    this.collections.add(collectionsItem);
    return this;
  }

  /**
   * Get collections
   * @return collections
  **/
  @ApiModelProperty(value = "")


  public List<String> getCollections() {
    return collections;
  }

  public void setCollections(List<String> collections) {
    this.collections = collections;
  }

  public CharactersIdComicsResponse collectedIssues(List<String> collectedIssues) {
    this.collectedIssues = collectedIssues;
    return this;
  }

  public CharactersIdComicsResponse addCollectedIssuesItem(String collectedIssuesItem) {
    if (this.collectedIssues == null) {
      this.collectedIssues = new ArrayList<String>();
    }
    this.collectedIssues.add(collectedIssuesItem);
    return this;
  }

  /**
   * Get collectedIssues
   * @return collectedIssues
  **/
  @ApiModelProperty(value = "")


  public List<String> getCollectedIssues() {
    return collectedIssues;
  }

  public void setCollectedIssues(List<String> collectedIssues) {
    this.collectedIssues = collectedIssues;
  }

  public CharactersIdComicsResponse dates(List<Dates> dates) {
    this.dates = dates;
    return this;
  }

  public CharactersIdComicsResponse addDatesItem(Dates datesItem) {
    if (this.dates == null) {
      this.dates = new ArrayList<Dates>();
    }
    this.dates.add(datesItem);
    return this;
  }

  /**
   * Get dates
   * @return dates
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Dates> getDates() {
    return dates;
  }

  public void setDates(List<Dates> dates) {
    this.dates = dates;
  }

  public CharactersIdComicsResponse prices(List<Prices> prices) {
    this.prices = prices;
    return this;
  }

  public CharactersIdComicsResponse addPricesItem(Prices pricesItem) {
    if (this.prices == null) {
      this.prices = new ArrayList<Prices>();
    }
    this.prices.add(pricesItem);
    return this;
  }

  /**
   * Get prices
   * @return prices
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Prices> getPrices() {
    return prices;
  }

  public void setPrices(List<Prices> prices) {
    this.prices = prices;
  }

  public CharactersIdComicsResponse images(List<Thumbnail> images) {
    this.images = images;
    return this;
  }

  public CharactersIdComicsResponse addImagesItem(Thumbnail imagesItem) {
    if (this.images == null) {
      this.images = new ArrayList<Thumbnail>();
    }
    this.images.add(imagesItem);
    return this;
  }

  /**
   * Get images
   * @return images
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Thumbnail> getImages() {
    return images;
  }

  public void setImages(List<Thumbnail> images) {
    this.images = images;
  }

  public CharactersIdComicsResponse thumbnail(List<Thumbnail> thumbnail) {
    this.thumbnail = thumbnail;
    return this;
  }

  public CharactersIdComicsResponse addThumbnailItem(Thumbnail thumbnailItem) {
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

  public CharactersIdComicsResponse creators(List<GenericObject> creators) {
    this.creators = creators;
    return this;
  }

  public CharactersIdComicsResponse addCreatorsItem(GenericObject creatorsItem) {
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

  public CharactersIdComicsResponse characters(List<GenericObject> characters) {
    this.characters = characters;
    return this;
  }

  public CharactersIdComicsResponse addCharactersItem(GenericObject charactersItem) {
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

  public CharactersIdComicsResponse stories(GenericObject stories) {
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

  public CharactersIdComicsResponse events(GenericObject events) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CharactersIdComicsResponse charactersIdComicsResponse = (CharactersIdComicsResponse) o;
    return Objects.equals(this.id, charactersIdComicsResponse.id) &&
        Objects.equals(this.digitalId, charactersIdComicsResponse.digitalId) &&
        Objects.equals(this.title, charactersIdComicsResponse.title) &&
        Objects.equals(this.issueNumber, charactersIdComicsResponse.issueNumber) &&
        Objects.equals(this.variantDescription, charactersIdComicsResponse.variantDescription) &&
        Objects.equals(this.description, charactersIdComicsResponse.description) &&
        Objects.equals(this.modified, charactersIdComicsResponse.modified) &&
        Objects.equals(this.isbn, charactersIdComicsResponse.isbn) &&
        Objects.equals(this.upc, charactersIdComicsResponse.upc) &&
        Objects.equals(this.diamondCode, charactersIdComicsResponse.diamondCode) &&
        Objects.equals(this.ean, charactersIdComicsResponse.ean) &&
        Objects.equals(this.issn, charactersIdComicsResponse.issn) &&
        Objects.equals(this.format, charactersIdComicsResponse.format) &&
        Objects.equals(this.pageCount, charactersIdComicsResponse.pageCount) &&
        Objects.equals(this.textObjects, charactersIdComicsResponse.textObjects) &&
        Objects.equals(this.resourceURI, charactersIdComicsResponse.resourceURI) &&
        Objects.equals(this.urls, charactersIdComicsResponse.urls) &&
        Objects.equals(this.series, charactersIdComicsResponse.series) &&
        Objects.equals(this.variants, charactersIdComicsResponse.variants) &&
        Objects.equals(this.collections, charactersIdComicsResponse.collections) &&
        Objects.equals(this.collectedIssues, charactersIdComicsResponse.collectedIssues) &&
        Objects.equals(this.dates, charactersIdComicsResponse.dates) &&
        Objects.equals(this.prices, charactersIdComicsResponse.prices) &&
        Objects.equals(this.images, charactersIdComicsResponse.images) &&
        Objects.equals(this.thumbnail, charactersIdComicsResponse.thumbnail) &&
        Objects.equals(this.creators, charactersIdComicsResponse.creators) &&
        Objects.equals(this.characters, charactersIdComicsResponse.characters) &&
        Objects.equals(this.stories, charactersIdComicsResponse.stories) &&
        Objects.equals(this.events, charactersIdComicsResponse.events);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, digitalId, title, issueNumber, variantDescription, description, modified, isbn, upc, diamondCode, ean, issn, format, pageCount, textObjects, resourceURI, urls, series, variants, collections, collectedIssues, dates, prices, images, thumbnail, creators, characters, stories, events);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CharactersIdComicsResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    digitalId: ").append(toIndentedString(digitalId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    issueNumber: ").append(toIndentedString(issueNumber)).append("\n");
    sb.append("    variantDescription: ").append(toIndentedString(variantDescription)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    isbn: ").append(toIndentedString(isbn)).append("\n");
    sb.append("    upc: ").append(toIndentedString(upc)).append("\n");
    sb.append("    diamondCode: ").append(toIndentedString(diamondCode)).append("\n");
    sb.append("    ean: ").append(toIndentedString(ean)).append("\n");
    sb.append("    issn: ").append(toIndentedString(issn)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    pageCount: ").append(toIndentedString(pageCount)).append("\n");
    sb.append("    textObjects: ").append(toIndentedString(textObjects)).append("\n");
    sb.append("    resourceURI: ").append(toIndentedString(resourceURI)).append("\n");
    sb.append("    urls: ").append(toIndentedString(urls)).append("\n");
    sb.append("    series: ").append(toIndentedString(series)).append("\n");
    sb.append("    variants: ").append(toIndentedString(variants)).append("\n");
    sb.append("    collections: ").append(toIndentedString(collections)).append("\n");
    sb.append("    collectedIssues: ").append(toIndentedString(collectedIssues)).append("\n");
    sb.append("    dates: ").append(toIndentedString(dates)).append("\n");
    sb.append("    prices: ").append(toIndentedString(prices)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    thumbnail: ").append(toIndentedString(thumbnail)).append("\n");
    sb.append("    creators: ").append(toIndentedString(creators)).append("\n");
    sb.append("    characters: ").append(toIndentedString(characters)).append("\n");
    sb.append("    stories: ").append(toIndentedString(stories)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
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

