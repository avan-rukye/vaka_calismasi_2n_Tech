package vaka_calismasi_2n_Tech;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class calisma_4 extends BaseDriver {

    @Test
    public void Test3() throws AWTException {

       driver.get("https://www.2ntech.com.tr/hr");
        driver.manage().window().maximize();
        Robot rbt=new Robot();

        MyFunc.Bekle(4);
        WebElement name= driver.findElement(By.xpath("//INPUT[@id='name']"));
        name.sendKeys("RUKİYE AVAN");

        WebElement birth= driver.findElement(By.xpath("//INPUT[@id='birth']"));
        birth.sendKeys("22041998");

        WebElement tc= driver.findElement(By.xpath("//INPUT[@id='tcKimlik']"));
        tc.sendKeys("55555555555");

        WebElement telNo= driver.findElement(By.xpath("//INPUT[@id='phone']"));
        telNo.sendKeys("05466619950");

        WebElement email= driver.findElement(By.xpath("//INPUT[@id='email']"));
        email.sendKeys("avanrukiye3@gmail.com");

        WebElement cv= driver.findElement(By.xpath("//LABEL[@for='cv_field'][text()='Dosya Yükleyiniz (.pdf)']"));
        cv.click();

        StringSelection dosyaYolu= new StringSelection("D:\\Users\\User\\Desktop\\BOS_CV.pdf");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(dosyaYolu, null);
        rbt.keyPress(KeyEvent.VK_ENTER);

        WebElement lisans= driver.findElement(By.xpath("//BUTTON[@type='button'][text()='Lisans']"));
        lisans.click();


        WebElement next= driver.findElement(By.xpath("//BUTTON[@type='submit']"));
        next.click();


        WebElement testEngineer= driver.findElement(By.xpath("//SPAN[@class='text-[15px] font-semibold text-white'][text()='Test Engineer']"));
        testEngineer.click();

        WebElement gonder= driver.findElement(By.xpath("//DIV[@class='text-white flex justify-center items-center text-[14px] py-2 px-4 rounded-full bg-[#DF1F29] cursor-pointer'][text()='Gönder']"));
        gonder.click();

        Assert.assertTrue("başvuru başarısız",driver.getCurrentUrl().equals("https://www.2ntech.com.tr/success"));
        //Ben true bekliyorum, değilse göster, yoksa test passed





    }


}
