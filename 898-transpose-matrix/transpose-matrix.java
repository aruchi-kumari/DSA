class Solution {
    public int[][] transpose(int[][] mat) {
        int [][]t = new int[mat[0].length][mat.length];
        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[i].length; j++){
                t[j][i] = mat[i][j];
            }
        }
      return t;  
    }
}