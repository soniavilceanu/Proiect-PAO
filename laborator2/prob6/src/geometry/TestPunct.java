package geometry;
import geometry.punct;

public class TestPunct {

    public static void main(String [] args){

        punct A = new punct(1,3);
        punct B = new punct(-1,2);
        System.out.println(A.distance(B));
        System.out.println(A.distance(-1,2));
    }
}
