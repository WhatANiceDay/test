package testng.tests;

import com.csdc.webclient.pageobjects.LoginPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import sun.rmi.runtime.Log;
import testng.base.WebClientTestBase;

public class DummyWebClientTest extends WebClientTestBase {

    private static final Logger log = LoggerFactory.getLogger(WebClientTestBase.class);

    private final static String DB_NAME = "TESTDATA (MS-vm)";
    private final static String USERNAME = "TEST_USER";
    private final static String PASSWORD = "TEST_USER";

    private LoginPage loginPage = appContext.getBean(LoginPage.class);

    @Test
    public void userLoginTest() {
        loginPage.open()
                .selectDB(DB_NAME)
                .signIn(USERNAME, PASSWORD);


        //works for Selenium  Chrome on linux with Xvbf
        /*System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        ChromeOptions ChromeOptions = new ChromeOptions();
        ChromeOptions.addArguments("window-size=1024,768");
        WebDriver driver = new ChromeDriver(ChromeOptions);
        driver.get("http://www.google.com");

        driver.findElement(By.name("q")).sendKeys("BLALA");
        driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
        log.info("-----------:" + driver.findElement(By.name("q")).getTagName());*/


        //works for Selenide  Chrome on linux with Xvbf
//        Configuration.baseUrl = WebClientProperties.readString("selenide.base.url");
//        Configuration.browser = "Chrome";
//        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
//        Selenide.open("http://www.google.com");
//        System.out.println("-----------:" + Selenide.$(By.name("q")).getTagName());


//        System.setProperty("webdriver.ie.driver", "src/test/resources/IEDriverServer.exe");
//        WebDriver driver = new InternetExplorerDriver();
//        driver.get("http://www.google.com");
//        log.info("-----------:" + driver.findElement(By.name("q")).getTagName());


//        Configuration.baseUrl = WebClientProperties.readString("selenide.base.url");
//        Configuration.browser = "ie";
//        System.setProperty("webdriver.ie.driver", "src/test/resources/IEDriverServer.exe");
//        Selenide.open("http://www.google.com");
//        System.out.println("-----------:" + Selenide.$(By.name("q")).getTagName());
    }
}
