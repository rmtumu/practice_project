package basic.q06;

public class ShowSeasons {

	public static void main(String[] args) {
		//月を意味する整数値が代入されている変数を宣言
		int month = 18;
		//月を意味する整数値が代入されている変数の値に応じて、季節を表示する
		switch (month) {
		case 1, 2, 12:
			System.out.println(month + "月は冬です。");
			break;
		case 3, 4, 5:
			System.out.println(month + "月は春です。");
			break;
		case 6, 7, 8:
			System.out.println(month + "月は夏です。");
			break;
		case 9, 10, 11:
			System.out.println(month + "月は秋です。");
			break;
		default:
			System.out.println(month + "月は存在しないです。");
		}

	}

}
