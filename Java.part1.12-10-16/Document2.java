public class Document2 {
	static int sum = 0;
	//the roll of two dices
	public static void rolls (){
		int dice1 = 0;
		int dice2 = 0;
		while((dice1 != 1)||(dice2 != 1)){
			sum = sum + 1;
			dice1 = (int) (Math.random()*6+1);
			dice2 = (int) (Math.random()*6+1);
			System.out.println(dice1 + "," + dice2);
}
}
  public static void main(String []args) {
	Document2.rolls();
	System.out.println("Sum:" + sum);//prints the number of rolls needed in order to have two 1s
}
}