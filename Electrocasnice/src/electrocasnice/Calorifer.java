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

//clasa copil

public class Calorifer extends Electrocasnice {
    int Putere, nrElementi;
    String Culoare;
    
    //constructor fara parametri
    
    Calorifer(){
        super();
        Putere=2500;
        nrElementi=10;
        Culoare="Alb";
    }
    
    //Super se foloseste pentru a apela clasa parinte(Electrocasnice)
    
    //constructor cu parametri
    
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
    
    //metoda toString pentru a putea afisa obiectul.
    
    public String toString(){
        String newline = System.getProperty("line.separator");
        return super.toString()+" Puterea este de "+Putere+"W \n Caloriferul are "+nrElementi+" elementi \n Culoarea este "+Culoare+".";
    }
}
