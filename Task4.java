public class Task4 {
    public static void main(String[] args) {
        int i = 1;
        int j = 1;
        int range = 10;

        while (i <= range) {
            while (j <= range) {
                int result = i * j;
                System.out.print(result + "\t");
                j++;
            }
            System.out.print("\n");
            j = 1;
            i++;
        }
    }
}