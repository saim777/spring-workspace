package beans;

public class Student {
    public String firstName;
    public int id;

    public Student(){

    }
    public Student(String firstName,int id){
       this.firstName=firstName;
       this.id=id;
    }
    public static Student createInstance(){
        return new Student();
    }

}
