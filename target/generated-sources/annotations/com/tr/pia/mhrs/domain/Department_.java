package com.tr.pia.mhrs.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Department.class)
public abstract class Department_ {

	public static volatile SingularAttribute<Department, String> departmentName;
	public static volatile SetAttribute<Department, Doctor> doctors;
	public static volatile SingularAttribute<Department, String> description;
	public static volatile SingularAttribute<Department, Long> id;
	public static volatile SingularAttribute<Department, Hospital> hospital;

	public static final String DEPARTMENT_NAME = "departmentName";
	public static final String DOCTORS = "doctors";
	public static final String DESCRIPTION = "description";
	public static final String ID = "id";
	public static final String HOSPITAL = "hospital";

}

