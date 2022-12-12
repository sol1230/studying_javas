public class ExtendsCalculations extends Calculations {

  ExtendsCalculations() {
    System.out.println("ExtendsCalculations - construntor");
  }

  // multiply
  public int multiplication(int first, int second) {
    int result = first * second;
    return result;
  }

  //    public Method subtraction   상속을 해주는 것과 받는 것은 이름, 갯수, 종류가 똑같아야 함
  public int subtraction(int first, int second) {
    int result = second - first;
    return result;
  }
}
