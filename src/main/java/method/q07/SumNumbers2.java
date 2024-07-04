package method.q07;

public class SumNumbers2 {

	public static void main(String[] args) {
		//整数 value と実数 realNumber を宣言
		int value = 5;
		double realNumber = 3.3;
		// 2つの引数を加算し、結果を出力
		System.out.println(
				String.format("第一引数（整数）：%d%n第二引数（実数）：%1.1f%n加算結果：%d", value, realNumber,
						calculateSum(value, realNumber)));

	}

	// 2つの引数を加算し、結果を返すメソッド
	public static int calculateSum(int value, double realNumber) {
		return (int) (value + realNumber);
	}

}
