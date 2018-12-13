package Test;
public class Person{
    private String name;
    private int age;
    public static String country="中国";
    
    Person(String name,int age){
          this.name=name;
          this.age=age;
    }
    
    public void fun(){
        System.out.println(name + " " + age + " " +country);
    }
   
    public static void main(String[] args)
    {
       Person person=new Person(" Mian", 18);
       person.fun();
       Person person1=new Person("Mian1", 20);
       person1.fun();
       Person person2=new Person("Mian2", 20);
       person2.fun();
       Person person3=new Person("Mian3", 20);
       person.country="日本";
       person3.fun();
       Person person4=new Person("Mian4", 20);
       person4.fun();
}
}
