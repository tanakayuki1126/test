package jo.co.internous.action;

public class Person {
	private String name = null;
	private int age = 0;

	public Person (String name,int age) {
		this.name=name;
		this.age=age;
	}

	public String getName() {
		return this.name;

	}

	public int getAge() {
		return this.age;
	}

	public void setName(String name) {
		this.name=name;
	}

	public void setAge(int age) {
		this.age=age;
	}

	public static void main(String[] args){

		Person taro =new Person("山田太郎",20);
		System.out.println(taro.getName());
		taro.setName("花子");
		System.out.println(taro.getName());

		Person taro1 =new Person("山田太郎",22);
		System.out.println(taro1.getName());
		System.out.println("セッターで年齢を変更前：" + taro1.getAge());
		taro1.setAge(30);
		System.out.println("セッターで年齢を変更後：" + taro1.getAge());
	}
}