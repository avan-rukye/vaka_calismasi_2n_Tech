package vaka_calismasi_2n_Tech;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;

public class US_102 extends BaseDriver {

        @Test
        public void Test1_1() {

            driver.get("https://2nhaber.com/");
            MyFunc.navbar_neden_hover();
            MyFunc.navbar_nasil_hover();
            MyFunc.navbar_isDunyasi_hover();
            MyFunc.navbar_yasam_hover();


        }

    }
