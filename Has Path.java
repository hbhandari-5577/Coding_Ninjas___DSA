import java.util.*;
public class Solution
{
    public static void hasPath(int adjMatrix[][],int v1,int v2,boolean visited[])
    {
        Queue<Integer> q = new LinkedList<>();
        q.add(v1);
        int n=adjMatrix.length;
        while(q.size()!=0)
        {
            int remove=q.remove();
            visited[remove]=true;
            if(remove==v2)
            {
                System.out.print("true");
                return;
            }
            for(int i=0;i<n;i++)
            {
                if(adjMatrix[remove][i]==1&&!visited[i])
                {
                    visited[i]=true;
                    q.add(i);
                }
            }
        }
        System.out.print("false");
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int e = sc.nextInt();
        int adjMatrix[][]=new int[n][n];
        for(int i=0;i<e;i++)
        {
            int fv = sc.nextInt(); // first vertix
            int sv = sc.nextInt(); // second vertix
            adjMatrix[fv][sv]=1;
            adjMatrix[sv][fv]=1;
        }
        int v1 = sc.nextInt();
        int v2 = sc.nextInt();
        boolean visited[] = new boolean[adjMatrix[0].length];
        hasPath(adjMatrix,v1,v2,visited);
    }
}