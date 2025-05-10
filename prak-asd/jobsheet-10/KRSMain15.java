import java.util.Scanner;

public class KRSMain15 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    QueueKRS15 antrian = new QueueKRS15(10);
    byte pilihan;

    do {
      System.out.println("\n=== Menu Persetujuan Kartu Rencana Studi ===");
      System.out.println("1. Tambah Mahasiswa ke Antrian");
      System.out.println("2. Proses KRS Mahasiswa");
      System.out.println("3. Tampilkan Semua Antrian");
      System.out.println("4. Tampilkan 2 Antrian Terdepan");
      System.out.println("5. Tampilkan Antrian Paling Akhir");
      System.out.println("6. Cetak Jumlah Antrian");
      System.out.println("7. Cetak Jumlah Yang Sudah Proses KRS");
      System.out.println("8. Kosongkan Antrian");
      System.out.println("0. Keluar");
      System.out.print("Pilih menu: ");
      pilihan = sc.nextByte(); sc.nextLine();

      switch (pilihan) {
        case 1:
          System.out.print("NIM   : ");
          String nim = sc.nextLine();
          System.out.print("Nama  : ");
          String nama = sc.nextLine();
          System.out.print("Prodi : ");
          String prodi = sc.nextLine();
          System.out.print("Kelas : ");
          String kelas = sc.nextLine();
          Mahasiswa15 mhs = new Mahasiswa15(nim, nama, prodi, kelas);
          antrian.tambahAntrian(mhs);
          break;
        case 2:
          Mahasiswa15[] diproses = antrian.prosesKRS();
          if (diproses != null) {
            System.out.println("KRS Mahasiswa yang diproses:");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            System.out.print("1. ");
            diproses[0].tampilkanData();
            System.out.print("2. ");
            diproses[1].tampilkanData();
          }
          break;
        case 3:
          antrian.tampilkanSemuaAntrian();
          break;
        case 4:
          antrian.tampilkanDuaTerdepan();
          break;
        case 5:
          antrian.tampilkanAkhirAntrian();
          break;
        case 6:
          System.out.println("Jumlah Antrian: " + antrian.jumlahAntrian());
          break;
        case 7:
          System.out.println("Jumlah yang sudah proses KRS: " + antrian.jumlahDiproses());
          break;
        case 8:
          antrian.kosongkanAntrian();
          break;
        case 0:
          System.out.println("Terima Kasih.");
          break;
        default: 
          System.out.println("Pilihan tidak valid");
      }
    } while (pilihan != 0);

    sc.close();
  }
}