package Basic_rav;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Basic_ravneet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","H:\\New folder (2)\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.google.com/");
driver.manage().window().maximize();
driver.findElement(By.name("q")).sendKeys("Eclipse luna download");
Actions s=new Actions(driver);
s.sendKeys(Keys.ENTER).perform();
driver.get("https://www.facebook.com/");
WebElement e=driver.findElement(By.xpath("//input[@type='email']"));
Actions a=new Actions(driver);
a.moveToElement(e).keyDown(e,Keys.SHIFT).sendKeys(e, "rvurandhawa").keyUp(Keys.SHIFT).doubleClick().contextClick().build().perform();
a.moveToElement(e).sendKeys(e,"rvurandhawa").keyDown(e,Keys.CONTROL).sendKeys("a").build().perform();
a.keyDown(e,Keys.CONTROL).sendKeys("c").build().perform();
a.keyDown(driver.findElement(By.xpath("//input[@name='firstname']")),Keys.CONTROL).sendKeys("v").build().perform();
	}

}
