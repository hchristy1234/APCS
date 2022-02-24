import java.io.IOException;
import java.util.*;
public class COVIDGAME {
	public static void main(String[] args) throws IOException {
		boolean gamestate = true;
		ArrayList<Item> inventory = new ArrayList<Item>();
		Player player = new Player(inventory);
		StorylineProgress save = new StorylineProgress(true, false, false, false, false, false, false, false, false, true);
		Scanner console = new Scanner(System.in);
		System.out.println("You are a student who got sick of online classes (Press Enter to continue for any lines)");
		console.nextLine();
		System.out.println("Ughhh, school is so boring. If only I can go back online so I can procrastinate on my schoolwork.");
		console.nextLine();
		System.out.println("Wait, I got it! There�s the new COVID variant going around! I should make it!");
		console.nextLine();
		System.out.println("Problem is, I need to make sure my tracks are covered. I hope the hospital allows me in.");
		gamestate = washingtonHospital(console, save, player);
		if (gamestate == true) {
			pacificCommons(console, save, player);
			lakeElizabeth();
			msjhs(console, save, player); 
		} else {
			save.dontDo();
			save.endings(console);
		}
	}
	
	public static boolean washingtonHospital(Scanner console, StorylineProgress save, Player player) throws IOException {
		String choice;
		Checks hospital = new Checks(false, false, false);
		System.out.println("I�m here. There should be some COVID samples here. But� should I even do it?");
		console.nextLine();
		System.out.println("(Y) Yes I should do it! \n(N) No I shouldn't...");
		choice = console.nextLine();
		if (choice.equals("N")) {
			return false;
		} else if (choice.equals("Y")) {
			System.out.println("Of course I should! In-person learning sucks! I should get going.");
		} else {
			System.out.println("Nothing? Whatever. I'll do it myself anyways");
		}
		
		while (save.isHere()) {
			if (hospital.getMapCheck() && hospital.getClipCheck() && hospital.getSecretaryCheck()) {
				System.out.println("Looks like I found my way. I'll go now.");
				console.nextLine();
				save.noLongerHere();
			} else {
				System.out.print("A. Check in with the secretary \nB. Check the clipboard \nC. Check the map");
				System.out.println();
				choice = console.nextLine();
				if (choice.equals("A")) {
					System.out.println("Secretary: Hello, how can I help you? \nYou: I just wanted to go in, can I?");
					console.nextLine();
					System.out.println("Secretary: Sorry, only visitors are allowed. \nYou: Oh.");
					System.out.println("A. Announce you're visiting someone. \nB. Leave.");
					choice = console.nextLine();
					if (choice.equals("A")) {
						System.out.println("You: Ah yes, I'm here to visit someone.");
						console.nextLine();
						System.out.println("Secretary: Who're you visiting?");
						if (hospital.getClipCheck()) {
							System.out.println("You: Michael Liu");
							console.nextLine();
							System.out.println("Secretary: Alright, just go to the third floor and find room 101. Have a nice day.");
							console.nextLine();
							System.out.println("You: Too easy!");
							console.nextLine();
							hospital.secretaryChecked(true);
							if (!hospital.getMapCheck()) {
								System.out.println("Now I just need to know where to go.");
							}
						} else {
							System.out.println("You: Uhhhh, Chuck Norris?");
							System.out.println("Secretary: And I'm Bob Ross. Now who're you visiting?");
							System.out.println("You: Nothing. I'll remember the name.");
						}
					} else {
						System.out.println("You: Nothing. I'll just leave.");
					}
				} else if (choice.equals("B")) {
					System.out.println("You pick up the clipboard. There's a list of patients on there.");
					console.nextLine();
					System.out.println("You: Wow. All these names. Daniel Sujef. Christina Chang. Oh, wait. Maybe Michael Liu will get me in!");
					hospital.clipChecked(true);
				} else if (choice.equals("C")) {
					System.out.println("You: Doctor's office. There it is. Least I know where to go now.");
					console.nextLine();
					hospital.mapChecked(true);
				}
			}
		}
		
		System.out.println("Looks like I'm at the office. Now, where would that COVID sample be?");
		console.nextLine();
		System.out.println("Well, definitely not in the safe box.");
		save.newLocation();   
		ImgShow img = new ImgShow();
		
		img.showShelf();
		while (save.isHere()) {
			System.out.print("1. Check the bottle of pills.\n2. Check the mask box\n3. Check the hand sanitizer\n");
			System.out.print("4. Check the teddy bear\n5. Check the graduate cylinder\n6. Check the Ointment\n");
			System.out.println("7. Check the mug\n8. Check the paper bag\n9. Crack the safe.");
			int observe = console.nextInt();
			if (observe == 1) {
				System.out.println("3 miligrams of dosage per day. OH WHAT IS THAT SMELL?!");
				img.showPills();
			} else if (observe == 2) {
				System.out.println("Wow, only two masks? And I thought the shortages were over.");
				img.showMaskBox();
			} else if (observe == 3) {
				System.out.println("Don�t need it. I�m not touching much.");
				img.showHandSanitizer();
			} else if (observe == 4) {
				System.out.println("Wow. Wonder why a doctor still needs this.");
				img.showTeddyBear();
			} else if (observe == 5) {
				System.out.println("This doctor�s weird. Only 5 mLs.");
				img.showGraduateCylinder();
			} else if (observe == 6) {
				System.out.println("Take 9 times a day. Who does that? Unless�");
				img.showOintment();
			} else if (observe == 7) {
				System.out.println("#1 boss. How egotistical.");
				img.showMug();
			} else if (observe == 8) {
				System.out.println("Pickup prescription: 1. Bottle, 2. Ointment, 3. Graduate. Weirdest list ever.");
				img.showPaperBag();
			} else if (observe == 9) {
				System.out.println("Huh, a lotta geometric stickers. I'll take a crack at it.");
				img.showSafe();
				console.nextLine();
				System.out.println("Type in the shape's name to proceed (case sensitive, in format of shape, shape, shape)");
				String crack = console.nextLine();
				if (hospital.checkCombo(crack)) {
					save.hospitalDone(console, save, player);
				} else {
					System.out.println("Not the right combination I guess.");
				}
			}
		}
		return true;
	}
	
	public static void pacificCommons(Scanner console, StorylineProgress save, Player player) {
		System.out.println("You went out of the hospital, no one noticing you secretly took a sample of COVID-19.");
		console.nextLine();
		System.out.println("You: Man, I'm pretty hungry right now. Hopefully I can get something to eat.");
		console.nextLine();
		System.out.println("You check your pocket for your wallet.");
		console.nextLine();
		System.out.println("You: Dang it! No money. And I can't go back. Even though I did just teleport here for some reason.");
		console.nextLine();
		System.out.println("You look to find some cars in front of you.");
		console.nextLine();
		System.out.println("You: Maybe these cars have some money in them.");
		console.nextLine();
		System.out.println("You: I better hurry though before someone catches me.");
		long startTime = System.currentTimeMillis();
		long limit = 10 * 60 * 1000;
		while (System.currentTimeMillis() < (limit + startTime)) {
			System.out.println("Choose the car you observe. (1, 2, or 3)");
			int observe = console.nextInt();
			if (observe == 1) {
				System.out.println("You: Huh, a teddy bear. Maybe this could be a doctor's car? Wait. Why... nevermind.");
				console.nextLine();
				System.out.println("You insert the key.");
				console.nextLine();
				System.out.println("You: Wow, what a lucky break.");
				console.nextLine();
				System.out.println("You: Didn't know the doctor was here. I'll take the money hopefully.");
				console.nextLine();
			} else if (observe == 2) {
				System.out.println("You: I wonder if...");
				console.nextLine();
				System.out.println("Ms. Qui: Hey! What are you doing?!");
				console.nextLine();
				System.out.println("You: Uhhh... it's not what it looks like!");
				console.nextLine();
				System.out.println("Ms. Qui: Police! Police!");
				console.nextLine();
				System.out.println("You: Uh oh.");
				limit = 3 * 60 * 1000;
			} else if (observe == 3) {
				System.out.println("You: I wonder why it's black and white.");
				console.nextLine();
				System.out.println("Police officer: Hey! What are you doing?!");
				console.nextLine();
				System.out.println("You: Oh! Uhh....");
				console.nextLine();
				System.out.println("Police officer: Get in! You're coming with me thief!");
				limit = 0;
				save.caught(true);
				save.endings(console);
			}
		}
	}
	
	public static void lakeElizabeth() {
		
	}
	
	public static void msjhs(Scanner console, StorylineProgress save, Player player) {
		save.newLocation();
		int inventory;
		int choice;
		int k = 0;
		boolean here = false;
		boolean mixed = false;
		Item book = new Item("Book");
		Item calculator = new Item("Calculator");
		Item key = new Item("Key");
		Item wrench = new Item("Wrench");
		Checks msjhs = new Checks(true, false, false, false, false);
		
		System.out.println("You: Wow, that was terrible. At least I got the things.");
		console.nextLine();
		System.out.println("You: I just need to go to a chemistry lab, mix the thing and spray it all over school.");
		console.nextLine();
		System.out.println("You: Looks like we're going to Mr. Florence's class");
		console.nextLine();
		System.out.println("You: Hey Mr. Florence!");
		console.nextLine();
		System.out.println("Florence: Hey there! You looking for something?");
		console.nextLine();
		System.out.println("You: Yeah, I need to um... use the chemistry set.");
		console.nextLine();
		System.out.println("Florence: I'm sorry. I can't allow that. The chemistry set is needed later on.");
		console.nextLine();
		System.out.println("You: Oh! No worries! (thinking) Well that's the worst lie i've ever heard. I'm gonna need to distract him.");
		
		while (save.isHere()) {
			
			for (int i = 0; i < player.getInventory().size(); i++) {
				if (player.getItem(i).equals(book)) {
					k++;
				} else if (player.getItem(i).equals(calculator)) {
					k++;
				}
				
				if (k == 2) {
					msjhs.textbookACalcFound(true);
				}
			}
			
			System.out.print("1. Talk to the teacher\n2. Go to the lab table\n3. Check the rats.\n4. Look into the toolbox\n");
			System.out.println("5. Go to the incubator.\n6. Check the tables.\n7. Check the desks.");
			choice = console.nextInt();
			console.nextLine();
			
			//Talking with the teacher
			if (choice == 1) {
				if (msjhs.teacherHere()) {
					System.out.println("You: Hey, Mr. Florence?");
					System.out.println("Mr. Florence: Yes?");
					if (msjhs.getTextbookACalc() && msjhs.getRats()) {
						System.out.println("1. Just wanted to chat.\n2. What's the chemistry set for?\n3. Someone's cheating in your class.\n4. Release the rat near the doorway.");
					} else if (msjhs.getRats()) {
						System.out.println("1. Just wanted to chat.\n2. What's the chemistry set for?\n3. Release the rat near the doorway.");
					} else if (msjhs.getTextbookACalc()){
						System.out.println("1. Just wanted to chat.\n2. What's the chemistry set for?\n3. Someone's cheating in your class.");
					} else {
						System.out.println("1. Just wanted to chat.\n2. What's the chemistry set for?");
					}
					choice = console.nextInt();
					if (choice == 1) {
						System.out.println("Mr. Florence: Sorry, I have a lot of things to prepare for, maybe later.");
					} else if (choice == 2) {
						System.out.println("Mr. Florence: It's for an important person. Sorry I don't have much time to talk for.");
					} else if (choice == 3 && msjhs.getTextbookACalc()) {
						System.out.println("You: Uh, Mr. Florence, I found some textbooks with post-it notes and a calculator on the desks.");
						console.nextLine();
						System.out.println("Mr. Florence: What? That can't be...");
						console.nextLine();
						System.out.println("You show him the texbook and calculator");
						System.out.println("Oh that! I'll take care of this, I'll be confiscating these.");
						console.nextLine();
						System.out.println("You (thinking): Wait, this could be my chance to get him out!");
						if (msjhs.getRats()) {
							System.out.println("1. Tell him the culprit is outside\n2. Stay silent\n3. Release the rats");
						} else {
							System.out.println("1. Tell him the culprit is outside\n2. Stay silent");
						}
						choice = console.nextInt();
						if (choice == 1) {
							System.out.println("You: Hey, I think I just saw them pass by here!");
							console.nextLine();
							System.out.println("Mr. Florence: Oh, there he is! Hey! You!");
							System.out.println("You decided to close the door and lock it from inside.");
							msjhs.teacherLeft();
						} else if (choice == 2) {
							System.out.println("Mr. Florence: Alright, thank you. I shall be returning to my work.");
							msjhs.textbookACalcFound(false);
							for (int i = 0; i < player.getInventory().size(); i++) {
								if (player.getItem(i).equals(book)) {
									player.useItem(i);
								} else if (player.getItem(i).equals(calculator)) {
									player.useItem(i);
								}
							}
						} else if (choice == 3 && msjhs.getRats()) {
							System.out.println("You released the rat from your hands.");
							console.nextLine();
							System.out.println("Mr. Florence: Oh! Where did that come from? Hey! Get back here!");
							console.nextLine();
							System.out.println("You: I salute you.");
							msjhs.teacherLeft();
						}
					} else if (choice == 3 && msjhs.getRats()) {
						System.out.println("You released the rat from your hands.");
						console.nextLine();
						System.out.println("Mr. Florence: No! I need the rats!");
						console.nextLine();
						System.out.println("You: Well that was easy.");
						msjhs.teacherLeft();
					} else if (choice == 4 && msjhs.getRats()) {
						System.out.println("You released the rat from your hands.");
						console.nextLine();
						System.out.println("Mr. Florence: No! I need the rats!");
						console.nextLine();
						System.out.println("You: Maybe I should have given him the things but eh.");
						msjhs.teacherLeft();
					}
				} else {
					System.out.println("1. Check the drawers.");
					choice = console.nextInt();
					console.nextLine();
					System.out.println("You check the drawers for anything.");
					console.nextLine();
					System.out.println("You: Hey! A key. Wonder what's this for.");
					player.addItem(key);
					msjhs.keyFound(true);
				}
				
				//lab tables
			} else if (choice == 2) {
				if (msjhs.teacherHere()) {
					System.out.println("Mr. Florence: Sorry, I can't allow you to use that table.");
					System.out.println("You (thinking): Dang it, I have to think of a way to get him out of here.");
				} else {
					if (!mixed && msjhs.getKey()) {
						labMixing(save, player, msjhs, console);
						mixed = true;
					} else if (!save.useWrench() && mixed) {
						System.out.println("You: Alright, I'm done. I just need to do something to spread the COVID virus");
					} else if (save.useWrench() && mixed) {
						save.noLongerHere();
						save.msjhsDone(console, save, player);
					} else {
						System.out.println("You: I'll need a key before starting.");
					}
				}
			} else if (choice == 3) {
				System.out.println("Hello little rats. Wish one of you could cook for me.");
				console.nextLine();
				System.out.println("You: Or maybe.");
				msjhs.ratsProcured(true);
				console.nextLine();
				System.out.println("You: You guys will be useful for later.");
			} else if (choice == 4) {
				if (msjhs.getKey()) {
					for (int i = 0; i < player.getInventory().size(); i++) {
						if (player.getItem(i).returnItem().equals("Key")) {
							player.useItem(i);
							i = player.getInventory().size() + 1;
						}
					}
					System.out.println("You: Lookie here. A wrench. Don't know why there's nothing else here though.");
					player.addItem(wrench);
					save.gotWrench(true);
				} else {
					System.out.println("You: Dang it, I need a key!");
				}
			} else if (choice == 5) {
				if (msjhs.teacherHere()) {
					System.out.println("Mr. Florence: Hey! Don't touch that please!");
				} else {
					if (msjhs.getKey()) {
						for (int i = 0; i < player.getInventory().size(); i++) {
							if (player.getItem(i).returnItem().equals("Key")) {
								player.useItem(i);
							}
						}
						System.out.println("You: Okay, I just need to put this here aaaaand there!");
					} else {
						System.out.println("Dangit, I don't have the key.");
					}
				}
			} else if (choice == 6) {
				System.out.println("You find a book laying on the table. It has some sticky notes on it.");
				System.out.println("1. Look closer or 2. Leave it alone.");
				choice = console.nextInt();
				if (choice == 1) {
					System.out.println("You: Oh my, someone's cheating. I better give this to Mr. Florence.");
					player.addItem(book);
				} else {
					System.out.println("You: Oh well, better not.");
				}
			} else if (choice == 7) {
				if (!here) {
					System.out.println("You: What's this here? Huh, didn't Mr. Florence always say you can't use your calculator during the test?");
					console.nextLine();
					System.out.println("You: And this is a graphing calculator");
					console.nextLine();
					System.out.println("You: I guess I'll tell him now.");
					player.addItem(calculator);
					here = true;
				} else {
					System.out.println("You: There's nothing else here.");
					System.out.println();
				}
			}
		}
	}
	
	public static void labMixing(StorylineProgress save, Player player, Checks msjhs, Scanner console) {
		System.out.println("You: Alright, let's get mixing!");
		console.nextLine();
		System.out.println("Add in the ingredients in the correct order and mix it correctly. NOTE: It must be correct or else you will have a more deadly virus on your hands. Enter 7 if you want to finish up the sample.");
		System.out.print("1. Put the COVID sample into the centrifuge\n2. Fully mix the COVID sample\n3. Place the COVID sample into the incubator\n");
		System.out.println("4. Place the COVID sample into the goose egg\n5. Mix the COVID sample with Agar Boba\n6. Add pizza grease into the COVID sample\n7. Finish the COVID sample");
		boolean centri = false;
		boolean mixed = false;
		boolean incubated = false;
		boolean goose = false;
		boolean mixedAgar = false;
		boolean grease = false;
		boolean here = true;
		int button = 0;
		int i = 0;
		int[] choice = new int[6];
		
		while (here) {
			System.out.println("Add in the ingredients in the correct order and mix it correctly. NOTE: It must be correct or else you will have a more deadly virus on your hands. Enter 7 if you want to finish up the sample.");
			System.out.print("1. Put the COVID sample into the centrifuge\n2. Fully mix the COVID sample\n3. Place the COVID sample into the incubator\n");
			System.out.println("4. Place the COVID sample into the goose egg\n5. Mix the COVID sample with Agar Boba\n6. Add pizza grease into the COVID sample\n7. Finish the COVID sample");
			int input = console.nextInt();
			if (input == 1) {
				if (centri) {
					System.out.println("You already did that!");
				} else {
					centri = true;
					choice[i] = input;
				}
			} else if (input == 2) {
				if (mixed) {
					System.out.println("You already did that!");
				} else {
					mixed = true;
					choice[i] = input;
				}
			} else if (input == 3) {
				if (incubated) {
					System.out.println("You already did that!");
				} else if (goose) {
					System.out.println("You: Wow, there's so many buttons. Which one should I press?");
					System.out.println("1. 5x || 2. 10x || 3. 15x");
					button = console.nextInt();
					incubated = true;
					choice[i] = input;
				} else {
					System.out.println("You need to put the sample in a container!");
				}
			} else if (input == 4) {
				if (goose) {
					System.out.println("You already did that!");
				} else {
					goose = true;
					choice[i] = input;
				}
			} else if (input == 5) {
				if (mixedAgar) {
					System.out.println("You already did that!");
				} else {
					mixedAgar = true;
					choice[i] = input;
				}
			} else if (input == 6) {
				if (grease) {
					System.out.println("You already did that!");
				} else {
					grease = true;
					choice[i] = input;
				}
			} else {
				for (int j = 0; j < choice.length; j++) {
					if (choice[0] == 6) {
						if (choice[1] == 1) {
							if (choice[2] == 5) {
								if (choice[3] == 4) {
									if (choice[4] == 3 && button == 2) {
										if (choice[5] == 2) {
											save.mixedCorrectly(true);
										}
									}
								}
							}
						}
					}
				}
				here = false;
				System.out.println("That's all done with!");
			}
			i++;
		}
	}
}
