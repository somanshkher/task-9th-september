package task2;

public class reversearray {

	public reversearray() {
	
 {
		{   
		    int[] my_array1 = {
		            1789, 2035, 1899, 1456, 2013, 
		            1458, 2458, 1254, 1472, 2365, 
		            1456, 2165, 1457, 2456};

		   for(int i = 0; i < my_array1.length / 2; i++)
		  {
		    int temp = my_array1[i];
		    my_array1[i] = my_array1[my_array1.length - i - 1];
		    my_array1[my_array1.length - i - 1] = temp;
		  }
		    
		 }
		}

	}

	public static void main(String[] args) {
	

	}

}
