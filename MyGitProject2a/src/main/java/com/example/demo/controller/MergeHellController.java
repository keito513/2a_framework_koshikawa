package com.example.demo.controller;

import java.util.Random;

public class MergeHellController {
	public static void main(String[] args) {
		kadaiA();
		kadaiB();

		// 乱数生成器のインスタンス化
		Random random = new Random();

		// 1から100までの乱数を生成して抽選する例
		int winningNumber = random.nextInt(100) + 1;

		System.out.println("抽選結果: " + winningNumber);
	}

	static void kadaiB() {

		Random random = new Random();

		int winningNumber = random.nextInt(100) + 1;

		System.out.println("抽選結果: " + winningNumber);
	}

}