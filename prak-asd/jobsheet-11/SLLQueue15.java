public class SLLQueue15 {
  NodeMhs15 head;
  NodeMhs15 tail;

  boolean isEmpty() {
    return head == null;
  }

  // fungsi menambah antrian
  void add(Kemahasiswaan15 input) {
    NodeMhs15 newInput = new NodeMhs15(input, null);
    if (!isEmpty()) {
      tail.next = newInput;
      tail = newInput;
    } else {
      head = newInput;
      tail = newInput;
    }
  }

  // fungsi memanggil antrian
  Kemahasiswaan15 panggil() {
    Kemahasiswaan15 temp = head.data;
    if (!isEmpty()) {
      head = head.next;
      return temp;
    } else {
      System.out.println("Antrian kosong!");
      return null;
    }
  }

  // fungsi menampilkan daftar antrian
  void print() {
    if (!isEmpty()) {
      NodeMhs15 temp = head;
      System.out.println("Daftar antrian:");
      System.out.println("NAMA" + "\t\t" + "NIM" + "\t" + "PRODI");
      System.out.println("-------------------------------");
      while (temp != null) {
        temp.data.tampilInformasi();
        temp = temp.next;
      }
    } else {
      System.out.println("Antrian kosong!");
    }
  }

  // fungsi menampilkan antrian terdepan
  void printDepan() {
    if (!isEmpty()) {
      System.out.println("Data antrian terdepan:");
      System.out.println("NAMA" + "\t\t" + "NIM" + "\t" + "PRODI");
      System.out.println("-------------------------------");
      head.data.tampilInformasi();
    } else {
      System.out.println("Antrian kosong!");
    }
  }

  // fungsi menampilkan antrian paling belakang
  void printBelakang() {
    if (!isEmpty()) {
      System.out.println("Data antrian paling belakang:");
      System.out.println("NAMA" + "\t\t" + "NIM" + "\t" + "PRODI");
      System.out.println("-------------------------------");
      tail.data.tampilInformasi();
    } else {
      System.out.println("Antrian kosong!");
    }
  }

  // fungsi menghitung jumlah yang mengantre
  void jumlahAntrian() {
    if (!isEmpty()) {
      NodeMhs15 temp = head;
      int total = 0;
      while (temp != null) {
        total++;
        temp = temp.next;
      }
      System.out.println("Jumlah mahasiswa yang mengantre = " + total);
    } else {
      System.out.println("Antrian kosong!");
    }
  }

  // fungsi mengosongkan antrian
  void clear() {
    head = null;
    System.out.println("Antrian berhasil dikosongkan.");
  }
}