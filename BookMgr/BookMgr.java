import java.util.Scanner;

public class BookMgr {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[]names = new String[6];
        int []states = new int[6];
        int []dates = new int[6];
        int [] counts = new int[6];
        
        names[0] = "��ѩ����";
        dates[0] = 5;
        states[0] = 1;
        counts[0] = 10;
        names[1] = "��«�ֵ�";
        dates[1] = 0;
        states[1] = 0;
        counts[1] = 16;
        names[2] ="��ѩ����2" ;
        dates[2] = 0;
        states[2] = 0;
        counts[2] = 78;
        boolean flag = true;
        int num = 0;
        do{
            System.out.println(��ӭʹ������ͼ�����ϵͳ);
            System.out.println(1.�鿴ͼ��);
            System.out.println(2.����ͼ��);
            System.out.println(3.����ͼ��);
            System.out.println(4.�黹ͼ��);
            System.out.println(5.ɾ��ͼ��);
            System.out.println(6.�˳�ϵͳ);
            System.out.print("��ѡ����Ĳ�����");
            
            int choose = input.nextInt();
            switch(choose){
            case 1
                System.out.println(nͼ����Ϣ�б�--);
                System.out.println(ͼ�����tͼ������tͼ��״̬t��������t���Ĵ���);
                for (int i = 0;inames.length;i++) {
                    if (names[i] != null) {
                        String state = (states[i] == 0)�ɽ����ѽ��;
                        String date = (dates[i] == 0)dates[i]+��;
                        String count = counts[i]+��;
                        System.out.println((i+1)+t+names[i]+t+state+t+date+t+count);
                    }else{
     
                        break;
                    }
                }
                break;
            case 2
                System.out.println(nͼ����Ϣ�б�--);
                System.out.print(����������ͼ�����ƣ�);
                String name = input.next();
                boolean flagAdd = false;
                for (int i = 0;inames.length;i++) {
                    if (names[i] == null) {
                        flagAdd = true;
                        names[i] = name;
                        System.out.println(ͼ�顶+name+����ӳɹ���);
                        break;
                    }
                }
                if (!flagAdd) {
                    System.out.println(�Բ��𣬻����������޷����ͼ�飡);
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
                System.out.println(������0����);
                num= input.nextInt();
            }
        }while(num == 0);
        System.out.println(лл����ӭʹ�ã�);        
    }   
}