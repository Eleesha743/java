package completecorejavaproject;

public class contactutil {
	public static contact convertcontact(String name,int number,String email) {
		contact c=new contact();
		c.setName(name);
		c.setNumber(number);
		c.setEmail(email);
		return c;
	}

}
