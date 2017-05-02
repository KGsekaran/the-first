//We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling. We are in trouble if they are both smiling or if neither of them is 
//smiling. Return true if we are in trouble.
package easy;

public class MonkeyTrouble {

	public void monkeyInTrouble(boolean aSmile, boolean bSmile) {
		
		if(aSmile && bSmile) {
			System.out.println(true);
		} else if(!aSmile && !bSmile) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}
}
