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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name = "story")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id", scope = Long.class)
public class Story implements Serializable {

	private static final long serialVersionUID = 5287227321225700996L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column
	private String title;

	@Column(name = "description_story")
	private String description;

	@Column(name = "resource_uri")
	private String resourceURI;

	@Column(name = "type_story")
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
	@JoinColumn(name = "codigo_serie")
	private Serie series;

	@OneToOne
	@JoinColumn(name = "codigo_comic")
	private Comic comics;

	@OneToOne
	@JoinColumn(name = "codigo_event")
	private Event events;

	@OneToOne
	@JoinColumn(name = "codigo_original_issue")
	private OriginalIssue originalIssue;

	@Transient
	private Integer available;

	@Column(name = "collection_uri")
	private String collectionURI;

	@OneToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "story_item", joinColumns = @JoinColumn(name = "story_id"), inverseJoinColumns = @JoinColumn(name = "item_id"))
	private List<Item> items;

	@Transient
	private Integer returned;

	public Integer getAvailable() {
		Integer size = 0;
		if (!this.items.isEmpty()) {
			size = this.items.size();
			this.available = size;
		}
		return available;
	}

	public void setAvailable(Integer available) {
		this.available = available;
	}

	public Integer getReturned() {
		Integer size = 0;
		if (!this.items.isEmpty()) {
			size = this.items.size();
			this.returned = size;
		}
		return returned;
	}

	public void setReturned(Integer returned) {
		this.returned = returned;
	}

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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getResourceURI() {
		return resourceURI;
	}

	public void setResourceURI(String resourceURI) {
		this.resourceURI = resourceURI;
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

	public Serie getSeries() {
		return series;
	}

	public void setSeries(Serie series) {
		this.series = series;
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

	public OriginalIssue getOriginalIssue() {
		return originalIssue;
	}

	public void setOriginalIssue(OriginalIssue originalIssue) {
		this.originalIssue = originalIssue;
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

}
