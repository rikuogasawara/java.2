public class Chapter07 {
	public static void main(String[] args) {
		// int型の変数「val」宣言。同時に「2 + 5」の結果を代入
		int val = 2 + 5;
		// 「val」を出力
		System.out.println(val);
		// 変数「val」をインクリメントする
		val++;
		// 「val」を出力
		System.out.println(val);
		// 変数「val」を「5」倍する
		val *= 5;
		// 「val」を出力
		System.out.println(val);

		// boolean型の変数「bool」を宣言。同時に「valは50と等しい」の結果を代入
		boolean bool = (val == 50);
		// 「bool」を出力
		System.out.println(bool);

		// 変数「bool」に「valは50未満」 且つ 「valを10で割った余りが0」の結果を代入
		bool = (val < 50) && (val % 10 == 0);
		// 「bool」を出力
		System.out.println(bool);
	}
}

public class Chapter08_2 {
	public static void main(String[] args) {
		String week = "Sunday"; // 例としてSundayで初期化。
		switch (week) {
		case "Sunday":
			System.out.println("日曜日です");
			break;
		case "Monday":
			System.out.println("月曜日です");
			break;
		case "Tuesday":
			System.out.println("火曜日です");
			break;
		case "Wednesday":
			System.out.println("水曜日です");
			break;
		case "Thursday":
			System.out.println("木曜日です");
			break;
		case "Friday":
			System.out.println("金曜日です");
			break;
		case "Saturday":
			System.out.println("土曜日です");
			break;
		default:
			System.out.println("曜日ではありません");
		}
	}
}