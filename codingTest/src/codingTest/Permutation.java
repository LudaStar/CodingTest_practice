package codingTest;

public class Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,3};
		int n = 3;
		int r = 2;
		int depth = 0;
		
		permutation(arr, depth, n, r);
	}
	
	static void permutation(int[] arr, int depth, int n, int r) {
	    if (depth == r) {
	        return;
	    }
	    for (int i=depth; i<n; i++) {
	        swap(arr, depth, i);
	        System.out.print("depth : " + depth+ " ");
	        System.out.print(" first swap ");
	        for(int j = 0; j < arr.length; j++) {
		    	System.out.print(arr[j]);
		    }
	        System.out.println();
	        
	        permutation(arr, depth + 1, n, r);
	        swap(arr, depth, i);
	        System.out.print("depth : " + depth + " ");
	        System.out.print(" second swap ");
	        for(int j = 0; j < arr.length; j++) {
		    	System.out.print(arr[j]);
		    }
	        System.out.println();
	    }
	}
	 
	static void swap(int[] arr, int depth, int i) {
	    int temp = arr[depth];
	    arr[depth] = arr[i];
	    arr[i] = temp;
	}

}
