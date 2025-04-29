public class StackSurat15 {
  Surat15[] stack;
  int top;
  int size;

  StackSurat15(int size) {
    this.size = size;
    stack = new Surat15[size];
    top = -1;
  }

  boolean isFull() {
    if (top == size - 1) {
      return true;
    } else {
      return false;
    }
  }

  boolean isEmpty() {
    if (top == -1) {
      return true;
    } else {
      return false;
    }
  }

  void push(Surat15 surat) {
    if (!isFull()) {
      top++;
      stack[top] = surat;
      System.out.println("Surat berhasil dimasukkan.");
    } else {
      System.out.println("Stack penuh! Tidak bisa menambahkan surat lagi.");
    }
  }

  Surat15 pop() {
    if (!isEmpty()) {
      Surat15 s = stack[top];
      top--;
      return s;
    } else {
      System.out.println("Stack kosong!");
      return null;
    }
  }

  Surat15 peek() {
    if (!isEmpty()) {
      return stack[top];
    } else {
      System.out.println("Stack kosong! Tidak ada surat yang dimasukkan.");
      return null;
    }
  }

  boolean cariSurat(String nama) {
    boolean ketemu = false;

    int i = 0;
    while (stack[i] != null) {
      if (stack[i].namaMahasiswa.equals(nama)) {
        ketemu = true;
      }
      i++;
    }
   
    if (ketemu) {
      return true;
    } else {
      return false;
    }
  } 
}