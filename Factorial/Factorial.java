// 递归实现20! 
public class Factorial
{
 
    public static void main(String[] args)
    {
        System.out.println(factorial(20));
        System.out.println(factorial(0));
        System.out.println(factorial(-2));
    }

    public static long factorial(int n)
    {
        if(n>=0)
        {
        if(n<=1)
        {
            return 1L;//0的阶乘为 1
        }
        else
        {
            return n*factorial(n-1);// 数据类型为long 因为是n*(n-1)! ------> n*(n-1)*.....*1L;
        }
        }
        else
        {
            return -1;
        }
    }
}