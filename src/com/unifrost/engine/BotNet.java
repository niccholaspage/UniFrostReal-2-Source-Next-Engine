package com.unifrost.engine;

public class BotNet {
	private boolean miner;
	
	public BotNet(boolean miner) {
		this.miner = miner;
	}
	
	public void mineCoin() {
		System.out.println("Mined a bitcoin!");
	}
}
