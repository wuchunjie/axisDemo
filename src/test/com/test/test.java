package com.test;

import com.yjcloud.health.vcard.webservices.impl.ErhcService;
import com.yjcloud.health.vcard.webservices.impl.ErhcServiceImplService;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * create by wcj
 * date 2018/7/17
 * time 14:38
 */
public class test {


    @Test
    public void test1(){

        ErhcServiceImplService service = new ErhcServiceImplService();
        ErhcService erhcService = service.getErhcServiceImplPort();
        String str = erhcService.doService("","");
        System.out.println(str);
    }

    @Test
    public void test2(){
        int[] i = new int[]{5,2,0};
        String[] s = new String[]{"L","O","V","E"};

        System.out.print(Arrays.toString(i));
        System.out.println(Arrays.toString(s));
    }

    @Test
    public void test() throws ParseException {

    }
}
