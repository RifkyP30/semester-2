public class Mahasiswa15 {
  String nim;
  String nama;
  String kelas;
  double ipk;

  Mahasiswa15() {

  }

  Mahasiswa15(String nim, String nama, String kelas, double ipk) {
    this.nim = nim;
    this.nama = nama;
    this.kelas = kelas;
    this.ipk = ipk;
  }

  void tampilInformasi() {
    System.out.println(nama + "\t\t" + nim + "\t" + kelas + "\t" + ipk);
  }
}