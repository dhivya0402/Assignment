public class In_class {
public static void main(String[] args) {
// Autoboxing
Integer intObj = 100;
Double doubleObj = 99.99;

// Unboxing
int intValue = intObj;
double doubleValue = doubleObj;

// Using methods
String intAsString = intObj.toString();
int parsedInt = Integer.parseInt("123");

System.out.println("Integer Object: " + intObj);
System.out.println("Integer Object: " + intValue);
System.out.println("Double Object: " + doubleObj);
System.out.println("Parsed Integer: " + parsedInt);
System.out.println("String Length: " + intAsString.length());
}
}