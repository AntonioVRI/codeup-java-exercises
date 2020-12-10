public class Person {
    private String name;


//    return this person's name
    public String getName(){
        return name;
    }

//    change property: name to the value given
    public void setName(String name){
        this.name = name;
    }

//    print to console using the name
    public void sayHello(){
        System.out.println("Hello, " + name);
    }

//    Person() method
    public Person(String name){
        this.name = name;
    }

    public static void main(String[] args) {
        Person person1 = new Person("Anthony");
        person1.sayHello();
        System.out.println(person1.getName());

        Person person2 = person1;

        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person1.setName("Jane");
        

    }
}
