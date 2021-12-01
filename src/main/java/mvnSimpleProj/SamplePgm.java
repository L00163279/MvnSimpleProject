package mvnSimpleProj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SamplePgm
{
	
    public static void main(String[] args)
    {
    	
//    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\shafe\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
//        
//        //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		driver.manage().window().maximize();
//
//        
//        // And now use this to visit Google
//        driver.get("http://www.facebook.com");
//        String URL= driver.getCurrentUrl();
//		System.out.println(URL);
    	SamplePgm.getTitle();
}
    public static String getTitle() {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\shafe\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
    	ChromeDriver driver = new ChromeDriver();
    	driver.get("http://www.facebook.com");
    	String title = driver.getTitle();
    	System.out.println(title);
    	return title;
    }
}