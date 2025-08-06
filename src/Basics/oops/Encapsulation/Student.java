package Basics.oops.Encapsulation;

public class Student {
    private String usn;
    private String name;

    Student(String usn, String name){
        this.usn = usn;
        this. name = name;
    }
    void setName(String name){
        this.name = name; //sets the name to the private member of the class
    }

    String getName(){
        return name; //gets the value from the private member
    }

    public static void main(String[] args) {
        Student s = new Student("Sanjana", "144");
        System.out.println(s.getName());
        s.setName("Skanda");
        System.out.println(s.getName());
    }
}
