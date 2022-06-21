package com.tr.pia.mhrs.domain;

import com.tr.pia.mhrs.domain.enumeration.Gender;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Patient.class)
public abstract class Patient_ {

	public static volatile SingularAttribute<Patient, String> firstName;
	public static volatile SingularAttribute<Patient, String> lastName;
	public static volatile SingularAttribute<Patient, String> password;
	public static volatile SingularAttribute<Patient, String> phoneNumber;
	public static volatile SingularAttribute<Patient, Gender> gender;
	public static volatile SingularAttribute<Patient, Long> id;
	public static volatile SingularAttribute<Patient, String> email;

	public static final String FIRST_NAME = "firstName";
	public static final String LAST_NAME = "lastName";
	public static final String PASSWORD = "password";
	public static final String PHONE_NUMBER = "phoneNumber";
	public static final String GENDER = "gender";
	public static final String ID = "id";
	public static final String EMAIL = "email";

}

