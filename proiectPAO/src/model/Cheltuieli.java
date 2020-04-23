package model;

public class Cheltuieli extends Buget{

    private float commission;
    private int id;
    private static int totalCheltuieli = 0;

    public Cheltuieli(float commission, float impozit, float totalDepozit){
        super(impozit, totalDepozit);
        this.commission = commission;
        totalCheltuieli ++;
        this.id = totalCheltuieli;
    }


    public float getCommission() {
        return commission;
    }

    public int getId() {
        return id;
    }

    public void setCommission(float commission){
        this.commission = commission;
    }

    public static int getTotalCheltuieli() {
        return totalCheltuieli;
    }

    public String toStringy(){
        return "Date cheltuieli:\nId: " + id + "\nComision " + commission + "\nNr total de cheltuieli: " + totalCheltuieli +"\nTotal depozit: " + totalDepozit + "\n";

    }
}
