/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electrocasnice;

/**
 *
 * @author cezar
 */
public class Electrocasnice {

    String Producator, EficientaEnergetica;
    float Pret;
    boolean UzCasnic;
    
    Electrocasnice (){
        Producator="necunoscut";
        EficientaEnergetica="A";
        Pret=1.1f;
        UzCasnic=true;
    }
    Electrocasnice(String Producator, String EficientaEnergetica, float P, boolean UzCasnic){
        this.Producator=Producator;
        this.EficientaEnergetica=EficientaEnergetica;
        this.Pret=P;
        this.UzCasnic=UzCasnic;
    }
    Electrocasnice(Electrocasnice e){
        this.Producator=e.Producator;
        this.EficientaEnergetica=e.EficientaEnergetica;
        this.Pret=e.Pret;
        this.UzCasnic=e.UzCasnic;
    }
    public String toString(){
        return "Electrocanic "+Producator+" "+EficientaEnergetica+" "+Pret+" lei \n\t Uz Casnic "+(UzCasnic?"da":"nu");
    }
}
