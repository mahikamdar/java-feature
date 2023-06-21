package com.DP;

public class Coin2 {
	public static void main(String[] args) {
		int coin[] = { 0, 2, 3, 5, 10 };
		int w = 15;
		int a[] = new int[w + 1];
		a[0] = 1;

		for (int i = 1; i < coin.length; i++) {

			for (int j = coin[i]; j <= w; j++) {
				a[j] = a[j] + a[j - coin[i]];

			}
		}
		System.out.println(a[w]);
	}
}
