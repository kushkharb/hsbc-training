package com.demo.Q7;

public class PrintWorker implements Runnable {

	private String message;

	private MessagePrinter printer;

	public PrintWorker(String message, MessagePrinter printer) {
		this.message = message;
		this.printer = printer;
	}

	@Override
	public void run() {

		printer.print(message);

	}
}
