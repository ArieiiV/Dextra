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

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name = "character_table")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id", scope = Long.class)
public class Character implements Serializable {

	private static final long serialVersionUID = 2480314819745943559L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id = null;

	@Column(name = "name_character")
	private String name = null;

	@Column(name = "description_character")
	private String description = null;

	@Column
	private String modified = null;

	@OneToOne
	@JoinColumn(name = "codigo_thumbnail")
	private Thumbnail thumbnail = null;

	@OneToOne
	@JoinColumn(name = "codigo_comic")
	private Comic comics = null;

	@OneToOne
	@JoinColumn(name = "codigo_serie")
	private Serie series = null;

	@OneToOne
	@JoinColumn(name = "codigo_story")
	private Story stories = null;

	@OneToOne
	@JoinColumn(name = "codigo_event")
	private Event events = null;

	@OneToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "character_table_url", joinColumns = @JoinColumn(name = "character_table_id"), inverseJoinColumns = @JoinColumn(name = "url_id"))
	private List<Url> urls = null;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public Thumbnail getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(Thumbnail thumbnail) {
		this.thumbnail = thumbnail;
	}

	public List<Url> getUrls() {
		return urls;
	}

	public void setUrls(List<Url> urls) {
		this.urls = urls;
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
