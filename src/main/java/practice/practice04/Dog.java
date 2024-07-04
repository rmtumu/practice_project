package practice.practice04;

public class Dog extends Animal {
	//private で フィールド変数 furColor を宣言=================
	private String furColor;

	//コンストラクタ=================
	public Dog(String name, int age, String furColor) {
		super(name, age);
		this.furColor = furColor;
	}

	//furColor のゲッター、セッター=================
	public String getFurColor() {
		return furColor;
	}

	public void setFurColor(String furColor) {
		this.furColor = furColor;
	}

	//それぞれの詳細を出力するメソッド=================
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("毛の色：" + getFurColor());
	}

	//鳴き声を出力するメソッド=================
	public void cry() {
		System.out.println("鳴き声：" + "ワン");
	}
}
