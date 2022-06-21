package com.tr.pia.mhrs.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(City.class)
public abstract class City_ {

	public static volatile SetAttribute<City, Hospital> hospitals;
	public static volatile SingularAttribute<City, String> name;
	public static volatile SingularAttribute<City, String> description;
	public static volatile SingularAttribute<City, Long> id;

	public static final String HOSPITALS = "hospitals";
	public static final String NAME = "name";
	public static final String DESCRIPTION = "description";
	public static final String ID = "id";

}

