package org.movoto.selenium.example;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Created by haozuo on 3/22/16.
 */
public class ChromeDriverTest {

    //private String testUrl;
    private WebDriver driver;

    @Before
    public void prepare() throws IOException {
        //setup chromedriver
        System.setProperty(
                "webdriver.chrome.driver",
                "webdriver/chromedriver");
        
        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");
        WebDriver driver = new ChromeDriver(options);
        

        // Create a new instance of the Chrome driver
        // Notice that the remainder of the code relies on the interface,
        // not the implementation.
        //driver = new ChromeDriver();

        //maximize window
        driver.get("https://en.wikipedia.org/wiki/Main_Page");
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        String title = driver.getTitle();
        System.out.println("............................................................................."+title);
        driver.manage().window().maximize();

        // And now use this to visit myBlog
        // Alternatively the same thing can be done like this
        // driver.navigate().to(testUrl);
        //driver.get(testUrl);
    }

	/*
	 * @Test public void testTitle() throws IOException {
	 * 
	 * // Find elements by attribute lang="READ_MORE_BTN" List<WebElement> elements
	 * = driver .findElements(By.cssSelector("[lang=\"READ_MORE_BTN\"]"));
	 * 
	 * //Click the selected button elements.get(0).click();
	 * 
	 * 
	 * assertTrue("The page title should be chagned as expected", (new
	 * WebDriverWait(driver, 5)) .until(new ExpectedCondition<Boolean>() { public
	 * Boolean apply(WebDriver d) { return d.getTitle().equals("我眼中软件工程人员该有的常识"); }
	 * }) );
	 */

    @After
    public void teardown1() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void test() {
		/*
		 * driver.get("https://en.wikipedia.org/wiki/Main_Page");
		 * driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); String title
		 * = driver.getTitle(); System.out.println(title);
		 */
    }

 

}
