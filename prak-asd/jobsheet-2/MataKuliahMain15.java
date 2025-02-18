public class MataKuliahMain15 {
  public static void main(String[] args) {
    // membuat object dengan konstruktor default
    MataKuliah15 matkul1 = new MataKuliah15();
    // mengisi atribut
    matkul1.nama = "Dasar Pemrograman";
    matkul1.kodeMK = "DP101";
    matkul1.sks = 4;
    matkul1.jumlahJam = 8;
    // mengakses method 
    matkul1.tampilInformasi();
    matkul1.ubahSKS(2);
    matkul1.tambahJam(3);
    matkul1.kurangiJam(6);
    matkul1.tampilInformasi();

    // membuat object dengan konstruktor berparameter
    MataKuliah15 matkulRifky = new MataKuliah15("Algoritma & Struktur Data", "ASD101", 3, 4);
    // mengakses method
    matkulRifky.tampilInformasi();
    matkulRifky.ubahSKS(2);
    matkulRifky.tambahJam(1);
    matkulRifky.kurangiJam(8);
    matkulRifky.tampilInformasi();
  }
}