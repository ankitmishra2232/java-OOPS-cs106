package com.Ankit.cs106.ex12;

import java.util.ArrayList;
import java.util.List;

public class MyQueue {
	private List<String> queueList;
	int count=0;
	//count =0;
	public MyQueue() {
		this.queueList = new ArrayList<String>();
	}
	public boolean isEmpty() {
		return this.count == 0;
	}
	public void enqueue(String person) {
		queueList.add(person);
		count++;
		System.out.println("Added\n");
	}
	
	public String dequeue() {
		if(isEmpty()) {
			return null;
		}
		else
			count--;
		return queueList.remove(0);
	}
	public String peek() {
		if(isEmpty()) {
			return null;
		}
		return this.queueList.get(0);
	}
	
	public void display() {
		for(String item : this.queueList) {
			System.out.println(item);
		}
	}

	public List getQueueList() {
		return queueList;
	}

	public void setQueueList(List queueList) {
		this.queueList = queueList;
	}

	
}

