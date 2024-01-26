package completecorejavaproject;

import java.io.*;
import java.util.Scanner;

public class contactmanagement {
	public  static void contactmanagementmethod() {
		Scanner sc= new Scanner(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		boolean flag=true;
		while(flag) {
		System.out.println("press 1 to create contact");
		System.out.println("press 2 to update contact");
		System.out.println("press 3 to delete contact");
		System.out.println("press 4 to get contactlist");
		System.out.println("press 5 to get contact based on name");
		System.out.println("press 6 to exit");
		
		System.out.println("enter choice:");
		
		int choice=0;
		for(;;) 
		{
		  try {
		     choice=Integer.parseInt(br.readLine());
		     break;
		     
		     }
		  catch(Exception e) {
			 System.out.println("plz enter numbers only");
		     }
		 }
		
		switch(choice) {
		case 1:
			System.out.println("create contact started");
			createcontact c=new createcontact();
			c.createcontacthtmlview();
			break;
		case 2:
			System.out.println("update contact started");
			updatecontact u=new updatecontact();
			u.updatecontacthtmlview();
			break;
		case 3:
			System.out.println("delete contact started");
			deletecontact d=new deletecontact();
			d.deletecontactmethod();
			break;
		case 4:
			System.out.println("getting all contacts");
			getcontactlist l=new getcontactlist();
			l.getcontactlistmethod();
			break;
		case 5:
			System.out.println("getting contact based on name");
			getcontactbasedonname n=new getcontactbasedonname();
			n.getcontactbasedonnamehtmlview();
			break;
		case 6:
			flag=false;
			System.out.println("exit application");
			break;
		default:
			break;
		}
		}
			
	}

}
