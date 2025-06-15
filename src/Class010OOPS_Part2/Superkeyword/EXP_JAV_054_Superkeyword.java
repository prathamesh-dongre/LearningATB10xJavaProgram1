package Class010OOPS_Part2.Superkeyword;

public class EXP_JAV_054_Superkeyword {

    public static void main(String[] args) {


        baseTC TC1 = new baseTC("Chrome");
        System.out.println(TC1.getbrowser());

        TC1.setbrowser("Edge",false);
        System.out.println(TC1.getbrowser());

    }
}

class baseTC {

    public String browser;
    //public boolean IsAdmin;
    public baseTC(String browser){

        this.browser = browser;
    }


    public String getbrowser(){
        return browser;
    }

    public void setbrowser(String browser, boolean ISADMIN){

        if(ISADMIN) {
            this.browser = browser;
        }

        else {
            System.out.println("Cannot change browser");
        }

    }
}
