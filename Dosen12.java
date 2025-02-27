public class Dosen12 {
    public String kode;
    public String nama;
    public boolean jenisKelamin;
    public int usia;

    public Dosen12(String kode, String nama, boolean jenisKelamin, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }

    public void cetakInfo() {
        System.out.println("Data Dosen");
        System.out.println("Kode         : " + this.kode);
        System.out.println("Nama         : " + this.nama);
        System.out.println("Jenis Kelamin: " + (this.jenisKelamin ? "L" : "P"));
        System.out.println("Usia         : " + this.usia);
        System.out.println("-----------------------------");
    }
}
