package Tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooTest {
    WebDriver driver;
	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
	}
	
	@After
	public void teardown() throws Exception {
	    driver.close();	
	}

	@Test
	public void test() {
		driver.get("http://www.yahoo.com");
		System.out.println(driver.getTitle());
	}

}
