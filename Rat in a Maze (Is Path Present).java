public class Solution
{
    public static boolean ratInAMaze(int maze[][])
    {
        int n=maze.length;
        int path[][]=new int[n][n];
        return helper(maze,0,0,path);
    }
    public static boolean helper(int[][] maze,int i,int j,int[][] path)
    {
        int n=maze.length;
        if(i<0 || i>=n || j<0|| j>=n || maze[i][j]==0 || path[i][j]==1) // if i,j cell is valid
        {
            return false;
        }
        path[i][j]=1;
        if(i==n-1 && j==n-1) // base case
        {
            return true;
        }
        if(helper(maze,i-i,j,path)) // checking top
        {
            return true;
        }
        if(helper(maze,i,j+1,path)) // checking right
        {
            return true;
        }
        if(helper(maze,i+1,j,path)) // checking down
        {
            return true;
        }
        if(helper(maze,i,j-1,path)) // checking left
        {
            return true;
        }
        return false;
    }
}