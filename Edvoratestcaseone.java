import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Edvoratestcaseone {

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
        
		
		WebElement uname = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/div/div/div[1]/div/input"));
        uname.sendKeys("Pwwv");
        
        WebElement pass = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/div/div/div[2]/div/input"));
        pass.sendKeys("paas");
        
        try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
        
        Alert al = driver.switchTo().alert();
        al.accept();
        
        WebElement Login = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/div/div/button"));
        Login.click();
        
        Alert all = driver.switchTo().alert();
        all.accept();
        

	}

}
