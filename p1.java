/*
  * Praktikum Lima
  * Mengetahui penggunaan operator increment dan decrement
  * @author Teknik Informatika Unindra 
*/
  public class PraktikumLima{
    public static void main (String[] args){
      
      int a = 1;
      int b = a++; //b mendapat nilai dari a(1), a kemudian bertambah 1
      System.out.println("a = " + a); //2
      System.out.println("b = " + b); //1
      
      int c = 1;
      int d = ++c; //d mendapat nilai setelah c bertambah 1(2)
      System.out.println("c = " + c); //2
      System.out.println("d = " + d); //2
      
      int i = 1;
      int j = i--; //j mendapat nilai dari i(1), a kemudian berkurang 1
      System.out.println("i = " + i); //0
      System.out.println("j = " + j); //1
      
      int k = 1;
      int l = --k; //l mendapat nilai setelah k berkurang 1(0)
      System.out.println("k = " + k); //0
      System.out.println("l = " + l); //0
      
      
    }
  }