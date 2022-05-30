package com.Collections;
import java.util.*;
class Collections {
    public static void main(String args[]){
        ArrayList<String> list=new ArrayList<String>();
        list.add("Ahmed");
        list.add("Okda");
        list.add("mossa");
        list.add("Rich");
        Iterator itr=list.iterator();
        System.out.println("Example 1");
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("Example 2");
        LinkedList<String> al=new LinkedList<String>();
        al.add("Okda");
        al.add("mossa");
        al.add("Rich");
        al.add("Ahmed");
        Iterator<String> itr1=al.iterator();
        while(itr1.hasNext()) {
            System.out.println(itr1.next());
        }
        System.out.println("Example 3");

        Vector<String> v=new Vector<String>();
        v.add("Rich");
        v.add("Ahmed");
        v.add("mossa");
        v.add("Okda");
        Iterator<String> itr2=v.iterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }
        System.out.println("Example 4");

        Stack<String> stack = new Stack<String>();
        stack.push("Rich");
        stack.push("Ahmed");
        stack.push("Okda");
        stack.push("mossa");
        stack.push("lw");
        stack.push("q");
        stack.pop();
        Iterator<String> itr3=stack.iterator();
        while(itr3.hasNext()){
            System.out.println(itr3.next());
        }
        System.out.println("Example 5");

        Deque<String> deque = new ArrayDeque<String>();
        deque.add("MB");
        deque.add("depp");
        deque.add("srv");
        for (String str : deque) {
            System.out.println(str);
        }

    }
}
