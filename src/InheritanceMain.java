public class InheritanceMain {

  public static void main(String[] args) {
    // InheritanceObject inheritanceObject = new InheritanceObject();
    Calculations calculations = new Calculations();
    Calculations calculationswithParam = new Calculations(6, 7);
    ExtendsCalculations extendsCalculations = new ExtendsCalculations();
    System.out.println("Done");
  }
}
// {
//   // calculations
//   first = 0;
//   {
//     // Calculations()
//     this.first = 1;
//   }
//   {
//     // addition()
//     this.first = 2;
//   }
// }
