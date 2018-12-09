//Java数组章节练习题
public class ArrayUtils
{
 
    public static void main(String[] args)
    {
        int max=0;
        int min=0;
        int sum=0;

        int []data1=new int[]{1,2,3,4,5,6};
        int []data2=new int[]{7,8,9,10,11,12};
        int []a=new int[]{1,3,5,7,9};
        int []b=null;
        b=arraySub(a,1,3);
        a=arraySub(a,1,3);
        int []data3=arrayJoin(data1,data2);

        max=arrayMaxElement(data1);
        min=arrayMinElement(data1);
        sum=arrayElementSum(data1);
         System.out.println(max+"\n");
         System.out.println(min+"\n");
         System.out.println(sum+"\n");
         printArray(data1);
         printArray(data3);
         printReversal(data1);
         printArray(b);
         printArray(a);

    }
     //1.计算数组中最大值
     //遍历max和数组元素依次比较
     public static int arrayMaxElement(int[] data)
     {
        int max=data[0];
          for(int i=0;i<data.length;i++)
        {
            if(data[i]>=max)
            {
            max=data[i];
            }

        }
        return max;
    }
    //2.计算数组中最小值
    //遍历min和数组元素依次比较
    public static int arrayMinElement(int[] data)
    {
        int min=data[0];
        for(int i=0;i<data.length;i++)
        {
            if(min>=data[i])
            {
                min=data[i];
            }
        }
        return min;
    }

    //3.计算数组值之和
    public static int arrayElementSum(int[] data)
    {
        int sum=0; 
        for(int i=0;i<data.length;i++)
        {
            sum+=data[i];
        }
        return sum;
    }

     //4.数组拼接
    // A {1,3,5,7,9} B {2,4,6,8,10} -> {1,3,5,7,9,2,4,6,8,10}
      public static int[] arrayJoin(int[] a, int[] b)
    {
        int length=a.length+b.length;
        int []dataJoin=new int[length];
        int i=0;
        int j=a.length;
        int k=0;
        /**for(int i=0;i<a.length;i++)//for循环方式
        {
          dataJoin[i]=a[i];
        }
         for(int i=0;i<b.length;i++)
        {
          dataJoin[i+b.length]=b[i];
        }
         */
        while(i<a.length&&j<length&&k<b.length)//while循环
        {
            dataJoin[i]=a[i];
            i++;
            dataJoin[j++]=b[k++];
        }

        return dataJoin;
    }
    
    


    //5.数组截取
    //[start, end)
    // A {1,3,5,7,9} ->(A,1,3) > {3,5}
     public static int[] arraySub(int[] data, int start , int end)
     {
     int length=end-start;//新数组的大小
     int []dataSub=new int[length];
     int i=0;//新数组首元素
     int j=start;//要截取的开始元素
     while(i<length&&j<end)
     {
         dataSub[i++]=data[j++];
     }
     return dataSub;
     }
     
     
       //6.数组打印
     public static void printArray(int []temp)
     {
     for(int i=0;i<temp.length;i++)
      {
           System.out.println(temp[i]);
      }
           System.out.print("\n");
     }
     
     

      //7.数组反转
    // 比如：[1,2,3,4] => [4,3,2,1]
    //第一种方法是逆序打印，但不改变数组内容
    //第二种方法是将内容逆序，改变原数组
     public static void printReversal(int[] data){
       //第二种方法
        for(int i=0;i<=data.length/2;i++)
       {
           data[i]=data[i]^data[data.length-i-1];
           data[data.length-i-1]=data[i]^data[data.length-i-1];
           data[i]=data[i]^data[data.length-i-1];
       }
       //打印数组
       for(int i=0;i<data.length;i++)
      {
           System.out.println(data[i]);
      }
       System.out.print("\n");
    }  
}