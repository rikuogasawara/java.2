@FunctionalInterface
interface Func1 {
	boolean isOdd(int x);
}

@FunctionalInterface
interface Func2 {
	String addNamePrefix(boolean male, String name);
}

public class Chapter8 {
	public static void main(String[] args) throws Exception {
		Func1 f1 = x -> x % 2 == 1;
		Func2 f2 = (male, name) -> {
			if (male) {
				return "Mr." + name;
			} else {
				return "Ms." + name;
			}
		};
		System.out.println(f1.isOdd(15));
		System.out.println(f2.addNamePrefix(true, "Smith"));
	}
}
}