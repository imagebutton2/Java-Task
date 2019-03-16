public class TestDemo {
    //早期实现泛型。。。用数组实现
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
    //Object是所有类的父类，，用它来实现泛型
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
        //必须要向下转型
        int x = (int)point.getX();
        int y = (int)point.getX();
        System.out.println("x="+x);
        System.out.println("y="+y);
    }


}
