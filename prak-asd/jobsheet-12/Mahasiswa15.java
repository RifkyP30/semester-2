public class Mahasiswa15 {
  String nim;
  String nama;
  String kelas;
  double ipk;

  Mahasiswa15(String nim, String nama, String kelas, double ipk) {
    this.nim = nim;
    this.nama = nama;
    this.kelas = kelas;
    this.ipk = ipk;
  }

  void tampil() {
    System.out.println("NIM: " + nim + ", Nama: " + nama + ", Kelas: " + kelas + ", IPK: " + ipk);
  }
}