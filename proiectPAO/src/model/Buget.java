package model;

public class Buget {
    protected float impozit;
    private float datorii;
    protected float totalDepozit;

    public Buget(float impozit, float totalDepozit){
        this.impozit = impozit;
        this.totalDepozit = totalDepozit;
    }

    public Buget(float impozit, float datorii, float totalDepozit){
        this.impozit = impozit;
        this.datorii = datorii;
        this.totalDepozit = totalDepozit;
    }

    public float getDatorii() {
        return datorii;
    }

    public float getImpozit() {
        return impozit;
    }

    public float getTotalDepozit() {
        return totalDepozit;
    }

    public void setDatorii(float datorii) {
        this.datorii = datorii;
    }

    public void setImpozit(float impozit) {
        this.impozit = impozit;
    }

    public void setTotalDepozit(float totalDepozit) {
        this.totalDepozit = totalDepozit;
    }



    public float calculBugetar(){
        return totalDepozit - impozit*totalDepozit;
    }
    public String toStringy(){
        return "Date buget:\nImpozit: " + impozit + "\ndatorii: " + datorii + "\nSuma totala depozitata: " + totalDepozit + "\n" + "\n";

    }

}
