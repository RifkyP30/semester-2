public class Nilai {

  void tampilTabel(String[] nama, String[] nim, int[] tahunMasuk, int[] nilaiUTS, int[] nilaiUAS) {
    System.out.printf("%-10s %-15s %-15s %-10s %-10s\n", "Nama", "NIM", "Tahun Masuk", "Nilai UTS", "Nilai UAS");

    for (int i = 0; i < nama.length; i++) {
      System.out.printf("%-10s %-15s %-15s %-10s %-10s\n", nama[i], nim[i], tahunMasuk[i], nilaiUTS[i], nilaiUAS[i]);
    }
  }

  int nilaiMaxDC(int[] arr, int l, int r) {
    if (l == r) {
      return arr[l];
    }

    int mid = (l + r) / 2;
    int maxKiri = nilaiMaxDC(arr, l, mid);
    int maxKanan = nilaiMaxDC(arr, mid + 1, r);

    if (maxKiri > maxKanan) {
      return maxKiri;
    } else {
      return maxKanan;
    }
  }

  int nilaiMinDC(int[] arr, int l, int r) {
    if (l == r) {
      return arr[l];
    }

    int mid = (l + r) / 2;
    int minKiri = nilaiMinDC(arr, l, mid);
    int minKanan = nilaiMinDC(arr, mid + 1, r);

    if (minKiri < minKanan) {
      return minKiri;
    } else {
      return minKanan;
    }
  }

  double rataNilaiBF(int[] arr) {
    int total = 0;
    double rataNilai;
    for (int nilai : arr) {
      total += nilai;
    }

    rataNilai = (double) total / arr.length;
    return rataNilai;
  }

}