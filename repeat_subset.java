// Target Sum repeat it ion

public class repeat_subset
{
    public static void main(String[] args) {
        int [] arr= {2,3,4};
        print_subset(arr,6,new String(),3,0);
    }

    static void print_subset(int [] arr , int sum , String ans , int  n,int index)
    {
        if(sum == 0)
        {
            System.out.println(ans);
            return ;
        }
        if(index == n || sum < 0)
        {
            return;
        }
        int x = arr[index];
        int left_sum=sum-x;

        print_subset(arr, left_sum, ans+x, n, index);     // taking the element but not increaing the index
        print_subset(arr, sum, ans, n, index+1);        // no taking the element

    }
}