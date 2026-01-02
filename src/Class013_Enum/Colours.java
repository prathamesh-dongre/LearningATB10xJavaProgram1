package Class013_Enum;

public enum Colours {
    RED("#FRCRED"),
    Green("#FRCGREEN"),
    BLUE("#FRCBLUE"),
    BLACK("#FRCBLACK");

    private String hexcode1;

    Colours(String hexcode){
        this.hexcode1= hexcode;
    }
    String getHexcode()
    {
        return this.hexcode1;
    }
}