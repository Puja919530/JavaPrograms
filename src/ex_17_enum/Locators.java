package ex_17_enum;

public enum Locators {
    page_button("#btn"),
    page_input("#input1");

    private String locators;

    Locators(String locators){
        this.locators = locators;
    }

    String getLocators(){
        return this.locators;
    }

}
