package jo.co.internous.action;

public class Capsule {
	public static void main(String[] args){

		Person taro =new Person("山田太郎",20);
		System.out.println(taro.getName());
		System.out.println(taro.getAge());

		Person taro1 =new Person("山田太郎",30);
		taro1.setAge(30);
		System.out.println(taro1.getName());
		System.out.println(taro1.getAge());


	}
}
