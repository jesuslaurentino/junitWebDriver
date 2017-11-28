package ejercicios;

import org.junit.Test;

public class FacebookLoginJunitChild extends ParentTest{
	@Test
    public void testFacebook () {
		facebookLogin("geral.overhage.selenium@gmail.com", "T3st1234");
		verifyElementExists(searchBoxLocator);
		
	}
}
