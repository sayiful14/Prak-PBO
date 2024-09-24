public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("ipul", 22, "kubah mas");
        person1.displayinfo();

        person1.setName("Bob");
        person1.setAge(30);
        person1.setAddress("kupang");

    System.out.println("Update Information");
    person1.displayinfo();
    }
}
