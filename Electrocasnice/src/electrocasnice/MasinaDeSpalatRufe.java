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

//clasa copil

public class MasinaDeSpalatRufe extends Electrocasnice {
    int rotatii, zgomotCentrifugare, zgomotSpalare, greutate, consumApa;
    String culoare;
    
    //constructor fara parametri
    
    MasinaDeSpalatRufe(){
        super(); // Putem accessa valorile/constructorul/functiile clasei parinte
        rotatii = 1600;
        zgomotCentrifugare = 77;
        zgomotSpalare = 51;
        culoare = "Alb";
        greutate = 7;
        consumApa= 90008;
    }
    
      //Super se foloseste pentru a apela clasa parinte(Electrocasnice)
    
    //constructor cu parametri
    
    MasinaDeSpalatRufe(String Producator, String EficientaEnergetica, float P, boolean UzCasnic, int rotatii, int zgomotCentrifugare, int zgomotSpalare, String culoare, int greutate, int consumApa){
        super(Producator, EficientaEnergetica, P, UzCasnic);
        this.rotatii= rotatii;
        this.zgomotCentrifugare= zgomotCentrifugare;
        this.zgomotSpalare= zgomotSpalare;
        this.culoare= culoare;
        this.greutate= greutate;
        this.consumApa= consumApa;
    }
    MasinaDeSpalatRufe(Electrocasnice e, String culoare, int zgomotSpalare, int zgomotCentrifugare, int rotatii, int greutate, int consumApa){
        super(e);
        this.culoare= culoare;
        this.zgomotSpalare= zgomotSpalare;
        this.zgomotCentrifugare= zgomotCentrifugare;
        this.rotatii= rotatii;
        this.greutate= greutate;
        this.consumApa= consumApa;
    }
    MasinaDeSpalatRufe(MasinaDeSpalatRufe r){
        super(r);
        this.culoare= r.culoare;
        this.zgomotSpalare= r.zgomotSpalare;
        this.zgomotCentrifugare= r.zgomotCentrifugare;
        this.rotatii= r.rotatii;
        this.greutate= r.greutate;
        this.consumApa= consumApa;

    }
    
    //metoda toString pentru a putea afisa obiectul.
    
    public String toString(){
         String newline = System.getProperty("line.separator");
        return super.toString()+"Culoare: "+culoare+" \n Zgomot spalare "+zgomotSpalare+" db \n Zgomot centrifugare: "+zgomotCentrifugare+" db \n Rotatii: "+rotatii+" RPM \n Greutate:"+greutate+" \n Consum apa anual:"+consumApa+".";
    }
}
