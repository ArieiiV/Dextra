package br.com.marvel.model.entity;

import java.io.Serializable;
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
@Table(name = "serie")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id", scope = Long.class)
public class Serie implements Serializable {

	private static final long serialVersionUID = 5287227321225700996L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column
	private String title;

	@Column(name = "description_serie")
	private String descripton;

	@Column(name = "resource_uri")
	private String resourceURI;

	@OneToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "serie_url", joinColumns = @JoinColumn(name = "serie_id"), inverseJoinColumns = @JoinColumn(name = "url_id"))
	private List<Url> urls;

	@Column(name = "start_year")
	private Long startYear;

	@Column(name = "end_year")
	private Long endYear;

	@Column
	private String rating;

	@Column(name = "type_serie")
	private String type;

	@Column
	private String modified;

	@OneToOne
	@JoinColumn(name = "codigo_thumbnail")
	private Thumbnail thumbnail;

	@OneToOne
	@JoinColumn(name = "codigo_creator")
	private Creator creators;

	@OneToOne
	@JoinColumn(name = "codigo_character")
	private Character characters;

	@OneToOne
	@JoinColumn(name = "codigo_story")
	private Story stories;

	@OneToOne
	@JoinColumn(name = "codigo_comic")
	private Comic comics;

	@OneToOne
	@JoinColumn(name = "codigo_event")
	private Event events;
	
	@OneToOne
	@JoinColumn(name = "codigo_next")
	private Next next;
	
	@OneToOne
	@JoinColumn(name = "codigo_previous")
	private Previous previous;

	@Transient
	private Integer available;

	@Column(name = "collection_uri")
	private String collectionURI;

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "serie_item", joinColumns = @JoinColumn(name = "serie_id"), inverseJoinColumns = @JoinColumn(name = "item_id"))
	private List<Item> items;

	@Transient
	private Integer returned;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescripton() {
		return descripton;
	}

	public void setDescripton(String descripton) {
		this.descripton = descripton;
	}

	public List<Url> getUrls() {
		return urls;
	}

	public void setUrls(List<Url> urls) {
		this.urls = urls;
	}

	public Long getStartYear() {
		return startYear;
	}

	public void setStartYear(Long startYear) {
		this.startYear = startYear;
	}

	public Long getEndYear() {
		return endYear;
	}

	public void setEndYear(Long endYear) {
		this.endYear = endYear;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getModified() {
		return modified;
	}

	public void setModified(String modified) {
		this.modified = modified;
	}

	public Thumbnail getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(Thumbnail thumbnail) {
		this.thumbnail = thumbnail;
	}

	public Creator getCreators() {
		return creators;
	}

	public void setCreators(Creator creators) {
		this.creators = creators;
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

	public String getResourceURI() {
		return resourceURI;
	}

	public void setResourceURI(String resourceURI) {
		this.resourceURI = resourceURI;
	}

	public Comic getComics() {
		return comics;
	}

	public void setComics(Comic comics) {
		this.comics = comics;
	}

	public Event getEvents() {
		return events;
	}

	public void setEvents(Event events) {
		this.events = events;
	}

	public Integer getAvailable() {
		return available;
	}

	public void setAvailable(Integer available) {
		this.available = available;
	}

	public String getCollectionURI() {
		return collectionURI;
	}

	public void setCollectionURI(String collectionURI) {
		this.collectionURI = collectionURI;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public Integer getReturned() {
		return returned;
	}

	public void setReturned(Integer returned) {
		this.returned = returned;
	}

}
