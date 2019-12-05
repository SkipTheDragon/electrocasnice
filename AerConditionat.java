/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electrocasnice;

/**
 *
 * @author DELL
 */
public class AerConditionat extends Electrocasnice{
    int Capacitate, NivelZgomot;
    boolean wifi, kitInstalare, Portabil;
    
    AerConditionat(){
    super();
    Capacitate=12000;
    NivelZgomot=24;
    wifi=true;
    kitInstalare=false;
    Portabil=false;
}
    
    AerConditionat(String Producator, String EficientaEnergetica, float P, boolean UzCasnic, int Capacitate, int NivelZgomot, boolean wifi, boolean kitInstalare, boolean Portabil){
       super(Producator, EficientaEnergetica, P, UzCasnic);
       this.Capacitate=Capacitate;
       this.NivelZgomot=NivelZgomot;
       this.wifi=wifi;
       this.kitInstalare=kitInstalare;
       this.Portabil=Portabil;
    }
    AerConditionat(Electrocasnice e, int Capacitate, int NivelZgomot, boolean wifi, boolean kitInstalare, boolean Portabil){
       super(e);
       this.Capacitate=Capacitate;
       this.NivelZgomot=NivelZgomot;
       this.wifi=wifi;
       this.kitInstalare=kitInstalare;
       this.Portabil=Portabil;
    }
    AerConditionat(AerConditionat a){
        super(a);
       this.Capacitate=a.Capacitate;
       this.NivelZgomot=a.NivelZgomot;
       this.wifi=a.wifi;
       this.kitInstalare=a.kitInstalare;
       this.Portabil=a.Portabil;
    }
    public String toString(){
        return super.toString()+" \n\t Capacitatea aerului conditionat este de "+Capacitate+"BTU, Nivelul de zgomot al unitatii interne este de "+NivelZgomot+"dB. Functie WiFi: "+(wifi?"Da, ":"Nu, ")+"Kit instalare inclus in pachet: "+(kitInstalare?"Da, ":"Nu, ")+"Portabil"+(Portabil?"Da.":"Nu.");
    }
}