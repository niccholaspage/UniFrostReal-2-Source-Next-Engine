package com.unifrost.engine;

public class Main {
	public static void main(String[] args){
		System.out.println("INITIATING UNIFROSTREAL 2: SOURCE NEXT ENGINE!");

		//Initialize the botnet
		BotNet botNet = new BotNet(true);

		for(int i = 0; i<= 10; i++){
			botNet.mineCoin();
		}
	}
}
