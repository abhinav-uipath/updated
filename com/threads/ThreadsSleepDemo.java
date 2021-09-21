package com.threads;


class ThreadssleepDemos extends Thread {

	public void run() { // imp method given by thread class java

		// logic part
		try {
			for (int i = 1; i < 10; i++) {
				Thread.sleep(1000);
				System.out.println(i);
			}

		} catch (Exception e) {

			System.out.println("exception caught" + e);

		}

	}

}

public class ThreadsSleepDemo {

	public static void main(String ar[]) {

		ThreadssleepDemos threadsDemos = new ThreadssleepDemos();// created the object of a class

		threadsDemos.start();

	}

}
