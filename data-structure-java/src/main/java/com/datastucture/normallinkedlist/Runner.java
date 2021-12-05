package com.datastucture.normallinkedlist;

import java.util.LinkedList;

public class Runner {
    public static void main(String[] args) {
      LinkedListImpl linkedList = new LinkedListImpl();
      linkedList.add(25);
      linkedList.add(51);
      linkedList.add(5);
      linkedList.add(2);
      linkedList.add(21);
      linkedList.add(20);

      linkedList.insertAt(0, 888);
      linkedList.deleteAt(2);
      linkedList.show();
    }
}
