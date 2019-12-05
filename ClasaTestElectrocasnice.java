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
    AerConditionat[] a=new AerConditionat[5];
    Calorifer[] c=new Calorifer[5];
    FierDeCalcat[] f=new FierDeCalcat[5];
    UscatorPar[] u=new UscatorPar[5];
    Monitor[] m=new Monitor[5];
    Televizor[] t=new Televizor[5];
    MasinaDeSpalatVase[] v=new MasinaDeSpalatVase[5];
    MasinaDeSpalatRufe[] r=new MasinaDeSpalatRufe[5];
    
    ClasaTestElectrocasnice(){
        e1=new Electrocasnice();
        e2=new Electrocasnice("LG","A++",2499.99f,true);
        e3=new Electrocasnice(e2);
        e3.Producator="Miele";
        
        a1=new AerConditionat();
        a2=new AerConditionat("Daikin", "A+++",3749.99f,true,18000,20,36,"R410A",true,true,false,true);
        a3=new AerConditionat(e2,12000,21,24,"R32",true,false,false,true);
        e[0]=e1;
        a[0]=a1;
        a[1]=a2;
        a[2]=a3;
        a[3]=new AerConditionat("Panasonic","A+",1999.90f,true,12000,26,24,"R32",false,false,false,true);
        a[4]=new AerConditionat("Electrolux","B",799f,true,9000,38,24,"R32",false,false,true,false);
        
        c1=new Calorifer();
        c2=new Calorifer("AEG","A",409.99f,true,2200,11,"negru");
        c3=new Calorifer(e2,1500,7,"gri");
        e[0]=e1;
        c[0]=c1;
        c[1]=c2;
        c[2]=c3;
        c[3]=new Calorifer("Heinner","C",239.99f,true,2500,13,"alb");
        c[4]=new Calorifer("Vortex","C+",249.90f,true,2400,12,"alb");
        
        u1=new UscatorPar();
        u2=new UscatorPar("Philips", "A+++", 238.99f,false,2,3,2200,true,true);
        u3=new UscatorPar(e2,3,3,2100,true,false);
        e[0]=e1;
        u[0]=u1;
        u[1]=u2;
        u[2]=u3;
        u[3]=new UscatorPar("Remington","A",249.99f,false,2,3,2300,true,true);
        u[4]=new UscatorPar("Rowenta","B",300.00f,false,3,3,2400,true,true);
        
        f[1]=new FierDeCalcat();
        f[2]=new FierDeCalcat("Tefal","A++",199.99f,true,"Ceramica","Alb",2400,180,true);
        f[3]=new FierDeCalcat(e2,"Ceramica","Verde",2300,180,false);
        e[0]=e1;
        f[0]=f1;
        f[1]=f2;
        f[2]=f3;
        f[3]=new FierDeCalcat("Philips","A++",215.99f,true,"Ceramica","Rosie",2300,180,true);
        f[4]=new FierDeCalcat("Bosch","A",113.99f,true,"Paladium","Galben",1800,50,true);
        
        t1=new Televizor();
        t2=new Televizor("Samsung","A++",2499.99f,true,125,true,true);
        t3=new Televizor(e2,108,true,false);
        e[0]=e1;
        t[0]=t1;
        t[1]=t2;
        t[2]=t3;
        t[3]=new Televizor("LG","A++",1999.99f,true,102,true,false);
        t[4]=new Televizor("Philips","A+++",3999.99f,true,150,true,true);
        
        m1=new Monitor();
        m2=new Monitor("Samsung","C--",10049.99f,true,80,30,true,true);
        m3=new Monitor(e2,120,60,true,false);
        e[0]=e1;
        m[0]=m1;
        m[1]=m2;
        m[2]=m3;
        m[3]=new Monitor("DELL","A++",1344.99f,false,50,60,false,true);
        m[4]=new Monitor("Philips","C",506.99f,true,60,45,false,false);

        
        v1=new MasinaDeSpalatVase();
        v2=new MasinaDeSpalatVase("Samsung","A++",5000.99f,true,14,32,8,0.54,"Alb");
        v3=new MasinaDeSpalatVase(e2,13,49,6,1,"Gri");
        e[0]=e1;
        v[0]=v1;
        v[1]=v2;
        v[2]=v3;
        v[3]=new MasinaDeSpalatVase("Bosch","A+++",4289.99f,true,13,42,8,0.73,"Negru");
        v[4]=new MasinaDeSpalatVase("Stalgast","B",16350.99f,false,120,58,16,3.4,"Gri");
        
        
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
        System.out.println(u1);
        System.out.println(u2);
        System.out.println(u3);
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
    }
}
