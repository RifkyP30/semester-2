import java.util.Scanner;

public class DataDosen15 {

  Dosen15[] dataDosen = new Dosen15[5];
  int idx;

  void tambah(Dosen15[] dsn) {
    Scanner input15 = new Scanner(System.in);

    dsn[idx] = new Dosen15();
    System.out.println("Masukkan data dosen!");
    System.out.print("Nama          : ");
    dsn[idx].nama = input15.nextLine();
    System.out.print("Kode          : ");
    dsn[idx].kode = input15.nextLine();
    System.out.print("Jenis Kelamin : ");
    dsn[idx].jenisKelamin = input15.nextLine();
    System.out.print("Usia          : ");
    dsn[idx].usia = input15.nextInt();
    input15.nextLine();

    dataDosen[idx] = dsn[idx];
    idx++;
  }

  void tampilInfo(Dosen15[] dsn) {
    System.out.printf("%-10s %-20s %-20s %-10s\n", "Kode", "Nama", "Jenis Kelamin", "Usia");
    for (int i = 0; i < dsn.length; i++) {
      if (dsn[i] == null) {
        break;
      } else {
        dsn[i].tampil();
      }
    }
  }

  void sortingASC() {
    int ite = 0;
    for (int i = 0; i < dataDosen.length; i++) {
      if (dataDosen[i] == null) {
        break;
      } else {
        ite++;
      }
    }

    for (int i = 0; i < ite - 1; i++) {
      for (int j = 1; j < ite - i; j++) {
        if (dataDosen[j].usia < dataDosen[j - 1].usia) {
          Dosen15 tmp = dataDosen[j];
          dataDosen[j] = dataDosen[j - 1];
          dataDosen[j - 1] = tmp;
        }
      }
    }

    System.out.printf("%-10s %-20s %-20s %-10s\n", "Kode", "Nama", "Jenis Kelamin", "Usia");
    for (int i = 0; i < ite; i++) {
      System.out.printf("%-10s %-20s %-20s %-10s\n", dataDosen[i].kode, dataDosen[i].nama, dataDosen[i].jenisKelamin, dataDosen[i].usia);
    }

  }

  void sortingDSC() {
    int ite = 0;
    for (int i = 0; i < dataDosen.length; i++) {
      if (dataDosen[i] == null) {
        break;
      } else {
        ite++;
      }
    }

    for (int i = 1; i < ite; i++) {
      Dosen15 tmp = dataDosen[i];
      int j = i;
      while (j > 0 && dataDosen[j - 1].usia < tmp.usia) {
        dataDosen[j] = dataDosen[j - 1];
        j--;
      }
      dataDosen[j] = tmp;
    }

    System.out.printf("%-10s %-20s %-20s %-10s\n", "Kode", "Nama", "Jenis Kelamin", "Usia");
    for (int i = 0; i < ite; i++) {
      System.out.printf("%-10s %-20s %-20s %-10s\n", dataDosen[i].kode, dataDosen[i].nama, dataDosen[i].jenisKelamin, dataDosen[i].usia);
    }
  }

  int jmlTerisi() {
    int ite = 0;
    for (int i = 0; i < dataDosen.length; i++) {
      if (dataDosen[i] == null) {
        break;
      } else {
        ite++;
      }
    }
    return ite;
  }

  void bubbleSort(int n) {
    for (int i = 0; i < n; i++) {
      for (int j = 1; j < n - i; j++) {
        if (dataDosen[j - 1].usia > dataDosen[j].usia) {
          Dosen15 tmp = dataDosen[j];
          dataDosen[j] = dataDosen[j - 1];
          dataDosen[j - 1] = tmp;
        }
      }
    }
  }
  
  void seqSearch(String cari, int n) {
    boolean ditemukan = false;

    for (int i = 0; i < n; i++) {
      if (dataDosen[i].nama.equalsIgnoreCase(cari)) {
        System.out.println("Data ditemukan!");
        System.out.println("Nama          : " + dataDosen[i].nama);
        System.out.println("Kode          : " + dataDosen[i].kode);
        System.out.println("Jenis Kelamin : " + dataDosen[i].jenisKelamin);
        System.out.println("Usia          : " + dataDosen[i].usia);
        ditemukan = true;
        break;
      }
    }
    if (!ditemukan) {
      System.out.println("Data tidak ditemukan!");
    }
  }

  int binSearch(int cari, int kiri, int kanan) {
    int mid;
    if (kanan >= kiri) {
      mid = (kiri + kanan) / 2;
      if (cari == dataDosen[mid].usia) {
        return mid;
      } else if (dataDosen[mid].usia > cari) {
        return binSearch(cari, kiri, mid - 1);
      } else {
        return binSearch(cari, mid + 1, kanan);
      }
    }
    return -1;
  }

  void tampilBinSearch(int hasil) {
    if (hasil != -1) {
      System.out.println("Data ditemukan");
      System.out.println("Nama          : " + dataDosen[hasil].nama);
      System.out.println("Kode          : " + dataDosen[hasil].kode);
      System.out.println("Jenis Kelamin : " + dataDosen[hasil].jenisKelamin);
      System.out.println("Usia          : " + dataDosen[hasil].usia);
    } else {
      System.out.println("Data tidak ditemukan");
    }
  }

}