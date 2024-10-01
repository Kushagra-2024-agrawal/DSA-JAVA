// Targetvsubset sum

public class subset_sum
{
    public static void main(String[] args) {
        String s ="234";
        sum_subet(s,6,new String());
        
    }

    static void sum_subet(String s , int sum , String ans)
    {
        
        if(s.length() == 0)
        {
            if(sum == 0)
            {
                System.out.println(ans);
                return ;
            }

            return ;
        }

        


        char ch = s.charAt(0);
        String ros = s.substring(1);

        int x = ch -48;
        int left_sum = sum -x;

        sum_subet(ros, left_sum, ans + x);
        sum_subet(ros,sum,ans);

    }

}