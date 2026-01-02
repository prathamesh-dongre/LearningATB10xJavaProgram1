package Class013_Enum;

public enum Locators {

        page_button("#btn"),
        page_input("#input1");

    private String locator1;

    Locators(String locator){
        this.locator1 = locator;
    }

    String getLocator(){
        return this.locator1;
    }
}
