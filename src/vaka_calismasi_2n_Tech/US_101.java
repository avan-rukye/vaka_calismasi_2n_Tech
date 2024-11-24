package calisma_1;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import com.google.common.annotations.VisibleForTesting;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.util.List;

public class calisma_1 extends BaseDriver {

    @Test
    public void Test1() {
        driver.get("https://2nhaber.com/");

        List<WebElement> linkler = driver.findElements(By.cssSelector("[id='menu-1-5dc673f1']"));

        for (WebElement e : linkler) {
            //tıklatılabilir, görünen yazısı olan ve class i olan
            if (!e.getText().equals("") && e.getClass() != null)

                System.out.println("Navbar  = "  + e.getText());
        }


    }
    @Test
    public void Test1_1() {

        driver.get("https://2nhaber.com/");
        MyFunc.navbar_neden_hover();
        MyFunc.navbar_nasil_hover();
        MyFunc.navbar_isDunyasi_hover();
        MyFunc.navbar_yasam_hover();

        driver.quit();
    }




    }


