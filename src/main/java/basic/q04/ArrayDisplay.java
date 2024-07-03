package basic.q04;

public class ArrayDisplay {

	public static void main(String[] args) {
		//配列を定義
		String[] fruits = {"りんご","ばなな","みかん","ぶどう","すいか"};
		
		//拡張 for文を使用して要素の値を順番に全て表示する
		for(String fruit : fruits) {
			System.out.println(fruit);
		}

	}

}
