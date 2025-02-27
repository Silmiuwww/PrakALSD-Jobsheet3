public class DataDosen12 {

    public static void dataSemuaDosen(Dosen12[] arrayOfDosen) {
        System.out.println("\n=== Data Semua Dosen ===");
        for (Dosen12 dosen : arrayOfDosen) {
            System.out.println("Kode         : " + dosen.kode);
            System.out.println("Nama         : " + dosen.nama);
            System.out.println("Jenis Kelamin: " + (dosen.jenisKelamin ? "Pria" : "Wanita"));
            System.out.println("Usia         : " + dosen.usia);
            System.out.println("-----------------------------");
        }
    }

    public static void jumlahDosenPerJenisKelamin(Dosen12[] arrayOfDosen) {
        int pria = 0, wanita = 0;

        for (Dosen12 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) { 
                pria++;
            } else {
                wanita++;
            }
        }

        System.out.println("\n=== Jumlah Dosen Per Jenis Kelamin ===");
        System.out.println("Pria  : " + pria);
        System.out.println("Wanita: " + wanita);
    }

    public static void rerataUsiaDosenPerJenisKelamin(Dosen12[] arrayOfDosen) {
        int totalUsiaPria = 0, totalUsiaWanita = 0;
        int countPria = 0, countWanita = 0;

        for (Dosen12 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                totalUsiaPria += dosen.usia;
                countPria++;
            } else {
                totalUsiaWanita += dosen.usia;
                countWanita++;
            }
        }

        System.out.println("\n=== Rata-rata Usia Dosen Per Jenis Kelamin ===");
        System.out.println("Pria  : " + (countPria == 0 ? "Tidak ada data" : (totalUsiaPria / (double) countPria)));
        System.out.println("Wanita: " + (countWanita == 0 ? "Tidak ada data" : (totalUsiaWanita / (double) countWanita)));
    }

    public static void infoDosenPalingTua(Dosen12[] arrayOfDosen) {
        if (arrayOfDosen.length == 0) {
            System.out.println("\nTidak ada data dosen.");
            return;
        }

        Dosen12 dosenTertua = arrayOfDosen[0];

        for (Dosen12 dosen : arrayOfDosen) {
            if (dosen.usia > dosenTertua.usia) {
                dosenTertua = dosen;
            }
        }

        System.out.println("\n=== Dosen Paling Tua ===");
        System.out.println("Kode         : " + dosenTertua.kode);
        System.out.println("Nama         : " + dosenTertua.nama);
        System.out.println("Jenis Kelamin: " + (dosenTertua.jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("Usia         : " + dosenTertua.usia);
    }

    public static void infoDosenPalingMuda(Dosen12[] arrayOfDosen) {
        if (arrayOfDosen.length == 0) {
            System.out.println("\nTidak ada data dosen.");
            return;
        }

        Dosen12 dosenTermuda = arrayOfDosen[0];

        for (Dosen12 dosen : arrayOfDosen) {
            if (dosen.usia < dosenTermuda.usia) {
                dosenTermuda = dosen;
            }
        }

        System.out.println("\n=== Dosen Paling Muda ===");
        System.out.println("Kode         : " + dosenTermuda.kode);
        System.out.println("Nama         : " + dosenTermuda.nama);
        System.out.println("Jenis Kelamin: " + (dosenTermuda.jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("Usia         : " + dosenTermuda.usia);
    }
}
