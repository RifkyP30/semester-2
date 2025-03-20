import java.util.Scanner;

public class MahasiswaDemo15 {

  public static void main(String[] args) {
    Scanner input15 = new Scanner(System.in);
    // input jumlah mahasiswa
    System.out.print("\nMasukkan jumlah mahasiswa: ");
    int jmlMhs = input15.nextInt();
    // membuat array of object
    Mahasiswa15[] dataMhs = new Mahasiswa15[jmlMhs];
    // membuat object dari class MahasiswaBerprestasi15
    MahasiswaBerprestasi15 daftar = new MahasiswaBerprestasi15(jmlMhs);

    // mengisi data mahasiswa
    for (int i = 0; i < dataMhs.length; i++) {
      System.out.println("\nMasukkan data mahasiswa ke-" + (i + 1));
      dataMhs[i] = new Mahasiswa15();
      dataMhs[i].isiData();
    }

    input15.close();
    System.out.println("----------------------------------------");

    daftar.tambah(dataMhs); 

    System.out.println("\nData mahasiswa sebelum sorting: ");
    daftar.tampil();

    daftar.bubbleSort();

    System.out.println("\nData mahasiswa setelah sorting berdasarkan IPK (DESC): ");
    daftar.tampil();

  }
  
}