Collections.sort(
    animals,
    new Comparator<String>() {
      @Override
      public int compare(String x, String y) {
        // 数値が小さい順に並べる
        return x.compareTo(y);
      }
    });
    
    for (int i = 0; i < 10; i++) {
  Thread t = new Thread(new Runnable() {
    @Override
    public void run() {
      System.out.println("無名クラスのテスト");
    }
  });
  t.start();
}