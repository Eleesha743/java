package completecorejavaproject;

import java.io.*;

public class companyutil {
	private static String companyname;
	private static File company;
	public static String getCompanyname() {
		return companyname;
	}
	public static void setCompanyname(String companyname) {
		companyutil.companyname = companyname;
	}
	public static File getCompany() {
		return company;
	}
	public static void setCompany(File company) {
		companyutil.company = company;
	}
	
    
}
