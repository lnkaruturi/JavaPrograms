import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Github {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LAKSHMI NARAYANA\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://github.com/");
		//driver.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/div/span/div/a[2]")).click();
		//driver.findElement(By.xpath("//*[@id=\"user_login\"]")).sendKeys("LuckyKLN");
		//driver.findElement(By.xpath("//*[@id=\"user_email\"]")).sendKeys("lkaruturi77@gmail.com");
		//driver.findElement(By.xpath("//*[@id=\"user_password\"]")).sendKeys("Kln@5594");
		//driver.findElement(By.xpath("//*[@id=\"signup_button\"]")).click();
		driver.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/div/span/div/a[1]")).click();
		driver.findElement(By.name("login")).sendKeys("LuckyKLN");
		driver.findElement(By.name("password")).sendKeys("Kln@5594");
		//driver.findElement(By.name("commit")).click();
		driver.findElement(By.xpath(".//*[contains(@name,'commit')]")).click();
	}

}
