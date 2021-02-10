class Main {
  public static void main(String[] args) {
   	StackQ Q = new StackQ(); 
	Q.enQueue("A"); 
	Q.enQueue("B"); 
	Q.enQueue("C"); 

	System.out.println(Q.deQueue()); 
	System.out.println(Q.deQueue()); 
	System.out.println(Q.deQueue()); 
	System.out.println(Q.deQueue()); //null

        Q.enQueue("A"); 
        Q.enQueue("B"); 
        Q.enQueue("C"); 
        System.out.println(Q.deQueue()); //A
        System.out.println(Q.deQueue());  //B
        Q.enQueue("D");
        System.out.println(Q.deQueue()); //C
	System.out.println(Q.deQueue()); //D
        System.out.println(Q.deQueue()); //null 
  }
}
