public class Calculations extends Object {
  int _first = 0;
  int _second = 0;

  // Constructor
  Calculations() {
    System.out.println("Calculations - construntor");
  }

  Calculations(int first, int second) {
    this._first = first;
    this._second = second;
    System.out.println("Calculations - construntor with param");
  }

  //  Public Method addition
  public int addition(int first, int second) {
    int result = first + second;
    return result;
  }

  // Multiplication
  public int multiplication() {
    int result = this._first * this._second;
    return result;
  }

  //    public Method subtraction
  public int subtraction(int first, int second) {
    int result = first - second;
    return result;
  }
}
