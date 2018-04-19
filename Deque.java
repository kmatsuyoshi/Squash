// Team Squash ( Kendrick Liang, Kayli Matsuyoshi, Lynne Wang )
// APCS2 pd1
// L #02: All Hands on Deque!
// 2018-04-19

/*****************************************************
 * interface Deque
 * Double-Ended Queue
 ******************************************************/

public interface Deque<Card> {

    //returns true if empty, false if not
    public boolean isEmpty();

    //Inserts the specified element at the front of this deque
    public void addFirst( Card e);

    //Inserts the specified element at the end of this deque
    public void addLast( Card e);

    //Retrieves and removes the first element of this deque
    //returns null if this deque is empty
    public Card pollFirst();

    //Retrieves and removes the last element of this deque
    //returns null if this deque is empty
    public Card pollLast();

    //Retrieves, but does not remove, the first element of this deque
    //returns null if this deque is empty
    public Card peekFirst();

    //Retrieves, but does not remove, the last element of this deque
    //returns null if this deque is empty
    public Card peekLast();
    
}
