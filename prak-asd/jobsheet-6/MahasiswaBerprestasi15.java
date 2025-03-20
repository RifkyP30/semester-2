public class MahasiswaBerprestasi15 {

  Mahasiswa15[] listMhs;

  MahasiswaBerprestasi15(int jml) {
    listMhs = new Mahasiswa15[jml];
  }

  void tambah(Mahasiswa15[] arr) {
    for (int i = 0; i < arr.length; i++) {
      listMhs[i] = arr[i];
    }
  }

  void tampil() {
    for (Mahasiswa15 m : listMhs) {
      m.tampilInformasi();
      System.out.println("--------------------");
    }
  }

  void bubbleSort() {
    for (int i = 0; i < listMhs.length - 1; i++) {
      for (int j = 1; j < listMhs.length - i; j++) {
        if (listMhs[j].ipk > listMhs[j - 1].ipk) {
          Mahasiswa15 tmp = listMhs[j];
          listMhs[j] = listMhs[j - 1];
          listMhs[j - 1] = tmp;
        }
      }
    }
  }

}