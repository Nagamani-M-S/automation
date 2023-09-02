package pomconcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	    FirefoxDriver driver=new FirefoxDriver();
	    driver.manage().window().maximize();
	    //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("https://www.facebook.com");
	}

}
