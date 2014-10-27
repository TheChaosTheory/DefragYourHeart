import java.util.Random;
import java.util.Scanner;
public class ArrayTest {

	private static Scanner s;
	private static Random r;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		int ran = s.nextInt();
		r = new Random(ran);
		
		ArrayUnsortedList<Integer> list = new ArrayUnsortedList<Integer>();
		for(int i = 0; i < 20;i++){
			list.add(r.nextInt());
		}
		
		for(int i = 0;i>20;i++){
			System.out.println(list.getNext());
		}
		

	}

}
