package exceptions;

public class ArrayIndex {
	public static void main(String[] args) {
		int [] arr= {55,65,75,85};
		try {
			for(int i=0; i<5; i++) {
				System.out.println(arr[i]);
			}
		}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e.getMessage());
			}
		}
	}
	

