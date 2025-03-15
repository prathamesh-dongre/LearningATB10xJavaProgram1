package Class009OOPS_Constructor;

import java.time.Year;

public class Bike2 {
    String Make;
    String Model;
    int Torque;
    int Year;


    Bike2(){
        Make="UKKK";
        Model="DKKK";
        Year=0000;
        Torque=0;
    }
    Bike2(String Makename,String Modelname, int MFYear, int BikeTorque ){

        this.Model= Modelname;
        this.Make= Makename;
        this.Year= MFYear;
        this.Torque= BikeTorque;
    }

}
