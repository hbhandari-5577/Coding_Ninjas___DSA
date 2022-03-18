import java.util.*;
public class Solution
{
    public static void bft(int adjMatrix[][], int currentVertex, boolean visited[])
    {
        Queue<Integer> q = new LinkedList<>();
        q.add(currentVertex);
        while(q.size() != 0)
        {
            int firstElement = q.remove();
            System.out.print(firstElement+" ");
            visited[currentVertex] = true;
            for(int i=0; i<adjMatrix[0].length; i++)
            {
                if(adjMatrix[firstElement][i]==1 && visited[i]==false)
                {
                    q.add(i);
                    visited[i]=true;
                }       
            }
        }   
    }
    public static void bfs(int adjMatrix[][]) // we have to deal with both connected and non connected
    {
        boolean visited[] = new boolean[adjMatrix.length];
        for(int i=0; i<adjMatrix.length; i++)
        {
            if(visited[i]==false)
            {
                bft(adjMatrix, i, visited);   
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int e = sc.nextInt();
        int adjMatrix[][] = new int[n][n];
        for(int i=0; i<e; i++)
        {
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            adjMatrix[v1][v2] = 1;   
            adjMatrix[v2][v1] = 1;
        }
        bfs(adjMatrix);
    }
}