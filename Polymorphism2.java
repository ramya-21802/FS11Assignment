//Polymorphism 
// 2)Create a Java class MathOperations with overloaded methods for addition (add) that can accept two integers, three doubles, and two strings, respectively. Demonstrate the usage of these methods in the main method by adding two integers, three doubles, and concatenating two strings.

public class MathOperations{

    public int add(int x, int y) {
        return x + y;
    }
    
    public double add(double x, double y, double z){
        return x + y + z;
    }
    
    public String add(String x, String y){
        return x + y;
    }

    public static void main(String[] args){
        MathOperations opr = new MathOperations();
        int int_Sum = opr.add(12, 34);
        System.out.println("Sum of two integers: " + int_Sum);
        double double_Sum = opr.add(78.90, 45.89, 34.073);
        System.out.println("Sum of three doubles: " + double_Sum);
        String string_Concatenation = opr.add("Nice", " to meet you");
        System.out.println("Concatenation of two strings: " + string_Concatenation);
    }
}
