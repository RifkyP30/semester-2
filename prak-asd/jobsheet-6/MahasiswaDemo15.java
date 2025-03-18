public class MahasiswaDemo15 {

  public static void main(String[] args) {
    MahasiswaBerprestasi15 list = new MahasiswaBerprestasi15();
    Mahasiswa15 m1 = new Mahasiswa15("123", "Zidan", "2A", 3.2);
    Mahasiswa15 m2 = new Mahasiswa15("124", "Ayu", "2A", 3.5);
    Mahasiswa15 m3 = new Mahasiswa15("125", "Sofi", "2A", 3.1);
    Mahasiswa15 m4 = new Mahasiswa15("126", "Sita", "2A", 3.9);
    Mahasiswa15 m5 = new Mahasiswa15("127", "Miki", "2A", 3.7);

    list.tambah(m1);
    list.tambah(m2);
    list.tambah(m3);
    list.tambah(m4);
    list.tambah(m5);

    System.out.println("Data mahasiswa sebelum sorting: ");
    list.tampil();

    System.out.println("Data mahasiswa setelah sorting berdasarkan IPK (DESC): ");
    list.bubbleSort();
    list.tampil();
  }
  
}