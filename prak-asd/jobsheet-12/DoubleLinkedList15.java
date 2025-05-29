public class DoubleLinkedList15 {
  Node15 head;
  Node15 tail;

  DoubleLinkedList15() {
    head = null;
    tail = null;
  }

  boolean isEmpty() {
    return head == null;
  }

  void addFirst(Mahasiswa15 data) {
    Node15 newNode = new Node15(data);
    if (isEmpty()) {
      head = tail = newNode;
    } else {
      newNode.next = head;
      head.prev = newNode;
      head = newNode;
    }
  }

  void addLast(Mahasiswa15 data) {
    Node15 newNode = new Node15(data);
    if (isEmpty()) {
      head = tail = newNode;
    } else {
      tail.next = newNode;
      newNode.prev = tail;
      tail = newNode;
    }
  }

  void insertAfter(String keyNim, Mahasiswa15 data) {
    Node15 current = head;

    // cari node dengan nim = keyNim
    while (current != null && !current.data.nim.equals(keyNim)) {
      current = current.next;
    }

    if (current == null) {
      System.out.println("Node dengan NIM " + keyNim + " tidak ditemukan.");
      return;
    }

    Node15 newNode = new Node15(data);

    // jika current adalah tail, cukup tambahkan di akhir
    if (current == tail) {
      current.next = newNode;
      newNode.prev = current;
      tail = newNode;
    } else {
      // sisipkan di tengah
      newNode.next = current.next;
      newNode.prev = current;
      current.next.prev = newNode;
      current.next = newNode;
    }

    System.out.println("Node berhasil disisipkan setelah NIM " + keyNim);
  }

  void print() {
    Node15 current = head;
    if (!isEmpty()) {
      while (current != null) {
        current.data.tampil();
        current = current.next;
      }
    } else {
      System.out.println("List kosong!");
    }
  }

  void removeFirst() {
    if (isEmpty()) {
      System.out.println("List kosong, tidak bisa dihapus.");
      return;
    }
    System.out.println("Data sudah berhasil dihapus.");
    System.out.println("Data yang terhapus:");
    if (head == tail) {
      head.data.tampil();
      head = tail = null;
    } else {
      head.data.tampil();
      head = head.next;
      head.prev = null;
    }
  }

  void removeLast() {
    if (isEmpty()) {
      System.out.println("List kosong, tidak bisa dihapus.");
      return;
    }
    System.out.println("Data sudah berhasil dihapus.");
    System.out.println("Data yang terhapus:");
    if (head == tail) {
      tail.data.tampil();
      head = tail = null;
    } else {
      tail.data.tampil();
      tail = tail.prev;
      tail.next = null;
    }
  }

  Node15 search(String keyNim) {
    Node15 current = head;
    while (current != null) {
      if (current.data.nim.equals(keyNim)) {
        return current;
      }
      current = current.next;
    }
    return null;
  }

  // fungsi menambahkan node pada indeks tertentu
  void add(int index, Mahasiswa15 data) {
    if (isEmpty()) {
      System.out.println("List masih kosong.");
      return;
    }

    Node15 nodeBaru = new Node15(data);
    Node15 current = head;
    for (int i = 0; i < index - 1; i++) {
      current = current.next;
    }

    current.next.prev = nodeBaru;
    nodeBaru.next = current.next;
    current.next = nodeBaru;
    nodeBaru.prev = current; 
  }

  // fungsi menghapus node setelah data key
  void removeAfter(String nimKey) {
    if (!isEmpty()) {
      Node15 current = head;
      while (current != null && !current.data.nim.equals(nimKey)) {
        current = current.next;
      }

      if (current == null) {
        System.out.println("Node dengan NIM " + nimKey + " tidak ditemukan.");
        return;
      }
      current.next.next.prev = current;
      current.next = current.next.next;
      System.out.println("Node berhasil dihapus.");
    } else {
      System.out.println("List kosong!");
    }
  }

  // fungsi menghapus node pada indeks tertentu
  void remove(int idx) {
    if (!isEmpty()) {
      Node15 current = head;
      for (int i = 0; i < idx; i++) {
        current = current.next;
      }
      current.prev.next = current.next;
      current.next.prev = current.prev;
      System.out.println("Node berhasil dihapus.");
    } else {
      System.out.println("List kosong!");
    }
  }

  // fungsi menampilkan data node head, tail, dan indeks tertentu
  void getFirst() {
    if (!isEmpty()) {
      System.out.println("Node head:");
      head.data.tampil();
    } else {
      System.out.println("List kosong!");
    }
  }

  void getLast() {
    if (!isEmpty()) {
      System.out.println("Node tail:");
      tail.data.tampil();
    } else {
      System.out.println("List kosong!");
    }
  }

  void getIndex(int idx) {
    if (!isEmpty()) {
      Node15 current = head;
      for (int i = 0; i < idx; i++) {
        current = current.next;
      }
      System.out.println("Node pada indeks ke-" + idx + ": ");
      current.data.tampil();
    } else {
      System.out.println("List kosong!");
    }
  }

  // fungsi menampilkan jumlah node dalam list
  void jumlah() {
    if (!isEmpty()) {
      Node15 current = head;
      int total = 0;
      while (current != null) {
        total++;
        current = current.next;
      }
      System.out.println("Jumlah node = " + total);
    } else {
      System.out.println("List kosong!");
    }
  }
}