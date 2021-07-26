package br.com.marvel.model.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(TextObject.class)
public abstract class TextObject_ {

	public static volatile SingularAttribute<TextObject, String> language;
	public static volatile SingularAttribute<TextObject, Long> id;
	public static volatile SingularAttribute<TextObject, String> text;
	public static volatile SingularAttribute<TextObject, String> type;

}

