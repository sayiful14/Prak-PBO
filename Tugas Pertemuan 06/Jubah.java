public class Jubah{
    private String name;
    private int strength;
    private int health;

    public Jubah(String name, int strength, int health){
        this.name = name;
        this.strength = strength;
        this.health = health;
    }

    public int getAddHealth(){
        return this.strength + this.health;
    }

    public int getDefencePower(){
        return this.strength;
    }

    public String getJubah() {
        return this.name;
    }
}
