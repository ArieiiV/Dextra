package br.com.marvel.model.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Event.class)
public abstract class Event_ {

	public static volatile SingularAttribute<Event, Next> next;
	public static volatile SingularAttribute<Event, Thumbnail> thumbnail;
	public static volatile SingularAttribute<Event, Story> stories;
	public static volatile SingularAttribute<Event, Previous> previous;
	public static volatile SingularAttribute<Event, Creator> creators;
	public static volatile SingularAttribute<Event, Comic> comics;
	public static volatile SingularAttribute<Event, String> start;
	public static volatile SingularAttribute<Event, String> description;
	public static volatile SingularAttribute<Event, String> resourceURI;
	public static volatile SingularAttribute<Event, String> title;
	public static volatile SingularAttribute<Event, Character> characters;
	public static volatile ListAttribute<Event, Url> urls;
	public static volatile SingularAttribute<Event, Serie> series;
	public static volatile SingularAttribute<Event, String> modified;
	public static volatile SingularAttribute<Event, String> end;
	public static volatile SingularAttribute<Event, Long> id;

}

