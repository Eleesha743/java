package completecorejavaproject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class getcontactbasedonname {
	public contact getcontactbasedonnamehtmlview() {
		contact c=null;
		try {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name");
		String inputname=sc.next();
		c=getcontactbasedonnamemethod(inputname);
		}
		catch(Exception e) {
			System.out.println("not found");
		}
		return c;
	}
	public contact getcontactbasedonnamemethod(String inputname) throws Exception {
		
		contact c=null;
		boolean contactcheck=false;
		File f=new File("contact.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		
		String data=br.readLine();
		while(data!=null) {
			String values[]=data.split("\t\t");
			String filename=values[0];
			if(inputname==filename) {
				contactcheck=true;
				int number=Integer.parseInt(values[1]);
				String email=values[2];
				c=contactutil.convertcontact(inputname, number, email);
			}
			data=br.readLine();
		}
		if(contactcheck) {
			System.out.println(c);
		}
		else {
			System.out.println("not found");
		}
		return c;
	}

}
