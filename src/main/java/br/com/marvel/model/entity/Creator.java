package br.com.marvel.model.entity;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "creator")
public class Creator implements Serializable {

	private static final long serialVersionUID = 5287227321225700996L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Transient
	private Integer available;

	@Column(name = "collection_uri")
	private String collectionURI;

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "creator_item", joinColumns = @JoinColumn(name = "creator_id"), inverseJoinColumns = @JoinColumn(name = "item_id"))
	private List<Item> items;

	@Transient
	private Integer returned;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getAvailable() {
		Integer size = 0;
		if(!this.items.isEmpty()) {
			size = this.items.size();
			this.available = size;
		}
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
		Integer size = 0;
		if(!this.items.isEmpty()) {
			size = this.items.size();
			this.returned = size;
		}
		return returned;
	}

	public void setReturned(Integer returned) {
		this.returned = returned;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(id);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Creator other = (Creator) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "ComicCharacterEntity [id=" + id + ", available=" + available + ", collectionURI=" + collectionURI
				+ ", items=" + items + ", returned=" + returned + "]";
	}

	
	
}
