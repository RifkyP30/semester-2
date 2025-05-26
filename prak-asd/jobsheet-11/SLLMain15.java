public class SLLMain15 {
  public static void main(String[] args) {
    SingleLinkedList15 sll = new SingleLinkedList15();
    Mahasiswa15 mhs1 = new Mahasiswa15("244107001", "Rifky", "1F", 3.7);
    Mahasiswa15 mhs2 = new Mahasiswa15("244107012", "Julian", "1F", 3.8);
    Mahasiswa15 mhs3 = new Mahasiswa15("244107032", "Hanip", "1F", 3.9);
    Mahasiswa15 mhs4 = new Mahasiswa15("244107024", "Gilang", "1F", 3.7);

    sll.print();
    sll.addFirst(mhs4);
    sll.print();
    sll.addLast(mhs1);
    sll.print();
    sll.insertAfter("Gilang", mhs3);
    sll.insertAt(2, mhs2);
    sll.print();
  }
}