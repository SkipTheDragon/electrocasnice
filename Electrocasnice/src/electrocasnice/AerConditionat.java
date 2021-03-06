package electrocasnice;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author DELL
 */

//clasa copil

public class AerConditionat extends Electrocasnice{
    int Capacitate, NivelZgomot;
    boolean wifi, kitInstalare, Portabil;

//Super se foloseste pentru a apela clasa parinte(Electrocasnice)
    
  //constructor fara parametri
   
    AerConditionat(){
    super();
    Capacitate=12000;
    NivelZgomot=24;
    wifi=true;
    kitInstalare=false;
    Portabil=false;
}

   //constructor cu parametri
    
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
    
    //metoda toString pentru a putea afisa obiectul.
    
    public String toString(){
        String newline = System.getProperty("line.separator");
        return super.toString()+" Capacitatea aerului conditionat este de "+Capacitate+"BTU \n Nivelul de zgomot al unitatii interne este de "+NivelZgomot+"dB \n Functie WiFi: "+(wifi?"Da \n ":"Nu \n ")+"Kit instalare inclus in pachet: "+(kitInstalare?"Da \n ":"Nu \n ")+"Portabil: "+(Portabil?"Da":"Nu");
    }
}