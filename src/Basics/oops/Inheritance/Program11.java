package Basics.oops.Inheritance;

class Program11 {
    String fname;
    String lname;

    Program11(String fname, String lname){
        this.fname = fname;
        this.lname = lname;
    }
}

class Student extends Program11{
    int usn;

    Student(String fname, String lname,int usn){
        super(fname,lname);
        this.usn = usn;
    }

    public static void main(String[] args) {
        Student st = new Student("Sanjana N", "Bharadwaj", 144);
        System.out.println("USN :" + st.usn + "  " + "NAME :" + st.fname + " "+ st.lname);

    }
}
