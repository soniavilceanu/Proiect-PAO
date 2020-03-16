package geometry;
import java.lang.Math;

public class punct {

    private int x,y;

    public punct(){
        x=0; y=0;
    }
    public punct(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }

    public String toStringy(){
        String afis;
        afis = "(" + x + "," + y + ")";
        return afis;
    }
    public double distance( punct A){
        return Math.sqrt((x-A.x) * (x-A.x) + (y-A.y) * (y-A.y));
    }
    public double distance(int X, int Y){
        return Math.sqrt((x-X) * (x-X) + (y-Y) * (y-Y));
    }


    public static void main(String [] args){

    }



}
