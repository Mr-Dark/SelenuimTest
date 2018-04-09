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
		driver.findElement(By.xpath(".//*[@id='u_0_a']")).sendKeys("Jamal");
		driver.findElement(By.xpath(".//*[@id='u_0_c']")).sendKeys("Alkelani");
		driver.findElement(By.xpath(".//*[@id='u_0_f']")).sendKeys("gamalxx@gmail.com");
		driver.findElement(By.xpath(".//*[@id='u_0_i']")).sendKeys("gamalxx@gmail.com");
		driver.findElement(By.xpath(".//*[@id='u_0_m']")).sendKeys("TestWithSelenuim");
		driver.findElement(By.xpath(".//*[@id='u_0_7']")).click();
		Select sel=new Select(driver.findElement(By.xpath(".//*[@id='month']")));
		sel.selectByIndex(3);
		Select sel2=new Select(driver.findElement(By.xpath(".//*[@id='day']")));
		sel.selectByIndex(3);
		Select sel3=new Select(driver.findElement(By.xpath(".//*[@id='year']")));
		sel.selectByIndex(3);
		driver.findElement(By.xpath(".//*[@id='u_0_s']")).click();
	}

}
