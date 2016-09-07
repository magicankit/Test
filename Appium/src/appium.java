
import io.appium.java_client.android.AndroidDriver;

import java.awt.event.KeyEvent;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;



public class appium {

		private static AndroidDriver driver;
		public static void main(String[] args) throws MalformedURLException, InterruptedException {
			
			//For app
			
			/*File classpathRoot = new File(System.getProperty("user.dir"));
			File appDir = new File(classpathRoot, "/Apps/Amazon/");
			//File app = new File("E:/Jar/com.amazon.mShop.android.shopping-5.2.3-502030-minAPI9.apk");
			File app = new File(appDir, "com.amazon.mShop.android.shopping-5.2.3-502030-minAPI9.apk");
			
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
			capabilities.setCapability("deviceName", "Ranjan");
			capabilities.setCapability("platformVersion", "4.4.2");
			capabilities.setCapability("platformName", "Android");
			capabilities.setCapability("app", app.getAbsolutePath());
			capabilities.setCapability("appPackage", "com.amazon.mShop.android.shopping");
			capabilities.setCapability("appActivity", "com.amazon.mShop.splashscreen.StartupActivity");

			driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
			//Thread.sleep(10000);
			driver.findElement(By.className("android.widget.EditText")).click();
			driver.findElementById("rs_search_src_text").sendKeys("ranjan");
			//driver.findElementById("rs_search_src_text").sendKeys("ranjan");
			//driver.tap(fingers, driver.findElementById("rs_search_src_text"), 2);
			driver.pressKeyCode(66);
			driver.quit();*/

			//For web
			
			
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability(CapabilityType.BROWSER_NAME, "CHROME");
			capabilities.setCapability("deviceName", "Ranjan");
			capabilities.setCapability("platformVersion", "4.4.2");
			capabilities.setCapability("platformName", "Android");
			capabilities.setCapability("appPackage", "http://www.zeenews.com/");
			

			driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			driver.get("http://www.zeenews.com/");
			driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
			//Thread.sleep(10000);
			driver.findElement(By.className("android.widget.EditText")).click();
			driver.findElementById("rs_search_src_text").sendKeys("ranjan");
			//driver.findElementById("rs_search_src_text").sendKeys("ranjan");
			//driver.tap(fingers, driver.findElementById("rs_search_src_text"), 2);
			driver.pressKeyCode(66);
			driver.quit();

			
			
	}

}