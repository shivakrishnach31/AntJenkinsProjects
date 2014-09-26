package Tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FbTest {
    WebDriver dr;
	@Before
	public void setUp() throws Exception {
		dr = new FirefoxDriver();
	}

	@After
	public void tearDown() throws Exception {
		dr.close();
	}

	@Test
	public void test() {
		dr.get("http://www.facebook.com");
		System.out.println(dr.getTitle());
		System.out.println("Test");
		System.out.println("Test");
	}

}
