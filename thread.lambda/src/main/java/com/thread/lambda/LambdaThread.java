package com.thread.lambda;

import java.util.Random;

public class LambdaThread implements Runnable {
	private static int SECONDS = 1000;
	private String name;
	private int maxIndex;
	private int total;

	public LambdaThread(String name, int maxIndex) {
		this.name = name;
		this.maxIndex = maxIndex;
		this.setTotal();
	}

	public String getName() {
		return this.name;
	}

	public int getTotal() {
		return this.total;
	}

	public void run() {
		try {
			this.total += this.maxIndex;

			Thread.sleep(this.getAdditionalMilliSeconds() * SECONDS);
		} catch (Exception e) {
			// TODO : catch exception
		}
	}

	private long getAdditionalMilliSeconds() 
	{
		return this.getRandomNumber(10, 1);
	}

	private void setTotal() 
	{
		this.total = this.getRandomNumber(50, 20);
	}

	private int getRandomNumber(int max, int min)
	{
		Random random = new Random();
		return random.nextInt((max - min) + 1) + min;
	}
}
