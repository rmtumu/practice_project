package practice.practice02;

public class EmployeeTest {

	public static void main(String[] args) {
		//インスタンス生成
		Employee employee = new Employee();

		//フィールド変数 name,age に値をセット
		employee.setName("山田");
		employee.setAge(20);

		//ゲッターでそれぞれの値を出力
		System.out.println("氏名:" + employee.getName());
		System.out.println("年齢:" + employee.getAge());

	}

}
