package Exercise_1_MZ.Ex16_to_Ex27;

public class Person {
    private String name;
    private String surname;
    private int age;
    private Address address;
    public Person() {

    }
    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = null;
    }

    public Person(String name, String surname, int age, Address address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }

    public void introduce() {
        System.out.println(getName() + " " + getSurname());
    }

    public void introduceWithAddress() {
        System.out.println(getName() + " " + getSurname() + " i mieszkam " + address.toString());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
