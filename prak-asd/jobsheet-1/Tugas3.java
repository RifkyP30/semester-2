import java.util.Scanner;
public class Tugas3 {
  static Scanner userInput = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.println("==== Program Jadwal Kuliah ====\n");
    // mengisi jumlah matkul
    System.out.print("Masukkan jumlah mata kuliah: ");
    byte jmlMk = userInput.nextByte();
    userInput.nextLine();
    // membuat array
    String[] matkul = new String[jmlMk];
    String[] hari = new String[jmlMk];
    int[] sks = new int[jmlMk];
    int[] semester = new int[jmlMk]; 

    isiDataMatkul(matkul, hari, sks, semester);

    while (true) {
      System.out.println("\n=== Menu ===");
      System.out.println("1. Tampilkan jadwal");
      System.out.println("2. Cari mata kuliah");
      System.out.print("Pilih menu (1-2): ");
      byte pilihMenu = userInput.nextByte();
      userInput.nextLine();

      switch (pilihMenu) {
        case 1:
          System.out.println("=== Pilihan jadwal ===");
          System.out.println("1. Tampilkan seluruh jadwal");
          System.out.println("2. Tampilkan jadwal berdasarkan hari");
          System.out.println("3. Tampilkan jadwal berdasarkan semester");
          System.out.print("Pilih menu (1-3): ");
          byte pilihMenuJadwal = userInput.nextByte();
          userInput.nextLine();
          switch (pilihMenuJadwal) {
            case 1:
              tampilkanSeluruhJadwal(matkul, hari, sks, semester);
              break;
            case 2:
              tampilkanBerdasarkanHari(matkul, hari, sks, semester);
              break;
            case 3:
              tampilkanBerdasarkanSemester(matkul, hari, sks, semester);
              break;
            default:
              System.out.print("menu tidak valid!");
          }
          break;
        case 2:
          cariMatkul(matkul, hari, sks, semester);
          break;
        default:
          System.out.println("menu tidak valid!");
          continue;
      }
      System.out.print("Ingin cari data lagi? (y/n): ");
      char cariLagi = userInput.nextLine().charAt(0);

      if (cariLagi == 'n') {
        break;
      }
    }

  }
  // fungsi untuk mengisi data mata kuliah
  static void isiDataMatkul(String[] matkul, String[] hari, int[] sks, int[] smst) {
    System.out.println("\nIsi data mata kuliah!");
    for (int i = 0; i < matkul.length; i++) {
      System.out.print("Masukkan nama mata kuliah ke-" + (i + 1) + ": ");
      matkul[i] = userInput.nextLine();
      System.out.print("Masukkan jumlah SKS: ");
      sks[i] = userInput.nextInt();
      System.out.print("Masukkan semester: ");
      smst[i] = userInput.nextInt();
      userInput.nextLine();
      System.out.print("Masukkan hari: ");
      hari[i] = userInput.nextLine();
      System.out.println();
    }
  }
  // fungsi menampilkan seluruh jadwal kuliah
  static void tampilkanSeluruhJadwal(String[] matkul, String[] hari, int[] sks, int[] smst) {
    System.out.printf("%-25s %-10s %-10s %-10s\n", "Mata Kuliah", "SKS", "Semester", "Hari");
    for (int i = 0; i < matkul.length; i++) {
      System.out.printf("%-25s %-10s %-10s %-10s\n", matkul[i], sks[i], smst[i], hari[i]);
    }
  }
  // fungsi menampilkan jadwal berdasarkan hari
  static void tampilkanBerdasarkanHari(String[] matkul, String[] hari, int[] sks, int[] smst) {
    System.out.print("Masukkan hari: ");
    String pilihHari = userInput.nextLine();
    boolean adaData = false;
    System.out.printf("%-25s %-10s %-10s\n", "Mata Kuliah", "SKS", "Semester");
    for (int i = 0; i < matkul.length; i++) {
      if (hari[i].equalsIgnoreCase(pilihHari)) {
        System.out.printf("%-25s %-10s %-10s\n", matkul[i], sks[i], smst[i]);
        adaData = true;
      }
    }
    if (!adaData) {
      System.out.println("tidak ada jadwal di hari tersebut");
    }
  }
  // fungsi menampilkan jadwal berdasarkan semester
  static void tampilkanBerdasarkanSemester(String[] matkul, String[] hari, int[] sks, int[] smst) {
    System.out.print("Masukkan semester: ");
    byte pilihSmst = userInput.nextByte();
    userInput.nextLine();
    boolean adaData = false;
    System.out.printf("%-25s %-10s %-10s\n", "Mata Kuliah", "SKS", "Hari");
    for (int i = 0; i < matkul.length; i++) {
      if (smst[i] == pilihSmst) {
        System.out.printf("%-25s %-10s %-10s\n", matkul[i], sks[i], hari[i]);
        adaData = true;
      }
    }
    if (!adaData) {
      System.out.println("tidak ada jadwal di semester tersebut");
    }
  }
  // fungsi mencari mata kuliah
  static void cariMatkul(String[] matkul, String[] hari, int[] sks, int[] smst) {
    System.out.print("Masukkan mata kuliah: ");
    String pilihMk = userInput.nextLine();
    boolean adaData = false;
    System.out.printf("%-10s %-10s %-10s\n", "SKS", "Semester", "Hari");
    for (int i = 0; i < matkul.length; i++) {
      if (matkul[i].equalsIgnoreCase(pilihMk)) {
        System.out.printf("%-10s %-10s %-10s\n", sks[i], smst[i], hari[i]);
        adaData = true;
      }
    }
    if (!adaData) {
      System.out.println("tidak ada data dari nama matkul tersebut");
    }
  }

}