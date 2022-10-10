import java.io.File;
import java.io.IOException;

import org.apache.logging.log4j.core.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dilip\\eclipse-workspace\\WebDriver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://demoqa.com");
		
		driver.manage().window().maximize();
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File src=ts.getScreenshotAs(OutputType.FILE);
	File trg=new File(".\\screenshot\\homepage.png");
	FileUtils.mkdir(src, true);
		
	}

}
