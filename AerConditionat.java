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
public class AerConditionat extends Electrocasnice{
    int Capacitate, NivelZgomot, LuniGarantie;
    String AgentRefrigerant;
    boolean wifi, kitInstalare, Portabil, Inverter;
    
    AerConditionat(){
    super();
    Capacitate=12000;
    NivelZgomot=24;
    LuniGarantie=24;
    AgentRefrigerant="R410A";
    wifi=true;
    kitInstalare=false;
    Portabil=false;
    Inverter=true;
}
    
    AerConditionat(String Producator, String EficientaEnergetica, float P, boolean UzCasnic, int Capacitate, int NivelZgomot,int LuniGarantie, String AgentRefrigerant, boolean wifi, boolean kitInstalare, boolean Portabil, boolean Inverter){
       super(Producator, EficientaEnergetica, P, UzCasnic);
       this.Capacitate=Capacitate;
       this.NivelZgomot=NivelZgomot;
       this.LuniGarantie=LuniGarantie;
       this.AgentRefrigerant=AgentRefrigerant;
       this.wifi=wifi;
       this.kitInstalare=kitInstalare;
       this.Portabil=Portabil;
       this.Inverter=Inverter;
    }
    AerConditionat(Electrocasnice e, int Capacitate, int NivelZgomot, int LuniGarantie, String AgentRefrigerant, boolean wifi, boolean kitInstalare, boolean Portabil, boolean Inverter){
       super(e);
       this.Capacitate=Capacitate;
       this.NivelZgomot=NivelZgomot;
       this.LuniGarantie=LuniGarantie;
       this.AgentRefrigerant=AgentRefrigerant;
       this.wifi=wifi;
       this.kitInstalare=kitInstalare;
       this.Portabil=Portabil;
       this.Inverter=Inverter;
    }
    AerConditionat(AerConditionat a){
        super(a);
       this.Capacitate=a.Capacitate;
       this.NivelZgomot=a.NivelZgomot;
       this.LuniGarantie=a.LuniGarantie;
       this.AgentRefrigerant=a.AgentRefrigerant;
       this.wifi=a.wifi;
       this.kitInstalare=a.kitInstalare;
       this.Portabil=a.Portabil;
       this.Inverter=a.Inverter;
    }
    public String toString(){
        return super.toString()+" \n\t Capacitatea aerului conditionat este de "+Capacitate+" BTU, Nivelul de zgomot al unitatii interne este de "+NivelZgomot+"dB, "+LuniGarantie+" luni garantie pentru persoane fizice, Tip Agent de racire: "+AgentRefrigerant". Functie WiFi: "+(wifi?"Da, ":"Nu, ")+"Kit instalare inclus in pachet: "+(kitInstalare?"Da, ":"Nu, ")+"Portabil: "+(Portabil?"Da, ":"Nu, ")+"Inverter: "+(Inverter?"Da.":"Nu.");
    }
}
