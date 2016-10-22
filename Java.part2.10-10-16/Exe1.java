public class Exe1 {
	public static void main(String [] args){
	    for(int i = 1; i < 10; i++){
			String tade = "";
	        for(int j = 1; j <= 9 - i; j++) {
	          tade = tade + "" + 0;
	        }

	        for (int l = 1; l <= i; l++) {
	          tade = tade + "" + i;
	        }
	        System.out.println(tade);
	      }
	}
}