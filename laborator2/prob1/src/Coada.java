import java.util.Arrays;

public class Coada {

    private int q[];
    private int n;

    //metode
    public Coada(){
        q = new int[100];
        n = 0;
    }
    public Coada(int n){
        n = 0;
        q = new int[n];
    }
    private void push(int x){
        int aux[] = q.clone();
        q = new int[n+1];
        for( int i=0; i<n; i++)
            q[i] = aux[i];
        q[n] = x;
        n++;


    }
    private int pop(){
        int aux[] = Arrays.copyOfRange(q,1,n);
        int popValue = q[0];
        q = new int[n-1];
        n--;
        for(int i=0; i<n; i++)
            q[i] = aux[i];

        return popValue;
    }
    private boolean isEmpty(){
        if(n == 0) return true;
        else return false;
    }
    private String toStringy(){
        String afis = "";
        afis = afis + n + ": ";
        for(int i=0; i<n; i++)
            afis = afis + Integer.toString(q[i]) + " ";

        return afis;
    }


    public static void main(String[] args){
        Coada test = new Coada();
        test.push(5);
        test.push(3);
        test.push(1);
        test.push(2);

        System.out.println(test.toStringy());

        test.pop();    System.out.println("-pop-");
        test.pop();    System.out.println("-pop-");
        test.pop();    System.out.println("-pop-");

        System.out.println("Este coada goala? " + test.isEmpty());

        System.out.println(test.toStringy());

        test.pop();    System.out.println("-pop-");
        System.out.println("Este coada goala? " + test.isEmpty());

    }
}
