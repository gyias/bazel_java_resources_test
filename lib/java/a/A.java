package a;

class A {
  public static void main(String[] args) {
    try {
      while (true) {
        System.err.println("Message: " + getMessage());
        Thread.sleep(1000);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  private static String getMessage() {
    return "BEFORE HOTSWAP";
  }
}
