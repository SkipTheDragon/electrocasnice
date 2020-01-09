package electrocasnice;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author cezar
 */

//Clasa parinte

public class Electrocasnice {

        String Producator, EficientaEnergetica;
        float Pret;
        boolean UzCasnic;
    
        //constructor fara parametri
        
    Electrocasnice (){
        Producator="necunoscut";
        EficientaEnergetica="A";
        Pret=1.1f;
        UzCasnic=true;
    }
    //this. se foloseste pentru a invoca/apela un parametru din clasa respectiva
    
    //constructor cu parametri
    
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
    
    //metoda toString pentru a putea afisa obiectul.
    
    public String toString(){
        return "Electrocasnic "+Producator+" "+EficientaEnergetica+" "+Pret+" lei, Uz Casnic "+(UzCasnic?"da \n":"nu \n");
    }
}
