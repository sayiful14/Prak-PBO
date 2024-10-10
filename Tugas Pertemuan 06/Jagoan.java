public class Jagoan {
    private String nama;
    private int baseHealth;
    private int baseAttack;
    private Jubah jubah;
    private Senjata senjata;
    

    public Jagoan(String nama) {
        this.nama = nama;
        this.baseHealth = 100;
        this.baseAttack = 10;
    }

    public String getNama() {
        return this.nama;   
    }

    public void setJubah(Jubah jubah) {
        this.jubah = jubah;
    }

    public void setSenjata(Senjata senjata) {
        this.senjata = senjata;
    }

    public int maxHealth() {
        return this.baseHealth + this.jubah.getAddHealth();
    }

    public int getAttackPower() {
        return this.baseAttack + this.senjata.getAttack();
    }
 
    public void display() {
        System.out.println("Player\t: " + this.nama);
        System.out.println("Health\t: " + this.maxHealth());
        System.out.println("Equip\t: " + this.jubah.getJubah());
        System.out.println("Weapon\t: " + this.senjata.getSenjata());
        System.out.println("Attack\t: " + this.getAttackPower());
    }

    public void serang(Jagoan lawan) {
        System.out.println(this.nama + " menyerang " + lawan.getNama());
    }
}