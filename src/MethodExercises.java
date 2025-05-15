public class MethodExercises {

    public static void main(String[] args) {
        sayHello("Gvantsa");// ამოცანა 1

        int mySum= sum(10,20);// ამოცანა 2
        System.out.println("SUM " + mySum);// ამოცანა 2

        boolean even = isEven(10);// ამოცანა 3
        System.out.println("Is the number even? " + even);// ამოცანა 3

        int myInt = convertToInteger(10.45);// ამოცანა 4
        System.out.println("INTEGER: " + myInt); // ამოცანა 4

        int max = findMax(10, 20);// ამოცანა 5
        System.out.println("MAX : " + max);// ამოცანა 5

        int length = getStringLength("Gvantsa"); // ამოცანა 6
        System.out.println("Length : " + length); // ამოცანა 6

        int myProduct1 = multiply(10, 20);// ამოცანა 7
        System.out.println(myProduct1);// ამოცანა 7
        int myProduct2 = multiply(10,20,30);// ამოცანა 7
        System.out.println(myProduct2);// ამოცანა 7



    }




// ამოცანა N 1
    public static void sayHello(String name) {
        System.out.println("Hello " + name);
    }

//  ამოცანა N 2
    public static int sum(int a, int b) {
        return a + b;
    }

//  ამოცანა N 3
    public static boolean isEven(int number) {
          return number % 2 == 0;
    }

//  ამოცანა N 4
    public static int convertToInteger(double number) {
         return (int) number;
    }


//  ამოცანა N 5
    public static int findMax(int a, int b) {
    if (a > b) {
        return a;
    } else {
        return b;
    }
}

//ამოცანა N 6
   public static int getStringLength(String text) {
        return text.length();
   }

//ამოცანა N 7
  public static int multiply(int a, int b){
        return  a * b;
  }
  public static int multiply(int a, int b, int c){
        return a * b * c;
  }





}














