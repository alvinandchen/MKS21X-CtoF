/*
both methods should take in
double parameters and return doubles.
*/
public class CtoFTester{
  public static void main(String[] args){
    System.out.println(celsiusToFahrenheit(33.0));
    System.out.println(fahrenheitToCelsius(33.0));
  }

  public static double celsiusToFahrenheit(double x){
    return (x * 9.0/5.0 + 32.0);
  }

  public static double fahrenheitToCelsius(double x){
    return ((x - 32.0) * 5.0/9.0);
  }

}
