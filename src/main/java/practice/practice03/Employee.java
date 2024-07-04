package practice.practice03;

public class Employee {
	//private で フィールド変数 name,age を宣言=================
	private String name;
	private int age;

	//コンストラクタ=================
	public Employee(String name, int age) {
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
	public void selfIntroduction() {
		System.out.println("氏名:" + getName());
		System.out.println("年齢:" + getAge());
	}

}
