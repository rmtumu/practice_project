package basic.q03;

public class SumLoop {

	public static void main(String[] args) {
		
		//1～100までの整数を足した結果を代入する変数 sum を宣言
		int sum = 0;//初期値0
		
		//for文を使用して1～100までの整数を足して、その総和を表示する
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		
		System.out.println(sum);
	}

}
