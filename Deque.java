public interface Deque<Card> {
    public int size();
    public Card element();
    public Card getFirst();
    public Card getLast();
    public Card peek();
    public boolean add(Card e);
    public void addFirst(Card e);
    public void addLast(Card e);
    public boolean contains(Object o);
    public Iterator<Card> descendingIterator();
    public Iterator<Card> iterator();
    public boolean offer(Card e);
    public boolean offerFirst(Card e);
    public boolean offerLast(Card e);
    public Card peek();
    public Card peekFirst();
    public Card peekLast();
    public Card poll();
    public Card pollLast();
    public Card pollFirst();
    public Card pop();
    public void remove();
    public Card remove(Object o);
}
