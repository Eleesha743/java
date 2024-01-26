package completecorejavaproject;
import java.io.*;
import java.util.*;
public class getcontactlist {
	public ArrayList<contact> getcontactlistmethod() {
		ArrayList<contact> l=new ArrayList<contact>();
		try {
		File f=new File("contact.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		String data=br.readLine();
		while(data!=null) {
			
			String values[]=data.split("\t\t");
			String name=values[0];
			int number=Integer.parseInt(values[1]);
			String email=values[2];
			contact c=contactutil.convertcontact(name, number, email);
			l.add(c);
			data=br.readLine();
		}
		
		}
		catch(Exception e) {
			System.out.println("not found");
		}
		return l;
	}

}
