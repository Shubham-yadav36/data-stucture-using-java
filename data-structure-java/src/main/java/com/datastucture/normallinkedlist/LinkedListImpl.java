package com.datastucture.normallinkedlist;

import java.util.Iterator;

public class LinkedListImpl {
    Node head;
    public void add(int data) {
        Node node = new Node();
        node.data = data;

        if(head == null){
            head = node;
        }     
        else{
            Node n = head;
            while(n.next != null){
                n = n.next;
            }
            n.next = node;
        }
    }
    
    public void insertAtStart(int data) {
    	Node node = new Node();
    	node.data = data;
    	node.next = head;
    	head = node;
    }
    
    public void insertAtLast(int data) {
    	Node node = new Node();
    	node.data = data;
    	Node temp = head;
    	while (temp.next != null) {
			temp = temp.next;
		}
    	temp.next = node;
    }
    
    public void insertAt(int index,int data) {
    	Node node = new Node();
    	node.data = data;
    	node.next = head;
    	
    	if (index == 0 ) {
			insertAtStart(data);
		}else {
			Node temp= node;
	    	for (int i = 0 ; i < index;i++) {
				temp = temp.next;
			}
	    	node.next = temp.next;
	    	temp.next = node;
		}
    	
    }
    
    public void deleteAt(int index) {
    	Node temp = head;
    	Node n = null;
    	
    	if(index == 0) {
    		head = head.next;
    	}else {
    		for (int i = 0 ; i < index;i++) {
    			temp = temp.next;
    		}
        	n = temp.next;
        	temp.next = n.next;
    	}
    	
  
    	
    }
    
    
    public void show(){
        Node temp = head;
        while(temp.next != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println(temp.data);
    }
}
