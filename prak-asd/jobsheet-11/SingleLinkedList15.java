public class SingleLinkedList15 {
  Node15 head;
  Node15 tail;

  boolean isEmpty() {
    return (head == null);
  }

  void print() {
    if (!isEmpty()) {
      Node15 tmp = head;
      System.out.println("Isi Linked List:");
      while (tmp != null) {
        tmp.data.tampilInformasi();
        tmp = tmp.next;
      }
      System.out.println();
    } else {
      System.out.println("Linked List kosong");
    }
  }

  void addFirst(Mahasiswa15 input) {
    Node15 ndInput = new Node15(input, null);
    if (isEmpty()) {
      head = ndInput;
      tail = ndInput;
    } else {
      ndInput.next = head;
      head = ndInput;
    }
  }

  void addLast(Mahasiswa15 input) {
    Node15 ndInput = new Node15(input, null);
    if (isEmpty()) {
      head = ndInput;
      tail = ndInput;
    } else {
      tail.next = ndInput;
      tail = ndInput;
    }
  }

  void insertAfter(String key, Mahasiswa15 input) {
    Node15 ndInput = new Node15(input, null);
    Node15 temp = head;
    do {
      if (temp.data.nama.equalsIgnoreCase(key)) {
        ndInput.next = temp.next;
        temp.next = ndInput;
        if (ndInput.next == null) {
          tail = ndInput;
        }
        break;
      }
      temp = temp.next;
    } while (temp != null);
  }

  void insertAt(int index, Mahasiswa15 input) {
    if (index < 0) {
      System.out.println("indeks salah");
    } else if (index == 0) {
      addFirst(input);
    } else {
      Node15 temp = head;
      for (int i = 0; i < index - 1; i++) {
        temp = temp.next;
      }
      temp.next = new Node15(input, temp.next);
      if (temp.next.next == null) {
        tail = temp.next;
      }
    }
  }
}