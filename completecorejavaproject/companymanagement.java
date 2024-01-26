package completecorejavaproject;

import java.io.*;
import java.util.*;

public class companymanagement {
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		boolean companyflag=true;
		while(companyflag) {
		System.out.println("press 1 to create sonycontact");
		System.out.println("press 2 to load sonycontact");
		System.out.println("press 3 to exit");
		System.out.println("enter choice:");
		int choice=0;
		for(;;) {
		try {
		  choice=Integer.parseInt(br.readLine());
		  break;
		}
		catch(Exception e) {
			System.out.println("plz give numbers btw 1 to 3");
		}
		}
		switch(choice) {
		case 1:
			System.out.println("creating sonycontact:");
			String company=sc.next();
			companyutil.setCompanyname(company+".txt");
			File f=new File(companyutil.getCompanyname());
			if (!f.exists()){
				f.createNewFile();
			}
			contactmanagement.contactmanagementmethod();
			break;
		case 2:
			System.out.println("loading sonycontact:");
			company=sc.next();
			companyutil.setCompanyname(company+".txt");
			f=new File(companyutil.getCompanyname());
			if(!f.exists()) {
				System.out.println("file not exist can i create:y/n");
				String yorn=sc.next();
				if(yorn.equals("y")) {
					f.createNewFile();
					contactmanagement.contactmanagementmethod();
				}
				else {
					System.out.println("exiting application");
					companyflag=false;
				}
			}
			else {
				contactmanagement.contactmanagementmethod();
			}
			break;
		case 3:
			System.out.println("exit the application");
			companyflag=false;
			break;
		default:
			System.out.println("enter between 1 to 3");
			break;
		}
		}
	}

}
