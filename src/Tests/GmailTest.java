package Tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailTest {
    WebDriver dr;
	@Before
	public void setUp() throws Exception {
        dr = new FirefoxDriver();
		}
//ajay added comment 
	@After
	public void tearDown() throws Exception {
		dr.close();
		System.out.println("added comment by ajay kovuri");
	}

	@Test
	public void test() {
		dr.get("http://gmail.com");
		System.out.println(dr.getTitle());
	}

}
