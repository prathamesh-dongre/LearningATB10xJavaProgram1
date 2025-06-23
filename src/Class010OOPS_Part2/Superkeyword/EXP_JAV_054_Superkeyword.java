package Class010OOPS_Part2.Superkeyword;

public class EXP_JAV_054_Superkeyword {

    public static void main(String[] args) {


        baseTC TC1 = new baseTC("Chrome");
        System.out.println(TC1.getbrowser());

        TC1.setbrowser("Edge",false);
        System.out.println(TC1.getbrowser());

        Testcase1 TT1 =new Testcase1("Mozilla");
        TT1.setbrowser("Mozilla Fire", true);
        System.out.println(TT1.getbrowser());

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

class Testcase1 extends baseTC {


    public Testcase1(String browser) {
        super(browser);
    }


    @Override
    public void setbrowser (String browserfox, boolean ISADMIN) {
        System.out.println("Overide the parent Set Browser");
        this.browser= browserfox;
    }
    public String getbrowser() {
        return browser;
    }
}
