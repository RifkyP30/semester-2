import java.util.Arrays;

public class SequentialSearch15 {

  public static void main(String[] args) {
    System.out.println("\n---- Program Pencarian Data Menggunakan Algoritma Sequential Search ----\n");

    int[] data = {10, 7, 17, -2, 8, 3, 11};
    int nilai = 6;

    System.out.print("Data\t\t\t= " + Arrays.toString(data));
    System.out.print("\nNilai yang dicari\t= " + nilai);
    System.out.print("\nHasil\t\t\t= ");

    int hasil = seqSearch(data, nilai);

    if (hasil != -1) {
      System.out.print("Nilai ditemukan");
    } else {
      System.out.print("Nilai tidak ditemukan");
    }
  }

  static int seqSearch(int[] arr, int targetNilai) {
    int idx = -1;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == targetNilai) {
        idx = i;
      }
    }
    return idx;
  }

}