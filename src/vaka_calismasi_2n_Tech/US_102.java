package vaka_calismasi_2n_Tech;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.List;

public class US_102 extends BaseDriver {

    @Test
    public void Test2() throws AWTException {
        driver.get("https://2nhaber.com/");

        driver.manage().window().maximize();

        Robot rbt=new Robot();

        WebElement search= driver.findElement(By.xpath("//div[@class='elementor-widget-cmsmasters-search__popup-trigger-container']"));
        search.click();

        WebElement search_sendKeys= driver.findElement(By.xpath("//INPUT[@type='search']"));
        MyFunc.Bekle(5);

        search_sendKeys.sendKeys("İstanbul");
        rbt.keyPress(KeyEvent.VK_ENTER);
        MyFunc.Bekle(5);

       driver.navigate().to("https://2nhaber.com/?s=%C4%B0stanbul"); //siteye git,aç

        List<WebElement> linkler1= driver.findElements(By.tagName("h3"));// bütün H3 olan tagli elementleri bul

        System.out.println("linkler.size() = " + linkler1.size());

        int sira=0;

        for(WebElement e: linkler1)
        {
            //tıklatılabilir, görünen yazısı olan ve href i olan
            if (!e.getText().equals("") && e.getAttribute("class")!= null)
                System.out.println("e.getText() = " + (sira++) + "." + e.getText());


        }}}





