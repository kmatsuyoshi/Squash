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

    public boolean isEmpty(){
	return _size == 0;
    }
    // *** MEANS OF INSERTION ***
    
    /* Inserts the specified element at the front of this deque if it is 
       possible to do so immediately without violating capacity restrictions, 
       throwing an IllegalStateException if no space is currently available. */
    // TO DO: Throw exception
    public void addFirst( Card e ) {
	DLLNode<Card> frontNode = new DLLNode( e, null, _front );
        if ( _size == 0 ) {
            _front = frontNode;
            _end = frontNode;
        }
        else {
            DLLNode<Card> tempNode = _front;
            tempNode.setPrev( frontNode );
	    frontNode.setNext( tempNode );
            _front = frontNode;
        }
        _size++;
    }

    /* Inserts the specified element at the end of this deque if it is 
       possible to do so immediately without violating capacity restrictions, 
       throwing an IllegalStateException if no space is currently available. */
    // TO DO: Throw exception
    public void addLast( Card e ) {
	DLLNode<Card> endNode = new DLLNode( e, _end ,null );
        if ( _size == 0 ) {
            _front = endNode;
            _end = endNode;
        }
        else {
            DLLNode<Card> tempNode = _end;
            tempNode.setNext( endNode );
            _end = endNode;
        }
        _size++;
    }
    
    // *** Peekers ***
    public Card peekFirst(){
	return _front.getValue();
    }
    public Card peekLast(){
	return _end.getValue();
    }

    // *** Pollers ***
    public Card pollFirst(){
	if (isEmpty())
	    return null;
	DLLNode<Card> tempNode = _front;
	_front = _front.getNext();
	_size--;
	return tempNode.getValue();
    }
    public Card pollLast(){
	if (isEmpty())
	    return null;
	DLLNode<Card> tempNode = _end;
	_end =_end.getPrev();
	_size--;
	return tempNode.getValue();
    }
    
    public String toString() {
	String retStr = "front->";
	DLLNode<Card> temp = _front; //init tr
	while( temp != null ) {
	    retStr += (String) temp.getValue() + "->";
	    temp = temp.getNext();
	}
	retStr += "NULL";
	return retStr;
    }//end toString()
    
}
