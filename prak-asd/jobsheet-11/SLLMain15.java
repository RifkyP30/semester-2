import java.util.Scanner;

public class SLLMain15 {
  public static void main(String[] args) {
    Scanner scan15 = new Scanner(System.in);
    SingleLinkedList15 sll = new SingleLinkedList15();
    int pilih;

    do {
      System.out.println("\n1. Tambah Data");
      System.out.println("2. Tampilkan Data");
      System.out.println("0. Keluar");
      System.out.print("Pilih menu: ");
      pilih = scan15.nextInt();
      scan15.nextLine();

      switch (pilih) {
        case 1:
          System.out.println("Masukkan data mahasiswa!");
          System.out.print("Nama  : ");
          String nama = scan15.nextLine();
          System.out.print("NIM   : ");
          String nim = scan15.nextLine();
          System.out.print("Kelas : ");
          String kelas = scan15.nextLine();
          System.out.print("IPK   : ");
          double ipk = scan15.nextDouble();
          Mahasiswa15 mhs = new Mahasiswa15(nim, nama, kelas, ipk);
          sll.addLast(mhs);
          break;
        case 2:
          sll.print();
          break;
        case 0:
          System.out.println("=== SELESAI ===");
          break;
        default:
          System.out.println("Menu tidak valid!");
      }
    } while (pilih != 0);

    scan15.close();
    
  }
}