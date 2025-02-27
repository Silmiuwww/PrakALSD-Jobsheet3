import java.util.Scanner;

public class DosenDemo12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah dosen: ");
        int jumlah = sc.nextInt();
        sc.nextLine();
        Dosen12[] daftarDosen = new Dosen12[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));

            System.out.print("Kode         : ");
            String kode = sc.nextLine();
            System.out.print("Nama         : ");
            String nama = sc.nextLine();
            System.out.print("Jenis Kelamin (L/P): ");
            char jk = sc.nextLine().charAt(0);
            boolean jenisKelamin = (jk == 'L' || jk == 'l'); 
            System.out.print("Usia         : ");
            int usia = sc.nextInt();
            System.out.println("-----------------------------");

            daftarDosen[i] = new Dosen12(kode, nama, jenisKelamin, usia);
            sc.nextLine();
        }

        System.out.println("\nData Dosen yang telah dimasukkan:");
        for (Dosen12 dosen : daftarDosen) {
            dosen.cetakInfo();

    }
}
}