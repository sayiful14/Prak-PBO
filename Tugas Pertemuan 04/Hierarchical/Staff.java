public class Staff extends Dosen {
    public Staff (String nama) {
        super(nama);
    }

    @Override
    public void kerja() {
        System.out.println("bantu dosen");
    }
}
