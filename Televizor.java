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
public class Televizor extends Electrocasnice {
        int Diagonala;
    boolean smart, UHD, Curbat, OLED;
    
    Televizor(){
    super();
    Diagonala=100;
    smart=true;
    UHD=false;
    Curbat=false;
    OLED=false;
}
    
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
    public String toString(){
        return super.toString()+" \n\t Diagonala televizorului este de "+Diagonala+" cm."+(smart?"Cu":"Fara")+" functie smart, "+(UHD?"cu":"fara")+" rezolutie UHD. Televizorul este curbat? "+(Curbat?"da":"nu")+"Televizorul este OLED? "+(OLED?"da":"nu");
    }
    }

