package com.thread.lambda.model;

import java.util.Hashtable;

public class OutputModel {
	private InputModel inputModel;
	private Hashtable<String, String> threads;

	public InputModel getInputModel() {
		return inputModel;
	}
	public void setInputModel(InputModel inputModel) {
		this.inputModel = inputModel;
	}
	public Hashtable<String, String> getThreads() {
		return threads;
	}
	public void setThreads(Hashtable<String, String> threads) {
		this.threads = threads;
	}
}
