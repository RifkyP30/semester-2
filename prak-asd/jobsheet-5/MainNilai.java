public class MainNilai {

  public static void main(String[] args) {
    // array
    String[] nama = {"Ahmad", "Budi", "Cindy", "Dian", "Eko", "Fajar", "Gina", "Hadi"};
    String[] nim = {"220101001", "220101002", "220101003", "220101004", "220101005", "220101006", "220101007", "220101008"};
    int[] tahunMasuk = {2022, 2022, 2021, 2021, 2023, 2020, 2023, 2020};
    int[] nilaiUTS = {78, 85, 90, 76, 92, 88, 80, 82};
    int[] nilaiUAS = {82, 88, 87, 79, 95, 85, 83, 84};

    Nilai nilai1 = new Nilai();
    System.out.println("---------------------------------------------------------------");
    nilai1.tampilTabel(nama, nim, tahunMasuk, nilaiUTS, nilaiUAS);
    System.out.println("---------------------------------------------------------------");
    System.out.println("\nNilai UTS tertinggi\t= " + nilai1.nilaiMaxDC(nilaiUTS, 0, nilaiUTS.length - 1));
    System.out.println("Nilai UTS terendah\t= " + nilai1.nilaiMinDC(nilaiUTS, 0, nilaiUTS.length - 1));
    System.out.println("Rata-rata nilai UAS\t= " + nilai1.rataNilaiBF(nilaiUAS));
  }

}