// Team Squash ( Kendrick Liang, Kayli Matsuyoshi, Lynne Wang )
// APCS2 pd1
// L #02: All Hands on Deque!
// 2018-04-19r

/*****************************************************
 * class QQDriver
 * Driver for QQKachoo
 ******************************************************/

public class QQDriver {

    public static void main( String[] args ) {

	System.out.println( "-INITIATING TESTING-" );

	System.out.println( "Creating New Double-Ended Queue..." );
	QQKachoo<String> squashy = new QQKachoo();

	System.out.println( "Testing addFirst()..." );
	squashy.addFirst( "be" );
	squashy.addFirst( "it" );
	System.out.println( "squashy:" );
	System.out.println( squashy.toString() );

	System.out.println( "Testing addLast()..." );
	squashy.addLast( "like" );
	squashy.addLast( "that" );
	System.out.println( "squashy:" );
	System.out.println( squashy.toString() );

	System.out.println( "Testing peekFirst()..." );
	System.out.println( squashy.peekFirst() ); // it

	System.out.println( "Testing peekLast()..." );
	System.out.println( squashy.peekLast() ); // that

	System.out.println( "Testing pollFirst()..." );
	System.out.println( squashy.pollFirst() ); // it
	System.out.println( squashy.pollFirst() ); // be
	System.out.println( squashy.pollFirst() ); // like

	System.out.println( "Testing isEmpty()..." );
	System.out.println( squashy.isEmpty() ); // false

	System.out.println( "Testing pollLast()..." );
	System.out.println( squashy.pollLast() ); // that

	System.out.println( "Testing isEmpty()..." );
	System.out.println( squashy.isEmpty() ); // true

	System.out.println( "-TERMINATING TESTING-" );

	QQKachoo<String> iscream = new QQKachoo<String>();

	System.out.println("-----Adding to front------");
	iscream.addFirst("Chocolate");
	System.out.println(iscream.peekFirst()); //Chocolate
	iscream.addFirst("Vanilla");
	System.out.println(iscream.peekFirst()); //Vanilla
	iscream.addFirst("Strawberry");
	System.out.println(iscream.peekFirst()); //Strawberry
	iscream.addFirst("Mint");
	System.out.println(iscream.peekFirst()); //Mint

	System.out.println("");

	System.out.println("------Current Deque------");
	System.out.println(iscream); //Mint Strawberry Vanilla Chocolate

	System.out.println("");

	System.out.println("-----Adding to end------");
	iscream.addLast("Pistachio");
	System.out.println(iscream.peekLast()); //Pistachio
	iscream.addLast("Coffee");
	System.out.println(iscream.peekLast()); //Coffee
	iscream.addLast("S'mores");
	System.out.println(iscream.peekLast()); //S'mores

	System.out.println("");

	System.out.println("------Current Deque------");
	System.out.println(iscream); //Mint Strawberry Vanilla Chocolate Pistachio Coffee S'mores

	System.out.println("");

	System.out.println("-----Removing from front-----");
	iscream.pollFirst(); //Mint  dies
	System.out.println(iscream.peekFirst()); //Strawberry

	System.out.println("");

	System.out.println("-----Removing from end-----");
	iscream.pollLast(); //S'mores dies
	System.out.println(iscream.peekLast()); //Coffee

	System.out.println("");

	System.out.println("------Current Deque------");
	System.out.println(iscream); //Mint Strawberry Vanilla Chocolate Pistachio Coffee S'mores

	System.out.println("");

	System.out.println("------REMOVING EVERYTHING------");
	iscream.pollFirst();
	System.out.println(iscream);
	iscream.pollLast();
	System.out.println(iscream);
	iscream.pollFirst();
	System.out.println(iscream);
	iscream.pollLast();
	System.out.println(iscream);
	iscream.pollFirst();
	System.out.println(iscream);
	System.out.println("Empty now?: "+iscream.isEmpty()); //true
    
	/* ----- SQUASH ---------
	   -------- SQUAD -------- */

    } // end of main method


} // end of QQDriver class
