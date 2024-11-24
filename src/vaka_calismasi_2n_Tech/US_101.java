package vaka_calismasi_2n_Tech;

import Utlity.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class US_101 extends BaseDriver {

    @Test
    public void Test1() {
        driver.get("https://2nhaber.com/");

        List<WebElement> linkler = driver.findElements(By.cssSelector("[id='menu-1-5dc673f1']"));

        for (WebElement e : linkler) {
            //tıklatılabilir, görünen yazısı
            if (!e.getText().equals("") && e.getClass() != null)

                System.out.println("Navbar  = "  + e.getText());
        }
        driver.quit();

    }





    }


