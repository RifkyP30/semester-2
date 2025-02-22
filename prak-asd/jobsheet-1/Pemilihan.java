import java.util.Scanner;

public class Pemilihan {
  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);
    // membuat variabel
    double nilaiTugas, nilaiKuis, nilaiUTS, nilaiUAS, nilaiAkhir;
    String nilaiHuruf, statusKelulusan;
    // mengisi nilai
    System.out.println("Program Menghitung Nilai Akhir");
    System.out.println("====================");
    System.out.print("Masukkan Nilai Tugas\t: ");
    nilaiTugas = userInput.nextDouble();
    System.out.print("Masukkan Nilai Kuis\t: ");
    nilaiKuis = userInput.nextDouble();
    System.out.print("Masukkan Nilai UTS\t: ");
    nilaiUTS = userInput.nextDouble();
    System.out.print("Masukkan Nilai UAS\t: ");
    nilaiUAS = userInput.nextDouble();
    System.out.println("====================");
    System.out.println("====================");

    userInput.close();
            // kondisi jika nilai di luar rentang
    if (!(nilaiTugas >= 0 && nilaiTugas <= 100) || !(nilaiKuis >= 0 && nilaiKuis <= 100) || !(nilaiUTS >= 0 && nilaiUTS <= 100) || !(nilaiUAS >= 0 && nilaiUAS <= 100)) {
      System.out.println("nilai tidak valid");
    } else {
      // menghitung nilai akhir
      nilaiAkhir = ((nilaiTugas * 0.2) + (nilaiKuis * 0.2) + (nilaiUTS * 0.3) + (nilaiUAS * 0.3));
      // menghitung nilai huruf dan status kelulusan 
      if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
        nilaiHuruf = "A";
        statusKelulusan = "LULUS";
      } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
        nilaiHuruf = "B+";
        statusKelulusan = "LULUS";
      } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
        nilaiHuruf = "B";
        statusKelulusan = "LULUS";
      } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
        nilaiHuruf = "C+";
        statusKelulusan = "LULUS";
      } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
        nilaiHuruf = "C";
        statusKelulusan = "LULUS";
      } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
        nilaiHuruf = "D";
        statusKelulusan = "TIDAK LULUS";
      } else {
        nilaiHuruf = "E";
        statusKelulusan = "TIDAK LULUS";
      }
      // menampilkan nilai akhir, nilai huruf, dan status kelulusan
      System.out.println("Nilai Akhir\t: " + nilaiAkhir);
      System.out.println("Nilai Huruf\t: " + nilaiHuruf);
      System.out.println("====================");
      System.out.println("====================");

      if (statusKelulusan == "LULUS") {
        System.out.println("SELAMAT ANDA " + statusKelulusan);
      } else {
        System.out.println("MAAF ANDA " + statusKelulusan);
      }

    }

  }
}