package Utlity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import static Utlity.BaseDriver.driver;

public class MyFunc {

    public static void Bekle(int sn){

        try {
            Thread.sleep(sn*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static void navbar_neden_hover(){

        Actions aksiyonlar=new Actions(driver); //aksiyonDriver
        MyFunc.Bekle(2);

        WebElement element=driver.findElement(By.xpath("//li[@id='menu-item-31740']"));
        Action aksiyon=aksiyonlar.moveToElement(element).build(); // üzerine gittin
        aksiyon.perform(); // üzerinde olduğunu etkinleştir.
    }

    public static void navbar_nasil_hover(){

        Actions aksiyonlar=new Actions(driver); //aksiyonDriver
        MyFunc.Bekle(2);
        WebElement element=driver.findElement(By.xpath("//li[@id='menu-item-31623']"));
        Action aksiyon=aksiyonlar.moveToElement(element).build(); // üzerine gittin
        aksiyon.perform(); // üzerinde olduğunu etkinleştir.
    }


    public static void navbar_isDunyasi_hover(){

        Actions aksiyonlar=new Actions(driver); //aksiyonDriver
        MyFunc.Bekle(2);

        WebElement element=driver.findElement(By.xpath("//li[@id='menu-item-31632']"));
        Action aksiyon=aksiyonlar.moveToElement(element).build(); // üzerine gittin
        aksiyon.perform(); // üzerinde olduğunu etkinleştir.
    }


    public static void navbar_yasam_hover(){

        Actions aksiyonlar=new Actions(driver); //aksiyonDriver
        MyFunc.Bekle(2);

        WebElement element=driver.findElement(By.xpath("//li[@id='menu-item-31629']"));
        Action aksiyon=aksiyonlar.moveToElement(element).build(); // üzerine gittin
        aksiyon.perform(); // üzerinde olduğunu etkinleştir.
    }



}
