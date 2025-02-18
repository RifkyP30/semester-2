public class DosenMain15 {
  public static void main(String[] args) {
    // membuat object dengan konstruktor default
    Dosen15 dosen1 = new Dosen15();
    // mengisi atribut
    dosen1.nama = "Leo";
    dosen1.idDosen = "143";
    dosen1.statusAktif = true;
    dosen1.tahunBergabung = 2000;
    dosen1.bidangKeahlian = "Pemrograman Dasar";
    // mengakses method
    dosen1.tampilInformasi();
    dosen1.setStatusAktif(true);
    System.out.println("Lama bekerja: " + dosen1.hitungMasaKerja(2025) + " tahun");
    dosen1.ubahKeahlian("Matematika");

    // membuat object dengan konstruktor berparameter
    Dosen15 dosenRifky = new Dosen15("M. Rifky P", "128", true, 2005, "Aljabar Linier");
    // mengakses method
    dosenRifky.tampilInformasi();
    dosenRifky.setStatusAktif(false);
    System.out.println("Lama bekerja: " + dosenRifky.hitungMasaKerja(2025) + " tahun");
    dosenRifky.ubahKeahlian("Kalkulus");
  }
}