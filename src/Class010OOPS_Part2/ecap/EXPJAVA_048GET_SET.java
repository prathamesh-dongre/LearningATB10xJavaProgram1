package Class010OOPS_Part2.ecap;

public class EXPJAVA_048GET_SET {

    public static void main(String[] args) {
        VwoLogin User1 = new VwoLogin("PPSS@123", "Wel1234");
        System.out.println(User1.Password);
        System.out.println(User1.Username);

        GoodEncapVwoLogin User2= new GoodEncapVwoLogin();
        User2.setUsername("Admin@t98o");
        System.out.println( User2.getUsername());

        User2.setPassword(false, "Admin@123");
        System.out.println(User2.getPassword());

     }
}

    class VwoLogin{
        public String Username;
        public String Password;

        VwoLogin(String User, String Pass){

            this.Username= User;
            this.Password=Pass;

        }

    }
    class  GoodEncapVwoLogin{
        private String username;
        private String password;


        public String getUsername(){
            return  username;
        }

        public void setUsername(String user){
            this.username= user;

        }

        public void setPassword(Boolean IsAdmin ,String Pass) {

            if (IsAdmin) {
                this.password = Pass;
            } else {
                System.out.println("Not Authorised for password Login");
            }
        }

        public String getPassword() {
            return password;
        }
    }












