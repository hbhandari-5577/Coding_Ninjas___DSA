import java.util.*;
public class Solution
{
    public static void getpath(int adjMatrix[][], int start, int end, boolean visited[], HashMap<Integer, Integer> map)
    {
        Queue<Integer> q = new LinkedList<>();
        q.add(start); 
        int n=adjMatrix.length;
        int e=0;
        while(q.size()!=0)
        {
            int remove=q.remove();
            visited[remove]=true;
            for(int i=0;i<n;i++)
            {
                if(adjMatrix[remove][i]==1&&!visited[i])
                {
                    map.put(i,remove);
                    visited[i]=true;
                    q.add(i);
                    if(i==end)
                    {
                        e=1;    
                    }
                    if(e==1)
                    {
                    	break;
                    }
                }
                if(e==1)
                {
                    break;
                }
            }
        }
        if(e==1)
        {
            int last=map.get(end);
            System.out.print(end+" ");
            while(last!=end)
            {
                System.out.print(last+" ");
                if(map.get(last)!=null)
                {
                    last=map.get(last);
                }
                else
                {
                    break;
                }
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int e = sc.nextInt();
        int adjMatrix[][]=new int[n][n];
        for(int i=0;i<e;i++)
        {
            int fv=sc.nextInt();
            int sv=sc.nextInt();
            adjMatrix[fv][sv]=1;
            adjMatrix[sv][fv]=1;
        }
        int start=sc.nextInt();
        int end=sc.nextInt();    
        HashMap<Integer, Integer> max = new HashMap<>();
        boolean visited[]= new boolean[adjMatrix[0].length];
        getpath(adjMatrix,start,end,visited,max);
    }
}