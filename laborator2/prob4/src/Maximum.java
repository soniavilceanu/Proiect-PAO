public class Maximum {

    public int nr;

    public int maxim(int a){
        if(a > nr) return a;
        else return nr;
    }

    public int maxim(int a, int b){
        int x = maxim(a);
        int aux = nr;

        nr = x;
        int result = maxim(b);
        nr = aux;

        return result;
    }
    public int maxim(int a, int b, int c) {

        int aux = nr;
        int x = maxim(a);
        nr = x;

        int y = maxim(b);
        nr = y;

        int result = maxim(c);

        nr = aux;
        return result;
    }
    public int maxim(int a, int b, int c, int d) {

        int aux = nr;
        int x = maxim(a);
        nr = x;

        int y = maxim(b);
        nr = y;

        int z = maxim(c);
        nr = z;

        int result = maxim(d);

        nr = aux;
        return result;
    }


    public static  void  main(String[] args){

        Maximum o=new Maximum();
        o.nr=4;
        int a=3, b=5, c=2, d=6;
        System.out.println(o.maxim(a));
        System.out.println(o.maxim(a,b));
        System.out.println(o.maxim(a,b,c));
        System.out.println(o.maxim(a,b,c,d));
    }
}
