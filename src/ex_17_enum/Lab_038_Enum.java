package ex_17_enum;

import org.xml.sax.Locator;

public class Lab_038_Enum {
    public static void main(String[] args) {

        System.out.println(Locators.page_button.getLocators());
        System.out.println(Locators.page_input.getLocators());

        System.out.println("---------");
        System.out.println(Colors.RED.getHexaCode());
        System.out.println(Colors.GREEN.getHexaCode());

        System.out.println("_________");
        System.out.println(APIURLs.google.getUrl());
        System.out.println(APIURLs.vwo.getUrl());
        System.out.println(APIURLs.katalon.getUrl());

    }
}
