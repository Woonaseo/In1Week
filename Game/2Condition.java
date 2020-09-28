class Main {
  public static void main(String[] args) {
    int hour, min, sec;

    hour = 13;
    min = 30;
    sec = 25;

    String ampm;
    ampm = (hour >= 12) ? "PM":"AM";
    hour = (hour >= 12) ? (hour-12):hour;

        // 조건식 ? True : False          조건 연산자


    System.out.println(ampm + " "+hour+":"+min+":"+sec);
  }
}
