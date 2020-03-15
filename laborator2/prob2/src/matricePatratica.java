public class matricePatratica {

    public static boolean simetrica(int n, int mat[][]){

        for(int i=0; i<n; i++)
            for(int j=0; j<n; j++)
                if(mat[i][j] != mat[j][i]) return false;
        return true;
    }

    public static void main(String[] args){
    int mat[][] = new int[][] {{1,7,3},{7,4,-5},{3,-5,6}};
    int n=mat[0].length;

    System.out.println(matricePatratica.simetrica(n,mat));
    }
}
