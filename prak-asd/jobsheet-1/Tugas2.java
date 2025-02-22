import java.util.Scanner;

public class Tugas2 {
  public static void main(String[] args) {
    System.out.println("\n==== Program Menghitung Volume, Luas Permukaan, dan Keliling Kubus ====\n");
    // memanggil fungsi menu
    menu();

  }
  // fungsi menampilkan menu dan menerima input dari pengguna
  static void menu() {
    Scanner userInput = new Scanner(System.in);

    while (true) {
      System.out.println("\n====================");
      System.out.println("1. Hitung volume kubus");
      System.out.println("2. Hitung luas permukaan kubus");
      System.out.println("3. Hitung keliling kubus");
      System.out.print("Pilih menu (1-3): ");
      byte pilihMenu = userInput.nextByte();
      userInput.nextLine();
      System.out.println();

      switch (pilihMenu) {
        case 1:
          System.out.print("Masukkan panjang sisi: ");
          double sisiVolume = userInput.nextDouble();
          userInput.nextLine();
          // memanggil fungsi hitung volume
          hitungVolume(sisiVolume);
          break;
        case 2: 
          System.out.print("Masukkan panjang sisi: ");
          double sisiLP = userInput.nextDouble();
          userInput.nextLine();
          // memanggil fungsi hitung luas permukaan
          hitungLuasPermukaan(sisiLP);
          break;
        case 3:
          System.out.print("Masukkan panjang sisi: ");
          double sisiKL = userInput.nextDouble();
          userInput.nextLine();
          // memanggil fungsi hitung keliling
          hitungKeliling(sisiKL);
          break;
        default:
          System.out.println("input tidak valid!");
          continue;
      }

      System.out.print("\nIngin menghitung lagi? (y/n): ");
      char hitungLagi = userInput.nextLine().charAt(0);

      if (hitungLagi == 'n') {
        System.out.println("\n==== SELESAI ====");
        break;
      }
    }
    userInput.close();

  }
  
  // fungsi untuk menghitung volume kubus
  static void hitungVolume(double rusuk) {
    double hasilVol = rusuk * rusuk * rusuk;
    System.out.println("Volume kubus = " + hasilVol);
  }
  // fungsi untuk menghitung luas permukaan kubus
  static void hitungLuasPermukaan(double rusuk) {
    double hasilLP = 6 * rusuk * rusuk;
    System.out.println("Luas permukaan kubus = " + hasilLP);
  }
  // fungsi untuk menghitung keliling kubus
  static void hitungKeliling(double rusuk) {
    double hasilKL = 12 * rusuk;
    System.out.println("Keliling kubus = " + hasilKL);
  }

}