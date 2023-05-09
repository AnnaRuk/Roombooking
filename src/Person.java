public class Person {

    private String firstName;
    private String lastName;

    Person(String firstName, String lastName){
        this.lastName = lastName;
        this.firstName = firstName;
    }
    public String toString(){
        return firstName + " " + lastName;
    }
}
