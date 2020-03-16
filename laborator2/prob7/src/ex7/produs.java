package ex7;

public class produs {
    public String nume;
    public double pret;
    public int cantitate;

    public produs(){
        nume = "";
        pret = 0;
        cantitate = 0;
    }
    public produs(String nume, double pret, int cantitate){
        this.nume = nume;
        this.pret = pret;
        this.cantitate = cantitate;
    }

    public String toStringy(){
        String afis;
        afis = "Nume: " + nume + ", " + "Pret: " + pret + ", " + "Cantitate: " + cantitate;
        return afis;
    }

    public double getTotalPlus(){
        return cantitate * pret;
    }

    public static void main(String [] args){

    }
}
