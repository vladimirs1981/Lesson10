package exercises;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validations {

	private Pattern pattern;
	private Matcher matcher;

	public String validateEmailAddress(String emailAddress) {

		pattern = Pattern.compile("^[(a-zA-Z-0-9-\\_\\+\\.)]+@[(a-z-A-z)]+\\.[(a-zA-z)]{2,3}$");
		matcher = pattern.matcher(emailAddress);
		if (matcher.matches()) {
			return "Valid Email Address";
		} else {
			return "Invalid Email Address";
		}
	}

	public String validateMobileNumber(String mobileNumber) {

		pattern = Pattern.compile("^\\+[0-9]{2,3}+[0-9]{8,9}$");//this is for our country :)
		matcher = pattern.matcher(mobileNumber);
		if (matcher.matches()) {
			return "Valid Mobile Number";
		} else {
			return "Invalid Mobile Number";
		}

	}
}
