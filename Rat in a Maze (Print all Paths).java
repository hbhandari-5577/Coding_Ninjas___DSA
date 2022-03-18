public class Solution
{
    public static void ratInAMaze(int maze[][])
    {
        int n=maze.length;
        int path[][]=new int[n][n];
        helper(maze,0,0,path);
    }
    public static void helper(int[][] maze,int i,int j,int[][] path)
    {
        int n=maze.length;
        if(i<0 || i>=n || j<0|| j>=n || maze[i][j]==0 || path[i][j]==1) // if i,j cell is valid
        {
            return;
        }
        path[i][j]=1;
        if(i==n-1 && j==n-1) // base case
        {
            for(int row=0;row<n;row++)
            {
                for(int col=0;col<n;col++)
                {
                    System.out.print(path[row][col]+" ");
                }
                System.out.println();
            }
            System.out.println();
            path[i][j]=0;
            return;
        }
        helper(maze,i-i,j,path); // checking top
        helper(maze,i,j+1,path); // checking right
        helper(maze,i+1,j,path); // checking down
        helper(maze,i,j-1,path); // checking left
        path[i][j]=0;
    }
    public static void main(String args[])
    {
        int arr[][]={{1,1,0},{1,1,0},{1,1,1}};
        ratInAMaze(arr);
    }
}