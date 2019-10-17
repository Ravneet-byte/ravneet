package Basic_rav;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robot_basics {
	public static void main(String[] args) throws AWTException, IOException, InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","H:\\New folder (2)\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
Robot r=new Robot();
String command="notepad.exe";
Process exec=Runtime.getRuntime().exec(command);
try{
	
	Thread.sleep(1000);
}
catch(Exception e){
	System.out.println("exception is:"+e);
}

r.keyPress(KeyEvent.VK_H);
Thread.sleep(1000);
r.keyPress(KeyEvent.VK_E);
Thread.sleep(1000);
r.keyPress(KeyEvent.VK_L);
Thread.sleep(1000);
r.keyPress(KeyEvent.VK_L);
Thread.sleep(1000);
r.keyPress(KeyEvent.VK_O);
Thread.sleep(1000);
System.out.println("------------all done in notepad-----------");





/*driver.get("http://spreadsheetpage.com/index.php/file/C35/P10/"); // sample url	
driver.findElement(By.xpath(".//a[@href=contains(text(),'yearly-calendar.xls')]")).click();	
Robot robot = new Robot();  // Robot class throws AWT Exception	
Thread.sleep(2000); // Thread.sleep throws InterruptedException	
robot.keyPress(KeyEvent.VK_DOWN);  // press arrow down key of keyboard to navigate and select Save radio button	

Thread.sleep(2000);  // sleep has only been used to showcase each event separately	
robot.keyPress(KeyEvent.VK_TAB);	
Thread.sleep(2000);	
robot.keyPress(KeyEvent.VK_TAB);	
Thread.sleep(2000);	
robot.keyPress(KeyEvent.VK_TAB);	
Thread.sleep(2000);	
robot.keyPress(KeyEvent.VK_ENTER);	
// press enter key of keyboard to perform above selected action	
*/}	 
}
