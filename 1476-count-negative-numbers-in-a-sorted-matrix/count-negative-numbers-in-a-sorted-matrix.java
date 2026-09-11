class Solution {
    public int countNegatives(int[][] grid) {
        int count=0;
        for(int i=0;i<grid.length;i++){
            Arrays.sort(grid[i]);

            int start=0;
            int end=grid[i].length-1;

            while(start<=end) {
                int mid = start+(end-start)/2;

                if(grid[i][mid] >= 0) {
                    end=mid-1;
                } 
                else if(grid[i][mid] < 0) {
                    start=mid+1;
                }
            }
            count=count+start;
        }
        return count;
    }
}