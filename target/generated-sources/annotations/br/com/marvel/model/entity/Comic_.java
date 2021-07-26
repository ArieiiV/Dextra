package br.com.marvel.model.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Comic.class)
public abstract class Comic_ {

	public static volatile SingularAttribute<Comic, Creator> creators;
	public static volatile SingularAttribute<Comic, Long> issueNumber;
	public static volatile SingularAttribute<Comic, String> isbn;
	public static volatile SingularAttribute<Comic, String> description;
	public static volatile SingularAttribute<Comic, String> title;
	public static volatile SingularAttribute<Comic, String> diamondCode;
	public static volatile SingularAttribute<Comic, Character> characters;
	public static volatile ListAttribute<Comic, Url> urls;
	public static volatile SingularAttribute<Comic, String> ean;
	public static volatile SingularAttribute<Comic, String> modified;
	public static volatile SingularAttribute<Comic, Long> id;
	public static volatile ListAttribute<Comic, Price> prices;
	public static volatile SingularAttribute<Comic, Event> events;
	public static volatile SingularAttribute<Comic, Long> pageCount;
	public static volatile SingularAttribute<Comic, Thumbnail> thumbnail;
	public static volatile ListAttribute<Comic, Image> images;
	public static volatile SingularAttribute<Comic, Story> stories;
	public static volatile ListAttribute<Comic, TextObject> textObjects;
	public static volatile SingularAttribute<Comic, Long> digitalId;
	public static volatile SingularAttribute<Comic, String> format;
	public static volatile SingularAttribute<Comic, String> upc;
	public static volatile ListAttribute<Comic, Dates> dates;
	public static volatile SingularAttribute<Comic, String> resourceURI;
	public static volatile SingularAttribute<Comic, String> variantDescription;
	public static volatile SingularAttribute<Comic, String> issn;
	public static volatile SingularAttribute<Comic, Serie> series;
	public static volatile ListAttribute<Comic, Item> items;

}

