/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electrocasnice;

/**
 *
 * @author Vali Leo
 * Referance link https://www.emag.ro/masina-de-spalat-rufe-aeg-8-kg-1600-rpm-clasa-a-motor-okoinverter-tehnologie-prosteam-alb-l7fee68s/pd/DGDZC1BBM/
 */

public class MasinaDeSpalatRufe extends Electrocasnice {
    int rotatii, zgomotCentrifugare, zgomotSpalare, greutate, consumApa;
    String clasa;
    
    MasinaDeSpalatRufe(){
        super();
        rotatii = 1600;
        zgomotCentrifugare = 77;
        zgomotSpalare = 51;
        clasa =  "A++";
        greutate = 7;
        consumApa= 90008;
    }
    MasinaDeSpalatRufe(String Producator, String EficientaEnergetica, float P, boolean UzCasnic, int rotatii, int zgomotCentrifugare, int zgomotSpalare, String clasa, int greutate, int consumApa){
        super(Producator, EficientaEnergetica, P, UzCasnic);
        this.rotatii= rotatii;
        this.zgomotCentrifugare= zgomotCentrifugare;
        this.zgomotSpalare= zgomotSpalare;
        this.clasa= clasa;
        this.greutate= greutate;
        this.consumApa= consumApa;
    }
    MasinaDeSpalatRufe(Electrocasnice e, String clasa, int zgomotSpalare, int zgomotCentrifugare, int rotatii, int greutate, int consumApa){
        super(e);
        this.clasa= clasa;
        this.zgomotSpalare= zgomotSpalare;
        this.zgomotCentrifugare= zgomotCentrifugare;
        this.rotatii= rotatii;
        this.greutate= greutate;
        this.consumApa= consumApa;
    }
    MasinaDeSpalatRufe(MasinaDeSpalatRufe r){
        super(r);
        this.clasa= r.clasa;
        this.zgomotSpalare= r.zgomotSpalare;
        this.zgomotCentrifugare= r.zgomotCentrifugare;
        this.rotatii= r.rotatii;
        this.greutate= r.greutate;
        this.consumApa= consumApa;

    }
    public String toString(){
        return super.toString()+" \n\t Clasa: "+clasa+"; Zgomot spalare "+zgomotSpalare+" db; Zgomot centrifugare: "+zgomotCentrifugare+" db; Rotatii: "+rotatii+" RPM; Greutate:"+greutate+";Consum apa anual:"+consumApa;
    }
}
