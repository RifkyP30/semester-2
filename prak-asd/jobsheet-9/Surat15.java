public class Surat15 {
  String idSurat;
  String namaMahasiswa;
  String kelas;
  char jenisIzin;
  int durasi;

  Surat15() {

  }

  Surat15(String idSurat, String namaMahasiswa, String kelas) {
    this.idSurat = idSurat;
    this.namaMahasiswa = namaMahasiswa;
    this.kelas = kelas;
  }

  void isiSurat(char jenisIzin, int durasi) {
    this.jenisIzin = jenisIzin;
    this.durasi = durasi;
  }
}