/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electrocasnice;
/**
 *
 * @author Leo
 */
public class ClasaTestElectrocasnice {
    Electrocasnice e1,e2,e3;
    AerConditionat a1,a2,a3;
    Calorifer c1,c2,c3;
    FierDeCalcat f1,f2,f3;
    UscatorPar u1,u2,u3;
    Monitor m1,m2,m3;
    Televizor t1,t2,t3;
    MasinaDeSpalatVase v1,v2,v3;
    MasinaDeSpalatRufe r1,r2,r3;
    Electrocasnice[] e={e1,e2,e3};
    
    AerConditionat[] a=new AerConditionat[4];
    Calorifer[] c=new Calorifer[4];
    FierDeCalcat[] f=new FierDeCalcat[4];
    UscatorPar[] u=new UscatorPar[4];
    Monitor[] m=new Monitor[4];
    Televizor[] t=new Televizor[4];
    MasinaDeSpalatVase[] v=new MasinaDeSpalatVase[4];
    MasinaDeSpalatRufe[] r=new MasinaDeSpalatRufe[4];
    
    ClasaTestElectrocasnice(){
        e1=new Electrocasnice();
        e2=new Electrocasnice("LG","A++",2499.99f,true);
        e3=new Electrocasnice(e2);
        e3.Producator="Miele";
        e[0]=e1;

        a[0]=new AerConditionat("Daikin", "A+++",3749.99f,true,18000,20,true,true,false);
        a[1]=new AerConditionat(e2,12000,21,true,false,false);
        a[2]=new AerConditionat("Panasonic","A+",1999.90f,true,12000,26,false,false,false);
        a[3]=new AerConditionat("Electrolux","B",799f,true,9000,38,false,false,true);
        
        c[0]=new Calorifer("AEG","A",409.99f,true,2200,11,"negru");
        c[1]=new Calorifer(e2,1500,7,"gri");
        c[2]=new Calorifer("Heinner","C",239.99f,true,2500,13,"alb");
        c[3]=new Calorifer("Vortex","C+",249.90f,true,2400,12,"alb");
        
        u[0]=new UscatorPar("Philips", "A+++", 238.99f,false,2,3,2200,true,true);
        u[1]=new UscatorPar(e2,3,3,2100,true,false);
        u[2]=new UscatorPar("Remington","A",249.99f,false,2,3,2300,true,true);
        u[3]=new UscatorPar("Rowenta","B",300.00f,false,3,3,2400,true,true);

        f[0]=new FierDeCalcat("Tefal","A++",199.99f,true,"Ceramica","Alb",2400,220,180,true);
        f[1]=new FierDeCalcat(e2,"Ceramica","Verde",2300,180,false);
        f[2]=new FierDeCalcat("Philips","A++",215.99f,true,"Ceramica","Rosie",2300,230,180,true);
        f[3]=new FierDeCalcat("Bosch","A",113.99f,true,"Paladium","Galben",1800,230,50,true);
        
        t[0]=new Televizor("Samsung","A++",2499.99f,true,125,true,true,false,false);
        t[1]=new Televizor(e2,108,true,false,false,false);
        t[2]=new Televizor("LG","A++",1999.99f,true,102,true,false,false,false);
        t[3]=new Televizor("Philips","A+++",3999.99f,true,150,true,true,true,true);
        
        m[0]=new Monitor("Samsung","C",10049.99f,true,80,30,true,true,true,true);
        m[1]=new Monitor(e2,120,60,true,false,false,false);
        m[2]=new Monitor("DELL","A++",1344.99f,false,50,60,false,true,false,false);
        m[3]=new Monitor("Philips","C",506.99f,true,60,45,false,false,false,false);

        v[0]=new MasinaDeSpalatVase("Samsung","A++",5000.99f,true,14,32,8,0.54d,"Alb",8,3707);
        v[1]=new MasinaDeSpalatVase(e2,13,49,6,1,"Gri",6,2697);
        v[2]=new MasinaDeSpalatVase("Bosch","A+++",4289.99f,true,13,42,8,0.73d,"Negru",9,3796);
        v[3]=new MasinaDeSpalatVase("Stalgast","B",16350.99f,false,120,58,16,3.4d,"Gri",5,2765);

        r[0]=new MasinaDeSpalatRufe("Arctic","C",2300.99f,true,32,2,54,"Alb",7,8707);
        r[1]=new MasinaDeSpalatRufe(e2,"Gri",49,6,1,6,2697);
        r[2]=new MasinaDeSpalatRufe("Bosch","A++",3489.99f,true,42,8,73,"Negru",9,9796);
        r[3]=new MasinaDeSpalatRufe("Samsung","B",1650.99f,false,58,16,3,"Alb",15,6765);
              
        for(int x=0;x<4;x++) {
                System.out.println(a[x]);
                System.out.println(c[x]);
                System.out.println(u[x]);
                System.out.println(f[x]);
                System.out.println(t[x]);
                System.out.println(m[x]);
                System.out.println(v[x]);
                System.out.println(r[x]);
        } 
      
    //  System.out.println(v[0].sloturiVase); // outputs specified variable value
    }
}