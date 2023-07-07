CapsuleTask.java
package practice;

public class CapsuleTask {
	private String content;
	private int date;
	private String status;

	public CapsuleTask(String content, int date) {
		this.content = content;
		this.date = date;
		this.status = "未完了";
	}

	public String getContent() {
		return content;
	}

	public int getDate() {
		return date;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
Chapter14.java
package practice;

public class Chapter14 {
	public static void main(String[] args) {
		CapsuleTask task = new CapsuleTask("牛乳を買う", 20211021);
		System.out.println("タスク内容は" + task.getContent() + "です。");
		System.out.println("期限は" + task.getDate() + "です。");
		System.out.println("状態は" + task.getStatus() + "です");
		task.setStatus("完了");
		System.out.println("状態は" + task.getStatus() + "になりました。");
	}
}