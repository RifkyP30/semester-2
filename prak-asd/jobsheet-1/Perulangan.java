import java.util.Scanner;

public class Perulangan {
  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);
    // mengisi NIM
    System.out.print("Masukkan NIM : ");
    long NIM = userInput.nextLong();
    byte n = (byte) (NIM % 100);  // mengambil 2 digit terakhir NIM
    System.out.println("====================");
    System.out.println("n : " + n);

    userInput.close();
    // menentukan nilai n, jika n < 10 maka n += 10
    if (n < 10) {
      n += 10;
    }

    int i = 1;
    while (i <= n) {
      if ((i % 2 == 0) && !(i == 6 || i == 10)) { // mencetak angka genap kecuali angka 6 & 10
        System.out.print(i + " ");
      } else if (i == 6 || i == 10) { // kondisi jika angka 6 & 10 maka akan dilewati (continue)
        i++;
        continue;
      } else {  // mencetak angka ganjil dengan tanda "*"
        System.out.print("* ");
      }
      i++;
    }

  }
}