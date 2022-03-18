public class MyClass
{
    public static int knapsack(int W,int v[],int wt[],int i)
    {
        if(i==v.length)
        {
            return 0;
        }
        int ans;
        if(wt[i]<=W)
        {
            int ans1=v[i]+knapsack(W-wt[i],v,wt,i+1); // including ith item
            int ans2=knapsack(W,v,wt,i+1); // excluding ith item
            ans=Math.max(ans1,ans2);
        }
        else
        {
            ans=knapsack(W,v,wt,i+1);
        }
        return ans;
    }
    public static void main(String args[])
    {
        int value[]={200,300,100};
        int weight[]={20,25,30};
        int net_Weight=50;
        int ans=knapsack(net_Weight,value,weight,0);
        System.out.print(ans);
    }
}