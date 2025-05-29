public class Kemahasiswaan15 {
  String nim;
  String nama;
  String prodi;

  Kemahasiswaan15(String nim, String nama, String prodi) {
    this.nim = nim;
    this.nama = nama;
    this.prodi = prodi;
  }

  void tampilInformasi() {
    System.out.println(nama + "\t\t" + nim + "\t" + prodi);
  }
}