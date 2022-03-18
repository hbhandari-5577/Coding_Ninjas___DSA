import java.util.*;
public class Solution
{
    public static void help(int adjMatrix[][],boolean visited[],int fv)
    {
        visited[fv]=true;
        int n=adjMatrix.length;   
        for(int j=0;j<n;j++)
        {
            if(adjMatrix[fv][j]==1&&!visited[j])
            {
                help(adjMatrix,visited,j); 
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int e = sc.nextInt();
        if(n==0)
        {
            System.out.print("true");
            System.exit(0);
        }
        int adjMatrix[][]=new int[n][n];
        for(int i=0;i<e;i++)
        {
            int fv=sc.nextInt();
            int sv=sc.nextInt();
            adjMatrix[fv][sv]=1;
            adjMatrix[sv][fv]=1;
        }    
        boolean visited[]=new boolean[adjMatrix.length];
        help(adjMatrix,visited,0);
        int length=visited.length;
        int i=0;
        while(i<visited.length)
        {
            if(visited[i]!=true)
            {
                System.out.print("false");
                System.exit(0);
            }
            i++;
        }
        System.out.print("true");
        System.exit(0);
    }
}