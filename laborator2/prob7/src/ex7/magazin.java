package ex7;

public class magazin {

    String nume;
    produs p1, p2, p3;

    public magazin(String nume, produs p1, produs p2, produs p3){
        this.nume = nume;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }
    public magazin(){
        this("", new produs(), new produs(), new produs());
    }

    public String toStringy()
    {
        return p1.toStringy() + "\n" + p2.toStringy() + "\n" + p3.toStringy();
    }

    public double getTotalMagazin(){
        return p1.getTotalPlus() + p2.getTotalPlus() + p3.getTotalPlus();
    }

    public static void main(String[] args){

        magazin mag = new magazin("Super Magazinul",
                new produs("betisoare parfumate",56.2,3),
                new produs("portocala", 5.5, 20),
                new produs("flori", 20, 50));
        System.out.println(mag.getTotalMagazin());
    }
}
