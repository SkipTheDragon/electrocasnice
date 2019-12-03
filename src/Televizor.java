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
    boolean smart, UHD;
    
    Televizor(){
    super();
    Diagonala=100;
    smart=true;
    UHD=false;
}
    
    Televizor(String Producator, String EficientaEnergetica, float Pret, boolean UzCasnic, int Diagonala, boolean smart, boolean UHD){
       super(Producator, EficientaEnergetica, Pret, UzCasnic);
       this.Diagonala=Diagonala;
       this.smart=smart;
       this.UHD=UHD;
    }
    Televizor(Electrocasnice e, int Diagonala, boolean smart, boolean UHD){
       super(e);
       this.Diagonala=Diagonala;
       this.smart=smart;
       this.UHD=UHD;
    }
    Televizor(Televizor t){
        super(t);
       this.Diagonala=t.Diagonala;
       this.smart=t.smart;
       this.UHD=t.UHD;
    }
    public String toString(){
        return super.toString()+" \n\t Diagonala televizorului este de "+Diagonala+" cm."+(smart?"Cu":"Fara")+" functie smart, "+(UHD?"cu":"fara")+" rezolutie UHD.";
    }
}
