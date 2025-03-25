public class Dosen15 {

  String nama;
  String kode;
  String jenisKelamin;
  int usia;

  Dosen15() {

  }

  Dosen15(String nm, String kd, String jk, int age) {
    nama = nm;
    kode = kd;
    jenisKelamin = jk;
    usia = age;
  }

  void tampil() {
    System.out.printf("%-10s %-20s %-20s %-10s\n", kode, nama, jenisKelamin, usia);
  }
  
}