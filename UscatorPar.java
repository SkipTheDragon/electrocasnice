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
public class UscatorPar extends Electrocasnice {
    int TrepteDeViteza, TrepteDeIncalzire, Putere;
    boolean TreaptaDeAerRece, DifuzorDeVolum;
    
    UscatorPar(){
    super();
    TrepteDeViteza=6;
    TrepteDeIncalzire=6;
    Putere=1500;
    TreaptaDeAerRece=true;
    DifuzorDeVolum=true;
    }
    
    UscatorPar(String Producator, String EficientaEnergetica, float P, boolean UzCasnic, int TrepteDeViteza, int TrepteDeIncalzire, int Putere, boolean TreaptaDeAerRece, boolean DifuzorDeVolum){
        super(Producator, EficientaEnergetica, P, UzCasnic);
        this.Putere=Putere;
        this.TreaptaDeAerRece=TreaptaDeAerRece;
        this.TrepteDeIncalzire=TrepteDeIncalzire;
        this.TrepteDeViteza=TrepteDeViteza;
    }
    
    UscatorPar(Electrocasnice e, int TrepteDeViteza, int TrepteDeIncalzire, int Putere, boolean TreaptaDeAerRece, boolean DifuzorDeVolum){
    super(e);
    this.Putere=Putere;
    this.TreaptaDeAerRece=TreaptaDeAerRece;
    this.TrepteDeIncalzire=TrepteDeIncalzire;
    this.TrepteDeViteza=TrepteDeViteza;
    }
    
    UscatorPar(UscatorPar u){
    this.Putere=u.Putere;
    this.TreaptaDeAerRece=u.TreaptaDeAerRece;
    this.TrepteDeIncalzire=u.TrepteDeIncalzire;
    this.TrepteDeViteza=u.TrepteDeViteza;
    }
    
    public String toString(){
    return super.toString()+" \n\t Putere de "+Putere+" , cu trepte de aer rece "+TreaptaDeAerRece+" ,cu trepte de incalzire "+TrepteDeIncalzire+" si "+TrepteDeViteza+" trepte de viteza";
}
}
