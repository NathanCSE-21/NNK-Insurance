import java.io.Serializable;

public class NewAgent implements Serializable{
	String firstname;
	String lastname;
	String middlename;
	String age;
	String phone;
	String email;
	String compemail;
	String comppass;
	String netid;
	String netpassword;
	
	
	public NewAgent(String firstname, 
			String lastname, 
			String middlename, 
			String age, 
			String phone, 
			String email, 
			String netid, 
			String netpassword,
			String compemail,
			String comppass) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.middlename = middlename;
		this.age = age;
		this.phone = phone;
		this.email = email;
		this.compemail = compemail;
		this.comppass = comppass;
		this.netid = netid;
		this.netpassword = netpassword;
	}
	
	@Override
    public String toString() {
        return "Agent: [" + this.firstname + " " + 
        		this.lastname + " " +
        		this.middlename + " " + 
        		this.age + " " + 
        		this.phone + " " +
        		this.email + " " + 
        		this.netid + " " +
        		this.netpassword + " " +
        		this.compemail + " " +
        		this.comppass + " ]";
    }
}
