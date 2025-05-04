
package fileobjectclstasksirimprtent;


public class Student extends Person {
    
    int id;

    public Student() {
    }

    public Student(int id) {
        this.id = id;
    }

    public Student(int id, String name, int age) {
        super(name, age);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

//    @Override
//    public String toString() {
//        return "Student{" + "id=" + id + '}';
//    }

    @Override
    public void displayPersonDetails() {
        super.displayPersonDetails(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.println("ID : "+id);
    }

    
    
    
}
