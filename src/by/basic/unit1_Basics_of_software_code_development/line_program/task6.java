package by.basic.line_program;

import java.util.Scanner;

/*
 * 6. Для данной области составить линейную программу, которая печатает true,
 *  если точка с координатами (х, у) принадлежит закрашенной области, и false — в противном случае:
*/
public class task6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// �������� ������
		System.out.println("x >> ");
		int x = scanner.nextInt();

		System.out.println("y >> ");
		int y = scanner.nextInt();
		
		if ((y >= 0 && y <= 4 && x >= -2 && x <= 2) 
				|| (y >= -3 && y <= 0 && x >= -4 && x <= 4)){
            System.out.println("True: ");
        }
        else{
            System.out.println("False: ");
            
		System.out.printf("x= %d y=%d ", x, y);
		
		

	}

}
}
