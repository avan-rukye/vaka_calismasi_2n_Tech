package vaka_calismasi_2n_Tech;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.List;

public class calisma_2 extends BaseDriver {

    @Test
    public void Test2() throws AWTException {
        driver.get("https://2nhaber.com/");

        driver.manage().window().maximize();

        Robot rbt=new Robot();




        WebElement search= driver.findElement(By.xpath("//div[@class='elementor-widget-cmsmasters-search__popup-trigger-container']"));
        search.click();
//div[@CLASS='elementor-widget-cmsmasters-search__form-container cmsmasters-submit-button-view-link']
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


        }



       /* Scanner okuStr=new Scanner(System.in);
        System.out.print("Seçim = "); int secim= okuStr.nextInt(2);

        switch (secim){
            case 1 :
                System.out.println("1."+ (e.getText().codePointAt(2)));break;
            case 2 :
                System.out.println("2."+ (e.getText().codePointAt(3)));break;
            case 3 :
                System.out.println("3."+ (e.getText().codePointAt(4)));break;
            case 4 :
                System.out.println("4."+ (e.getText().codePointAt(5)));break;
            case 5 :
                System.out.println("5."+ (e.getText().codePointAt(6)));break;
            case 6 :
                System.out.println("6."+ (e.getText().codePointAt(7)));break;




            default :
                System.out.println("Hatalı giriş"); // opsiyonlu , yazmayabilirsin
        }
*/

      // WebElement webSelect=driver.findElement(By.xpath("//div[@class='cmsmasters-blog__posts']"));
     //   Select javaSelect=new Select(webSelect);
      //  javaSelect.selectByIndex(2);  // ister bu şekilde seçebilirsin   : indexle
      //  MyFunc.Bekle(2);





    }




}
