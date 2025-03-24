import java.util.Arrays;

public class BinarySearch15 {

  public static void main(String[] args) {
    System.out.println("\n---- Program Pencarian Data Menggunakan Algoritma Binary Search ----\n");

    int[] data = {10, 7, 17, -2, 8, 3, 11};
    int nilai = 10;

    System.out.print("Data sebelum diurutkan\t= " + Arrays.toString(data));
    bubbleSort(data);
    System.out.print("\nData setelah diurutkan\t= " + Arrays.toString(data));

    System.out.print("\nNilai yang dicari\t= " + nilai);
    System.out.print("\nHasil\t\t\t= ");

    int hasil = binSearch(data, 0, data.length, nilai);

    if (hasil != -1) {
      System.out.print("Nilai ditemukan");
    } else {
      System.out.print("Nilai tidak ditemukan");
    }
  }

  static void bubbleSort(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = 1; j < arr.length - i; j++) {
        if (arr[j - 1] > arr[j]) {
          int temp = arr[j];
          arr[j] = arr[j - 1];
          arr[j - 1] = temp;
        }
      }
    }
  }

  static int binSearch(int[] arr, int kiri, int kanan, int targetNilai) {
    if (kiri > kanan) {
      return -1;
    }

    int mid = (kiri + kanan) / 2;

    if (targetNilai == arr[mid]) {
      return mid;
    }

    if (targetNilai < arr[mid]) {
      return binSearch(arr, kiri, mid - 1, targetNilai);
    }

    return binSearch(arr, mid + 1, kanan, targetNilai);
  }

}