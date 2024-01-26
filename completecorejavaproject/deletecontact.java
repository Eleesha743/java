package completecorejavaproject;

import java.util.*;
import java.io.*;
public class deletecontact {
	public void deletecontactmethod()  {
		try {
		Scanner sc=new Scanner(System.in);
		StringBuilder sb=new StringBuilder();
		System.out.println("enter name to delete:");
		String inputname=sc.next();
		File f=new File("contact.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		String data=br.readLine();
		while(data!=null) {
			String values[]=data.split("\t\t");
			String filename=values[0];
			if(inputname != filename) {
				sb.append(data+"\n");
			}
			data=br.readLine();
		}
		FileWriter fw=new FileWriter(f);
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write(sb.toString());
		bw.close();
		System.out.println(sb);
		}
		catch(Exception e) {
			System.out.println("not found");
		}
		
	}

}
