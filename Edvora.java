// TS001 User able to register using any username and password without any problem.


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Edvora {

	public static void main(String[] args) {
       System.setProperty("webdriver.chrome.driver","D:\\\\Selenium\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testing-assessment-foh15kew9-edvora.vercel.app/");
		
		WebElement register = driver.findElement(By.xpath("//*[@id=\'__next\']/div/main/div/div/p[2]/button"));
		register.click();
		
		WebElement reguname = driver.findElement(By.xpath("//*[@id=\'__next\']/div/main/div/div/div[1]/div/input"));
        reguname.sendKeys("Prav");
        
        WebElement regpass = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/div/div/div[2]/div/input"));
        regpass.sendKeys("pass");
        
        WebElement Submit = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/div/div/button"));
        Submit.click();
        
        Alert al = driver.switchTo().alert();
        al.accept();
	    
	}
	

}
