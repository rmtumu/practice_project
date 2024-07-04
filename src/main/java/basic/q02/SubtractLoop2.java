package basic.q02;

public class SubtractLoop2 {

	public static void main(String[] args) {
		int value = 100;//valueに100を代入
		//do while文を使用して100から1ずつ減算して、0まで表示する
		do {
			System.out.println(value);
			value--;
		} while (value >= 0);

	}

}
