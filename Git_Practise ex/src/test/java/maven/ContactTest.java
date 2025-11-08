package maven;

import org.testng.annotations.Test;

public class ContactTest {
@Test(groups = "RegressionTest")
public void createOrgTest() {
	System.out.println("createContactTest is executed");
}
@Test(groups = "SmokeTest")
public void modifyOrgTest() {
	System.out.println("modifyContactTest is executed");
}
}
