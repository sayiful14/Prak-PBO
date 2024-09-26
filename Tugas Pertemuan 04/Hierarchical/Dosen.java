public class Dosen extends Karyawan {
    public Dosen (String nama) {
        super(nama);
    }

    @Override
    public void kerja() {
        System.out.println("mengajar");
    }
}