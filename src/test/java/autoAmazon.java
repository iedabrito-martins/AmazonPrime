
import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class autoAmazon {  
	private WebDriver driver;

	@Before
	public void before() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//driver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.com.br/");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	}

	@Test
	public void teste() {
		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		driver.findElement(By.name("email")).sendKeys("iedabmartins05@gmail.com");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.name("password")).sendKeys("050419");
		driver.findElement(By.id("signInSubmit")).click();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Arquitetura limpa: o guia do artesão para estrutura e design de software ");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.className("s-image")).click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 250)", "");
		driver.findElement(By.id("one-click-button")).click();
		//driver.findElement(By.id("buy-now-button")).click();		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);			
		driver.findElement(By.xpath("//*[@id='boleto']/div/div/label/div/div/div/div/label/input")).click();
		driver.findElement(By.xpath("//*[@id='place-order-button']")).click();
		
		/*driver.findElement(By.id("pp-Rix7r1-71")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		assertTrue(driver.findElement(By.id("a-popover-content-1")).isDisplayed());
		driver.findElement(By.name("ppw-widgetEvent:SetPaymentPlanSelectContinueEvent")).click();
		driver.findElement(By.className("a-button-text a-text-center")).click();*/
		
		
		
	}

	@After
	public void after() {
	//	driver.quit();
	}
}



