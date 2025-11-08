package jenkin;

import org.testng.annotations.Test;

public class OrgTest {
@Test(groups = "SmokeTest")
public void createOrgTest() {
	System.out.println("createOrgTest is executed");
}
@Test(groups = "RegressionTest")
public void modifyOrgTest() {
	System.out.println("modifyOrgTest is executed");
}
}
