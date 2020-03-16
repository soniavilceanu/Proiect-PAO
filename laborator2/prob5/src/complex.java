public class complex {

    public double re, im;

    public complex(double re, double im){
        this.re = re;
        this.im = im;
    }
    public complex(){
        this(0,0);
    }

    public complex suma(complex nr){
        complex result = new complex();
        result.re = this.re + nr.re;
        result.im = this.im + nr.im;
        return result;
    }

    public String toStringy(){
        String afis;
        afis = re + "+" + im + "i";
        return afis;
    }

    public boolean isEqual(complex nr){
        if(re == nr.re  &&  im == nr.im) return true;
        return false;
    }



    public static void main(String [] args){

        complex x = new complex(5,6);
        complex y = new complex(8,2);

        System.out.println(x.toStringy());
        System.out.println(y.toStringy());

        System.out.println("suma : " + x.suma(y).toStringy());
        System.out.println("sunt egale? : " + x.isEqual(y));


    }
}
