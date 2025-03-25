import java.util.Scanner;

public class DosenMain15 {

  public static void main(String[] args) {
    System.out.println("----- SISTEM INFORMASI DATA DOSEN -----");

    Dosen15[] arrayDosen = new Dosen15[10];
    DataDosen15 list = new DataDosen15();

    menu(list, arrayDosen);

    System.out.println("\n----- SELESAI -----");
  }

  static void menu(DataDosen15 list, Dosen15[] dsn) {
    Scanner input15 = new Scanner(System.in);
    boolean next = true;

    while (next) {
      System.out.println("\nMenu:");
      System.out.println("1. Tambah data");
      System.out.println("2. Tampil data");
      System.out.println("3. Sorting ASC");
      System.out.println("4. Sorting DSC");
      System.out.println("5. Pencarian data sequential (nama)");
      System.out.println("6. Pencarian data binary (usia)");
      System.out.println("0. Keluar");
      System.out.print("Pilih menu: ");
      byte pilihMenu = input15.nextByte();
      input15.nextLine();

      switch (pilihMenu) {
        case 1:
          menuTambah(list, dsn);
          break;
        case 2:
          menuTampil(list, dsn);
          break;
        case 3:
          menuSortingASC(list);
          break;
        case 4:
          menuSortingDSC(list);
          break;
        case 5:
          menuSeqSearch(list);
          break;
        case 6:
          menuBinSearch(list);
          break;
        case 0:
          next = false;
          break;
        default:
          System.out.println("Menu tidak valid.\nMasukkan input yang valid!");
      }
    }
  }

  static void menuTambah(DataDosen15 list, Dosen15[] dsn) {
    System.out.println("\n--- Menambahkan data ---");
    list.tambah(dsn);
  }

  static void menuTampil(DataDosen15 list, Dosen15[] dsn) {
    System.out.println("\n--- Menampilkan data ---");
    list.tampilInfo(dsn);
  }

  static void menuSortingASC(DataDosen15 list) {
    System.out.println("\n--- Mengurutkan usia dosen (ASCENDING) menggunakan bubble sort ---");
    list.sortingASC();
  }

  static void menuSortingDSC(DataDosen15 list) {
    System.out.println("\n--- Mengurutkan usia dosen (DESCENDING) menggunakan insertion sort ---");
    list.sortingDSC();
  }

  static void menuSeqSearch(DataDosen15 list) {
    Scanner input15 = new Scanner(System.in);
    System.out.println("\n--- Mencari nama dosen dengan algoritma sequential search ---");
    System.out.print("Masukkan nama yang dicari: ");
    String name = input15.nextLine();
    int n = list.jmlTerisi();
    list.seqSearch(name, n);
  }

  static void menuBinSearch(DataDosen15 list) {
    Scanner input15 = new Scanner(System.in);
    System.out.println("\n--- Mencari usia dosen dengan algoritma binary search ---");
    System.out.print("Masukkan usia yang dicari: ");
    int age = input15.nextInt();
    input15.nextLine();
    int n = list.jmlTerisi();
    list.bubbleSort(n);
    int hasil = list.binSearch(age, 0, n - 1);
    list.tampilBinSearch(hasil);
  }

}