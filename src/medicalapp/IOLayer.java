package medicalapp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

public class IOLayer extends DataLayer {

	private ArrayList<Object> list;
	private String fileName;
	public final static String TOKEN = "\\|\\|";
	public final static String FIELDSEPERATOR = "||";


	public IOLayer(String fileName) {

		this.list = new ArrayList<>();
		this.fileName = this.getClass().getResource("").getPath() + "data/" + fileName;
		
		try{
			this.read();
		}
		catch(Exception ex){
			System.out.println(ex.getMessage());
			System.exit(-1);
		}
	}
	
	private boolean flushData(){
		boolean status = false;
		try {
			this.saveFile();
			status = true;
		}
		catch (Exception ex) {
			System.out.println("Error: Cannot write to file.");
		}
		
		return status;
	}
	
	private void saveFile() throws Exception{
		PrintWriter pw = new PrintWriter(new File(this.fileName));
			
		
		for (Object obj : list) {

			String[] fields = (String[]) obj;

			int i=0;
			StringBuilder sb = new StringBuilder();
			for(; i < fields.length - 1; i++){
				sb.append(fields[i] + FIELDSEPERATOR);
			}
			sb.append(fields[i]);
			pw.println(sb.toString());			
		}
		
		pw.close();
	}

	@Override
	public ArrayList<Object> read() throws Exception {

		this.list.clear();
		Scanner input = new Scanner(new File(this.fileName));
		while (input.hasNext()) {
			String[] fields = input.nextLine().split(TOKEN);
			this.list.add(fields);
		}

		input.close();

		return this.list;

	}

	@Override
	public boolean add(String[] fields) {

		this.list.add(fields);

		boolean status = flushData();;
		
		return status;
	}

	@Override
	public boolean update(String[] fields) {

		boolean status = false;

		for (Object obj : list) {

			String[] fieldList = (String[]) obj;

			if (fieldList[0].equals(fields[0])) {
				for (int i = 0; i < fields.length; i++) {
					fieldList[i] = fields[i];
				}
				status = flushData();
				break;
			}
		}

		return status;
	}

	@Override
	public boolean delete(String id) {

		boolean status = false;
		for (Object obj : list) {

			String[] fieldList = (String[]) obj;

			if (fieldList[0].equals(id)) {

				this.list.remove(obj);

				status = flushData();
				break;
			}
		}

		return status;
	}

	public void showRecords() {

		for (Object obj : list) {

			String[] fields = (String[]) obj;

			for (String s : fields) {
				System.out.print(s + " ");
			}
			System.out.println();
		}
	}

	@Override
	public String[][] getData() {

		return  Utility.to2DArray(list);
	}
	
	@Override
	public String[] findRecord(String id) {

		for (Object obj : list) {

			String[] fieldList = (String[]) obj;

			if (fieldList[0].equals(id)) {

				return fieldList;
			}
		}
		
		return null;
	}
	
	public static void main(String[] args) {

		// DataLayer iol = new IOLayer("patients.txt");
		//
		// String[] fields =
		// "438319675||Kevin||Truong||123 1st Street||Nile||IL||60641||(773) 123 - 4567||(773) 213 - 4567||2/3/1952".split(TOKEN);
		//
		// testUpdate(iol, fields);
		//
		// System.out.println();

		DataLayer dlayer2 = DataLayer.instance(DataLayer.PatientData);
		
		//String[] fields = "470064055||04/15/2014 07:15:00 ||60||Follow-up||not Approved||need to talk to Don||252242635||299560622".split(TOKEN);
		String[] fields = "438319675||Don||Bedecs||123 1st Street||Nile||IL||60641||(773) 123 - 4567||(773) 213 - 4567||2/3/1952".split(TOKEN);
		testUpdate(dlayer2, fields);

	}

	private static void testUpdate(DataLayer iol, String[] fields) {

		try {
			ArrayList<Object> list = iol.read();

			System.out.println("Before Updating");
			iol.showRecords();

			System.out.println("After Updated");
			iol.update(fields);
			iol.showRecords();

//			System.out.println("Deleted " + fields[0]);
//			iol.delete(fields[0]);
//			iol.showRecords();

		}
		catch (Exception ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}

	}

	

	

}
