package co.incubyte;

public class Number {

  private int value;
  private DbLogger dbLogger;
  public Number(int value, DbLogger dbLogger) {
    this.value = value;
    this.dbLogger = dbLogger;
  }

  public String convertToFizzBuzz() {
    if (value % 3 == 0 && value % 5 == 0) {
      dbLogger.logFizzBuzz();
      return "FizzBuzz";
    } else if (value % 3 == 0) {
      dbLogger.logFizz();
      return "Fizz";
    } else if (value % 5 == 0) {
      dbLogger.logBuzz();
      return "Buzz";
    }
    dbLogger.logNumber();
    return String.valueOf(value);
  }

  public static void main(String[] args) {
    Number number = new Number(5, new DbLogger());
    System.out.println(number.convertToFizzBuzz());
  }

}
