package Basic_rav;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Hdfc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","H:\\New folder (2)\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.hdfc.com/");
driver.manage().window().maximize();
System.out.println("title of parent window:"+driver.getTitle());
System.out.println("url of website is:"+driver.getCurrentUrl());
//String parent=driver.getWindowHandle();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
WebDriverWait w=new WebDriverWait(driver,10);
String parent1=driver.getWindowHandle();
/*WebElement e=driver.findElement(By.linkText("Existing Customers"));
Actions a=new Actions(driver);
a.moveToElement(e).perform();
WebElement s=driver.findElement(By.xpath("//*[@id='existing-customer-menu']/li/ul/li[1]/a"));
a.moveToElement(s).perform();
a.moveToElement(driver.findElement(By.linkText("Customer Login"))).click().build().perform();
Set<String>child1=driver.getWindowHandles();
Iterator<String>i=child1.iterator();
while(i.hasNext()){
	
	String child=i.next();
	if(!parent.equalsIgnoreCase(child)){
		
		
		driver.switchTo().window(child);
	String tit=	driver.getTitle();
	System.out.println("title of child window is:"+tit);
	driver.findElement(By.xpath("//*[@id='frmLoginAccount']/div[1]/input")).sendKeys("01234567");
	driver.findElement(By.name("dob")).click();
	driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr[2]/td[4]/a")).click();
	driver.findElement(By.xpath("//*[@id='frmLoginAccount']/div[4]/button")).click();
	//driver.close();
	}
}
driver.switchTo().window(parent);*/
//driver.findElement(By.linkText("About Us")).click();
/*Actions a=new Actions(driver);
a.moveToElement(driver.findElement(By.linkText("Deposits"))).click().build().perform();
//a.moveToElement(driver.findElement(By.xpath("//*[@id='navbarDropdown']"))).perform();
w.until(ExpectedConditions.elementToBeClickable(By.linkText("PLACE YOUR DEPOSITS ONLINE")));
driver.findElement(By.linkText("PLACE YOUR DEPOSITS ONLINE")).click();
System.out.println("-----------done");

Set<String>id=driver.getWindowHandles();
Iterator<String>i=id.iterator();
while(i.hasNext()){
	
	String child1=i.next();
	if(!parent1.equalsIgnoreCase(child1))
	{
		
		driver.switchTo().window(child1);
		w.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/form[1]/section/div[2]/div[1]/div/a")));
		driver.findElement(By.xpath("/html/body/form[1]/section/div[2]/div[1]/div/a")).click();
		driver.close();
		
	}
	
}
driver.switchTo().window(parent1);
driver.navigate().back();*/

//driver.findElement(By.xpath("//*[@id='navbar']/div/div[1]/div/a/img")).click();
/*WebElement e=driver.findElement(By.xpath("//*[@id='primary-menu']/li[1]"));
Actions a=new Actions(driver);
a.moveToElement(e).build().perform();
//driver.findElement(By.linkText("Home Improvement Loans")).click();
List<WebElement>list=driver.findElements(By.xpath("//ul[starts-with(@class,'menu-list')]"));
int linksize=list.size();
System.out.println("total links are:"+linksize);
for(int i=0;i<linksize;i++){
	
	String t=list.get(i).getText();
	if(!t.isEmpty()){
		System.out.println("link at:"+i+"is:"+t);
		
	}
	
}*/
driver.findElement(By.linkText("About Us")).click();
	}}

