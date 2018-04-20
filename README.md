# Squash
Roster: Kendrick Liang, Kayli Matsuyoshi, Lynne Wang

### TO DO LIST:
- [x] Draft a list of prioritized deque methods to implement
- [x] Write a local Deque interface
- [x] Design an implementation (QQKachoo) of the Deque interface w/ chosen methods
    - Chosen methods:
        - boolean isEmpty();
        - void addFirst( Card );
        - void addLast( Card );
        - Card pollFirst();
        - Card pollLast();
        - Card peekFirst();
        - Card peekLast();
    - Decide on an architecture for our doubly-linked queue (as of now, LinkedList)
- [x] Create a driver class to test functionality of QQKachoo
- [x] Modify README as decisions are made and improved

### PLAN:
1. Draft a list of prioritized deque methods to implement.
2. Write a local Deque interface.
- Group the methods according to how they function and what they return.
- This process includes grouping accessors and any methods that share a common functionality, such as the remove methods and the add methods.
3. Design an implementation (QQKachoo) of the Deque interface w/ chosen methods.
    - Use the methods stated in the interface Deque, which QQKachoo implements.
    - QQKachoo will be a class for a Double-Ended Queue functionality.
    - We decided to use Double Linked Nodes to create a Double-Ended Queue because the methods cost less runtime as opposed to an ArrayList-formatted Double-Ended Queue, which is not mostly constant time operations.
    - Work with the accessor methods first, then the add methods, and work towards the remove methods and rest of the methods.
4. Create a driver class to test functionality of QQKachoo.
5. Modify README as decisions are made and improved.
