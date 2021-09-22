package mvnId;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeClass {

	public static void main(String[] args) {
		//WebDriverManager.chromedriver().setup();
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        
	}

}
