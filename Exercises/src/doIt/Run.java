package doIt;

import easy.MonkeyTrouble;

public class Run {

	public static void main(String[] args) {
		MonkeyTrouble monkeyTrouble = new MonkeyTrouble();
		monkeyTrouble.monkeyInTrouble(true, true);
		monkeyTrouble.monkeyInTrouble(false, false);
		monkeyTrouble.monkeyInTrouble(true, false);
	}
}
