package com.hospital.common;

import java.util.Vector;

public class Patient {
	public static Vector<String> patientNames = new Vector<String>(10);
	public static Vector<String> patientID = new Vector<String>(10);
	public static Vector<String> patientAge = new Vector<String>(10);
	public static Vector<String> patientGender = new Vector<String>(10);
	public static Vector<String> patientPhonenumber = new Vector<String>(10);
	public static Vector<String> patientDisease = new Vector<String>(10);
	public static Vector<String> doctorID = new Vector<String>(10);
	static {
		String set="null";
		doctorID.add(set);	
		doctorID.add(set);
		doctorID.add(set);
		doctorID.add(set);
		doctorID.add(set);
		doctorID.add(set);
		doctorID.add(set);
		doctorID.add(set);
		doctorID.add(set);
		doctorID.add(set);
	}
	
}
