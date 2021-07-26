package br.com.marvel.model.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name = "comic")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id", scope = Long.class)
public class Comic implements Serializable {

	private static final long serialVersionUID = 5997607763715776021L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "digital_id")
	private Long digitalId;

	@Column(name = "title_comic")
	private String title;

	@Column(name = "issue_number")
	private Long issueNumber;

	@Column(name = "variant_description")
	private String variantDescription;

	@Column(name = "description_comic")
	private String description;

	@Column
	private String modified;

	@Column
	private String isbn;

	@Column
	private String upc;

	@Column(name = "diamond_code")
	private String diamondCode;

	@Column
	private String ean;

	@Column
	private String issn;

	@Column(name = "format_comic")
	private String format;

	@Column(name = "page_count")
	private Long pageCount;

	@OneToMany
	@JoinTable(name = "comic_text_table", joinColumns = @JoinColumn(name = "comic_id"), inverseJoinColumns = @JoinColumn(name = "text_table_id"))
	private List<TextObject> textObjects;

	@OneToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "comic_url", joinColumns = @JoinColumn(name = "comic_id"), inverseJoinColumns = @JoinColumn(name = "url_id"))
	private List<Url> urls = null;

	@Column(name = "resource_uri")
	private String resourceURI;

	@OneToOne
	@JoinColumn(name = "codigo_serie")
	private Serie series;

	@Transient
	private ArrayList<String> variants;

	@Transient
	private ArrayList<String> collections;

	@Transient
	private ArrayList<String> collectedIssues;

	@Column
	@OneToMany
	@JoinTable(name = "comic_dates", joinColumns = @JoinColumn(name = "comic_id"), inverseJoinColumns = @JoinColumn(name = "dates_id"))
	private List<Dates> dates;

	@OneToMany
	@JoinTable(name = "comic_price", joinColumns = @JoinColumn(name = "comic_id"), inverseJoinColumns = @JoinColumn(name = "price_id"))
	private List<Price> prices;

	@OneToOne
	@JoinColumn(name = "codigo_thumbnail")
	private Thumbnail thumbnail;

	@OneToMany
	@JoinTable(name = "comic_image", joinColumns = @JoinColumn(name = "comic_id"), inverseJoinColumns = @JoinColumn(name = "image_id"))
	private List<Image> images;

	@OneToOne
	@JoinColumn(name = "codigo_creator")
	private Creator creators;

	@ManyToMany
	@JoinTable(name = "comic_item", joinColumns = @JoinColumn(name = "comic_id"), inverseJoinColumns = @JoinColumn(name = "item_id"))
	private List<Item> items;

	@OneToOne(mappedBy = "comics")
	private Character characters;

	@OneToOne
	@JoinColumn(name = "codigo_story")
	private Story stories;

	@OneToOne
	@JoinColumn(name = "codigo_event")
	private Event events;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getDigitalId() {
		return digitalId;
	}

	public void setDigitalId(Long digitalId) {
		this.digitalId = digitalId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Long getIssueNumber() {
		return issueNumber;
	}

	public void setIssueNumber(Long issueNumber) {
		this.issueNumber = issueNumber;
	}

	public String getVariantDescription() {
		return variantDescription;
	}

	public void setVariantDescription(String variantDescription) {
		this.variantDescription = variantDescription;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getModified() {
		return modified;
	}

	public void setModified(String modified) {
		this.modified = modified;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getUpc() {
		return upc;
	}

	public void setUpc(String upc) {
		this.upc = upc;
	}

	public String getDiamondCode() {
		return diamondCode;
	}

	public void setDiamondCode(String diamondCode) {
		this.diamondCode = diamondCode;
	}

	public String getEan() {
		return ean;
	}

	public void setEan(String ean) {
		this.ean = ean;
	}

	public String getIssn() {
		return issn;
	}

	public void setIssn(String issn) {
		this.issn = issn;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public Long getPageCount() {
		return pageCount;
	}

	public void setPageCount(Long pageCount) {
		this.pageCount = pageCount;
	}

	public List<TextObject> getTextObjects() {
		return textObjects;
	}

	public void setTextObjects(List<TextObject> textObjects) {
		this.textObjects = textObjects;
	}

	public List<Url> getUrls() {
		return urls;
	}

	public void setUrls(List<Url> urls) {
		this.urls = urls;
	}

	public String getResourceURI() {
		return resourceURI;
	}

	public void setResourceURI(String resourceURI) {
		this.resourceURI = resourceURI;
	}

	public Serie getSeries() {
		return series;
	}

	public void setSeries(Serie series) {
		this.series = series;
	}

	public ArrayList<String> getVariants() {
		return variants;
	}

	public void setVariants(ArrayList<String> variants) {
		this.variants = variants;
	}

	public ArrayList<String> getCollections() {
		return collections;
	}

	public void setCollections(ArrayList<String> collections) {
		this.collections = collections;
	}

	public ArrayList<String> getCollectedIssues() {
		return collectedIssues;
	}

	public void setCollectedIssues(ArrayList<String> collectedIssues) {
		this.collectedIssues = collectedIssues;
	}

	public List<Dates> getDates() {
		return dates;
	}

	public void setDates(List<Dates> dates) {
		this.dates = dates;
	}

	public List<Price> getPrices() {
		return prices;
	}

	public void setPrices(List<Price> prices) {
		this.prices = prices;
	}

	public Thumbnail getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(Thumbnail thumbnail) {
		this.thumbnail = thumbnail;
	}

	public List<Image> getImages() {
		return images;
	}

	public void setImages(List<Image> images) {
		this.images = images;
	}

	public Creator getCreators() {
		return creators;
	}

	public void setCreators(Creator creators) {
		this.creators = creators;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public Character getCharacters() {
		return characters;
	}

	public void setCharacters(Character characters) {
		this.characters = characters;
	}

	public Story getStories() {
		return stories;
	}

	public void setStories(Story stories) {
		this.stories = stories;
	}

	public Event getEvents() {
		return events;
	}

	public void setEvents(Event events) {
		this.events = events;
	}

}
