public class DataDosen15 {
  // method menampilkan data semua dosen
  void dataSemuaDosen(Dosen15[] arrayOfDosen) {
    System.out.println("\n----- Data Semua Dosen -----");
    System.out.printf("%-15s %-25s %-20s %-10s\n", "Kode", "Nama", "Jenis Kelamin", "Usia");
    for (int i = 0; i < arrayOfDosen.length; i++) {
      System.out.printf("%-15s %-25s %-20s %-10s\n", arrayOfDosen[i].kode, arrayOfDosen[i].nama, arrayOfDosen[i].jenisKelamin, arrayOfDosen[i].usia);
    }
  }
  // method menampilkan data jumlah dosen per jenis kelamin
  void jumlahDosenPerJenisKelamin(Dosen15[] arrayOfDosen) {
    System.out.println("\n----- Data Jumlah Dosen Per Jenis Kelamin -----");
    int jmlPria = 0;
    int jmlWanita = 0;
    for (int i = 0; i < arrayOfDosen.length; i++) {
      if (arrayOfDosen[i].jenisKelamin.equalsIgnoreCase("pria")) {
        jmlPria++;
      } else {
        jmlWanita++;
      }
    }

    System.out.println("Jumlah pria     : " + jmlPria);
    System.out.println("Jumlah wanita   : " + jmlWanita);
  }
  // method menampilkan rata-rata usia dosen per jenis kelamin
  void rerataUsiaDosenPerJenisKelamin(Dosen15[] arrayOfDosen) {
    System.out.println("\n----- Rata-rata Usia Dosen Per Jenis Kelamin -----");
    int jmlPria = 0;
    int jmlWanita = 0;
    int jmlUsiaPria = 0;
    int jmlUsiaWanita = 0;
    double rata2Pria;
    double rata2Wanita;
    for (int i = 0; i < arrayOfDosen.length; i++) {
      if (arrayOfDosen[i].jenisKelamin.equalsIgnoreCase("pria")) {
        jmlPria++;
        jmlUsiaPria += arrayOfDosen[i].usia;
      } else {
        jmlWanita++;
        jmlUsiaWanita += arrayOfDosen[i].usia;
      }
    }

    rata2Pria = (double) jmlUsiaPria / jmlPria;
    rata2Wanita = (double) jmlUsiaWanita / jmlWanita;
    System.out.println("Rata-rata usia pria     : " + rata2Pria + " tahun");
    System.out.println("Rata-rata usia wanita   : " + rata2Wanita + " tahun"); 
  }
  // method menampilkan data dosen paling tua
  void infoDosenPalingTua(Dosen15[] arrayOfDosen) {
    System.out.println("\n----- Data Dosen Paling Tua -----");
    int dosenPalingTua = arrayOfDosen[0].usia;
    int indeksTua = 0;
    for (int i = 1; i < arrayOfDosen.length; i++) {
      if (arrayOfDosen[i].usia > dosenPalingTua) {
        dosenPalingTua = arrayOfDosen[i].usia;
        indeksTua = i;
      }
    }
    System.out.println("Kode          : " + arrayOfDosen[indeksTua].kode);
    System.out.println("Nama          : " + arrayOfDosen[indeksTua].nama);
    System.out.println("Jenis Kelamin : " + arrayOfDosen[indeksTua].jenisKelamin);
    System.out.println("Usia          : " + arrayOfDosen[indeksTua].usia);
  }
  // method menampilkan data dosen paling muda
  void infoDosenPalingMuda(Dosen15[] arrayOfDosen) {
    System.out.println("\n----- Data Dosen Paling Muda -----");
    int dosenPalingMuda = arrayOfDosen[0].usia;
    int indeksMuda = 0;
    for (int i = 1; i < arrayOfDosen.length; i++) {
      if (arrayOfDosen[i].usia < dosenPalingMuda) {
        dosenPalingMuda = arrayOfDosen[i].usia;
        indeksMuda = i;
      }
    }
    System.out.println("Kode          : " + arrayOfDosen[indeksMuda].kode);
    System.out.println("Nama          : " + arrayOfDosen[indeksMuda].nama);
    System.out.println("Jenis Kelamin : " + arrayOfDosen[indeksMuda].jenisKelamin);
    System.out.println("Usia          : " + arrayOfDosen[indeksMuda].usia);
  }
}