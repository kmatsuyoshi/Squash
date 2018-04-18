// Team Squash ( Kendrick Liang, Kayli Matsuyoshi, Lynne Wang )
// APCS2 pd1
// HW37 --
// 2018-04-19r

/*****************************************************
 * class QQKachoo
 * Double-Ended Queue
 ******************************************************/

public class QQKachoo<Card> implements Deque<Card> {

    // ~~~ INSTANCE VARIABLES ~~~

    private DLLNode<Card> _front;
    private DLLNode<Card> _end;
    private int _size;
    
    // ~~~~~ CONSTRUCTOR(S) ~~~~~

    public QQKachoo() {
	_size = 0;
    }
    
    // ~~~~~~~~~ METHODS ~~~~~~~~

    // *** ACCESSORS ***
    
    // Returns the number of elements in this deque.
    public int size() {
	return _size;
    }

    // Retrieves, but does not remove, the first element of this deque.
    public Card getFirst() {
	return _front.getValue();
    }

    // Retrieves, but does not remove, the last element of this deque.
    public Card getLast() {
	return _end.getValue();
    }

    /* Retrieves, but does not remove, the head of the queue represented by 
       this deque (in other words, the first element of this deque). */
    // Wait... what is the difference between this and getFirst()?
    public Card element() {
	return _front.getValue();
    }
    
    // *** MEANS OF INSERTION ***
    
    /* Inserts the specified element into the queue represented by this deque
       (in other words, at the tail of this deque) if it is possible to do so 
       immediately without violating capacity restrictions, returning true upon 
       success and throwing an IllegalStateException if no space is currently 
       available. */
    // TO DO: Throw exception
    public boolean add( Card e ) {
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
	return true;
    }

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

    // *** Idk ***
    
    // Returns true if this deque contains the specified element.
    public boolean contains( Object o );

    // *** Iterators ***

    /* Returns an iterator over the elements in this deque in reverse 
       sequential order. */
    public Iterator<Card> descendingIterator();

    // Returns an iterator over the elements in this deque in proper sequence. 
    public Iterator<Card> iterator();

    // *** Offerers ***
    
    public boolean offer( Card e );
    public boolean offerFirst( Card e );
    public boolean offerLast( Card e );

    // *** Peekers ***
    public Card peek();
    public Card peekFirst();
    public Card peekLast();

    // *** Pollers ***
    public Card poll();
    public Card pollFirst();
    public Card pollLast();

    // *** Stack Functions ***
    public Card pop();
    public void push( Card e );

    // *** Removers ***
    public Card remove();
    public boolean remove( Object o );
    public Card removeFirst();
    public boolean removeFirstOccurrence( Object o );
    public Card removeLast();
    public boolean removeLastOccurence();
    
    
}
