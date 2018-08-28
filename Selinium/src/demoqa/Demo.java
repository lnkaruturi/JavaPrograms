package demoqa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LAKSHMI NARAYANA\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demoqa.com/");
		driver.findElement(By.xpath("//*[@id=\"menu-item-374\"]")).click();
		driver.findElement(By.name("first_name")).sendKeys("Lakshmi ");
		//Thread.sleep(1000);
		driver.findElement(By.name("last_name")).sendKeys("Karuturi ");
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"pie_register\"]/li[2]/div/div/input[1]")).click();
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"pie_register\"]/li[3]/div/div[1]/input[3]")).click();
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"dropdown_7\"]")).sendKeys("India");
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"mm_date_8\"]")).sendKeys("5");
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"dd_date_8\"]")).sendKeys("6");
		
		driver.findElement(By.xpath("//*[@id=\"yy_date_8\"]")).sendKeys("1993");
		
		driver.findElement(By.xpath("//*[@id=\"phone_9\"]")).sendKeys("7047791898");
		//Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		driver.findElement(By.id("username")).sendKeys("Lucky");
		//Thread.sleep(1000);
		driver.findElement(By.name("e_mail")).sendKeys("lkaruturi77@gmail.com");
		//Thread.sleep(1000);
		WebElement upload = driver.findElement(By.xpath("//*[@id=\"profile_pic_10\"]"));
		 upload.sendKeys("C:\\Users\\LAKSHMI NARAYANA\\Downloads\\IMG_1166.jpg");
		 driver.findElement(By.id("description")).sendKeys("This is LK");
		 driver.findElement(By.id("password_2")).sendKeys("Lucky@55947233");
		 driver.findElement(By.xpath("//*[@id=\"confirm_password_password_2\"]")).sendKeys("Lucky@55947233");
		 //driver.findElement(By.xpath("//*[@id=\"pie_register\"]/li[14]/div/input")).click();
		
		
		
		
		
		

	}

}
