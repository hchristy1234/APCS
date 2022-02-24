import java.util.*;
public class StorylineProgress {
	private boolean doIt;
	private boolean covidSample;
	private boolean costcoPizza;
	private boolean agarBoba;
	private boolean gooseEgg;
	private boolean wrench;
	private boolean mixedCorrect;
	private boolean caught;
	private boolean secret;
	private boolean here;
	
	public StorylineProgress(boolean d, boolean cS, boolean cP, boolean aB, boolean gE, boolean w, boolean mC, boolean c, boolean s, boolean h) {
		doIt = d;
		covidSample = cS;
		costcoPizza = cP;
		agarBoba = aB;
		gooseEgg = gE;
		wrench = w;
		mixedCorrect = mC;
		caught = c;
		secret = s;
		here = h;
	}
	
	public void gotCOVIDSample(boolean cS) {
		covidSample = cS;
	}
	
	public void gotPizzaSlice(boolean cP) {
		costcoPizza = cP;
	}
	
	public void gotBoba(boolean aB) {
		agarBoba = aB;
	}
	
	public void gotEgg(boolean gE) {
		gooseEgg = gE;
	}
	
	public void gotWrench(boolean w) {
		wrench = w;
	}
	
	public void caught(boolean c) {
		caught = c;
	}
	
	public void dontDo() {
		doIt = false;
	}
	
	public void newLocation() {
		here = true;
	}
	
	public void noLongerHere() {
		here = false;
	}
	
	public boolean isHere() {
		return here;
	}
	
	public void hospitalDone(Scanner console, StorylineProgress save, Player player) {
		System.out.println("Yes! Maybe school is somehow worth something. Ew, that came out of my mouth wrong.");
		console.nextLine();
		System.out.println("You: Wow, who knew a doctor would keep the sample in a safe like this. (Got COVID-19 sample!)");
		Item covid = new Item("COVID sample");
		player.addItem(covid);
		console.nextLine();
		System.out.println("You: And a car key. Maybe I'll take it to because the plot told me so. (Got car key!)");
		Item key = new Item("Key");
		player.addItem(key);
		save.noLongerHere();
		save.gotCOVIDSample(true);
		console.nextLine();
	}
	
	public void pacificCommonsDone(Scanner console, StorylineProgress save, Player player) {
		System.out.println("");
	}
	
	public void lakeElizabethDone(Scanner console, StorylineProgress save, Player player) {
		
	}
	
	public void msjhsDone(Scanner console, StorylineProgress save, Player player) {
		
	}
	
	public void endings(Scanner console) {
		if ((!mixedCorrect || !costcoPizza || !agarBoba || !gooseEgg || !wrench) && doIt && !caught) {
		System.out.println("Your virus has been released but too many people are getting sick and the death counts are rising.");
		console.nextLine();
		System.out.println("The world is nearly ending. Oh well at least you can try again, right? Not like it would be happening in real life");
		System.out.println("Plague Inc. in real life ending");
		} else if (caught) {
			System.out.println("Your foolishness has made the police catch you in your act. smh smh git gud.");
			System.out.println("Caught ending");
		} else if (!doIt) {
			System.out.println("Nah, I shouldn�t be doing this. I�m a total tryhard and online school would just swamp us in homework instead.");
			console.nextLine();
			System.out.println("Your goody two shoes self decided it would be best to not try to go back to online school much to your dismay.");
			console.nextLine();
			System.out.println("Seriously, how much of a good guy do you have to be to do that? Unless you're the impossible type that likes school or a teacher.");
			System.out.println("Good guy ending!");
		} else if (secret) {
			System.out.println("You broke the game. Oh wow.");
			console.nextLine();
			System.out.println("Uhhhh. Hi. I'm the writer of this.");
			console.nextLine();
			System.out.println("I hope you're enjoying this so far. Maybe. I don't know.");
			console.nextLine();
			System.out.println("Well yeah, lemme see. Since you broke the game and all.");
			console.nextLine();
			System.out.println("Oh! Uhhh, you wake up in front of your computer.");
			console.nextLine();
			System.out.println("The game Plague Inc was running on it, turns out your 'Coronavirus' disease has failed to eradicate the world.");
			console.nextLine();
			System.out.println("Well, the date's May 26, 2012. You still got school going on. You kinda wish there was a way to get out of school but you do have more memories of outside than inside.");
			System.out.println("Dream ending");
		} else if (mixedCorrect && costcoPizza && agarBoba && gooseEgg && wrench) {
			System.out.println("Here we go!");
			console.nextLine();
			System.out.println("Few days later.");
			console.nextLine();
			System.out.println("The days gone by and more cases are rising.");
			console.nextLine();
			System.out.println("But due to your big-brained nature, you managed to create a more harmless variant of COVID-19.");
			console.nextLine();
			System.out.println("School is now closed and you returned back to online learning.");
			console.nextLine();
			System.out.println("Successful ending!");
		}
	}
}
