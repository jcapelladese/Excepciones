import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author iaw47941842
 *
 */
public class Principal {
	
	
	public static void  mehtodB(){
		try {
			methodA();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void  methodA() throws FileNotFoundException{
		File file = new File("algo.txt");
		BufferedReader stdin = new BufferedReader(new FileReader(file));
//		String dara = stdin.readLine();
	}
	
	public static double divide(double a, double b) {
		
		if ( b == 0 || a == 0) {
			throw new RuntimeException("no puede ser 0");
		} 
		double res = a/b;
		return res;
	}
	
	public static void main(String[] args) {
//		String n = null;
//		System.out.println(n);
		
		Scanner scan = new Scanner(System.in);
		
		double num = 0;
		double div = 0;
		boolean correcto = false;
		
		
		while (!correcto) {
			
//			try {
			System.out.println("Introduce un número: ");
			num = scan.nextDouble();
			System.out.println("Introduce un número: ");
			div = scan.nextDouble();
			divide(num, div);
//			double res = num/div;
//			System.out.println("resultado : " + res);
//			if (Double.isInfinite(res)) 
//				throw new MiExcepcion("infinito");			
//			}catch (Exception e) {
//				 System.out.println(e.getMessage());
//			}finally {
//				System.out.println("Siempre");
//			}
			correcto = true;
		}
		
	}

}
