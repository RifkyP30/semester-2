public class Dosen15 {
  String nama;
  String idDosen;
  boolean statusAktif;
  int tahunBergabung;
  String bidangKeahlian;
  // konstruktor default
  public Dosen15() {

  }
  // konstruktor berparameter
  public Dosen15(String nm, String id, boolean status, int thnGabung, String ahli) {
    nama = nm;
    idDosen = id;
    statusAktif = status;
    tahunBergabung = thnGabung;
    bidangKeahlian = ahli;
  }
  // method-method
  void tampilInformasi() {
    System.out.println("\n=== Informasi Dosen ===");
    System.out.println("Nama lengkap: " + nama);
    System.out.println("ID: " + idDosen);
    System.out.println("Tahun bergabung: " + tahunBergabung);
    System.out.println("Bidang keahlian: " + bidangKeahlian);
  }

  void setStatusAktif(boolean status) {
    System.out.println("\n=== Status Dosen ===");
    if (status) {
      System.out.println("Status: Aktif");
    } else {
      System.out.println("Status: Tidak aktif");
    }
  }

  int hitungMasaKerja(int thnSkrg) {
    return thnSkrg - tahunBergabung;
  }

  void ubahKeahlian(String bidang) {
    System.out.println("\n=== Perubahan Keahlian ===");
    System.out.println("Keahlian awal: " + bidangKeahlian);
    bidangKeahlian = bidang;
    System.out.println("Keahlian baru: " + bidangKeahlian);
  }
}