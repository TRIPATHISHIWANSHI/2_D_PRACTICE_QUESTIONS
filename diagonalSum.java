

class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat[0].length;
        int ans = 0;

// O(N*N)
        // for(int i =0;i<n;i++){
        //     for(int j =0;j<n;j++){
        //         if(i==j || i+j==n-1){
        //             ans+=mat[i][j];
        //         System.out.println(ans+" "+i+" "+j+" "+mat[i][j]);
        //         }
        //     }
        // }

// O(N)
        for(int i =0;i<n;i++){
            ans+=mat[i][i];
        }
        int k = n-1;
        for(int i =0;i<n;i++){
            if(i!=k)
            ans+=mat[i][k--];
            else k--;
        }
        return ans;
    }
}
