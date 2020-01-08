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
        this.DifuzorDeVolum=DifuzorDeVolum;
    }
    
    UscatorPar(Electrocasnice e, int TrepteDeViteza, int TrepteDeIncalzire, int Putere, boolean TreaptaDeAerRece, boolean DifuzorDeVolum){
    super(e);
    this.Putere=Putere;
    this.TreaptaDeAerRece=TreaptaDeAerRece;
    this.TrepteDeIncalzire=TrepteDeIncalzire;
    this.TrepteDeViteza=TrepteDeViteza;
    this.DifuzorDeVolum=DifuzorDeVolum;
    }
    
    UscatorPar(UscatorPar u){
    this.Putere=u.Putere;
    this.TreaptaDeAerRece=u.TreaptaDeAerRece;
    this.TrepteDeIncalzire=u.TrepteDeIncalzire;
    this.TrepteDeViteza=u.TrepteDeViteza;
    this.DifuzorDeVolum=u.DifuzorDeVolum;
    }
    
    public String toString(){
    return "Putere de "+Putere+" W, cu "+TrepteDeIncalzire+" trepte de incalzire si "+TrepteDeViteza+" trepte de viteza, "+(TreaptaDeAerRece?"cu":"fara")+" treapta de aer rece, "+(DifuzorDeVolum?"cu":"fara")+" difuzor de volum.";
}
}
