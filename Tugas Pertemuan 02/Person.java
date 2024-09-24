public class Person {
    private String name;
    private int age;
    private String address;

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void displayinfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Address: " + this.address);
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getname() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return  this.age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String Address() {
        return this.address;
    }
}
