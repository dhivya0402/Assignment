public class Main1 {
  int modelYear;
  String modelName;

  // Constructor with one parameter
  public Main1(String modelName) {
    // Call the two-parameter constructor to reuse code and set a default year    
    this(2020, modelName);
  }

  // Constructor with two parameters
  public Main1(int modelYear, String modelName) {
    // Use 'this' to assign values to the class variables
    this.modelYear = modelYear;
    this.modelName = modelName;
  }

  // Method to print car information
  public void printInfo() {
    System.out.println(modelYear + " " + modelName);
  }

  public static void main(String[] args) {
    // Create a car with only model name (uses default year)
    Main1 car1 = new Main1("Corvette");

    // Create a car with both model year and name
    Main1 car2 = new Main1(1969, "Mustang");

    car1.printInfo();
    car2.printInfo();
  }
}

