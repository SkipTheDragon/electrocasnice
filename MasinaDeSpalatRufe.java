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
    int rotatii, zgomotCentrifugare, zgomotSpalare;
    String clasa;
    
    MasinaDeSpalatRufe(){
        super();
        rotatii = 1600;
        zgomotCentrifugare = 77;
        zgomotSpalare = 51;
        clasa =  "A++";
    }
    MasinaDeSpalatRufe(String Producator, String EficientaEnergetica, float P, boolean UzCasnic, int rotatii, int zgomotCentrifugare, int zgomotSpalare, String clasa){
        super(Producator, EficientaEnergetica, P, UzCasnic);
        this.rotatii= rotatii;
        this.zgomotCentrifugare= zgomotCentrifugare;
        this.zgomotSpalare= zgomotSpalare;
        this.clasa= clasa;
    }
    MasinaDeSpalatRufe(Electrocasnice e, String clasa, int zgomotSpalare, int zgomotCentrifugare, int rotatii){
        super(e);
        this.clasa= clasa;
        this.zgomotSpalare= zgomotSpalare;
        this.zgomotCentrifugare= zgomotCentrifugare;
        this.rotatii= rotatii;
    }
    MasinaDeSpalatRufe(MasinaDeSpalatRufe r){
        super(r);
        this.clasa= r.clasa;
        this.zgomotSpalare= r.zgomotSpalare;
        this.zgomotCentrifugare= r.zgomotCentrifugare;
        this.rotatii= r.rotatii;
    }
    public String toString(){
        return super.toString()+" \n\t Clasa: "+clasa+"; Zgomot spalare "+zgomotSpalare+" db; Zgomot centrifugare: "+zgomotCentrifugare+" db; Rotatii: "+rotatii+" RPM";
    }
}
