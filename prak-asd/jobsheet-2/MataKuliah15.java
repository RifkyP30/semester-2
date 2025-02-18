public class MataKuliah15 {
  String kodeMK;
  String nama;
  int sks;
  int jumlahJam;
  // konstruktor default
  public MataKuliah15() {

  }
  // konstruktor berparameter
  public MataKuliah15(String nm, String kode, int sks, int jmlJam) {
    nama = nm;
    kodeMK = kode;
    this.sks = sks;
    jumlahJam = jmlJam;
  }
  // method-method
  void tampilInformasi() {
    System.out.println("\n=== Informasi Mata Kuliah ===");
    System.out.println("Nama mata kuliah: " + nama);
    System.out.println("Kode mata kuliah: " + kodeMK);
    System.out.println("Jumlah SKS: " + sks);
    System.out.println("Jumlah jam: " + jumlahJam + " jam");
  }

  void ubahSKS(int sksBaru) {
    System.out.println("\n=== Perubahan SKS ===");
    System.out.println("SKS awal: " + sks);
    System.out.println("Perubahan SKS: " + sksBaru);
    sks = sksBaru;
    System.out.println("SKS baru: " + sks);
  }

  void tambahJam(int jam) {
    System.out.println("\n=== Penambahan Jam ===");
    System.out.println("Jam awal: " + jumlahJam);
    System.out.println("Penambahan jam: " + jam);
    jumlahJam += jam;
    System.out.println("Jam baru: " + jumlahJam);
  }

  void kurangiJam(int jam) {
    System.out.println("\n=== Pengurangan Jam ===");
    if (jumlahJam > jam) {
      System.out.println("Jumlah jam awal: " + jumlahJam);
      System.out.println("Jumlah pengurangan jam: " + jam);
      jumlahJam -= jam;
      System.out.println("Jumlah jam baru: " + jumlahJam);
    } else {
      System.out.println("Pengurangan jam tidak dapat dilakukan!");
    }
  }
}