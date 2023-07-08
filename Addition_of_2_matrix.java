

class Solution
{
    public void  Addition(int[][] matrixA, int[][] matrixB)
    {
        // code here
        for(int i=0;i<matrixA.length;i++){
            for(int j =0;j<matrixA[0].length;j++){
                matrixA[i][j]+=matrixB[i][j];
            }
        }
    }
}
