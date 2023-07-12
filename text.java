Human.java
public abstract class Human {
	public abstract void work();
}
Student.java
public class Student extends Human {
	@Override
	public void work() {
		System.out.println("勉強をします");
	}
}
Programmer.java
public class Programmer extends Human {
	@Override
	public void work() {
		System.out.println("プログラムを書きます");
	}

	public void study() {
		System.out.println("技術書を読みます");
	}
}
Driver.java
public class Driver extends Human {
	@Override
	public void work() {
		System.out.println("車を運転します");
	}
}
Teacher.java
public class Teacher extends Human {
	@Override
	public void work() {
		System.out.println("登壇をします");
	}
}
Doctor.java
public class Doctor extends Human {
	@Override
	public void work() {
		System.out.println("診察をします");
	}
}
Chapter16.java
package practice;

public class Chapter16 {

	public static void main(String[] args) {
		// 5つのサブクラスのインスタンスを生成
		Human[] humans = new Human[] {
				new Student(),
				new Programmer(),
				new Driver(),
				new Teacher(),
				new Doctor(),
			};

		for (Human h : humans) {
			// workメソッドを呼び出す
			h.work();
            // instanceof演算子でProgrammerかどうか判定
			if (h instanceof Programmer ) {
                // キャストしつつメソッドを呼び出す
				((Programmer)h).study();
			}
		}
	}
}