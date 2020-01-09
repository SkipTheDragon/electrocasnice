/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electrocasnice;

/**
 *
 * @author Rzvn69
 */

//clasa copil

public class FierDeCalcat extends Electrocasnice{
        String Talpa, Culoare;
        int Putere, Jet_De_Abur, Tensiune;
        boolean AutoCuratare;

        //constructor fara parametri
        
    FierDeCalcat(){
        super();
        Talpa="Aluminiu";
        Culoare="negru";
        Putere=1100;
        Jet_De_Abur=50;
        Tensiune=220;
        AutoCuratare=true;
    }
    
    //Super se foloseste pentru a apela clasa parinte(Electrocasnice)
    
    //constructor cu parametri
    
    FierDeCalcat(String Producator, String EficientaEnergetica, float P, boolean UzCasnic, String Talpa, String Culoare, int Putere, int Tensiune, int Jet_De_Abur, boolean AutoCuratare){
        super(Producator, EficientaEnergetica, P, UzCasnic);
        this.Culoare=Culoare;
        this.Talpa=Talpa;
        this.Jet_De_Abur=Jet_De_Abur;
        this.Putere=Putere;
        this.Tensiune=Tensiune;
        this.AutoCuratare=AutoCuratare;
}
    
FierDeCalcat(Electrocasnice e, String Talpa, String Culoare, int Putere,int Tensiune, int Jet_De_Abur, boolean AutoCuratare){
        super(e);
        this.Culoare=Culoare;
        this.Talpa=Talpa;
        this.Jet_De_Abur=Jet_De_Abur;
        this.Putere=Putere;
        this.Tensiune=Tensiune;
        this.AutoCuratare=AutoCuratare;
}

FierDeCalcat(FierDeCalcat f){
        super(f);
        this.Culoare=f.Culoare;
        this.Talpa=f.Talpa;
        this.Jet_De_Abur=f.Jet_De_Abur;
        this.Putere=f.Putere;
        this.Tensiune=f.Tensiune;
        this.AutoCuratare=f.AutoCuratare;
}

  //metoda toString pentru a putea afisa obiectul.

public String toString(){
    String newline = System.getProperty("line.separator");
       return super.toString()+"Culoare "+Culoare+" \ncu talpa "+Talpa+" \njet de aburi "+Jet_De_Abur+" \nputere de: "+Putere+" W \n"+(AutoCuratare?"cu":"fara")+" functie de Autocuratare \nTensiune de: "+Tensiune+"V.";   
}
}

