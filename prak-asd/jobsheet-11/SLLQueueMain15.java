import java.util.Scanner;

public class SLLQueueMain15 {
  public static void main(String[] args) {
    Scanner scan15 = new Scanner(System.in);
    System.out.println("=== Program Antrian Layanan Unit Mahasiswa ===");

    SLLQueue15 sllq = new SLLQueue15();
    byte pilih;

    do {
      System.out.println("\n=== MENU ===");
      System.out.println("1. Tambah antrian");
      System.out.println("2. Panggil antrian");
      System.out.println("3. Tampilkan daftar antrian");
      System.out.println("4. Tampilkan antrian terdepan");
      System.out.println("5. Tampilkan antrian paling akhir");
      System.out.println("6. Tampilkan jumlah antrian");
      System.out.println("7. Kosongkan antrian");
      System.out.println("0. Keluar");
      System.out.print("Pilih menu: ");
      pilih = scan15.nextByte();
      scan15.nextLine();

      switch (pilih) {
        case 1:
          System.out.println("Masukkan data mahasiswa!");
          System.out.print("Nama  : ");
          String nama = scan15.nextLine();
          System.out.print("NIM   : ");
          String nim = scan15.nextLine();
          System.out.print("Prodi : ");
          String prodi = scan15.nextLine();
          Kemahasiswaan15 dataMhs = new Kemahasiswaan15(nim, nama, prodi);
          sllq.add(dataMhs);
          break;
        case 2:
          Kemahasiswaan15 dataDipanggil = sllq.panggil();
          if (dataDipanggil != null) {
            System.out.println("Data mahasiswa yang dipanggil:");
            dataDipanggil.tampilInformasi();
          }
          break;
        case 3:
          sllq.print();
          break;
        case 4:
          sllq.printDepan();
          break;
        case 5:
          sllq.printBelakang();
          break;
        case 6:
          sllq.jumlahAntrian();
          break;
        case 7:
          sllq.clear();
          break;
        case 0:
          System.out.println("\n=== TERIMA KASIH ===");
          break;
        default:
          System.out.println("Menu tidak valid!");
      }
    } while (pilih != 0);

    scan15.close();
  }
}