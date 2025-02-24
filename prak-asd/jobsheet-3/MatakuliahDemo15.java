import java.util.Scanner;

public class MatakuliahDemo15 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan jumlah mata kuliah: ");
    int jmlMk = sc.nextInt();
    Matakuliah15[] arrayOfMatakuliah = new Matakuliah15[jmlMk];

    for (int i = 0; i < arrayOfMatakuliah.length; i++) {
      arrayOfMatakuliah[i] = new Matakuliah15();
      System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
      arrayOfMatakuliah[i].tambahData();
    }

    for (int i = 0; i < arrayOfMatakuliah.length; i++) {
      System.out.println("Data Matakuliah ke-" + (i + 1));
      arrayOfMatakuliah[i].cetakInfo();
    }
  }
}