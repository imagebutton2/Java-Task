public class TestDemo {
    //����ʵ�ַ��͡�����������ʵ��
    public static int add(int...data){
        int result=0;
        for (int i = 0; i<data.length;i++) {
            result += data[i];

        }
        return result;



    }

    private  Point point(){

        return new Point();
    }
    //Object��������ĸ��࣬��������ʵ�ַ���
   private class Point{
        private Object x;
        private Object y;

        public Point() {

        }

        public Object getX() {
            return x;
        }

        public void setX(Object x) {
            this.x = x;
        }

        public Object getY() {
            return y;
        }

        public void setY(Object y) {
            this.y = y;
        }
    }


    public static void main(String[] args) {
        System.out.println(add(1,2,3,4,5,6));
        System.out.println(add(new int []{1,2,5,6}));


        TestDemo testDemo = new TestDemo();
        Point point=testDemo.point();
        point.setX(10);
        point.setY(10);
        //����Ҫ����ת��
        int x = (int)point.getX();
        int y = (int)point.getX();
        System.out.println("x="+x);
        System.out.println("y="+y);
    }


}
