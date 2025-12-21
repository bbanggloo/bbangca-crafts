package com.bbanggloo.bbangca.javacraft.jdk25.jep514;

public class AheadOfTimeCommandLineErgonomics {
	
	static void main(String[] args) {
		long start = System.nanoTime();

		for (int i = 0; i < 5_000_000; i++) {
			compute(i);
		}

		long end = System.nanoTime();
		System.out.printf("Elapsed: %d ms%n", (end - start) / 1_000_000);
	}

	private static void compute(int n) {
		double result = 0;
		for (int i = 0; i < 100; i++) {
			result += Math.sin(i + n);
		}
		if (n % 1_000_000 == 0) {
			System.out.printf("Checkpoint at %,d%n", n);
		}
	}
}
