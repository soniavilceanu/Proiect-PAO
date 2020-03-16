import java.util.Arrays;

public class array {

    public static int[] cauta(int a[], int x){

        int index = -1;
        for (int i = 0; i<a.length; i++){
            if(a[i] == x){
                index = i;
                break;
            }
        }

        if (index == -1) return null;
        else return Arrays.copyOfRange(a,index,a.length);
    }

    public static void main(String [] args){

        int a[] = {4, 5, 6, 6, 2, 8, 9};
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(cauta(a,6)));
    }
}
