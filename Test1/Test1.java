public class Test1
{
 
    public static void main(String[] args)
    {
        
    myprint();
    }

    public static void myprint()
    {
        int k=0;
        for(int i=1;i<10;i++)
        {
            for(int j=1;j<=i;j++)
            {
                k=j;//k为这一行要打印的列
                System.out.print(i+"*"+j+"="+(i*j)+" \t");//按 1*1=1 的格式打印
            }
            if(k>=i)//这一行打印完毕
            {
                 System.out.print("\n");
            }
        }
    }
}