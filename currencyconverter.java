import java. util.Scanner;
public class currencyconverter {

    public static void main(String[] args) {
        System.out.println("press 1 for Ruppe");
        System.out.println("press 2 for Dollar");
        System.out.println("press 3 for Euro");
        Scanner sc = new Scanner(System.in);
        System. out.println("Choose the currency for convert");
        int choice = sc.nextInt();
        System.out.println("Enter the amount");
        double amount = sc.nextDouble();
        switch (choice) {
            case 1:
                Ruppe_to_other(amount);
                break;
            case 2:
                Dollar_to_other(amount);
                break;
            case 3:
                Euro_to_other(amount);
                break;
            default:
                System.out.println("Invalid choice");
        }

    }

public static void Ruppe_to_other(double amt) {
    System.out.println("1 Ruppe = " + 0.013 + " Dollar");
    System.out.println();

    System.out.println(amt+" Ruppe = " + (amt*0.013) + " Dollar");
    System.out.println();

    System.out.println("1 Ruppe = " + 0.012 + " Euro");
    System.out.println();
    System.out.println(amt+" Ruppe = " + (amt*0.012) + " Euro");
    System.out.println();

}
    

public static void Dollar_to_other(double amt) {
    System.out.println("1 Dollar = " + 79.37 + " Ruppe");
    System.out.println();
    System.out.println(amt+" Dollar = " + (amt*79.37) + " Ruppe");
    System.out.println();

    System.out.println("1 Dollar= " + 0.98 + " Euro");
    System.out.println();

    System.out.println(amt+" Dollar = " + (amt*0.98) + " Euro");
}

    

public static void Euro_to_other(double amt){
    System.out.println("1 Euro = " + 80.85 + " Ruppe");
    System.out.println();
    System.out.println(amt+" Euro = " + (amt*80.85) + " Ruppe");
    System.out.println();

    System.out.println("1 Euro = " + 1.02 + " Dollar");
    System.out.println();

    System.out.println(amt+" Euro = " + (amt*1.02) + " Dollar");
}
}