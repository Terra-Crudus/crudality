/* Names: Erika Rosales, Emily Lederman
 * Project: Final, Character Creator
 * Description: To create a character for Vampire The Masquerade 5th edition 
 */
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//import java.util.Formatter;

public class Main 
{
	static Scanner input;
	static Random randGen;

	public static void main(String[] args) 
	{
		input = new Scanner(System.in);
		randGen = new Random();
		int toolChoice = 0;
		int newchar = 0;
		charactermaker cm;
		
		System.out.println("If you are here to make a new character, enter 1, otherwise, enter 2.");
		
		if (newchar == 1)
		{
			System.out.println("Enter the number of the "
					+ "tool you want to use.");
				System.out.println("1. Changeling 20 Character Creator");
				System.out.println("2. Mage 20 Character Creator");
				System.out.println("3. Vampire 20 Character Creator");
				System.out.println("4. Werewolf 20 Character Creator");
				System.out.println("5. Wraith 20 Character Creator");
				System.out.println("6. Vampire 5th Character Creator");
				
		
				toolChoice = input.nextInt();
			
				if (toolChoice == 1) 
				{
					cm = new changeling20CharacterMaker(new C20Char());
				}	 
				else if (toolChoice == 2)
				{
					cm = new mage20CharacterMaker(new M20Char());
				} 
				else if (toolChoice == 3)
				{
					cm = new vampire20CharacterMaker(new V20Char());
				} 
				else if (toolChoice == 4)
				{
					cm = new werewolf20CharacterMaker(new W20Char());
				}
				else if (toolChoice == 5)
				{
					cm = new wraith20CharacterMaker(new WR20Char());
				}
				else if (toolChoice == 6)
				{
					cm = new vampire5CharacterMaker(new V5Char());
				}
				cm.openingDialog();
				cm.factionpick();
				cm.attributePicker();
				cm.skillPicker();
				cm.naturedemeanor();
				cm.backgrounds();
				cm.powerpick();
				cm.characterdetails();
				cm.flawsandmerits();
				cm.charreview();
				cm.export();
				cm.freebiepoints();
		}
		else
		{	
			System.out.println("Select a character you would like to spend exp on.");
			
			System.out.println("1. Changeling 20th Experience Spender");
			System.out.println("2. Mage 20th Experience Spender");
			System.out.println("3. Vampire 20th Experience Spender");
			System.out.println("4. Werewolf 20th Experience Spender");
			System.out.println("5. Wraith 20th Experience Spender");
			System.out.println("6. Vampire 5th Experience Spender");
			
			toolChoice = input.nextInt();
			
			if (toolChoice == 1) 
			{
				//c20 exp spender
			} 
			else if (toolChoice == 2) 
			{
				//m20 exp spender
			}
			else if (toolChoice == 3) 
			{
				//v20 exp spender
			}
			else if (toolChoice == 4) 
			{
				//w20 exp spender;
			}
			else if (toolChoice == 5) 
			{
				//wr20 exp spender
			}
			else if (toolChoice == 6) 
			{
				//v520 exp spender
			}
		}
	}// end of main

 
//------------------------beginning off all main character maker methods--------------------------------

	

	private static void v5CharacterMaker() 
	{
		V5Character character; // character being created
		character = new V5Character();
		int playerReturns = 0; // value for players returning or not
		
		character.V5OpeningDialog();
		character.V5ClanList();
		character.V5ClanSelector();
		character.V5DisciplineList();
		character.V5ClanDisciplines();
		character.V5AttributePicker();
		character.V5SkillPicker();
		character.V5PredatorSelect();
		character.V5AdvantageSelect();
		character.V5Convictions();
		character.V5Touchstones();
		character.V5Generation();
		character.V5BloodStats();
		character.V5DisciplinePick();
		character.V5CharacterDetails();
		character.V5EquipShop();
		character.V5Stats2();
		character.V5CharReview();
		character.V5Export();
		
		
//		fifthedconvictionsEntered(playerCharacter, playerReturns);
//		// touchstones (people who arent vamps) that reflect their convictions, pastor, cop, etc
//		fifthedtouchstoneMaker(playerCharacter, playerReturns);
//		// generation (times descended from cain, the first vamp)
//		fifthedgenerationDecider(playerCharacter, playerReturns);
//		// blood surge, blood potency, mend amount, rouse re-roll, power bonus, bane
//		// severity, feeding penalty
//		fifthedbloodStats(playerCharacter, playerReturns);
//		fifthedpowerPicker(playerCharacter, playerReturns);
//		fifthedcharacterDetails(playerCharacter, playerReturns);
//		fifthedequipmentShop(playerCharacter, playerReturns);
//		playerCharacter.Humanity = 7;// humanity (7)
//		
//		//willpower (Composure + Resolve)
//		playerCharacter.Willpower = playerCharacter.Composure + playerCharacter.Resolve; 
//		playerCharacter.Health = playerCharacter.Stamina + 3;// health (Stamina + 3)
//		System.out.println("Looks like your character is about done, and now lets go "
//			+ "over all of the information that we have gathered so far.");
//		fifthedcharacterPrinter(playerCharacter, playerReturns);
//		fifthgoBackAndEdit(playerCharacter, playerReturns);
//		fifthedfreebiePoints(playerCharacter, playerReturns);
//		fifthedsaveAndExport(playerCharacter, playerReturns);
//		fiftheduploadAndSpendExperience(playerCharacter, playerReturns);
//		// List of allies
	}
	
//------------------------beginning off all character sub methods--------------------------------
	
	private static void uploadAndSpendExperience(V5Character playerCharacter, int playerReturns) 
	{
		/* Increase Attribute 			New Level x5
		 * Increase Skill				New Level x3
		 * New Specialty				3
		 * Clan Discipline				New Level x5
		 * Other Discipline				New Level x7
		 * Caitiff Discipline			New Level x6
		 * Blood Sorcery Ritual			Ritual Level x3
		 * Thin Blood Formula			Formula Level x3
		 * Advantage					3 per dot
		 * Blood Potency				New Level x10
		 */
	}
	
	private static void saveAndExport(V5Character playerCharacter, int playerReturns) 
	{
		try 
		{
			File characterSheet = new File("New Character.txt");
		    if (characterSheet.createNewFile()) 
		    {
		    	System.out.println("File created: " + characterSheet.getName());
		    } 
		    else 
		    {
		    System.out.println("File already exists.");
		    }
		} 
		catch (IOException e) 
		{
		System.out.println("An error occurred.");
		      e.printStackTrace();
		} 
		finally 
		{
			//close file
		}
		
		try 
		{
			FileWriter myWriter = new FileWriter("New Character.txt");
		    myWriter.write("Name: " + playerCharacter.name);
		    myWriter.close();
		    System.out.println("Successfully wrote to the file.");
		} 
		catch (IOException e) 
		{
			System.out.println("An error occurred.");
		    e.printStackTrace();
		}
	}//end of saveAndExport
	



	private static void skillPicker(V5Character playerCharacter, int playerReturns) 
	{
		int skillChoice = 0;
		int skillsAtOne = 0;
		int skillsAtTwo = 0;
		int skillsAtThree = 0;
		int skillsAtFour = 0;

		System.out.println("There are 3 methods you can choose for skill distrobution.");
		System.out.println("(1). Jack of all trades: One Skill at 3; " 
			+ "eight Skills at 2; ten Skills at 1");
		System.out.println("(2). Balanced: Three Skills at 3; five Skills at 2; seven Skills at 1");
		System.out.println("(3). Specialist: One Skill at 4; three Skills at 3; " 
			+ "three Skills at 2; three Skills at 1");
		System.out.println("Which one would you like?");
		skillChoice = input.nextInt();
		if (skillChoice == 1) 
		{
			skillsAtFour = 0;
			skillsAtThree = 1;
			skillsAtTwo = 8;
			skillsAtOne = 10;

		} else if (skillChoice == 2) 
		{
			skillsAtFour = 0;
			skillsAtThree = 3;
			skillsAtTwo = 2;
			skillsAtOne = 7;

		} else if (skillChoice == 3) 
		{
			skillsAtFour = 1;
			skillsAtThree = 3;
			skillsAtTwo = 3;
			skillsAtOne = 3;
		}
	}// end of skill picker

}// end of class

//if (playerReturns == 1)
//{
//	System.out.println();	
//}
//else { ; }

/*
 * ----Alpha---- 
 * Advantages (Backgrounds, Flaws, Merits) 
 * Equipment Descriptions for the disciplines and each of the powers 
 * Rituals for Blood Sorcery and Oblivion 
 * Full Clan Description 
 * Pretty much everything to do with the Hecata
 * Uses for Willpower 
 * Uses for Bloodpoints 
 * Mechanics for each discipline 
 * Thin Blood Drinking Mechanic (Melancholic, ETC) 
 * Description of all attributes and skills Thin blood merits 
 * and flaws all benefits that a predator type gives
 * 
 * Make sure to input an if that if someone is thinblood they are forced to pick
 * thinblood come generation time, and also make sure that people cant pick
 * thinblood if they arent one.
 * 
 * Make sure that turn date, birthdate, are all checked against each other.
 * 
 * Mend amount is not calibrated to handle the levels of damage that it heals,
 * and then how much, this needs to be adjusted in the future to make any kind
 * of sense (This is the same for feeding penalty)
 * 
 * Emily when you start adding in all of the powers for all of the disciplines,
 * you need a way to record and ref this as well as print it out when the
 * character is finally done, otherwise it isnt going to make sense and no one
 * knows that you need to select powers at each level, please dont forget that
 * you also can pick from any level or lower at each choice.
 * 
 * Make sure to allow for further bloodlines of the hecata implament something
 * in the future for people to read about predator types.
 * 
 * Notes of the following (New disciplines/power)
 * new advantages
 * new clans
 * new predator types
 * 
 * you need to go make and include in the method name what edition its for
 */

/*
 * ----Beta---- SYSTEMS AND TOOLS 
 * Humanity Dropping 
 * System Health Tracking
 * System Coterie Creation 
 * Thin Blood Resonance Tracker 
 * Combat outline 
 * Damage from various sources 
 * Hunting 
 * Drugs 
 * Memoriam 
 * Banes and how they work Boons and
 * Boon Tracker Diablerie Tracker Spending EXP Dice roller
 * Diablerie Tracker/logger/adjuster
 */

/*
 * ----BETA 2: More Systems---- 
 * NPC maker 
 * Ghoul Maker 
 * Combat tracker and sim
 * Character Journal 
 * Multi character Combat Tracker 
 * Discipline Search
 */

/* "The Anarchs
  * Prince/
  * Primogen/Sheriff/Seneschal/Whip/Herald/Keeper of Elysium
  * Blood Bond
  * Fae/Werewolves/Mages
  * Elysium
  * Staking
  * Ghouls
  * Humanity
  * Society of Saint Leopold
  * The Second Inquisition
  * (Children of The Blood) Advantages
  * (Cult of The Blood Gods)
  */

/* WHAT DO I DO IN THIS GAME?
 * Hunt for blood
 * Struggle with the Beast
 * Build and break relationships
 * Hide from, or fight, the Second Inquisition
 * Rule the streets
 * Protect the Touchstones of your Humanity
 * Rise to power
 * Plot against other Kindred
 * Unearth terrible secrets
 * Face the consequences of being a monster
 * Fight radical, primitivist werewolves
 * Sabotage, Negotiate with, or Fight the other political factions
 * Bend humans to your will
 */
