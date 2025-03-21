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

}