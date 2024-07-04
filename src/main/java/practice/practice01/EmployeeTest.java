package practice.practice01;

public class EmployeeTest {

	public static void main(String[] args) {
		//インスタンス生成
		Employee e1 = new Employee();

		//フィールド変数 name,age に氏名と年齢を代入
		e1.name = "山田";
		e1.age = 20;

		//インスタンス生成
		Employee e2 = new Employee();

		//フィールド変数 name,age に氏名と年齢を代入
		e2.name = "鈴木";
		e2.age = 30;

		//それぞれの詳細を出力
		e1.showInfo();
		System.out.println("------------");
		e2.showInfo();

	}

}
