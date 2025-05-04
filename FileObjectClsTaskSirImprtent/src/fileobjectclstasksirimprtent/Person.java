
package fileobjectclstasksirimprtent;


public class Person {
    
    String name;
    int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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

    public void setAge(int age) {
        this.age = age;
    }
    
//    public String ps(){
//        
//        String masud ="Name : "+name+"\n"+"Age : "+age+"\n";
//    
//    
//    return masud;
//    }
        
    
   public void displayPersonDetails(){
    
        System.out.println("Name :" + name);
        System.out.println("Name :" + age);
    
    }  
    
}
