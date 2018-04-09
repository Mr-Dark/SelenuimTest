import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Test {
	static WebDriver driver;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\"
				+ "gamal\\Desktop\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		driver=new FirefoxDriver();
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@org.junit.Test
	public void test() {
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("gamalalkelani@gmail.com");
		driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("gamal@@t20166");
		driver.findElement(By.xpath(".//*[@id='u_0_2']")).click();

	}

}
