public class SLLMain15 {
  public static void main(String[] args) {
    SingleLinkedList15 sll = new SingleLinkedList15();

    Mahasiswa15 mhs1 = new Mahasiswa15("244107001", "Rifky", "1F", 3.7);
    Mahasiswa15 mhs2 = new Mahasiswa15("244107012", "Julian", "1F", 3.8);
    Mahasiswa15 mhs3 = new Mahasiswa15("244107032", "Hanip", "1F", 3.9);
    Mahasiswa15 mhs4 = new Mahasiswa15("244107024", "Gilang", "1F", 3.7);

    sll.addLast(mhs1);
    sll.addLast(mhs2);
    sll.addLast(mhs3);
    sll.addLast(mhs4);

    System.out.println("data index 1 : ");
    sll.getData(1);
    System.out.println();

    System.out.println("data mahasiswa an Hanip berada pada index : " + sll.indexOf("hanip"));
    System.out.println();

    sll.removeFirst();
    sll.removeLast();
    sll.print();
    sll.removeAt(0);
    sll.print();
    
  }
}