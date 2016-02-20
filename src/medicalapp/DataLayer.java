package medicalapp;

import java.util.*;

public abstract class DataLayer {
	
	public static int IOFILE = 1;
	public static int MYSQL = 2;
	public static int SQLITE = 3;
	private static int DEFAULT=IOFILE;
	
	public final static String DoctorData = "doctors.txt";
	public final static String PatientData = "patients.txt";
	public final static String AppointmentData = "appointments.txt";
	
	private static DataLayer dataLayer = null;
	
	public static DataLayer instance(String dataName){
		
		return instance(DEFAULT, dataName);
	}

	
	private static DataLayer instance(int type, String name){
		if(type == SQLITE){
			//todo
		}
		else if(type == MYSQL){
			//todo
		}
		else{
			if(dataLayer == null){
				dataLayer = new IOLayer(name);
			}
		}
		return dataLayer;
	}

	public abstract ArrayList<Object> read() throws Exception;

	public abstract boolean add(String[] fields);

	public abstract boolean update(String[] fields);

	public abstract boolean delete(String id);
	
	public abstract String[] findRecord(String id);
		
	public abstract void showRecords();
	
	public abstract String[][] getData();
		
}
