import java.util.Scanner;

public class Matakuliah15 {
  public String kode;
  public String nama;
  public int sks;
  public int jumlahJam;

  public Matakuliah15() {
  }

  public Matakuliah15(String kode, String nama, int sks, int jumlahJam) {
    this.kode = kode;
    this.nama = nama;
    this.sks = sks;
    this.jumlahJam = jumlahJam;
  }

  void tambahData() {
    Scanner sc = new Scanner(System.in);
    String dummy;
    System.out.print("Kode      : ");
    kode = sc.nextLine();
    System.out.print("Nama      : ");
    nama = sc.nextLine();
    System.out.print("Sks       : ");
    dummy = sc.nextLine();
    sks = Integer.parseInt(dummy);
    System.out.print("Jumlah Jam: ");
    dummy = sc.nextLine();
    jumlahJam = Integer.parseInt(dummy);
    System.out.println("------------------------------");
  }

  void cetakInfo() {
    System.out.println("Kode      : " + kode);
    System.out.println("Nama      : " + nama);
    System.out.println("Sks       : " + sks);
    System.out.println("Jumlah Jam: " + jumlahJam);
    System.out.println("------------------------------");
  }
}