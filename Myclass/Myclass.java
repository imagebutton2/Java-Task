//一个简单的泛型
public class Myclass<T,E> {
    private T t;
    private E e;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public E getE() {
        return e;
    }

    public void setE(E e) {
        this.e = e;
    }

    public static void main(String[] args) {
        Myclass<String,Integer> my=new Myclass<>();
        my.setT("杜豪");
        my.setE(18);
        String name = my.getT();
        Integer age = my.getE();
        System.out.println("姓名："+name+"  "+"年龄："+age );
    }
}
