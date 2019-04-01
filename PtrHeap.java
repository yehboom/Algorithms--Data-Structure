package algs24;

import stdlib.StdIn;
import stdlib.StdOut;


/**
 *  The <tt>PtrHeap</tt> class is the priorityQ class from Question 2.4.24.
 *  It represents a priority queue of generic keys.
 *  
 *  It supports the usual <em>insert</em> and <em>delete-the-maximum</em>
 *  operations, along with methods for peeking at the maximum key,
 *  testing if the priority queue is empty, and iterating through
 *  the keys.
 *  For additional documentation, see <a href="http://algs4.cs.princeton.edu/24pq">Section 2.4</a> of
 *  <i>Algorithms, 4th Edition</i> by Robert Sedgewick and Kevin Wayne.
 */

public class PtrHeap<K extends Comparable<? super K>> {
	
	static class Node<K> {
		K value;
		Node<K> parent;
		Node<K> lchild;
		Node<K> rchild;
	}
	
	private int size;
	private Node<K> root;
	
    boolean isRoot(Node<K> n){ return n == root; }
    
    Node<K> find(int n){ return null; } 
	
	void exch(Node<K> n1, Node<K> n2) { 
	// only swap items of nodes 
	}
	
	@SuppressWarnings("unchecked")
	/** Create an empty priority queue  */
	public PtrHeap() {
		
	}
    
	/** Is the priority queue empty? */
	public boolean isEmpty() { 
		return true; }
	

	/** Return the number of items on the priority queue. */
	public int size() { 
		return size; }

	/**
	 * Return the largest key on the priority queue.
	 * Throw an exception if the priority queue is empty.
	 */
	public K max() {
		return null;
		
	}

	/** Add a new key to the priority queue. */
	public void insert(K x) { 
		return;	
	}

	/**
	 * Delete and return the largest key on the priority queue.
	 * Throw an exception if the priority queue is empty.
	 */
	public K delMax() {
		return null;
	}

	private void showHeap() { 
	    // a method to print out the heap
		// useful for debugging
	}

	public static void main(String[] args) {
		PtrHeap<String> pq = new PtrHeap<>();
		StdIn.fromString("10 20 30 40 50 - - - 05 25 35 - - - 70 80 05 - - - - ");
		while (!StdIn.isEmpty()) {
			StdOut.print ("pq:  "); pq.showHeap();
			String item = StdIn.readString();
			if (item.equals("-")) StdOut.println("max: " + pq.delMax());
			else pq.insert(item);
		}
		StdOut.println("(" + pq.size() + " left on pq)");

	}

}

