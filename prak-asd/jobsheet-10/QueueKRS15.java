public class QueueKRS15 {
  Mahasiswa15[] data;
  int front;
  int rear;
  int size; // ukuran array
  int total; // jumlah elemen
  int jmlDiproses; // jumlah KRS mahasiswa yang sudah diproses

  QueueKRS15(int size) {
    this.size = size;
    this.data = new Mahasiswa15[size];
    this.front = 0;
    this.rear = -1;
    this.total = 0;
    this.jmlDiproses = 0;
  }
  // cek antrian kosong
  boolean isEmpty() {
    if (total == 0) {
      return true;
    } else {
      return false;
    }
  }
  // cek antrian penuh
  boolean isFull() {
    if (total == size) {
      return true;
    } else {
      return false;
    }
  }
  // enqueue
  void tambahAntrian(Mahasiswa15 mhs) {
    if (isFull()) {
      System.out.println("Antrian penuh!");
      return;
    }
    rear = (rear + 1) % size;
    data[rear] = mhs;
    total++;
    System.out.println(mhs.nama + " berhasil ditambah ke Antrian.");
  }
  // dequeue (memanggil antrian 2 mahasiswa)
  Mahasiswa15[] prosesKRS() {
    Mahasiswa15[] mhs = new Mahasiswa15[2];
    if (isEmpty()) {
      System.out.println("Antrian kosong!");
      return null;
    }
    mhs[0] = data[front];
    mhs[1] = data[front + 1];
    front = (front + 2) % size;
    total -= 2;
    jmlDiproses += 2;
    return mhs;
  }
  // print
  void tampilkanSemuaAntrian() {
    if (isEmpty()) {
      System.out.println("Antrian kosong!");
      return;
    }
    System.out.println("Daftar Antrian:");
    System.out.println("NIM - NAMA - PRODI - KELAS");
    for (int i = 0; i < total; i++) {
      int index = (front + i) % size;
      System.out.print((i + 1) + ". ");
      data[index].tampilkanData();
    }
  }
  // clear
  void kosongkanAntrian() {
    if (!isEmpty()) {
      front = 0;
      rear = -1;
      total = 0;
      jmlDiproses = 0;
      System.out.println("Antrian berhasil dikosongkan.");
    } else {
      System.out.println("Antrian masih kosong!");
    }
  }
  // menampilkan dua antrian terdepan
  void tampilkanDuaTerdepan() {
    if (isEmpty()) {
      System.out.println("Antrian kosong!");
    } else {
      System.out.println("2 Antrian Terdepan:");
      System.out.println("NIM - NAMA - PRODI - KELAS");
      System.out.print("1. ");
      data[front].tampilkanData();
      System.out.print("2. ");
      data[front + 1].tampilkanData();
    }
  }
  // menampilkan antrian paling akhir
  void tampilkanAkhirAntrian() {
    if (isEmpty()) {
      System.out.println("Antrian kosong!");
    } else {
      System.out.println("Antrian paling akhir:");
      System.out.println("NIM - NAMA - PRODI - KELAS");
      data[rear].tampilkanData();
    }
  }
  // jumlah antrian
  int jumlahAntrian() {
    return total;
  }
  // jumlah KRS yang diproses
  int jumlahDiproses() {
    return jmlDiproses;
  }
}