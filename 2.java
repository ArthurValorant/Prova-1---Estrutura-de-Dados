public class ClienteDePilha {

   public static void main(String[] args) {
      Stack<String> pilha;
      pilha = new Stack<String>();

      while (!StdIn.isEmpty()) {
         String str = StdIn.readString();
         if (!str.equals("-"))
            pilha.push(str);
         else if (!pilha.isEmpty()) 
                 StdOut.print(pilha.pop() + " ");
      }
      StdOut.println("(" + pilha.size() + " left on stack)");
   }
}
public class ListaPilha {
    private Item[] a;
   private int N;

   // construtor
   public StackRA() {
      a = (Item[]) new Object[2];
      N = 0;
   }

   // a pilha mora em a[0..N-1]
   
   public boolean isEmpty() {
      return N == 0;
   }
   
   public void push(Item item) { 
      if (N == a.length)
         resize(2 * a.length);
      a[N++] = item;
   }

   public Item pop() {
      Item item = a[--N];
      if (N > 0 && N == a.length/4)
         resize(a.length/2);
      return item;
   }

   private void resize(int max) {
      Item[] temp;
      temp = (Item[]) new Object[max];
      for (int i = 0; i < N; i++)
         temp[i] = a[i];
      a = temp;
   }
    
}
public class StackL<Item> {

   private Node first; 

   private class Node {
       Item item;
       Node next;
   }

   public boolean isEmpty() {
       return first == null;
   }

   public void push(Item item) {
       Node oldfirst = first;
       first = new Node();
       first.item = item;
       first.next = oldfirst;
   }

   public Item pop() {
       Item item = first.item;
       first = first.next;
       return item;
   }

   public static void main(String[] args) {
       StackL<String> s = new StackL<String>();
       while (!StdIn.isEmpty()) {
           String item = StdIn.readString();
           if (!item.equals("-")) s.push(item);
           else if (!s.isEmpty()) StdOut.print(s.pop() + " ");
       }
       StdOut.println("(" + s.size() + " left on stack)");
   }
}