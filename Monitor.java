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
public class Monitor extends Electrocasnice {
        int Diagonala, RataRefresh;
    boolean UltraWide, UHD;
    
    Monitor(){
    super();
    Diagonala=60;
    RataRefresh=75;
    UltraWide=false;
    UHD=true;
}
    
    Monitor(String Producator, String EficientaEnergetica, float Pret, boolean UzCasnic, int Diagonala, int RataRefresh,  boolean UltraWide, boolean UHD){
       super(Producator, EficientaEnergetica, Pret, UzCasnic);
       this.Diagonala=Diagonala;
       this.RataRefresh=RataRefresh;
       this.UltraWide=UltraWide;
       this.UHD=UHD;
    }
    Monitor(Electrocasnice e, int Diagonala, int RataRefresh, boolean UltraWide, boolean UHD){
       super(e);
       this.Diagonala=Diagonala;
       this.RataRefresh=RataRefresh;
       this.UltraWide=UltraWide;
       this.UHD=UHD;
    }
    Monitor(Monitor a){
        super(a);
       this.Diagonala=Diagonala;
       this.RataRefresh=RataRefresh;
       this.UltraWide=UltraWide;
       this.UHD=UHD;
    }
    public String toString(){
        return super.toString()+" \n\t Diagonala monitorului este de "+Diagonala+"cm. Ultra Wide:"
    }
}
