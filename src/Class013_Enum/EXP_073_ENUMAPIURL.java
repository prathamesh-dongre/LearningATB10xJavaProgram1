package Class013_Enum;

enum EXP_073_ENUMAPIURL {

    katalon("https://katalon.com"),
    google("https://google.com");
    private String url;

    EXP_073_ENUMAPIURL(String url){
        this.url=url;
    }
     String getUrl (){
        return this.url;
     }
}
