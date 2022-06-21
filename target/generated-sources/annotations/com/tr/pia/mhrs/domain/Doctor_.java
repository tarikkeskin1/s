package com.tr.pia.mhrs.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Doctor.class)
public abstract class Doctor_ {

	public static volatile SingularAttribute<Doctor, String> lastName;
	public static volatile SingularAttribute<Doctor, String> name;
	public static volatile SingularAttribute<Doctor, Long> id;
	public static volatile SingularAttribute<Doctor, String> title;
	public static volatile SingularAttribute<Doctor, Department> department;

	public static final String LAST_NAME = "lastName";
	public static final String NAME = "name";
	public static final String ID = "id";
	public static final String TITLE = "title";
	public static final String DEPARTMENT = "department";

}

