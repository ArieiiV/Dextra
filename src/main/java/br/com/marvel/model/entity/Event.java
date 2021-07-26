package br.com.marvel.model.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "event_table")
public class Event implements Serializable {

	private static final long serialVersionUID = 5287227321225700996L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column
	private String title;

	@Column(name = "description_comic")
	private String description;

	@Column(name = "resource_uri")
	private String resourceURI;

	@OneToMany
	@JoinTable(name = "event_url", joinColumns = @JoinColumn(name = "event_id"), inverseJoinColumns = @JoinColumn(name = "url_id"))
	private List<Url> urls;

	@Column
	private String modified;

	@Column(name = "event_start")
	private String start;

	@Column(name = "event_end")
	private String end;

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
	@JoinColumn(name = "codigo_serie")
	private Serie series;

	@OneToOne
	@JoinColumn(name = "codigo_next")
	private Next next;

	@OneToOne
	@JoinColumn(name = "codigo_previous")
	private Previous previous;

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

	public List<Url> getUrls() {
		return urls;
	}

	public void setUrls(List<Url> urls) {
		this.urls = urls;
	}

	public String getModified() {
		return modified;
	}

	public void setModified(String modified) {
		this.modified = modified;
	}

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getEnd() {
		return end;
	}

	public void setEnd(String end) {
		this.end = end;
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

	public Comic getComics() {
		return comics;
	}

	public void setComics(Comic comics) {
		this.comics = comics;
	}

	public Serie getSeries() {
		return series;
	}

	public void setSeries(Serie series) {
		this.series = series;
	}

	public Next getNext() {
		return next;
	}

	public void setNext(Next next) {
		this.next = next;
	}

	public Previous getPrevious() {
		return previous;
	}

	public void setPrevious(Previous previous) {
		this.previous = previous;
	}

}
