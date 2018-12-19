package com.example.weronika.wskazniekppm;

public class PPM {

    private double wzrost, wiek, masa;
    private String plec;

    public PPM(double wzrost, double wiek, double masa, String plec) {
        this.wzrost = wzrost;
        this.wiek = wiek;
        this.masa = masa;
        this.plec = plec;
    }

    public double Benedicta_Harrisa() {
     double wynikBH = 0;

     if(plec.equals("Kobieta")) {
         wynikBH =  655.1 +(9.563 * masa)+(1.85 * wzrost)-(4.676*wiek);
     }
     else {
         wynikBH =66.5 + (13.75* masa) + (5.003* wzrost)- (6.775*wiek);
     }


     return wynikBH;
    }

    public double Mufflin(){
       double wynikM=0;
        if(plec.equals("Kobieta")) {
            wynikM =  (10*masa)+(6.25*wzrost)-(5*wiek)- 161;
        }
        else {
            wynikM =(10*masa)+(6.25*wzrost)-(5*wiek) + 5;
        }
        return wynikM;
    }


}

