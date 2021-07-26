package br.com.marvel.model.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Creator.class)
public abstract class Creator_ {

	public static volatile SingularAttribute<Creator, String> collectionURI;
	public static volatile SingularAttribute<Creator, Long> id;
	public static volatile ListAttribute<Creator, Item> items;

}

