package br.com.marvel.model.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Story.class)
public abstract class Story_ {

	public static volatile SingularAttribute<Story, String> collectionURI;
	public static volatile SingularAttribute<Story, Long> id;
	public static volatile ListAttribute<Story, Item> items;

}

