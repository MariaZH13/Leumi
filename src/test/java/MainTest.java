import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class MainTest {

    WebDriver wd;

    @BeforeMethod
    public void init(){
        wd = new ChromeDriver();
        wd.manage().window().maximize();
        wd.navigate().to("https://www.leumi.co.il/");
        wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

    @Test
    public void findElement(){
        System.out.println(wd.findElement(By.xpath("//span[.='פרטי']")).getText());
    }


    @AfterMethod
    public void tearDown(){
        wd.quit();
    }
}
