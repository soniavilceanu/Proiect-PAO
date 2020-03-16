package scoala;

public class catalog {

    public String grupa;
    public student s1, s2, s3, s4, s5;

    public String toStringy(){
        return grupa + "\n" + s1.toStringy() + "\n" + s2.toStringy()+ "\n" + s3.toStringy()+ "\n" + s4.toStringy()+ "\n" + s5.toStringy();
    }
    public double getMedieClasa(){
        return (s1.getMedieAn() + s2.getMedieAn() + s3.getMedieAn() + s4.getMedieAn() + s5.getMedieAn())/5;
    }

    public catalog(String grupa, student s1, student s2, student s3, student s4, student s5) {
        this.grupa = grupa;
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
        this.s4 = s4;
        this.s5 = s5;
    }

    public catalog() {
        this("", new student(), new student(), new student(), new student(), new student());
    }

    public static void main(String[] args){

        catalog myCatalog = new catalog("244",
                new student("Ion",10,10),
                new student("Maria",5,7),
                new student("Nicu",6,8),
                new student("Ilie",10,9),
                new student("Costel",9,10));
        System.out.println(myCatalog.toStringy() + "\n");
        System.out.println(myCatalog.getMedieClasa());

    }

}
