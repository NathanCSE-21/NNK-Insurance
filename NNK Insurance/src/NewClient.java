import java.io.Serializable;

public class NewClient implements Serializable{
	String firstname;
	String lastname;
	String client_email;
	String client_phone;
	String client_city;
	String client_state;
	String client_dob;
	String client_sex;
	String client_marital;
	String client_ssn;
	
	String vehyear;
	String vehyear1;
	String vehmake;
	String vehmake1;
	String vehmodel;
	String vehmodel1;
	String vehvin;
	String vehvin1;
	String vehdriver;
	String vehdriver1;
	String vehnot;
	String vehci;
	String vehcic;
	String vehcll;
	
	 String netID;
	 String netpass;
	 String status;
	
	public NewClient(String firstname, String lastname, String client_email, String client_phone, String client_city ,
	String client_state, String client_dob, String client_sex,
	 String client_marital, String client_ssn,
	String vehyear, String vehyear1, String vehmake,
	String vehmake1,
	 String vehmodel,
	String vehmodel1,
	String vehvin,
	String vehvin1,
	String vehdriver,
	 String vehdriver1,
	 String vehnot,
	 String vehci,
	 String vehcic,
	 String vehcll, String netID, String netpass, String status) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.client_email = client_email;
		this.client_phone = client_phone;
		this.client_city = client_city;
		this.client_state = client_state;
		this.client_dob = client_dob;
		this.client_sex = client_sex;
		this.client_marital = client_marital;
		this.client_ssn = client_ssn;
		this.vehyear = vehyear;
		this.vehyear1 = vehyear1;
		this.vehmake = vehmake;
		this.vehmake1 = vehmake1;
		this.vehmodel = vehmodel;
		this.vehvin = vehvin;
		this.vehvin1 = vehvin1;
		this.vehdriver = vehdriver;
		this.vehdriver1 = vehdriver1;
		this.vehnot = vehnot; 
		this.vehci = vehci;
		this.vehcic = vehcic;
		this.vehcll = vehcll;
		this.netID = netID;
		this.netpass = netpass;
		this.status = status;
	}
	
	
	@Override
    public String toString() {
        return "Client: [" + this.firstname + " " + 
        		this.lastname + " " +
        		this.client_phone + " " + 
        		this.client_email + " " + 
        		this.client_city + " " +
        		this.client_state + " " + 
        		this.client_dob + " " +
        		this.client_sex + " " +
        		this.client_marital + " " +
        		this.client_ssn + " " +
        		this.vehyear + " " +
        		this.vehmake + " " +
        		this.vehmodel + " " +
        		this.vehvin + " " + 
        		this.vehdriver + " " +
        		this.vehyear1 + " " + 
        		this.vehmake1 + " " + 
        		this.vehmodel1 + " " +
        		this.vehvin1 + " " + 
        		this.vehdriver1 + " " + this.vehnot + " " + this.vehci + " " + this.vehcic + " " +
        		this.vehcll + " " + this.netID + " " + this.netpass + " " + this.status + 
        		" ]";
    }
}

