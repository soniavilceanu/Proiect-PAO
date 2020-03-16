import java.util.Scanner;

public class student {

    private String nume;
    private String prenume;
    public static int contor = 0;

    public student(){
        nume = "";
        prenume = "";
        contor ++;
    }
    public student(String nume, String prenume){
        this.nume = nume;
        this.prenume = prenume;
        contor ++;
    }

    public String toStringy(){
        return nume + " " + prenume;
    }

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        student studenti[] = new student[5];

        for (int i = 0; i<studenti.length; i++){

            String nume = scan.next();
            String prenume = scan.next();

            studenti[i] = new student(nume,prenume);
            System.out.println(studenti[i].toStringy() + "  " + student.contor);
        }

    }
}
