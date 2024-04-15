import java.util.Scanner;

class FoodCost {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt(); 
        int Y = scanner.nextInt(); 

        
        int totalCost = X * 6 + Y;

        System.out.println(totalCost);
    }
}
