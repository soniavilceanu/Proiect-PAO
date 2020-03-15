import java.util.Scanner;

public class matrice {

    public int n, m, mat[][];

    public matrice(int n, int m) {
        this.n = n;
        this.m = m;
        mat = new int[n][m];
    }
    public matrice() {
        this.n = 0;
        this.m = 0;
        mat = new int[100][100];
    }

    public void citire(){

        Scanner scan = new Scanner(System.in);

        for(int i=0; i<n; i++)
            for(int j=0; j<m; j++)
                mat[i][j] = scan.nextInt();

    }

    public matrice add(matrice m2) {

        if (m2.mat[0].length != m || m2.mat.length != n){
            System.out.println("nu se pot aduna");
            return null;
    }
        else{
            matrice matriceAux = new matrice();
            matriceAux.mat = new int[n][m];

            for(int i=0; i<n; i++)
                for(int j=0; j<m; j++)
                    matriceAux.mat[i][j] = this.mat[i][j] + m2.mat[i][j];

                matriceAux.n=n;
                matriceAux.m=m;
                return matriceAux;
        }
    }

    private matrice multiply(matrice m2) {

        if (m2.n != m){
            System.out.println("nu se pot inmulti");
            return null;
        }
        else{
            matrice matriceAux = new matrice();
            matriceAux.mat = new int[n][m2.m];


            for(int i=0; i<n; i++)
                for(int j=0; j<m2.m; j++)
                    for(int k=0; k<m; k++)
                        matriceAux.mat[i][j] += this.mat[i][k] * m2.mat[k][j];
            matriceAux.n=n;
            matriceAux.m=m2.m;
            return matriceAux;
         }
    }

    public matrice pow(int x){

        matrice aux = new matrice();
        aux.mat = new int[n][m];
        aux.n=n;
        aux.m=m;

        for(int i=0; i<n; i++)
            aux.mat[i][i]=1;

        for (int i = 0; i < x; i++)
            aux = this.multiply(aux);

        return aux;

    }

    public String toStringy(){
        String afis = "";

        for(int i=0; i<n; i++) {
            for (int j = 0; j < m; j++)
                afis = afis + Integer.toString(mat[i][j]) + " ";
            afis = afis + "\n";
        }
        return afis;
    }

    public static void main(String[] args){

        matrice m1, m2;
        m1 = new matrice(2,2);
        m2 = new matrice(2,2);

        m1.citire(); m2.citire();

        //adunare
        matrice m3 = m1.add(m2);
        if(m3 != null)
            System.out.println(m3.toStringy());

        //inmultire
        matrice m4 = m1.multiply(m2);
        if(m4 != null)
            System.out.println(m4.toStringy());

        //ridicare la putere
        matrice m5 = m1.pow(3); // la puterea 3
        if(m5 != null)
            System.out.println(m5.toStringy());
    }

}
