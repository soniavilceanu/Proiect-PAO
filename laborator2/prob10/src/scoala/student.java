package scoala;

public class student {

    public  String nume;
    public double medieSem1;
    public double medieSem2;

    public student(String nume, double m1, double m2){
        this.nume = nume;
        this.medieSem2 = m2;
        this.medieSem1 = m1;
    }
    public student(){
        this("",0,0);
    }

    public String toStringy(){
        return nume + " " + medieSem1 + " " + medieSem2;
    }

    public double getMedieAn() {
        return (medieSem1 + medieSem2)/2;
    }
}
