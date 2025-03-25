import java.util.Scanner;

public class MahasiswaDemo15 {

  public static void main(String[] args) {
    MahasiswaBerprestasi15 list = new MahasiswaBerprestasi15();
    Scanner sc = new Scanner(System.in);
    int jmlMhs = 5;

    for (int i = 0; i < jmlMhs; i++) {
      System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
      System.out.print("NIM   : ");
      String nim = sc.nextLine();
      System.out.print("Nama  : ");
      String nama = sc.nextLine();
      System.out.print("Kelas : ");
      String kelas = sc.nextLine();
      System.out.print("IPK   : ");
      double ipk = sc.nextDouble();
      sc.nextLine();
      System.out.println("----------------------------------");
      list.tambah(new Mahasiswa15(nim, nama, kelas, ipk));
    }

    list.tampil();
    // melakukan pencarian data sequential
    System.out.println("---------------------------------------------------");
    System.out.println("Pencarian Data");
    System.out.println("---------------------------------------------------");
    System.out.println("Masukkan ipk mahasiswa yang dicari: ");
    System.out.print("IPK: ");
    double cari = sc.nextDouble();

    System.out.println("----------------------------------");
    System.out.println("menggunakan sequential searching");
    double posisi = list.sequentialSearching(cari);
    int pss = (int) posisi;
    list.tampilPosisi(cari, pss);
    list.tampilDataSearch(cari, pss);

    System.out.println("----------------------------------");
    System.out.println("menggunakan binary search");
    double posisi2 = list.findBinarySearch(cari, 0, jmlMhs - 1);
    int pss2 = (int) posisi2;
    list.tampilPosisi(cari, pss2);
    list.tampilDataSearch(cari, pss2);

  }
  
}