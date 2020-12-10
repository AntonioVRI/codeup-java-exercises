public class Person {
    private String name;

//    return this person's name
    public String getName(){
        return this.name;
    }

//    change property: name to the value given
    public void setName(String name){
        this.name = name;
    }

//    print to console using the name
    public void sayHello(){
        System.out.println("Hello, " + this.name);
    }

//    Person() method
    public Person(String name){
        this.name = name;
    }

    public static void main(String[] args) {

    }
}
