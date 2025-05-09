import java.util.Scanner;

public class QueueMain15 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Masukkan kapasitas queue: ");
    int n = sc.nextInt();

    Queue15 Q = new Queue15(n);
    int pilih;

    do {
      menu();
      pilih = sc.nextInt();

      switch (pilih) {
        case 1:
          System.out.print("Masukkan data baru: ");
          int dataMasuk = sc.nextInt();
          Q.enqueue(dataMasuk);
          if (Q.isFull()) {
            System.out.println("Data sudah penuh!");
            pilih = 0; // untuk menghentikan program
          }
          break;
        case 2:
          int dataKeluar = Q.dequeue();
          if (dataKeluar != 0) {
            System.out.println("Data yang dikeluarkan: " + dataKeluar);
            break;
          }
          if (Q.isEmpty()) {
            System.out.println("Tidak ada data untuk dikeluarkan!");
            pilih = 0; // untuk menghentikan program
          }
          break;
        case 3:
          Q.print();
          break;
        case 4:
          Q.peek();
          break;
        case 5:
          Q.clear();
          break;
      }
    } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);
  }

  public static void menu() {
    System.out.println("Masukkan operasi yang diinginkan:");
    System.out.println("1. Enqueue");
    System.out.println("2. Dequeue");
    System.out.println("3. Print");
    System.out.println("4. Peek");
    System.out.println("5. Clear");
    System.out.println("-----------------");
  }
}