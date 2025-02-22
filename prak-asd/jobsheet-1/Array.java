import java.util.Scanner;

public class Array {
  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);

    System.out.println("====================");
    System.out.println("Program Menghitung IP Semester");
    System.out.println("====================");
    System.out.print("Masukkan jumlah mata kuliah: ");  // mengisi jumlah matkul
    byte jmlMK = userInput.nextByte();
    userInput.nextLine();
    System.out.println("====================");
    // membuat array dan variabel
    double IP;
    String[] matkul = new String[jmlMK];
    String[] nilaiHuruf = new String[jmlMK];
    double[] nilaiAngka = new double[jmlMK];
    double[] bobotNilai = new double[jmlMK];
    byte[] sks = new byte[jmlMK];

    double perhitunganAtas = 0;  // menghitung nilai setara * bobot sks
    double perhitunganBawah = 0; // menghitung total sks
    for (int i = 0; i < jmlMK; i++) {
      // mengisi nama MK, jml sks, dan nilai angka
      System.out.print("Masukkan nama mata kuliah ke-" + (i + 1) + "\t: ");
      matkul[i] = userInput.nextLine();
      System.out.print("Masukkan bobot SKS\t\t: ");
      sks[i] = userInput.nextByte();
      System.out.print("Masukkan nilai angka\t\t: ");
      nilaiAngka[i] = userInput.nextDouble();
      userInput.nextLine();
      System.out.println();
      // menghitung nilai huruf dan bobot nilai
      if (nilaiAngka[i] > 80 && nilaiAngka[i] <= 100) {
        nilaiHuruf[i] = "A";
        bobotNilai[i] = 4;
      } else if (nilaiAngka[i] > 73 && nilaiAngka[i] <= 80) {
        nilaiHuruf[i] = "B+";
        bobotNilai[i] = 3.5;
      } else if (nilaiAngka[i] > 65 && nilaiAngka[i] <= 73) {
        nilaiHuruf[i] = "B";
        bobotNilai[i] = 3;
      } else if (nilaiAngka[i] > 60 && nilaiAngka[i] <= 65) {
        nilaiHuruf[i] = "C+";
        bobotNilai[i] = 2.5;
      } else if (nilaiAngka[i] > 50 && nilaiAngka[i] <= 60) {
        nilaiHuruf[i] = "C";
        bobotNilai[i] = 2;
      } else if (nilaiAngka[i] > 39 && nilaiAngka[i] <= 50) {
        nilaiHuruf[i] = "D";
        bobotNilai[i] = 1;
      } else {
        nilaiHuruf[i] = "E";
        bobotNilai[i] = 0;
      }
      //menghitung perhitungan atas & bawah
      perhitunganAtas += bobotNilai[i] * sks[i];
      perhitunganBawah += sks[i];
    }

    userInput.close();
    // menghitung IP
    IP = perhitunganAtas / perhitunganBawah;
    // menampilkan tabel
    System.out.println("====================");
    System.out.println("hasil konversi nilai");
    System.out.println("====================");
    System.out.printf("%-35s %-15s %-15s %-15s %-10s%n", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai", "SKS");

    for (int i = 0; i < jmlMK; i++) {
      System.out.printf("%-35s %-15s %-15s %-15s %-10s%n", matkul[i], nilaiAngka[i], nilaiHuruf[i], bobotNilai[i], sks[i]);
    }

    // menampilkan IP semester
    System.out.println("====================");
    System.out.printf("IP : %.2f", IP);
    
  }
}