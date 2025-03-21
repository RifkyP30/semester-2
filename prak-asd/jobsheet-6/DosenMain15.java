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
      System.out.println("5. Keluar");
      System.out.print("Pilih menu: ");
      byte pilihMenu = input15.nextByte();

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

}