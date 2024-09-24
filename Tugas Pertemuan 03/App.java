public class App {
    public static void main(String[] args) throws Exception {
        
        Karyawan Ridho = new Karyawan("12345", "Ridho");
        Karyawan Melan = new Karyawan("12346", "Melan");

        Ridho.getInfo();
        Melan.getInfo();
        Ridho.absenPagi();
        Ridho.kerja();
        Melan.absenPagi();
        Melan.kerja();
        Ridho.absenPulang();
        Melan.absenPulang();

        Dosen Andiani = new Dosen("23455", "332211", "Andiani");
        Dosen Ionia = new Dosen("23456", "332212", "Ionia");

        Andiani.getInfo();
        Ionia.getInfo();
        Andiani.absenPagi();
        Ionia.absenPagi();
        Andiani.kerja();
        Ionia.kerja();
        Andiani.ngajar();
        Ionia.ngajar();
        Andiani.absenPulang();
        Ionia.absenPulang();
    }
}