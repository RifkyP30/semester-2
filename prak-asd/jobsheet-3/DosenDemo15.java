import java.util.Scanner;

public class DosenDemo15 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan jumlah dosen: ");
    int jmlDosen = sc.nextInt();
    sc.nextLine();
    Dosen15[] arrayOfDosen = new Dosen15[jmlDosen];
    String kode, nama, jnsKelamin;
    int usia;
    // FOR (input data)
    for (int i = 0; i < arrayOfDosen.length; i++) {
      System.out.println("Masukkan Data Dosen ke-" + (i + 1));
      System.out.print("Kode          : ");
      kode = sc.nextLine();
      System.out.print("Nama          : ");
      nama = sc.nextLine();
      System.out.print("Jenis Kelamin : ");
      jnsKelamin = sc.nextLine();
      System.out.print("Usia          : ");
      usia = sc.nextInt();
      sc.nextLine();
      System.out.println("------------------------------------------");

      arrayOfDosen[i] = new Dosen15(kode, nama, jnsKelamin, usia);
    }
    // FOR EACH (menampilkan data)
    int i = 1;
    for (Dosen15 dosen : arrayOfDosen) {
      System.out.println("Data Dosen ke-" + i);
      System.out.println("Kode          : " + dosen.kode);
      System.out.println("Nama          : " + dosen.nama);
      System.out.println("Jenis Kelamin : " + dosen.jenisKelamin);
      System.out.println("Usia          : " + dosen.usia);
      System.out.println("------------------------------------------");
      i++;
    }
  }
}