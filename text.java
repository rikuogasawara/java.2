package practice;

public class Chapter18_3 {

	public static void main(String[] args) {

		String zip = "\\d{3}-\\d{4}";// 郵便番号の正規表現
		String zip1 = "100-0001"; // 東京駅の郵便番号
		String zip2 = "1000-001"; // 誤った郵便番号
		System.out.println(zip1 + "=" + zip1.matches(zip));
		System.out.println(zip2 + "=" + zip2.matches(zip));

		String tel = "0[789]0-\\d{4}-\\d{4}"; // 携帯電話番号の正規表現
		String tel1 = "090-1111-2222"; // 正しいフォーマットの電話番号
		String tel2 = "090-111-12222"; // 誤ったフォーマットの電話番号
		String tel3 = "050-1111-2222"; // 誤った値の電話番号
		System.out.println(tel1 + "=" + tel1.matches(tel));
		System.out.println(tel2 + "=" + tel2.matches(tel));
		System.out.println(tel3 + "=" + tel3.matches(tel));

		String time = "([01]\\d|2[0123]):[0-5]\\d"; // 時刻（24時間表記）の正規表現
		String time1 = "23:59"; // 正しいフォーマットの時刻
		String time2 = "23-59"; // 誤ったフォーマットの電話番号
		String time3 = "24:00"; // 誤った値の電話番号
		System.out.println(time1 + "=" + time1.matches(time));
		System.out.println(time2 + "=" + time2.matches(time));
		System.out.println(time3 + "=" + time3.matches(time));

	}
}