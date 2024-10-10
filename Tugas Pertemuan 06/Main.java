public class Main {
    public static void main(String[] args) {
        // Jagoan 1
        System.out.println("-- Pemain 1 --");
        Jagoan jakaSembung = new Jagoan("Jaka Sembung");
        Jubah jubahPutih = new Jubah("Jubah Putih", 7, 50);
        Senjata golok = new Senjata("Golok", 25);
        jakaSembung.setJubah(jubahPutih);
        jakaSembung.setSenjata(golok);
        jakaSembung.display();

        System.out.println();

        //Jagoan 2
        System.out.println("-- Pemain 2 --");
        Jagoan pitung = new Jagoan("Si Pitung");
        Jubah jubahHitam = new Jubah("Jubah Hitam", 8, 52);
        Senjata toya = new Senjata("Toya", 24);
        pitung.setJubah(jubahHitam);
        pitung.setSenjata(toya);
        pitung.display();

        System.out.println();

        //Gameplay
        System.out.println("-- Turn 1 --");
        jakaSembung.serang(pitung);
        jakaSembung.serang(pitung);
        System.out.println();

        System.out.println("-- Turn 2 --");
        pitung.serang(jakaSembung);
        System.out.println();

        System.out.println("-- Turn 3 --");
        jakaSembung.serang(pitung);
        System.out.println();

        System.out.println("-- Turn 4 --");
        pitung.serang(jakaSembung);
        
    }
}