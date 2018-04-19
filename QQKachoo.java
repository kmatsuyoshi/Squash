// Team Squash ( Kendrick Liang, Kayli Matsuyoshi, Lynne Wang )
// APCS2 pd1
// L #02: All Hands on Deque!
// 2018-04-19r

/*****************************************************
 * class QQKachoo
 * Double-Ended Queue
 ******************************************************/

public class QQKachoo<Card> implements Deque<Card> {

    // ~~~ INSTANCE VARIABLES ~~~
    private DLLNode<Card> _front, _end;
    private int _size;
    
    // ~~~~~ CONSTRUCTOR(S) ~~~~~
    public QQKachoo() {
	_front = _end = null;
	_size = 0;
    }
    
    // ~~~~~~~~~ METHODS ~~~~~~~~
    
    // *** MEANS OF INSERTION ***
    
    /* Inserts the specified element at the front of this deque if it is 
       possible to do so immediately without violating capacity restrictions, 
       throwing an IllegalStateException if no space is currently available. */
    // TO DO: Throw exception
    public void addFirst( Card e ) {
	LLNode<T> frontNode = new LLNode( e, null );
        if ( _size == 0 ) {
            _front = frontNode;
            _end = frontNode;
        }
        else {
            LLNode<T> tempNode = _front;
            tempNode.setPrev( frontNode );
	    frontNode.setNext( tempNode );
            _front = frontNode;
        }
        _size += 1;
    }

    /* Inserts the specified element at the end of this deque if it is 
       possible to do so immediately without violating capacity restrictions, 
       throwing an IllegalStateException if no space is currently available. */
    // TO DO: Throw exception
    public void addLast( Card e ) {
	LLNode<T> endNode = new LLNode( e, null );
        if ( _size == 0 ) {
            _front = endNode;
            _end = endNode;
        }
        else {
            LLNode<T> tempNode = _end;
            tempNode.setNext( endNode );
            _end = endNode;
        }
        _size += 1;
    }
    
    // *** Peekers ***
    public Card peekFirst();
    public Card peekLast();

    // *** Pollers ***
    public Card pollFirst();
    public Card pollLast();   
    
}
