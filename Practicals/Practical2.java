import java.util.Scanner;

 class Practical2 {
    public static void main(String[] args) {
        Practical2 practical2 = new Practical2();
        practical2.checkPrime();
    }

    public void checkPrime() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it's a prime: ");
        int number = scanner.nextInt();

        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
        
        scanner.close();
    }

    public boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
