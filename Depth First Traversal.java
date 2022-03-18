import java.util.*;
public class Graphs
{
    public static void dft(int adjMatrix[][], int currentVertex, boolean visited[])
    {
        visited[currentVertex]=true;
        System.out.print(currentVertex+" ");
        for(int i=0;i<adjMatrix.length;i++)
        {
            if(adjMatrix[currentVertex][i]==1 && visited[i]==false)
            {
                dft(adjMatrix,i,visited); // i is the neighbour of currentVertex
            }
        }
    }
    public static void dft(int adjMatrix[][])
    {
        boolean visited[]=new boolean[adjMatrix.length];
        for(int i=0;i<adjMatrix.length;i++)
        {
            if(visited[i]==false)
            {
                dft(adjMatrix,i,visited);
            }
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int e=sc.nextInt();
        int adjMatrix[][]=new int[n][n];
        for(int i=0;i<e;i++)
        {
            int v1=sc.nextInt();
            int v2=sc.nextInt();
            adjMatrix[v1][v2]=1;
            adjMatrix[v2][v1]=1;
        }
        dft(adjMatrix);
    }
}