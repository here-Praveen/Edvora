import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Changepassword {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","D:\\\\Selenium\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testing-assessment-foh15kew9-edvora.vercel.app/");
		
		WebElement register = driver.findElement(By.xpath("//*[@id=\'__next\']/div/main/div/div/p[2]/button"));
		register.click();
		
        try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
        
		WebElement reguname = driver.findElement(By.xpath("//*[@id=\'__next\']/div/main/div/div/div[1]/div/input"));
        reguname.sendKeys("Pbbv");
        
        WebElement regpass = driver.findElement(By.xpath("//*[@id=\'__next\']/div/main/div/div/div[2]/div/input"));
        regpass.sendKeys("ptts");
        
        WebElement Submit = driver.findElement(By.xpath("//*[@id=\'__next\']/div/main/div/div/button"));
        Submit.click();
        
        try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
        
        Alert al = driver.switchTo().alert();
        al.accept();
        
        WebElement editpro = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/div/div[1]/div[1]/div/div/button"));
        editpro.click();
         
        JavascriptExecutor js = (JavascriptExecutor) driver;
        
        js.executeScript("window.scrollBy(0,1000)");
        
        WebElement cpass = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/div/div[1]/div[1]/div/div/button"));
        cpass.sendKeys("newo");
        
        WebElement Submitpass = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/div/div[2]/div[1]/div/div/button[2]"));
        Submitpass.click();
        
        driver.get("https://testing-assessment-foh15kew9-edvora.vercel.app/");
		
        reguname.sendKeys("Pbbv");
       
        regpass.sendKeys("newo");
        Submit.click();
        
        al.accept();
        
	}

}
