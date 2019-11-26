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
public class FierDeCalcat extends Electrocasnice{
    String Talpa, Culoare;
    int Putere, Jet_De_Abur;
    boolean AutoCuratare;
    
    FierDeCalcat(){
        super();
        Talpa="Aluminiu";
        Culoare="negru";
        Putere=1100;
        Jet_De_Abur=50;
        AutoCuratare=true;
    }
    
    FierDeCalcat(String Producator, String EficientaEnergetica, float P, boolean UzCasnic, String Talpa, String Culoare, int Putere, int Jet_De_Abur, boolean AutoCuratare){
        super(Producator, EficientaEnergetica, P, UzCasnic);
        this.Culoare=Culoare;
        this.Talpa=Talpa;
        this.Jet_De_Abur=Jet_De_Abur;
        this.Putere=Putere;
       }
    
FierDeCalcat(Electrocasnice e, String Talpa, String Culoare, int Putere, int Jet_De_Abur, boolean AutoCuratare){
        super(e);
        this.Culoare=Culoare;
        this.Talpa=Talpa;
        this.Jet_De_Abur=Jet_De_Abur;
        this.Putere=Putere;
}

FierDeCalcat(FierDeCalcat f){
    super(f);
    this.Culoare=f.Culoare;
    this.Talpa=f.Talpa;
    this.Jet_De_Abur=f.Jet_De_Abur;
    this.Putere=f.Putere;
}
public String toString(){
return super.toString()+" \n\t Culoare "+Culoare+" cu talpa "+Talpa+" cu jet de aburi "+Jet_De_Abur+" si putere de: "+Putere+"W";
}
}

