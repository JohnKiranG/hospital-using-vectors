package com.hospital.common;

import java.util.Scanner;
import java.util.Vector;

import com.hospital.doctor.DoctorActivity;

public class Doctor {
	public static Vector<String> doctorNames = new Vector<String>(10);
	public static Vector<String> doctorPsswds = new Vector<String>(10);
	static {
		doctorNames.add("Ram");
		doctorPsswds.add("acs");
		doctorNames.add("John");
		doctorPsswds.add("123");
	}

	// public static String doctor[]={"john"};
	// private static String psswd[]={"123"};

	public static void docVerify(Scanner input, Scanner str) {
		System.out.print("Enter Doctor Name: ");
		String name = str.nextLine();
		System.out.print("Enter psswd: ");
		String pass = str.nextLine();
		if (doctorNames.contains(name) && pass.equals(doctorPsswds.elementAt(doctorNames.indexOf(name)))) {
			System.out.println("Welcome: "+ doctorNames.elementAt(doctorNames.indexOf(name)));
			DoctorActivity.doctorActivity(input, str,doctorNames.indexOf(name));
		} else {
			System.out.println("Enter valid username and psswd");
			docVerify(input, str);
		}
	}
}
