
public class Test {

	public static void main(String[]args){

	Person taro = new Person();

	taro.name="山田太郎";
	taro.age=20;
	taro.phoneNumber="?";
	taro.address="?";

	System.out.println(taro.name);
	System.out.println(taro.age);
	System.out.println(taro.phoneNumber);
	System.out.println(taro.address);

	taro.talk();
	taro.walk();
	taro.run();


	Person kimura = new Person();

	kimura.name="木村次郎";
	kimura.age=18;
	kimura.phoneNumber="?";
	kimura.address="?";

	System.out.println(kimura.name);
	System.out.println(kimura.age);
	System.out.println(kimura.phoneNumber);
	System.out.println(kimura.address);

	kimura.talk();
	kimura.walk();
	kimura.run();


	Person suzuki = new Person();

	suzuki.name="鈴木花子";
	suzuki.age=16;
	suzuki.phoneNumber="?";
	suzuki.address="?";

	System.out.println(suzuki.name);
	System.out.println(suzuki.age);
	System.out.println(suzuki.phoneNumber);
	System.out.println(suzuki.address);

	suzuki.talk();
	suzuki.walk();
	suzuki.run();


	Person tanaka = new Person();

	tanaka.name="田中佑来";
	tanaka.age=25;
	tanaka.phoneNumber="080-8392-0775";
	tanaka.address="y-rmm@docomo.ne.jp";

	System.out.println(tanaka.name);
	System.out.println(tanaka.age);
	System.out.println(tanaka.phoneNumber);
	System.out.println(tanaka.address);

	tanaka.talk();
	tanaka.walk();
	tanaka.run();


	Robot aibo =new Robot();

	aibo.name="aibo";
	aibo.talk();
	aibo.walk();
	aibo.run();

	Robot asimo =new Robot();

	asimo.name="asimo";
	asimo.talk();
	asimo.walk();
	asimo.run();

	Robot pepper =new Robot();

	pepper.name="pepper";
	pepper.talk();
	pepper.walk();
	pepper.run();

 }
}

