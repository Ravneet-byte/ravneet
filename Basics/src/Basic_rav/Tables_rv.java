package Basic_rav;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tables_rv {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","H:\\New folder (2)\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.toolsqa.com/automation-practice-table");
/*List<WebElement>rows=driver.findElements(By.xpath("//*[@id='content']/table/tbody/tr/td[2]"));
int s=rows.size();

System.out.println("size is:"+s);

for(int i=0;i<s;i++){
	
	String text=rows.get(i).getText();
	System.out.println("text of row"+ i+"is:"+text);
}*/

/*List<WebElement>cols=driver.findElements(By.xpath("//*[@id='content']/table/tbody/tr[1]/td"));
int s=cols.size();

System.out.println("size is:"+s);

for(int i=0;i<s;i++){
	
	String text=cols	.get(i).getText();
	System.out.println("text of row"+ i+"is:"+text);
}*/


String t=driver.findElement(By.xpath("//*[@id='content']/table/tbody/tr[1]/th")).getText();
System.out.println(t);

WebElement table=driver.findElement(By.xpath("//table[@summary='Sample Table']"));
List<WebElement>rows=table.findElements(By.tagName("tr"));
int rowsize=rows.size();
System.out.println("total rows are:"+rowsize);
for(int i=0;i<rowsize;i++){
	
	List<WebElement>cols=rows.get(i).findElements(By.tagName("td"));
	int colsize=cols.size();
	System.out.println("cols are :"+colsize);
	for(int j=0;j<colsize;j++){
		
	String col=	cols.get(j).getText();
		
		System.out.println("text of column is at row :"+i+"and column "+j+"is:"+col);
		
	}
	System.out.println("----------------------");
}
	}

}
