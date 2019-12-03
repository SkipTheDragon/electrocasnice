/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electrocasnice;

/**
 *
 * @author Leo
 * Reference Link: https://www.emag.ro/masina-de-spalat-vase-incorporabila-beko-10-seturi-5-programe-clasa-a-45-cm-dis25011/pd/D3G6QJBBM/
 */
public class MasinaDeSpalatVase extends Electrocasnice {
    int sloturiVase, programNum, nivelZgomort;
    double energyConsumptionPerCycle;
    String Culoare;
    
    MasinaDeSpalatVase(){
        super();
        sloturiVase= 30;
        programNum= 10;
        nivelZgomort= 36;
        energyConsumptionPerCycle =  0.92;
    }
    MasinaDeSpalatVase(String Producator, String EficientaEnergetica, float P, boolean UzCasnic, int sloturiVase, int nivelZgomort, int programNum, double energyConsumptionPerCycle){
        super(Producator, EficientaEnergetica, P, UzCasnic);
        this.sloturiVase= sloturiVase;
        this.nivelZgomort= nivelZgomort;
        this.programNum= programNum;
        this.energyConsumptionPerCycle= energyConsumptionPerCycle;
    }
    MasinaDeSpalatVase(Electrocasnice e, double energyConsumptionPerCycle, int programNum, int nivelZgomort, int sloturiVase){
        super(e);
        this.energyConsumptionPerCycle= energyConsumptionPerCycle;
        this.programNum= programNum;
        this.nivelZgomort= nivelZgomort;
        this.sloturiVase= sloturiVase;
    }
    MasinaDeSpalatVase(MasinaDeSpalatVase c){
        super(c);
        this.energyConsumptionPerCycle= c.energyConsumptionPerCycle;
        this.programNum= c.programNum;
        this.nivelZgomort= c.nivelZgomort;
        this.sloturiVase= c.sloturiVase;
    }
    public String toString(){
        return super.toString()+" \n\t Numar programe: "+programNum+"; Nivelul de zgomot este "+nivelZgomort+"; Sloturi pentru vase: "+sloturiVase+"; Are un consum de "+energyConsumptionPerCycle+"Kw/h per ciclu";
    }
}
