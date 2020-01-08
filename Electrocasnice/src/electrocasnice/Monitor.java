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
    boolean UltraWide, UHD, Curbat, Gaming;
    
    Monitor(){
    super();
    Diagonala=60;
    RataRefresh=75;
    UltraWide=false;
    UHD=true;
    Curbat=false;
    Gaming=false;
}
    
    Monitor(String Producator, String EficientaEnergetica, float Pret, boolean UzCasnic, int Diagonala, int RataRefresh, boolean UltraWide, boolean UHD, boolean Curbat, boolean Gaming){
       super(Producator, EficientaEnergetica, Pret, UzCasnic);
       this.Diagonala=Diagonala;
       this.RataRefresh=RataRefresh;
       this.UltraWide=UltraWide;
       this.UHD=UHD;
    }
    Monitor(Electrocasnice e, int Diagonala, int RataRefresh, boolean UltraWide, boolean UHD, boolean Curbat, boolean Gaming){
       super(e);
       this.Diagonala=Diagonala;
       this.RataRefresh=RataRefresh;
       this.UltraWide=UltraWide;
       this.UHD=UHD;
       this.Curbat=Curbat;
       this.Gaming=Gaming;
    }
    Monitor(Monitor m){
        super(m);
       this.Diagonala=m.Diagonala;
       this.RataRefresh=m.RataRefresh;
       this.UltraWide=m.UltraWide;
       this.UHD=m.UHD;
       this.Curbat=m.Curbat;
       this.Gaming=m.Gaming;
    }
    public String toString(){
        return "Diagonala monitorului este de "+Diagonala+"cm. Ultra Wide: "+(UltraWide?"da":"nu")+", "+(UHD?"cu":"fara")+" rezolutie UHD. Rata de refresh este de "+RataRefresh+" Hz. Monitorul curbat: "+(Curbat?"da":"nu")+", Monitorul gaming "+(Gaming?"da.":"nu.");
    }
}
