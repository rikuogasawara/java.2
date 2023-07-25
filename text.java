
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class Chapter3 {
	public static void main(String[] args) throws Exception {
		// 当日のインスタンスからwithDayOfMonthでその月の1日のインスタンスを得る
		LocalDate d = LocalDate.now().withDayOfMonth(1);

		// lengthOfMonthでその月の最後の日が取得できる
		final int lastDay = d.lengthOfMonth();
		for (int i = 1; i <= lastDay; i++) {
			// 曜日を取得
			DayOfWeek w = d.getDayOfWeek();
			// 曜日の文字列表現を取得
			String wstr = w.getDisplayName(TextStyle.SHORT, Locale.getDefault());
			System.out.print(d.getDayOfMonth() + "(" + wstr + ") ");
			// 土曜日かどうかを判定
			if (w == DayOfWeek.SATURDAY) {
				System.out.println();
			}

			d = d.plusDays(1);
		}
	}
}
