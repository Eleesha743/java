package completecorejavaproject;

import java.util.*;
import java.io.*;
public class updatecontact {
	public static contact  updatecontactmethod(String inputname,int updatednumber,String updatedemail) throws Exception {
		
		StringBuilder sb=new StringBuilder();
		contact c=new contact();
		boolean contactcheck=false;
		File f=new File("contact.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		String data=br.readLine();
		while(data!=null) {
			String values[]=data.split("\t");
			String filename=values[0];
			if(inputname==filename) {
				contactcheck=true;
				int number=Integer.parseInt(values[1]);
				String email=values[2];
				c=contactutil.convertcontact(inputname, updatednumber, updatedemail);
				sb.append(c.toString());
			}
			else {
				sb.append(data+"\n");
			}
			data=br.readLine();
		}
		System.out.println(sb);
		FileWriter fw=new FileWriter(f);
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write(sb.toString());
		bw.close();
		return c;
	}
	public  void updatecontacthtmlview() {
		try {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter name to update:");
		String inputname=sc.next();
		System.out.println("enter update number:");
		int updatednumber=sc.nextInt();
		System.out.println("enter update email:");
		String updatedemail=sc.next();
		contact updatedcontact=updatecontactmethod(inputname,updatednumber,updatedemail);
		System.out.println(updatedcontact);
		}
		catch(Exception e) {
			System.out.println("not found");
		}
	}

}
