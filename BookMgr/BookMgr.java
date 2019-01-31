import java.util.Scanner;

public class BookMgr {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[]names = new String[6];
        int []states = new int[6];
        int []dates = new int[6];
        int [] counts = new int[6];
        
        names[0] = "白雪公主";
        dates[0] = 5;
        states[0] = 1;
        counts[0] = 10;
        names[1] = "葫芦兄弟";
        dates[1] = 0;
        states[1] = 0;
        counts[1] = 16;
        names[2] ="白雪公主2" ;
        dates[2] = 0;
        states[2] = 0;
        counts[2] = 78;
        boolean flag = true;
        int num = 0;
        do{
            System.out.println(欢迎使用迷你图书管理系统);
            System.out.println(1.查看图书);
            System.out.println(2.新增图书);
            System.out.println(3.借阅图书);
            System.out.println(4.归还图书);
            System.out.println(5.删除图书);
            System.out.println(6.退出系统);
            System.out.print("请选择你的操作：");
            
            int choose = input.nextInt();
            switch(choose){
            case 1
                System.out.println(n图书信息列表--);
                System.out.println(图书序号t图书名称t图书状态t借阅日期t借阅次数);
                for (int i = 0;inames.length;i++) {
                    if (names[i] != null) {
                        String state = (states[i] == 0)可借阅已借出;
                        String date = (dates[i] == 0)dates[i]+日;
                        String count = counts[i]+次;
                        System.out.println((i+1)+t+names[i]+t+state+t+date+t+count);
                    }else{
     
                        break;
                    }
                }
                break;
            case 2
                System.out.println(n图书信息列表--);
                System.out.print(请输入新增图书名称：);
                String name = input.next();
                boolean flagAdd = false;
                for (int i = 0;inames.length;i++) {
                    if (names[i] == null) {
                        flagAdd = true;
                        names[i] = name;
                        System.out.println(图书《+name+》添加成功！);
                        break;
                    }
                }
                if (!flagAdd) {
                    System.out.println(对不起，货架已满，无法添加图书！);
                }
                break;
            case 3
                break;
            case 4
                break;
            case 5
                break;
            case 6
                flag = false;
                break;
            default
                flag = false;
                break;
            }
            if (flag == false) {
                break;
            }else{
                System.out.println(请输入0返回);
                num= input.nextInt();
            }
        }while(num == 0);
        System.out.println(谢谢，欢迎使用！);        
    }   
}