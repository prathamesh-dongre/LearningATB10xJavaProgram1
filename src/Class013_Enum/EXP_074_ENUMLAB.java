package Class013_Enum;

public class EXP_074_ENUMLAB {

        public static void main(String[] args) {
            System.out.println(URLS.katalon);
            if (URLS.katalon.name().equals("katalon")) {
                System.out.println("I want to do somethings");
            }
        }
    // if (URLS.katalon.equals("katalon"))
    //URLS.katalon → enum object
    // "katalon" → String
    //Enum never equals a String

    // Enum is nothing
    enum URLS {
        google, restassured, katalon, vwo
    }
}
