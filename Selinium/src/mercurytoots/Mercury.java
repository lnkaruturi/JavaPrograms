package mercurytoots;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mercury {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LAKSHMI NARAYANA\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.newtours.demoaut.com/");
		driver.findElement(By.xpath(".//*[starts-with(@href,'mercuryregister.php')]")).click();
		driver.findElement(By.xpath(".//*[contains(@name,'firstName')]")).sendKeys("Lakshmi");
		driver.findElement(By.xpath(".//*[contains(@name,'lastName')]")).sendKeys("Karuturi");
		driver.findElement(By.xpath(".//*[contains(@name,'phone')]")).sendKeys("7047791898");
		driver.findElement(By.xpath(".//*[contains(@id,'userName')]")).sendKeys("lkaruturi77@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[contains(@name,'address1')]")).sendKeys("4211 Harwin Place");
		//driver.findElement(By.name("address1")).sendKeys("4211 Harwin Place");
		driver.findElement(By.name("address2")).sendKeys("Apt-309");
		driver.findElement(By.xpath(".//*[contains(@name,'city')]")).sendKeys("Glen Allen");
		//driver.findElement(By.name("city")).sendKeys("Glen Allen");
		driver.findElement(By.xpath(".//*[contains(@name,'state')]")).sendKeys("VA");
		//driver.findElement(By.name("state")).sendKeys("VA");
		driver.findElement(By.name("postalCode")).sendKeys("23060");
		driver.findElement(By.name("country")).sendKeys("UNITED STATES");
		Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys("lkaruturi77@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Lucky@5594");
		driver.findElement(By.name("confirmPassword")).sendKeys("Lucky@5594");
	}

}
