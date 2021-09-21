package com.threads;

class ThreadsRunDemos implements Runnable {

	public void run() {
		try {
			System.out.println("list of running thread " + Thread.currentThread());

		} catch (Exception e) {
			System.out.println("Exception caught " + e);
		}
	}
}

public class ThreadsDemosByRun {
	public static void main (String arg[]) {
		   int numberOfThreads = 2;

		   

	        for (int i = 0; i < numberOfThreads; i++) {

	 

	            ThreadsDemos threadsDemos = new ThreadsDemos();//created the object of a class

	 

	            threadsDemos.start();// life cycle of threads start() call the run method
	            threadsDemos.setName("abhinav thread");
	            threadsDemos.setPriority(8);

}
	}}