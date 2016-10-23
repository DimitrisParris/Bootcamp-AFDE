import java.util.Arrays;
public class Array {
	public static void main (String [] args){
	 int [] array ={1,2,3,4,5,6,7,8,9,10};
	 shift(array);
	}
	public static void shift(int [] array){
		int [] pin = new int [10];
		for (int i=0; i<10; i++){
			for (int l=1; l<10; l++){
				int t = array[9];
				pin[l]=array[l-1];
				pin[0]=t;
			}
			for (int j=0; j<10; j++){
				array[j]=pin[j];
			}
		System.out.println(Arrays.toString(array));
		}
	}

	
	}
	
	


