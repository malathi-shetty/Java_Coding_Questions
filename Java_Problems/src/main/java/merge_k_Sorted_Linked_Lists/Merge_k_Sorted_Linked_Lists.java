package merge_k_Sorted_Linked_Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//public class Merge_k_Sorted_Linked_Lists {

// Merge k sorted linked lists and return it as one sorted list.

class Node {
	int data; // Value of the node
	Node next; // Pointer to the next node

	Node(int data) {
		this.data = data; // Initialize the node with a value
		this.next = null; // Set next to null initially
	}
}

public class Merge_k_Sorted_Linked_Lists {

	// Method to merge k sorted linked lists
	public static Node mergeKLists(Node[] lists) {
		if (lists == null || lists.length == 0)
			return null; // Check for empty input

		Node mergedHead = null; // Head of the merged list
		Node current = null; // Pointer to track the current node

		// Keep merging until there is only one list left
		while (true) {
			Node minNode = null; // To find the smallest node
			int minIndex = -1; // To track the index of the smallest node

			// Find the smallest node among the k lists
			for (int i = 0; i < lists.length; i++) {
				if (lists[i] != null) { // Check if the list is not empty
					if (minNode == null || lists[i].data < minNode.data) {
						minNode = lists[i]; // Update the smallest node
						minIndex = i; // Update the index
					}
				}
			}

			// If we found a minimum node, add it to the merged list
			if (minNode != null) {
				if (mergedHead == null) {
					mergedHead = new Node(minNode.data); // Initialize the merged list
					current = mergedHead; // Set current to the head
				} else {
					current.next = new Node(minNode.data); // Add the smallest node
					current = current.next; // Move current pointer
				}
				// Move to the next node in that list
				lists[minIndex] = lists[minIndex].next;
			} else {
				break; // No more nodes to process
			}
		}

		return mergedHead; // Return the head of the merged list
	}

	// Helper method to print the linked list
	public static void printList(Node head) {
		Node current = head;
		while (current != null) {
			System.out.print(current.data + " -> ");
			current = current.next;
		}
		System.out.println("null");
	}

	// Main method to test the merging of k sorted linked lists
	public static void main(String[] args) {
		// Create sample sorted linked lists
		Node list1 = new Node(1);
		list1.next = new Node(4);
		list1.next.next = new Node(5);

		Node list2 = new Node(1);
		list2.next = new Node(3);
		list2.next.next = new Node(4);

		Node list3 = new Node(2);
		list3.next = new Node(6);

		// Array of linked lists
		Node[] lists = { list1, list2, list3 };

		// Merge the k sorted linked lists
		Node mergedList = mergeKLists(lists);

		// Print the merged linked list
		printList(mergedList);
	}
}