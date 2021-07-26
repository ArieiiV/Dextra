package br.com.marvel.model.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "item")
public class Item implements Serializable {
	
	private static final long serialVersionUID = 3262723385097483117L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "resource_uri")
	private String resourceURI;
	
	@Column(name = "name_item")
	private String name;
	
	@Column(name = "type_item")
	private String type;
	
	@Column(name = "role_item")
	private String role;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getResourceURI() {
		return resourceURI;
	}

	public void setResourceURI(String resourceURI) {
		this.resourceURI = resourceURI;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, resourceURI, role, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		return Objects.equals(name, other.name) && Objects.equals(resourceURI, other.resourceURI)
				&& Objects.equals(role, other.role) && Objects.equals(type, other.type);
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", resourceURI=" + resourceURI + ", name=" + name + ", type=" + type + ", role="
				+ role + "]";
	}

}
