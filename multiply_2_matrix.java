

class GfG
{
      public static void multiply(int A[][], int B[][], int C[][], int N)
        {
           for(int i=0;i<A.length;i++){
                for(int j =0;j<B.length;j++){
                    C[i][j] = 0;
                    for(int k =0;k<C[i].length;k++){
                        C[i][j] += A[i][k]*B[k][j];
                    }
                }
            }
        }
}
