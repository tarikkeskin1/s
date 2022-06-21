package com.tr.pia.mhrs.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Appointment.class)
public abstract class Appointment_ {

	public static volatile SingularAttribute<Appointment, String> date;
	public static volatile SingularAttribute<Appointment, Doctor> doctor;
	public static volatile SingularAttribute<Appointment, Patient> patient;
	public static volatile SingularAttribute<Appointment, Long> id;

	public static final String DATE = "date";
	public static final String DOCTOR = "doctor";
	public static final String PATIENT = "patient";
	public static final String ID = "id";

}

