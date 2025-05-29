import java.util.Scanner;

public class DLLMain15 {
  public static void main(String[] args) {
    DoubleLinkedList15 list = new DoubleLinkedList15();
    Scanner scan = new Scanner(System.in);
    int pilihan;

    do {
      System.out.println("\nMenu Double Linked List Mahasiswa");
      System.out.println("1. Tambah di awal");
      System.out.println("2. Tambah di akhir");
      System.out.println("3. Hapus di awal");
      System.out.println("4. Hapus di akhir");
      System.out.println("5. Tampilkan data");
      System.out.println("6. Cari mahasiswa berdasarkan NIM");
      System.out.println("7. Tambah node pada indeks tertentu");
      System.out.println("8. Hapus node setelah data key");
      System.out.println("9. Hapus node pada indeks tertentu");
      System.out.println("10. Tampilkan node head");
      System.out.println("11. Tampilkan node tail");
      System.out.println("12. Tampilkan node pada indeks tertentu");
      System.out.println("13. Tampilkan jumlah node dalam list");
      System.out.println("0. Keluar");
      System.out.print("Pilih menu: ");
      pilihan = scan.nextInt();
      scan.nextLine();

      switch (pilihan) {
        case 1 -> {
          Mahasiswa15 mhs = inputMahasiswa(scan);
          list.addFirst(mhs);
        }
        case 2 -> {
          Mahasiswa15 mhs = inputMahasiswa(scan);
          list.addLast(mhs);
        }
        case 3 -> list.removeFirst();
        case 4 -> list.removeLast();
        case 5 -> list.print();
        case 6 -> {
          System.out.print("Masukkan NIM yang dicari: ");
          String nim = scan.nextLine();
          Node15 found = list.search(nim);
          if (found != null) {
            System.out.println("Data ditemukan:");
            found.data.tampil();
          } else {
            System.out.println("Data tidak ditemukan.");
          }
        }
        case 7 -> {
          Mahasiswa15 mhsBaru = inputMahasiswa(scan);
          System.out.print("Masukkan indeks: ");
          int idx = scan.nextInt();
          scan.nextLine();
          list.add(idx, mhsBaru);
        }
        case 8 -> {
          System.out.print("Masukkan NIM: ");
          String nimKey = scan.nextLine();
          list.removeAfter(nimKey);
        }
        case 9 -> {
          System.out.print("Masukkan indeks: ");
          int ind = scan.nextInt();
          scan.nextLine();
          list.remove(ind);
        }
        case 10 -> list.getFirst();
        case 11 -> list.getLast();
        case 12 -> {
          System.out.print("Masukkan indeks: ");
          int idxDicari = scan.nextInt();
          scan.nextLine();
          list.getIndex(idxDicari);
        }
        case 13 -> list.jumlah();
        case 0 -> System.out.println("Keluar dari program.");
        default -> System.out.println("Pilihan tidak valid!");
      }
    } while (pilihan != 0);

    scan.close();
  }
  
  static Mahasiswa15 inputMahasiswa(Scanner scan) {
    System.out.print("Masukkan NIM: ");
    String nim = scan.nextLine();
    System.out.print("Masukkan Nama: ");
    String nama = scan.nextLine();
    System.out.print("Masukkan Kelas: ");
    String kelas = scan.nextLine();
    System.out.print("Masukkan IPK: ");
    double ipk = scan.nextDouble();
    scan.nextLine();
    // Mahasiswa15 mhs = new Mahasiswa15(nim, nama, kelas, ipk);
    return new Mahasiswa15(nim, nama, kelas, ipk);
  }
}