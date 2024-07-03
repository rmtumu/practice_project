package basic.q05;

public class FizzBuzz {

	public static void main(String[] args) {

		// if文を使用し1～100までの整数を表示する
		for (int i = 1; i <= 100; i++) {

			if (i % 15 == 0) {
				System.out.println("FizzBuzz");// 3の倍数かつ5の倍数はFizzBuzzと表示する
			} else if (i % 5 == 0) {
				System.out.println("Buzz");// 5の倍数はBuzzと表示する
			} else if (i % 3 == 0) {
				System.out.println("Fizz");// 3の倍数はFizzと表示する
			} else {
				System.out.println(i);// 条件に当てはまらない場合は i を表示
			}

		}

	}

}
