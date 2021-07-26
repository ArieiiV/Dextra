package br.com.marvel.model.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Character.class)
public abstract class Character_ {

	public static volatile SingularAttribute<Character, Thumbnail> thumbnail;
	public static volatile ListAttribute<Character, Url> urls;
	public static volatile SingularAttribute<Character, Story> stories;
	public static volatile SingularAttribute<Character, Serie> series;
	public static volatile SingularAttribute<Character, Comic> comics;
	public static volatile SingularAttribute<Character, String> name;
	public static volatile SingularAttribute<Character, String> description;
	public static volatile SingularAttribute<Character, String> modified;
	public static volatile SingularAttribute<Character, Long> id;
	public static volatile SingularAttribute<Character, Event> events;

}

