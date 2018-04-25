/*
  Team Yahoo Search -- Bing Li, Lily Yan, Selina Zou
  APCS2 pd1
  Lab 02
  2018-04-18
*/

public class DequeTester {
    public static void main(String[] args) {
	QQKachoo<String> mister = new QQKachoo<String>();

	System.out.println("\nEnqueueing deque mister...");

	mister.addLast("and");
	mister.addLast("there's");
	mister.addLast("nobody");
	mister.addLast("around");

	mister.addFirst("forest");
	mister.addFirst("a");
	mister.addFirst("in");
	mister.addFirst("falling");
	mister.addFirst("you're");
	mister.addFirst("when");
	
	System.out.println("\nmister after enqueing: " + mister);
	
	System.out.println("\n\nDequeueing mister: ");
	while (! mister.isEmpty()) {
	    int firstOrLast = (int)(Math.random() * 2); //determines whether to remove element at front or end of deque
	    if (firstOrLast == 0) { 
		System.out.println("\nRemoving element at FRONT of deque...");
		System.out.println("Element at front: " + mister.peekFirst());
		System.out.println("Element removed: " + mister.pollFirst());
	    }

	    else {
	        System.out.println("\nRemoving element at END of deque...");
		System.out.println("Element at end: " + mister.peekLast());
		System.out.println("Element removed: " + mister.pollLast());
	    }

	    System.out.println("Deque after dequeue: " + mister);
	}	   
	/* ~~~~~~~~~~~~MOVE ME DOWN~~~~~~~~~~~~~
	   ~~~~~~~~~~~~YOU MADE IT~~~~~~~~~~~~~~~ */
    }
}
