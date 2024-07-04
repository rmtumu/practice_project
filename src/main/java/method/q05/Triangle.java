package method.q05;

public class Triangle {

	public static void main(String[] args) {
		//三角形の底辺 base と三角形の高さ height を宣言
		int base = 8;
		int height = 5;
		//引数を用いて三角形の面積を求め、結果を出力
		System.out.println(String.format("底辺：%d%n高さ：%d%n三角形の面積：%d", base, height, getTriangleArea(base, height)));
	}

	// 引数を用いて三角形の面積を求め、結果を返すメソッド
	public static int getTriangleArea(int base, int height) {
		return (base * height) / 2;
	}

}
