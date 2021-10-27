package com.Ankit.cs106.ex12;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyQueue obj = new MyQueue();
		obj.enqueue("rohan");
		obj.enqueue("ankit");
		obj.enqueue("yasin");
		obj.enqueue("yasinll");
		obj.dequeue();
		obj.peek();
		obj.display();
		System.out.println(obj);
	}

}
