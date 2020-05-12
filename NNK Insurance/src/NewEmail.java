import java.io.Serializable;

public class NewEmail implements Serializable {
	String email;
	String password;
	
	public NewEmail(String email,String password) {
		super();
		this.email = email;
		this.password = password;
	}
	
	@Override
    public String toString() {
        return "Email: [" + this.email + ", " + this.password + "]";
    }
}
