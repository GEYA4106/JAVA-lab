class Student{
    int id;
    String name;
    
    Student(int i,String n){
        id=i;
        name=n;
    }
    void display(){
        System.out.println("ID:"+id+"Name:"+name);
    }
}
public class Constructor{
    public static void main(String [] args){
        Student s = new Student(1,"Geya");
        s.display();
    }
}