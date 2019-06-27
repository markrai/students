package core.day06.multithreading;

public class MultiThreading  implements Runnable {

		public static void main(String[] args) {
			Thread guruThread1 = new Thread("Guru1");
			Thread guruThread2 = new Thread("Guru2");
			guruThread1.start();
			guruThread2.start();
			System.out.println("Thread names are following:");
			System.out.println(guruThread1.getName());
			System.out.println(guruThread2.getName());
		}

		@Override
		public void run() {
		}

	}

