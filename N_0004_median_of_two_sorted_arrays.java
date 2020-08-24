import java.util.Arrays;

public class N_0004_median_of_two_sorted_arrays {
	public static void main(String[] args) {
		int[] a = {5,7,9,11,13,15};
		int[] b = {4,6,10,12};
		
		int alength = a.length;
		int blength = b.length;
		int k =0;
		
		int[] ab = new int[a.length+b.length];
		System.arraycopy(a, 0, ab, 0, alength);
		System.arraycopy(b, 0, ab, alength, blength);
		
		Arrays.sort(ab);
		
		if(ab.length %2 == 0) {
			System.out.println((ab[ab.length/2-1]+ab[ab.length/2])/2.0);
		}else {
			System.out.println(ab[ab.length/2]);
		}
		for(int j =0;j <ab.length;j++) {
			System.out.print(ab[j]);
			System.out.print(",");
		}
	}
}	
