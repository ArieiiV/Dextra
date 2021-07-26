package br.com.marvel.model.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Serie.class)
public abstract class Serie_ {

	public static volatile SingularAttribute<Serie, String> collectionURI;
	public static volatile SingularAttribute<Serie, Long> id;
	public static volatile ListAttribute<Serie, Item> items;

}

