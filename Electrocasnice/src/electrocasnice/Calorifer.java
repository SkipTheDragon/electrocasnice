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
public class Calorifer extends Electrocasnice {
    int Putere, nrElementi;
    String Culoare;
    
    Calorifer(){
        super();
        Putere=2500;
        nrElementi=10;
        Culoare="Alb";
    }
    Calorifer(String Producator, String EficientaEnergetica, float P, boolean UzCasnic, int Putere, int nrElementi, String Culoare){
        super(Producator, EficientaEnergetica, P, UzCasnic);
        this.Putere=Putere;
        this.nrElementi=nrElementi;
        this.Culoare=Culoare;
    }
    Calorifer(Electrocasnice e, int Putere, int nrElementi, String Culoare){
        super(e);
        this.Putere=Putere;
        this.nrElementi=nrElementi;
        this.Culoare=Culoare;
    }
    Calorifer(Calorifer c){
        super(c);
        this.Putere=c.Putere;
        this.nrElementi=c.nrElementi;
        this.Culoare=c.Culoare;
    }
    public String toString(){
        return " Puterea este de "+Putere+"W, Caloriferul are "+nrElementi+" elementi, Culoarea este "+Culoare+".";
    }
}
