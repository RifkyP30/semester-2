public class Fungsi {
  public static void main(String[] args) {
    System.out.println("==== RoyalGarden ====\n");
    // membuat array dan variabel
    String[] namaCabang = {"RoyalGarden 1", "RoyalGarden 2", "RoyalGarden 3", "RoyalGarden 4"};
    String[] jenisBunga = {"Aglonema", "Keladi", "Alocasia", "Mawar"};
    int[][] stokBunga = {
      {10, 5, 15, 7},
      {6, 11, 9, 12}, 
      {2, 10, 10, 5},
      {5, 7, 12, 9}
    };
    int[] hargaBunga = {75000, 50000, 60000, 10000};
    int[] jmlBungaMati = {1, 2, 0, 5};
    // memanggil fungsi pendapatan setiap cabang
    pendapatanSetiapCabang(namaCabang, stokBunga, hargaBunga);
    // memanggil fungsi stok cabang royalgarden 4
    jumlahStokCabang4(stokBunga, jenisBunga, jmlBungaMati);
   
  }
  // fungsi menampilkan pendapatan setiap cabang 
  static void pendapatanSetiapCabang(String[] cabang, int[][] stok, int[] harga) {
    System.out.println("\nData Pendapatan Bunga Setiap Cabang: ");

    for (int i = 0; i < stok.length; i++) {
      int total = 0;
      for (int j = 0; j < stok[i].length; j++) {
        total += stok[i][j] * harga[j];
      }
      System.out.println(cabang[i] + " = Rp. " + total);
    }

  }
  /*
    fungsi menampilkan jumlah stok setiap jenis bunga di cabang
    royal garden 4 jika ada pengurangan stok bunga karena mati
  */
  static void jumlahStokCabang4(int[][] stok, String[] bunga, int[] bungaMati) {
    System.out.println("\nJumlah Stok Setiap Jenis Bunga Royal Garden 4");
    for (int i = 0; i < stok[3].length; i++) {
      System.out.println(bunga[i] + " = " + stok[3][i] + " buah");
    }
    System.out.println("====================");
    System.out.println("Jenis bunga yang mati:");
    for (int i = 0; i < bunga.length; i++) {
      System.out.println(bunga[i] + " = " + bungaMati[i] + " buah");
    }
    System.out.println("====================");
    System.out.println("Jumlah stok setiap jenis bunga setelah pengurangan:");
    for (int i = 0; i < stok[3].length; i++) {
      System.out.println(bunga[i] + " = " + (stok[3][i] - bungaMati[i]) + " buah");
    }
  }

}