package collection_framework;

public class jcf_array {

	public static void main(String[] args) {

		int[][] contents = { { 88, 66, 79 }, { 56, 25, 39 }, { 58, 47, 69 } };

		System.out.println("Loop Using Enhanced for loop:");
		for (int[] eachRow : contents) {
			for (int j : eachRow) {
				System.out.print(j + "\t");
			}
			System.out.println("");
		}

		// TODO Auto-generated method stub
		Object arr[] = { "joydeep", 21, };
		for (Object r : arr) {
			System.out.println(r);
		}

		Object events[][] = { { (1452), ("Italy") } };
		for (Object[] k : events) {
			for (Object j : k) {
				System.out.print(j + "\t");

			}
		}

	}
}
