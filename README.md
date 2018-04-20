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

### METHOD SELECTIONS:
When selecting our methods, we looked at the Deque interface on the Oracle Java API and carefully examined the section regarding equivalent methods to the Queue (FIFO) and Stack (LIFO) interfaces. We were particularly interested in the basic functions a double-ended queue needed: to be able to add, remove, and peek at both ends. Thus, we chose the methods for those functions at both the front and end of the deque. Instead of using remove, we decided to use the poll method because it didn't require exception handling (only need to return null if deque is empty). Simplicity and robustness of code were prioritized. We also chose isEmpty() as a helper method.

### ARCHITECTURE OF CHOICE:
We pursued a node-based architecture (using DLLNodes). We were looking for the architecture with the best runtime efficiencies. Array was not ideal because it would constantly have to be expanded as the deque grew. ArrayList was shot down because the dequeue method for both single-ended queue directions was O(n). In contrast, with doubly-linked nodes, only one method had an O(n) runtime. The other three were all constant time, O(1).
