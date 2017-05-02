//The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation. 
//We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
package easy;

public class SleepIn {
	public void doISleepIn(boolean weekday, boolean vacation) {
		if(weekday==false || vacation==true){
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}
}
