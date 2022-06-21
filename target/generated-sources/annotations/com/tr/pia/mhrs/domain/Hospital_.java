package com.tr.pia.mhrs.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Hospital.class)
public abstract class Hospital_ {

	public static volatile SingularAttribute<Hospital, City> city;
	public static volatile SingularAttribute<Hospital, String> name;
	public static volatile SingularAttribute<Hospital, String> description;
	public static volatile SingularAttribute<Hospital, Long> id;
	public static volatile SetAttribute<Hospital, Department> departments;

	public static final String CITY = "city";
	public static final String NAME = "name";
	public static final String DESCRIPTION = "description";
	public static final String ID = "id";
	public static final String DEPARTMENTS = "departments";

}

