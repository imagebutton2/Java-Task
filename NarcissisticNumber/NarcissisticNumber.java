
public class NarcissisticNumber {
    public static void main(String[] args) {
        for(int i = 100;i < 1000;i++) {
            if(isNarcissisticNumber(i)) {
                System.out.print(i+"¡¢");
            }
        }
    }
    public static boolean isNarcissisticNumber(int num) {
        if(num<100 && num > 1000) {
            return false;
        }else {
            int gewei = num % 10;
            int shiwei = (num / 10) % 10;
            int baiwei = num / 100;
            int result = gewei*gewei*gewei+
                shiwei*shiwei*shiwei+baiwei*baiwei*baiwei;
            if(result == num) {
                return true;
            }else {
                return false;
            }
        }
    }
}
