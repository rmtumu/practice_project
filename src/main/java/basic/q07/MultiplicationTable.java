package basic.q07;

public class MultiplicationTable {

	public static void main(String[] args) {
		// 二重ループを使用し九九を表示する
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				//printf()メソッド と %3d で最低3桁分の幅で列を揃えて出力
				System.out.printf("%3d", i * j);
			}
			//改行
			System.out.println();
		}

	}

}
