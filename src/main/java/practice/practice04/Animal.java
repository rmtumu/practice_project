package practice.practice04;

public class Animal {
	//private で フィールド変数 name,age を宣言=================
	private String name;
	private int age;

	//コンストラクタ=================
	public Animal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	//name のゲッター、セッター=================
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//age のゲッター、セッター=================
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	//それぞれの詳細を出力するメソッド=================
	public void showInfo() {
		System.out.println("名前:" + getName());
		System.out.println("年齢:" + getAge());
	}

}
