package method.q10;

import java.util.Arrays;

public class EvenNumber {

	public static void main(String[] args) {
		//配列の要素数は、10
		int[] arrays = { 3, 2, 5, 6, 7, 25, 10, 51, 88, 98 };
		// 引数の整数の配列から偶数の値の個数を出力
		System.out.println(String.format(Arrays.toString(arrays) + "には、偶数が%d個あります。", getEvenNumbers(arrays)));

	}

	// 引数の整数の配列から偶数の値の個数を返すメソッド
	public static int getEvenNumbers(int[] arrays) {
		int countEvenNumber = 0;
		for (int array : arrays) {
			if (array % 2 == 0) {
				countEvenNumber++;
			}
		}
		return countEvenNumber;
	}

}
