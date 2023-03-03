import java.util.Scanner; 
 
public class prilo1 { 
 public static void main(String[] args) { 
 Scanner in = new Scanner(System.in); 
 System.out.print("Введите N: "); 
 int n = in.nextInt(); 
 System.out.print("Введите X: "); 
 int x = in.nextInt(); 
 System.out.println("Результат: "+calc_sum(n, x)); 
 in.close(); 
 } 
 
 static double calc_sum(int n, int x) { 
 double sum = 0; 
 for (int nn = 0; nn <= n; nn++) { 
 sum += 1/((2 * nn + 1) * Math.pow(x, 2*nn + 1)); 
 } 
 return sum; 
 } 
}