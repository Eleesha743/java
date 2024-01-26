package completecorejavaproject;

import java.io.*;
import java.util.*;

public class createcontact {
	public  contact createcontactmethod(String name,int number,String email) throws Exception{
		Random r=new Random();
		int id=r.nextInt(1000);
		contact c=contactutil.convertcontact(name,number,email);
		File f=new File(companyutil.getCompanyname());
		FileWriter fw=new FileWriter(f,true);
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write(c.toString()+"\n");
		bw.close();
		return c;
	}

	
	public void createcontacthtmlview(){
		try {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name:");
		String name=sc.next();	
		System.out.println("enter number:");
		int number=sc.nextInt();
		System.out.println("enter email:");
		String email=sc.next();
		contact data=createcontactmethod(name,number,email);
		System.out.println(data);
		}
		catch(Exception e) {
			System.out.println("not found");
		}
		
	}

}
