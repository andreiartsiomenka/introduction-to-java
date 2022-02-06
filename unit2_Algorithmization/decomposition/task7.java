package by.basic.algorithmization.decomposition;

/*
 * 7. Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.
 * 
 * */
public class task7 {
	public static void main(String[] args) {
        System.out.println(sumOfFactorials(9));
    }


    /*
     * Сумма факториалов всех нечетных чисел от 1 до n
     */
    static long sumOfFactorials(int n) {
        long result = 1;
        long factorial = 1;
        for (int i = 2; i <=n; i++) {
            factorial *= i;
            if ((i & 1) == 1) result += factorial;
        }
        return result;
    }
}
