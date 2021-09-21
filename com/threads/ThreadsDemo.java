package com.threads;

 class ThreadsDemos extends Thread{

	 public void run() {
		 try {
			 System.out.println("list of threads running "+Thread.currentThread());
		 }
		 catch(Exception e) {
			 System.out.println("exception caught"+e);
		 }
	 }
}
public class ThreadsDemo {
	public static void main (String arg[]) {
	      int numberOfThreads = 2;

	      

	        for (int i = 0; i < numberOfThreads; i++) {

	 

	            ThreadsDemos threadsDemos = new ThreadsDemos();
	            threadsDemos.start();
	}
}
}