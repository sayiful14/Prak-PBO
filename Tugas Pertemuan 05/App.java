public class App {
    public static void main(String[] args) {
        Spider spider = new Spider();
        spider.eat();

        Dog dog = new Dog();
        dog.setName("Budi");
        System.out.println("Nama anjing: " + dog.getName());
        dog.play();
        dog.eat();
        dog.walk();

        Cat cat = new Cat("Mouza");
        System.out.println("Nama kucing: " + cat.getName());
        cat.play();
        cat.eat();
        cat.walk();
    }
}