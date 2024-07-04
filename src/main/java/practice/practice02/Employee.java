package practice.practice02;

public class Employee {
	//private で フィールド変数 name,age を宣言=================
	private String name;
	private int age;

	//コンストラクタ=================
	public Employee() {
		super();
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

}
