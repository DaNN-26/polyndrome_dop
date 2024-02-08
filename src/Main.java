import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число: ");
        int z = input.nextInt();
        char[] c = ("" + z).toCharArray();
        int[] digits = new int[c.length];
        for (int i = 0 ; i < digits.length ; i++)
            digits[i] = c[i] - '0';
        int [] digits2 = new int[digits.length];
        for(int i = 0; i < digits.length; i++)
            digits2[digits.length - 1 - i] = digits[i];
        int result = Arrays.compare(digits, digits2);
        if (result == 0)
            System.out.printf("Число %d является полиндромом.", + z);
        else
            System.out.printf("Ошибка! Число %d не является полиндромом.", + z);
    }
}