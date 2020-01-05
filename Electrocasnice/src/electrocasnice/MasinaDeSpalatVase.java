package electrocasnice;


import electrocasnice.Electrocasnice;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Leo
 * Reference Link: https://www.emag.ro/masina-de-spalat-vase-incorporabila-beko-10-seturi-5-programe-clasa-a-45-cm-dis25011/pd/D3G6QJBBM/
 */
public class MasinaDeSpalatVase extends Electrocasnice {
    int sloturiVase, programNum, nivelZgomort, greutate, consumApa;
    double energyConsumptionPerCycle;
    String Culoare;
    
    MasinaDeSpalatVase(){
        super();
        sloturiVase= 30;
        programNum= 10;
        nivelZgomort= 36;
        energyConsumptionPerCycle =  0.92;
        Culoare="Alba";
        greutate = 9;
        consumApa = 54484;
    }
    MasinaDeSpalatVase(String Producator, String EficientaEnergetica, float P, boolean UzCasnic, int sloturiVase, int nivelZgomort, int programNum, double energyConsumptionPerCycle, String Culoare,int greutate ,int consumApa){
        super(Producator, EficientaEnergetica, P, UzCasnic);
        this.sloturiVase= sloturiVase;
        this.nivelZgomort= nivelZgomort;
        this.programNum= programNum;
        this.energyConsumptionPerCycle= energyConsumptionPerCycle;
        this.Culoare=Culoare;
        this.greutate= greutate;
        this.consumApa= consumApa;
    }
    MasinaDeSpalatVase(Electrocasnice e, double energyConsumptionPerCycle, int programNum, int nivelZgomort, int sloturiVase, String Culoare, int greutate, int consumApa){
        super(e);
        this.energyConsumptionPerCycle= energyConsumptionPerCycle;
        this.programNum= programNum;
        this.nivelZgomort= nivelZgomort;
        this.sloturiVase= sloturiVase;
        this.Culoare=Culoare;
        this.greutate= greutate;
        this.consumApa= consumApa;
    }
    MasinaDeSpalatVase(MasinaDeSpalatVase v){
        super(v);
        this.energyConsumptionPerCycle= v.energyConsumptionPerCycle;
        this.programNum= v.programNum;
        this.nivelZgomort= v.nivelZgomort;
        this.sloturiVase= v.sloturiVase;
        this.Culoare=v.Culoare;
        this.greutate= v.greutate;
        this.consumApa= v.consumApa;
    }
    public String toString(){
        return super.toString()+" \n\t Numar programe: "+programNum+"; Nivelul de zgomot este "+nivelZgomort+"; Sloturi pentru vase: "+sloturiVase+"; Are un consum de "+energyConsumptionPerCycle+"Kw/h per ciclu; Colarea "+Culoare+ ";Greutate" +greutate+ "kg;Consum apa anual:"+ consumApa;
    }
}
