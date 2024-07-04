package practice.practice04;

public class Sparrow extends Animal {
	//private で フィールド変数 canFly を宣言=================
	private boolean canFly;

	//コンストラクタ=================
	public Sparrow(String name, int age, boolean canFly) {
		super(name, age);
		this.canFly = canFly;
	}

	//飛行能力を判定するメソッド
	public boolean isCanFly() {
		return canFly;
	}

	//canFly のセッター=================
	public void setCanFly(boolean canFly) {
		this.canFly = canFly;
	}

	//それぞれの詳細を出力するメソッド=================
	@Override
	public void showInfo() {
		super.showInfo();
		if (isCanFly()) {
			System.out.println("飛べます");
		}else {
			System.out.println("飛べません");
		}

	}

	//鳴き声を出力するメソッド=================
	public void cry() {
		System.out.println("鳴き声：" + "チュンチュン");
	}

}
