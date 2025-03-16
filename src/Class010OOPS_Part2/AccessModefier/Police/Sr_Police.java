package Class010OOPS_Part2.AccessModefier.Police;

import CLASS001.Main;

public class Sr_Police {

    public int gun;
    public String ID;

    public Sr_Police(int gun) {
        ;
          this.gun=gun;
        System.out.println(gun);
    }
    //  Only class under this packages can use shoot function if Protected
    //  If private can be used only in this class
    //  If Public all can use same
        protected void shoot() {

            System.out.println("Yes,You can shoot");
        }

}

  class CID{

     public static void main(String[] args) {

         Sr_Police CID= new Sr_Police(10);
        CID.shoot();
     }


 }
