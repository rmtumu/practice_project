package practice.practice04;

public class AnimalTest {

	public static void main(String[] args) {
		//インスタンス生成
		Dog dog = new Dog("ポチ", 2, "白");

		//それぞれの詳細と鳴き声を出力
		dog.showInfo();
		dog.cry();

		System.out.println("----------------------");

		//インスタンス生成
		Sparrow sparrow = new Sparrow("チュン", 1, true);

		//それぞれの詳細と鳴き声を出力
		sparrow.showInfo();
		sparrow.cry();

	}

}
