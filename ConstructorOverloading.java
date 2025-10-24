class Student{
    int id;
    String name;
    Student(){
        id =0;
        name="not assigned";
    }
    Student (int i,String n){
        id =i;
        name=n;
    }
    void show(){
        System.out.println("ID:"+id+" Name:"+name);
    }
}
public class ConstructorOverloading{
    public static  void main(String [] args){
        Student s1 = new Student();
        Student s2 = new Student(1,"Geya");
        s1.show();
        s2.show();
    }
}
