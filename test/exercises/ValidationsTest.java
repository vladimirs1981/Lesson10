package exercises;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ValidationsTest {

	Validations validations = new Validations();

	@Test
	void testIfEmailIsValid() {

		assertEquals("Valid Email Address", validations.validateEmailAddress("st.vladas@hotmail.com"));
		assertEquals("Valid Email Address", validations.validateEmailAddress("st.vladas54@gmail.com"));
		assertEquals("Invalid Email Address", validations.validateEmailAddress("st.vladas@hotmail.com54"));
		assertEquals("Invalid Email Address", validations.validateEmailAddress("st.vladas.hotmail.com"));

	}

	@Test
	void testIfMobileNumberIsValid() {
		assertEquals("Valid Mobile Number", validations.validateMobileNumber("+381642191610"));
		assertEquals("Invalid Mobile Number", validations.validateMobileNumber("+3816421as91610"));
		assertEquals("Invalid Mobile Number", validations.validateMobileNumber("+381642191610568"));

	}
}
