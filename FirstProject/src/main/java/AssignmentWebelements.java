
import java.util.Timer;
import java.util.concurrent.TimeUnit;

import org.apache.hc.core5.util.Timeout;
import org.bouncycastle.asn1.cms.Time;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentWebelements {

	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(By.id("email")).sendKeys("shar@gmail.com");
		
		
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("firstname")).sendKeys("Shat");
		driver.findElement(By.xpath("//*[@name='lastname']")).sendKeys("Pat");
		driver.findElement(By.xpath("//*[@name='reg_email__']")).sendKeys("ShatPat@gmail.com");
		driver.findElement(By.xpath("//*[@name='reg_email_confirmation__']")).sendKeys("ShatPat@gmail.com");
		driver.findElement(By.xpath("//*[@name='reg_passwd__']")).sendKeys("ShatPat");
		Select s=new Select(driver.findElement(By.name("birthday_month")));
		s.selectByIndex(4);
		Select s1=new Select(driver.findElement(By.name("birthday_day")));
		s1.selectByValue("8");
		WebElement year=driver.findElement(By.name("birthday_year"));
		Select s2=new Select(year);
		s2.selectByVisibleText("1990");
		
		WebElement rdbtn=driver.findElement(By.xpath("//label[text()='Female']"));
		
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();	
		
		driver.close();

	}

}
