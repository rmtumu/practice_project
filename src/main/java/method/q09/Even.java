package method.q09;

public class Even {

	public static void main(String[] args) {
		//整数値 value を宣言
		int value = 10;
		//偶数か奇数かを判定し結果を出力
		if (checkEven(value)) {
			System.out.println(String.format("%dは偶数です。", value));
		} else {
			System.out.println(String.format("%dは奇数です。", value));
		}

	}

	// 偶数か奇数かを判定するメソッド
	public static boolean checkEven(int value) {
		if (value % 2 == 0) {
			return true;
		} else {
			return false;
		}

	}

}
