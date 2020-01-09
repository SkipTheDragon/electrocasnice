/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electrocasnice;

/**
 *
 * @author Andrei
 */

//clasa copil

public class Televizor extends Electrocasnice {
        int Diagonala;
    boolean smart, UHD, Curbat, OLED;
    
    //constructor fara parametri
    
    Televizor(){
    super();
    Diagonala=100;
    smart=true;
    UHD=false;
    Curbat=false;
    OLED=false;
}
    
    //Super se foloseste pentru a apela clasa parinte(Electrocasnice)
    
    //constructor fara parametri
    
    
    Televizor(String Producator, String EficientaEnergetica, float Pret, boolean UzCasnic, int Diagonala, boolean smart, boolean UHD, boolean Curbat, boolean OLED){
       super(Producator, EficientaEnergetica, Pret, UzCasnic);
       this.Diagonala=Diagonala;
       this.smart=smart;
       this.UHD=UHD;
       this.Curbat=Curbat;
       this.OLED=OLED;
    }
    Televizor(Electrocasnice e, int Diagonala, boolean smart, boolean UHD, boolean Curbat, boolean OLED){
       super(e);
       this.Diagonala=Diagonala;
       this.smart=smart;
       this.UHD=UHD;
       this.Curbat=Curbat;
       this.OLED=OLED;
    }
    Televizor(Televizor t){
        super(t);
       this.Diagonala=t.Diagonala;
       this.smart=t.smart;
       this.UHD=t.UHD;
       this.Curbat=t.Curbat;
       this.OLED=t.OLED;
    }
    
        //metoda toString pentru a putea afisa obiectul.
    
    public String toString(){
         String newline = System.getProperty("line.separator");
         return super.toString()+"Diagonala televizorului este de "+Diagonala+" cm \n "+(smart?"Cu":"Fara")+" functie smart \n "+(UHD?"cu":"fara")+" rezolutie UHD \n Televizor curbat: "+(Curbat?"da":"nu")+" \n Televizorul OLED: "+(OLED?"da.":"nu.");
    }
    }

