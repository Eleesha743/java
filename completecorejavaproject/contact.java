package completecorejavaproject;

public class contact {
	private String name;
	private int number;
	private String email;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public contact( String name, int number, String email) {
		super();
		this.name = name;
		this.number = number;
		this.email = email;
	}
	public contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return name+"\t\t"+number+"\t\t"+email;
	}

}
