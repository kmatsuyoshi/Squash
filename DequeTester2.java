// Team Ayo (Shafali, Henry, Kenny)
// APCS2 pd1
// L #02: All Hands on Deque!
// 2018-04-25w

/*****************************************************
 * class QQDriver
 * Driver for QQKachoo
 ******************************************************/

public class DequeTester2 {

    public static void main(String[] args) {
	QQKachoo<String> ayo = new QQKachoo<String>();

	//Testing add methods
	System.out.println("Add first: cat");
	ayo.addFirst("cat");
	System.out.println("Add first: dog");
	ayo.addFirst("dog");
	System.out.println("Add first: icecream");
	ayo.addFirst("icecream");
	System.out.println("Add last: pizza");
	ayo.addLast("pizza");
	System.out.println("Add last: tower");
	ayo.addLast("tower");

	//Testing toString
	System.out.println("Print toString: (icecream, dog, cat, pizza, tower)");
	System.out.println(ayo);

	//Testing peek
	System.out.println("PeekFirst: icecream");
	System.out.println(ayo.peekFirst());
	System.out.println("PeekLast: tower");
	System.out.println(ayo.peekLast());

	//Testing poll
	System.out.println(ayo.pollLast());
	System.out.println(ayo.pollFirst());
    }
}
