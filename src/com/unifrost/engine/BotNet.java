package com.unifrost.engine;

public class BotNet {
	private final boolean miner;

	public BotNet(boolean miner) {
		this.miner = miner;
	}

	public void mineCoin() {
		if (miner){
			System.out.println("Mined a bitcoin!");
		} else {
			System.out.println("I am not a miner!");
		}
	}
}
