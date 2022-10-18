public class Task3 {
    public static void main(String[] args) {
        int initialNumber = 0;
        System.out.println(initialNumber);
        int secondNumber = 1;
        System.out.println(secondNumber);
        int count = 0;
        int numberOfFib = 10;

        while (count < numberOfFib - 1) {
            int followingNumber = initialNumber + secondNumber;
            initialNumber = secondNumber;
            secondNumber = followingNumber;
            count++;
            System.out.println(followingNumber);
        }
    }
}