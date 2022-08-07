import java.util.Random;
import java.util.Scanner;

public class V5Character 
{
	String name;
	String Clan;
	int birthDate;
	int turnDate;
	String hairColor;
	String eyeColor;
	String originalNationality;
	String currentNationality;
	int Age;
	int Strength;
	int Dexterity;
	int Stamina;
	int Charisma;
	int Manipulation;
	int Composure;
	int Intelligence;
	int Resolve;
	int Wits;
	int Athletics;
	int Brawl;
	int Craft;
	int Drive;
	int Firearms;
	int Larceny;
	int Melee;
	int Stealth;
	int Survival;
	int AnimalKen;
	int Etiquette;
	int Insight;
	int Intimidation;
	int Leadership;
	int Performance;
	int Persuasion;
	int Streetwise;
	int Subterfuge;
	int Academics;
	int Awareness;
	int Finance;
	int Investigation;
	int Medicine;
	int Occult;
	int Politics;
	int Science;
	int Technology;
	int Humanity;
	int Willpower;
	int Health;
	int Generation;
	String predatorType;
	int bloodPotency;
	int bloodSurge;
	int mendAmount;
	int rouseReroll;
	int powerBonus;
	String feedingPenalty;
	int baneSeverity;
	int discipline1Rating;
	int discipline2Rating;
	int discipline3Rating;
	int discipline4Rating;
	int discipline5Rating;
	int discipline6Rating;
	int discipline7Rating;
	int discipline8Rating;
	int discipline9Rating;
	int discipline10Rating;
	String discipline1Name;
	String discipline2Name;
	String discipline3Name;
	String discipline4Name;
	String discipline5Name;
	String discipline6Name;
	String discipline7Name;
	String discipline8Name;
	String discipline9Name;
	String discipline10Name;
	int totalExperience;
	int currentExperience;
	int minBloodPotency;
	int maxBloodPotency;
	
	static Scanner input = new Scanner(System.in);
	static Random randGen = new Random();
	
	public V5Character()// default constructor
	{
		this.name = "New";
		this.Clan = "Mekhet";
		this.birthDate = 0101;
		this.turnDate = 0101;
		this.hairColor = "Rainbows";
		this.eyeColor = "Rainbows";
		this.originalNationality = "Landia";
		this.currentNationality = "'MERICA";
		this.Age = 0;
		this.Strength = 0;
		this.Dexterity = 0;
		this.Stamina = 0;
		this.Charisma = 0;
		this.Manipulation = 0;
		this.Composure = 0;
		this.Intelligence = 0;
		this.Resolve = 0;
		this.Wits = 0;
		this.Athletics = 0;
		this.Brawl = 0;
		this.Craft = 0;
		this.Drive = 0;
		this.Firearms = 0;
		this.Larceny = 0;
		this.Melee = 0;
		this.Stealth = 0;
		this.Survival = 0;
		this.AnimalKen = 0;
		this.Etiquette = 0;
		this.Insight = 0;
		this.Intimidation = 0;
		this.Leadership = 0;
		this.Performance = 0;
		this.Persuasion = 0;
		this.Streetwise = 0;
		this.Subterfuge = 0;
		this.Academics = 0;
		this.Awareness = 0;
		this.Finance = 0;
		this.Investigation = 0;
		this.Medicine = 0;
		this.Occult = 0;
		this.Politics = 0;
		this.Science = 0;
		this.Technology = 0;
		this.Humanity = 0;
		this.Willpower = 0;
		this.Health = 0;
		this.Generation = 0;
		this.predatorType = "Hungry";
		this.bloodPotency = 0;
		this.bloodSurge = 0;
		this.mendAmount = 0;
		this.rouseReroll = 0;
		this.powerBonus = 0;
		this.feedingPenalty = "None";
		this.baneSeverity = 0;
		this.discipline1Rating = 0;
		this.discipline2Rating = 0;
		this.discipline3Rating = 0;
		this.discipline4Rating = 0;
		this.discipline5Rating = 0;
		this.discipline6Rating = 0;
		this.discipline7Rating = 0;
		this.discipline8Rating = 0;
		this.discipline9Rating = 0;
		this.discipline10Rating = 0;
		this.discipline1Name = "";
		this.discipline2Name = "";
		this.discipline3Name = "";
		this.discipline4Name = "";
		this.discipline5Name = "";
		this.discipline6Name = "";
		this.discipline7Name = "";
		this.discipline8Name = "";
		this.discipline9Name = "";
		this.discipline10Name = "";
		this.totalExperience = 0;
		this.currentExperience = 0;
		this.minBloodPotency = 0;
		this.maxBloodPotency = 0;
	}// end of default constructor

	// beginning of getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClan() {
		return Clan;
	}

	public void setClan(String clan) {
		Clan = clan;
	}

	public int getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(int birthDate) {
		this.birthDate = birthDate;
	}

	public int getTurnDate() {
		return turnDate;
	}

	public void setTurnDate(int turnDate) {
		this.turnDate = turnDate;
	}

	public String getHairColor() {
		return hairColor;
	}

	public void setHairColor(String hairColor) {
		this.hairColor = hairColor;
	}

	public String getEyeColor() {
		return eyeColor;
	}

	public void setEyeColor(String eyeColor) {
		this.eyeColor = eyeColor;
	}

	public String getOriginalNationality() {
		return originalNationality;
	}

	public void setOriginalNationality(String originalNationality) {
		this.originalNationality = originalNationality;
	}

	public String getCurrentNationality() {
		return currentNationality;
	}

	public void setCurrentNationality(String currentNationality) {
		this.currentNationality = currentNationality;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public int getStrength() {
		return Strength;
	}

	public void setStrength(int strength) {
		Strength = strength;
	}

	public int getDexterity() {
		return Dexterity;
	}

	public void setDexterity(int dexterity) {
		Dexterity = dexterity;
	}

	public int getStamina() {
		return Stamina;
	}

	public void setStamina(int stamina) {
		Stamina = stamina;
	}

	public int getCharisma() {
		return Charisma;
	}

	public void setCharisma(int charisma) {
		Charisma = charisma;
	}

	public int getManipulation() {
		return Manipulation;
	}

	public void setManipulation(int manipulation) {
		Manipulation = manipulation;
	}

	public int getComposure() {
		return Composure;
	}

	public void setComposure(int composure) {
		Composure = composure;
	}

	public int getIntelligence() {
		return Intelligence;
	}

	public void setIntelligence(int intelligence) {
		Intelligence = intelligence;
	}

	public int getResolve() {
		return Resolve;
	}

	public void setResolve(int resolve) {
		Resolve = resolve;
	}

	public int getWits() {
		return Wits;
	}

	public void setWits(int wits) {
		Wits = wits;
	}

	public int getAthletics() {
		return Athletics;
	}

	public void setAthletics(int athletics) {
		Athletics = athletics;
	}

	public int getBrawl() {
		return Brawl;
	}

	public void setBrawl(int brawl) {
		Brawl = brawl;
	}

	public int getCraft() {
		return Craft;
	}

	public void setCraft(int craft) {
		Craft = craft;
	}

	public int getDrive() {
		return Drive;
	}

	public void setDrive(int drive) {
		Drive = drive;
	}

	public int getFirearms() {
		return Firearms;
	}

	public void setFirearms(int firearms) {
		Firearms = firearms;
	}

	public int getLarceny() {
		return Larceny;
	}

	public void setLarceny(int larceny) {
		Larceny = larceny;
	}

	public int getMelee() {
		return Melee;
	}

	public void setMelee(int melee) {
		Melee = melee;
	}

	public int getStealth() {
		return Stealth;
	}

	public void setStealth(int stealth) {
		Stealth = stealth;
	}

	public int getSurvival() {
		return Survival;
	}

	public void setSurvival(int survival) {
		Survival = survival;
	}

	public int getAnimalKen() {
		return AnimalKen;
	}

	public void setAnimalKen(int animalKen) {
		AnimalKen = animalKen;
	}

	public int getEtiquette() {
		return Etiquette;
	}

	public void setEtiquette(int etiquette) {
		Etiquette = etiquette;
	}

	public int getInsight() {
		return Insight;
	}

	public void setInsight(int insight) {
		Insight = insight;
	}

	public int getIntimidation() {
		return Intimidation;
	}

	public void setIntimidation(int intimidation) {
		Intimidation = intimidation;
	}

	public int getLeadership() {
		return Leadership;
	}

	public void setLeadership(int leadership) {
		Leadership = leadership;
	}

	public int getPerformance() {
		return Performance;
	}

	public void setPerformance(int performance) {
		Performance = performance;
	}

	public int getPersuasion() {
		return Persuasion;
	}

	public void setPersuasion(int persuasion) {
		Persuasion = persuasion;
	}

	public int getStreetwise() {
		return Streetwise;
	}

	public void setStreetwise(int streetwise) {
		Streetwise = streetwise;
	}

	public int getSubterfuge() {
		return Subterfuge;
	}

	public void setSubterfuge(int subterfuge) {
		Subterfuge = subterfuge;
	}

	public int getAcademics() {
		return Academics;
	}

	public void setAcademics(int academics) {
		Academics = academics;
	}

	public int getAwareness() {
		return Awareness;
	}

	public void setAwareness(int awareness) {
		Awareness = awareness;
	}

	public int getFinance() {
		return Finance;
	}

	public void setFinance(int finance) {
		Finance = finance;
	}

	public int getInvestigation() {
		return Investigation;
	}

	public void setInvestigation(int investigation) {
		Investigation = investigation;
	}

	public int getMedicine() {
		return Medicine;
	}

	public void setMedicine(int medicine) {
		Medicine = medicine;
	}

	public int getOccult() {
		return Occult;
	}

	public void setOccult(int occult) {
		Occult = occult;
	}

	public int getPolitics() {
		return Politics;
	}

	public void setPolitics(int politics) {
		Politics = politics;
	}

	public int getScience() {
		return Science;
	}

	public void setScience(int science) {
		Science = science;
	}

	public int getTechnology() {
		return Technology;
	}

	public void setTechnology(int technology) {
		Technology = technology;
	}

	public int getHumanity() {
		return Humanity;
	}

	public void setHumanity(int humanity) {
		Humanity = humanity;
	}

	public int getWillpower() {
		return Willpower;
	}

	public void setWillpower(int willpower) {
		Willpower = willpower;
	}

	public int getHealth() {
		return Health;
	}

	public void setHealth(int health) {
		Health = health;
	}

	public int getGeneration() {
		return Generation;
	}

	public void setGeneration(int generation) {
		Generation = generation;
	}

	public String getPredatorType() {
		return predatorType;
	}

	public void setPredatorType(String predatorType) {
		this.predatorType = predatorType;
	}

	public int getBloodPotency() {
		return bloodPotency;
	}

	public void setBloodPotency(int bloodPotency) {
		this.bloodPotency = bloodPotency;
	}

	public int getBloodSurge() {
		return bloodSurge;
	}

	public void setBloodSurge(int bloodSurge) {
		this.bloodSurge = bloodSurge;
	}

	public int getMendAmount() {
		return mendAmount;
	}

	public void setMendAmount(int mendAmount) {
		this.mendAmount = mendAmount;
	}

	public int getRouseReroll() {
		return rouseReroll;
	}

	public void setRouseReroll(int rouseReroll) {
		this.rouseReroll = rouseReroll;
	}

	public int getPowerBonus() {
		return powerBonus;
	}

	public void setPowerBonus(int powerBonus) {
		this.powerBonus = powerBonus;
	}

	public String getFeedingPenalty() {
		return feedingPenalty;
	}

	public void setFeedingPenalty(String feedingPenalty) {
		this.feedingPenalty = feedingPenalty;
	}

	public int getBaneSeverity() {
		return baneSeverity;
	}

	public void setBaneSeverity(int baneSeverity) {
		this.baneSeverity = baneSeverity;
	}

	public int getDiscipline1Rating() {
		return discipline1Rating;
	}

	public void setDiscipline1Rating(int discipline1Rating) {
		this.discipline1Rating = discipline1Rating;
	}

	public int getDiscipline2Rating() {
		return discipline2Rating;
	}

	public void setDiscipline2Rating(int discipline2Rating) {
		this.discipline2Rating = discipline2Rating;
	}

	public int getDiscipline3Rating() {
		return discipline3Rating;
	}

	public void setDiscipline3Rating(int discipline3Rating) {
		this.discipline3Rating = discipline3Rating;
	}

	public int getDiscipline4Rating() {
		return discipline4Rating;
	}

	public void setDiscipline4Rating(int discipline4Rating) {
		this.discipline4Rating = discipline4Rating;
	}

	public int getDiscipline5Rating() {
		return discipline5Rating;
	}

	public void setDiscipline5Rating(int discipline5Rating) {
		this.discipline5Rating = discipline5Rating;
	}

	public int getDiscipline6Rating() {
		return discipline6Rating;
	}

	public void setDiscipline6Rating(int discipline6Rating) {
		this.discipline6Rating = discipline6Rating;
	}

	public int getDiscipline7Rating() {
		return discipline7Rating;
	}

	public void setDiscipline7Rating(int discipline7Rating) {
		this.discipline7Rating = discipline7Rating;
	}

	public int getDiscipline8Rating() {
		return discipline8Rating;
	}

	public void setDiscipline8Rating(int discipline8Rating) {
		this.discipline8Rating = discipline8Rating;
	}

	public int getDiscipline9Rating() {
		return discipline9Rating;
	}

	public void setDiscipline9Rating(int discipline9Rating) {
		this.discipline9Rating = discipline9Rating;
	}

	public int getDiscipline10Rating() {
		return discipline10Rating;
	}

	public void setDiscipline10Rating(int discipline10Rating) {
		this.discipline10Rating = discipline10Rating;
	}

	public String getDiscipline1Name() {
		return discipline1Name;
	}

	public void setDiscipline1Name(String discipline1Name) {
		this.discipline1Name = discipline1Name;
	}

	public String getDiscipline2Name() {
		return discipline2Name;
	}

	public void setDiscipline2Name(String discipline2Name) {
		this.discipline2Name = discipline2Name;
	}

	public String getDiscipline3Name() {
		return discipline3Name;
	}

	public void setDiscipline3Name(String discipline3Name) {
		this.discipline3Name = discipline3Name;
	}

	public String getDiscipline4Name() {
		return discipline4Name;
	}

	public void setDiscipline4Name(String discipline4Name) {
		this.discipline4Name = discipline4Name;
	}

	public String getDiscipline5Name() {
		return discipline5Name;
	}

	public void setDiscipline5Name(String discipline5Name) {
		this.discipline5Name = discipline5Name;
	}

	public String getDiscipline6Name() {
		return discipline6Name;
	}

	public void setDiscipline6Name(String discipline6Name) {
		this.discipline6Name = discipline6Name;
	}

	public String getDiscipline7Name() {
		return discipline7Name;
	}

	public void setDiscipline7Name(String discipline7Name) {
		this.discipline7Name = discipline7Name;
	}

	public String getDiscipline8Name() {
		return discipline8Name;
	}

	public void setDiscipline8Name(String discipline8Name) {
		this.discipline8Name = discipline8Name;
	}

	public String getDiscipline9Name() {
		return discipline9Name;
	}

	public void setDiscipline9Name(String discipline9Name) {
		this.discipline9Name = discipline9Name;
	}

	public String getDiscipline10Name() {
		return discipline10Name;
	}

	public void setDiscipline10Name(String discipline10Name) {
		this.discipline10Name = discipline10Name;
	}

	public int getTotalExperience() {
		return totalExperience;
	}

	public void setTotalExperience(int totalExperience) {
		this.totalExperience = totalExperience;
	}

	public int getCurrentExperience() {
		return currentExperience;
	}

	public void setCurrentExperience(int currentExperience) {
		this.currentExperience = currentExperience;
	}

	public int getMinBloodPotency() {
		return minBloodPotency;
	}

	public void setMinBloodPotency(int minBloodPotency) {
		this.minBloodPotency = minBloodPotency;
	}

	public int getMaxBloodPotency() {
		return maxBloodPotency;
	}

	public void setMaxBloodPotency(int maxBloodPotency) {
		this.maxBloodPotency = maxBloodPotency;
	}

	public void V5OpeningDialog() 
	{
		int playerReturns1 = 5;// new player or old player
		String returning;// string that decides if they are a new player
		System.out.println("Welcome to the Vampire The Masquerade 5th " 
			+ "edition character creator. First, are you a new "
			+ "player to this game?\n (If you are a returning player "
			+ "but you would like all of the information and lore that "
			+ "new players are taught,\n feel free to enter new)");
		returning = input.next();
			if (returning == "new" || returning == "New" || returning == "NEW") 
			{
				playerReturns1 = 1;
			} 
			else 
			{
				playerReturns1 = 2;
			} // end of if that sets an int for player
			
			if (playerReturns1 == 1) 
			{
				System.out.println("In this game, almost all things will " 
					+ "be rated 1-5, 1 being the least amount of skill, "
					+ "power, etc. and 5 being mastery. Any stat that is "
					+ "scaled from one to five like Strength is, and goes "
					+ "beyond it is therefore supernaturally beyond what any "
					+ "human could do. 5 strength would reflect the strongest " 
					+ "human whoever lived.\n");
				System.out.println("You will play as someone who has been turned "
					+ "into a vampire who belongs to a specific clan or bloodline. "
					+ "Each of the clans and bloodlines are a descendant of the " 
					+ "first vampire, Cain.");
			} else {;}
		return playerReturns1;
	}

	public void V5ClanSelector() 
	{
		int clanChoice; // Choice of clan
		String clanName = null; // clan name
		System.out.println("The clans come with their own benefits and weaknesses. "
			+ "If you want to know more about a clan, then emily\n should really "
			+ "program a way to read more about them huh.\n");
		clanList(playerReturns1);
		System.out.println("You have these options for clans, " 
			+ "please enter one that you want.");

		if (playerReturns1 == 1) 
		{
			System.out.println("Cain, born of Adam and Eve slaughtered his brother Abel out "
				+ "of jealousy for Abel's favor from God. Cain was cast to the land of "
				+ "Nod forever. Cain originally turned three children, Zillah (The Beautiful), "
				+ "Enoch (The Wise), Irad (The Strong). It was these three that turned "
				+ "13 more who became the original clans. Cain was furious that more "
				+ "had been created and quickly he was disgusted with how his children "
				+ "interacted with humanity. The original clans had names created from "
				+ "their founder. Malkav for Malkavian, Brujah for Brujah, etc. The "
				+ "third generation's were the founders of each clan and were known "
				+ "as the Antediluvians. It was during their reign that the great "
				+ "flood came and washed away the city of Enoch and all of the children "
				+ "of Seth. Cain was so despondent from this, he left from all "
				+ "of his children. The Antediluvians and Cain are said to raise up in "
				+ "the apocalypse (known as Gehenna) and devour all of their chidren "
				+ "before Cain drinks them down in turn. All who descend from Cain and "
				+ "carry the vampiric curse can be called Cainites.");
		} 
		else {;}

		clanChoice = input.nextInt();
		if (clanChoice == 1) 
		{
			// Banu Haqim- Blood Sorcery, Celerity, Obfuscate
			clanName = "Banu Haqim";
			playerCharacter.discipline1Name = "Blood Sorcery";
			playerCharacter.discipline2Name = "Celerity";
			playerCharacter.discipline3Name = "Obfuscate";
			playerCharacter.discipline1Rating = 0;
			playerCharacter.discipline2Rating = 0;
			playerCharacter.discipline3Rating = 0;
		} else if (clanChoice == 2) 
		{
			// Brujah- Celerity, Potence, Presence
			clanName = "Brujah";
			playerCharacter.discipline1Name = "Celerity";
			playerCharacter.discipline2Name = "Potence";
			playerCharacter.discipline3Name = "Presence";
			playerCharacter.discipline1Rating = 0;
			playerCharacter.discipline2Rating = 0;
			playerCharacter.discipline3Rating = 0;
		} else if (clanChoice == 3) 
		{
			// Gets to pick 3
			clanName = "Caitiff";
			System.out.println("If you are a caitiff, you are basically "
				+ "without a clan, so you get to select three " 
				+ "disciplines from the list to have access to "
				+ "before you pick the ones you want. Here are all " 
				+ "of the disciplines in the game.");
			disciplinesList();
			playerCharacter.discipline1Name = "";
			playerCharacter.discipline2Name = "";
			playerCharacter.discipline3Name = "";
			playerCharacter.discipline1Rating = 0;
			playerCharacter.discipline2Rating = 0;
			playerCharacter.discipline3Rating = 0;
		} else if (clanChoice == 4) 
		{
			// gets none
			clanName = "Duskborn";
			playerCharacter.discipline1Name = "";
			playerCharacter.discipline2Name = "";
			playerCharacter.discipline3Name = "";
			playerCharacter.discipline1Rating = 0;
			playerCharacter.discipline2Rating = 0;
			playerCharacter.discipline3Rating = 0;
		} else if (clanChoice == 5) 
		{
			// Gangrel- Animalism, Protean, Presence
			clanName = "Gangrel";
			playerCharacter.discipline1Name = "Animalism";
			playerCharacter.discipline2Name = "Protean";
			playerCharacter.discipline3Name = "Presence";
			playerCharacter.discipline1Rating = 0;
			playerCharacter.discipline2Rating = 0;
			playerCharacter.discipline3Rating = 0;
		} else if (clanChoice == 6) 
		{
			// Hecata
			clanName = "Hecata";
			playerCharacter.discipline1Name = "Auspex";
			playerCharacter.discipline2Name = "Fortitude";
			playerCharacter.discipline3Name = "Oblivion";
			playerCharacter.discipline1Rating = 0;
			playerCharacter.discipline2Rating = 0;
			playerCharacter.discipline3Rating = 0;
		} else if (clanChoice == 7) 
		
		{
			// Hecata - Giovanni
			clanName = "Hecata (Giovanni)";
			playerCharacter.discipline1Name = "Dominate";
			playerCharacter.discipline2Name = "Fortitude";
			playerCharacter.discipline3Name = "Oblivion";
			playerCharacter.discipline1Rating = 0;
			playerCharacter.discipline2Rating = 0;
			playerCharacter.discipline3Rating = 0;
		} else if (clanChoice == 8) 
		{
			// Hecata - Harbingers of Skulls
			clanName = "Hecata (Harbinger of Skulls)";
			playerCharacter.discipline1Name = "Auspex";
			playerCharacter.discipline2Name = "Fortitude";
			playerCharacter.discipline3Name = "Oblivion";
			playerCharacter.discipline1Rating = 0;
			playerCharacter.discipline2Rating = 0;
			playerCharacter.discipline3Rating = 0;
		} else if (clanChoice == 9) 
		{
			// Hecata - Lamiae
			clanName = "Hecata (Lamiae or The Gorgons)";
			playerCharacter.discipline1Name = "Fortitude";
			playerCharacter.discipline2Name = "Potence";
			playerCharacter.discipline3Name = "Oblivion";
			playerCharacter.discipline1Rating = 0;
			playerCharacter.discipline2Rating = 0;
			playerCharacter.discipline3Rating = 0;
		} else if (clanChoice == 10) 
		{
			// Hecata - Nagaraja
			clanName = "Hecata (Nagaraja or The Flesh Eaters)";
			playerCharacter.discipline1Name = "Auspex";
			playerCharacter.discipline2Name = "Dominate";
			playerCharacter.discipline3Name = "Oblivion";
			playerCharacter.discipline1Rating = 0;
			playerCharacter.discipline2Rating = 0;
			playerCharacter.discipline3Rating = 0;
		} else if (clanChoice == 11) 
		{
			// Hecata - Samedi
			clanName = "Hecata (Samedi or The Descendants of The Baron)";
			playerCharacter.discipline1Name = "Fortitude";
			playerCharacter.discipline2Name = "Obfuscate";
			playerCharacter.discipline3Name = "Oblivion";
			playerCharacter.discipline1Rating = 0;
			playerCharacter.discipline2Rating = 0;
			playerCharacter.discipline3Rating = 0;
		} else if (clanChoice == 12) 
		{
			// Lasombra- Dominate, Oblivion, Potence
			clanName = "Lasomabra";
			playerCharacter.discipline1Name = "Dominate";
			playerCharacter.discipline2Name = "Oblivion";
			playerCharacter.discipline3Name = "Potence";
			playerCharacter.discipline1Rating = 0;
			playerCharacter.discipline2Rating = 0;
			playerCharacter.discipline3Rating = 0;
		} else if (clanChoice == 13) 
		{
			// Malkavian- Auspex, Dominate, Obfuscate
			clanName = "Malkavian";
			playerCharacter.discipline1Name = "Auspex";
			playerCharacter.discipline2Name = "Dominate";
			playerCharacter.discipline3Name = "Obfuscate";
			playerCharacter.discipline1Rating = 0;
			playerCharacter.discipline2Rating = 0;
			playerCharacter.discipline3Rating = 0;
		} else if (clanChoice == 14) 
		{
			// Nosferatu- Animalism, Obfuscate, Potence
			clanName = "Nosferatu";
			playerCharacter.discipline1Name = "Animalism";
			playerCharacter.discipline2Name = "Obfuscate";
			playerCharacter.discipline3Name = "Potence";
			playerCharacter.discipline1Rating = 0;
			playerCharacter.discipline2Rating = 0;
			playerCharacter.discipline3Rating = 0;
		} else if (clanChoice == 15) 
		{
			// Ravnos - Animalism, Obfuscate, Presence
			clanName = "Ravnos";
			playerCharacter.discipline1Name = "Animalism";
			playerCharacter.discipline2Name = "Obfuscate";
			playerCharacter.discipline3Name = "Presence";
			playerCharacter.discipline1Rating = 0;
			playerCharacter.discipline2Rating = 0;
			playerCharacter.discipline3Rating = 0;
		} else if (clanChoice == 16) 
		{
			// Salubri - Auspex, Dominate, Fortitude
			clanName = "Salubri";
			playerCharacter.discipline1Name = "Auspex";
			playerCharacter.discipline2Name = "Dominate";
			playerCharacter.discipline3Name = "Fortitude";
			playerCharacter.discipline1Rating = 0;
			playerCharacter.discipline2Rating = 0;
			playerCharacter.discipline3Rating = 0;
		} else if (clanChoice == 17) 
		{
			// The Ministry - Obfuscate, Protean, Presence
			clanName = "The Ministry";
			playerCharacter.discipline1Name = "Obfuscate";
			playerCharacter.discipline2Name = "Protean";
			playerCharacter.discipline3Name = "Presence";
			playerCharacter.discipline1Rating = 0;
			playerCharacter.discipline2Rating = 0;
			playerCharacter.discipline3Rating = 0;
		} else if (clanChoice == 18) 
		{
			// Toreador - Auspex, Celerity, Presence,
			clanName = "Toreador";
			playerCharacter.discipline1Name = "Auspex";
			playerCharacter.discipline2Name = "Celerity";
			playerCharacter.discipline3Name = "Presence";
			playerCharacter.discipline1Rating = 0;
			playerCharacter.discipline2Rating = 0;
			playerCharacter.discipline3Rating = 0;
		} else if (clanChoice == 19) 
		{
			// Tremere - Auspex, Blood Sorcery, Dominate
			clanName = "Tremere";
			playerCharacter.discipline1Name = "Auspex";
			playerCharacter.discipline2Name = "Blood Sorcery";
			playerCharacter.discipline3Name = "Dominate";
			playerCharacter.discipline1Rating = 0;
			playerCharacter.discipline2Rating = 0;
			playerCharacter.discipline3Rating = 0;
		} else if (clanChoice == 20) 
		{
			// Tzimisce - Animalism, Dominate, Protean
			clanName = "Tzimisce";
			playerCharacter.discipline1Name = "Animalism";
			playerCharacter.discipline2Name = "Dominate";
			playerCharacter.discipline3Name = "Protean";
			playerCharacter.discipline1Rating = 0;
			playerCharacter.discipline2Rating = 0;
			playerCharacter.discipline3Rating = 0;
		} else if (clanChoice == 21) 
		{
			// Ventrue - Dominate, Fortitude, Presence
			clanName = "Ventrue";
			playerCharacter.discipline1Name = "Dominate";
			playerCharacter.discipline2Name = "Fortitude";
			playerCharacter.discipline3Name = "Presence";
			playerCharacter.discipline1Rating = 0;
			playerCharacter.discipline2Rating = 0;
			playerCharacter.discipline3Rating = 0;
		} else {;} // we need a prompt for if it doesnt match any of the clans here
		System.out.println("You have chosen the clan " + clanChoice);
		System.out.println();
		playerCharacter.Clan = clanName;
		// are you sure you want this clan
	}

	public void V5ClanDisciplines() 
	{
		// TODO Auto-generated method stub
		
	}

	public void V5AttributePicker() 
	{
		// TODO Auto-generated method stub
		
	}

	public void V5SkillPicker() 
	{
		// TODO Auto-generated method stub
		
	}

	public void V5PredatorSelect() 
	{
		int predator = 0; // predator type chose
		int bonusDisciplineDot;
		String chosenDisDot;
		System.out.println();
		System.out.println();
		System.out.println("Every kindred has a specific way that they hunt and "
			+ "obtain blood they need to survive. The following is the \nname "
			+ "of each way of hunting, also known as predator type, and "
			+ "roughly how they hunt. Each has its own benefits\n and flaws "
			+ "that will influence your character.\n");
		System.out.println("1. Alleycat: You take blood by force, or threat.\n");
		System.out.println("2. Bagger: You aquire preserved or dead blood, " 
			+ "rather than hunt the living.\n");
		System.out.println("3. Blood Leech: You feed from other vampires.\n");
		System.out.println("4. Cleaver: You take blood covertly from " 
			+ "your mortal family or friends.\n");
		System.out.println("5. Consenualist: You take blood with consent.\n");
		System.out.println("6. Farmer: You feed from animals.\n");
		System.out.println("7. Osiris: As an object of devotion, you feed" 
			+ " from your cult, church, or fans.\n");
		System.out.println("8. Sandman: You feed from sleeping victims, " 
			+ "often breaking into homes.\n");
		System.out.println("9. Scene Queen: You feed from a subculture or " 
			+ "exclusive group in which you enjoy high status.\n");
		System.out.println("10. Siren: You feed by seduction, under the guise of sex.\n");
		System.out.println("Please enter the number of the type of predator you feel fits "
			+ "your character. You can also type Read. \nand the predator "
			+ "type to find out the benefits and downfalls of it.\n");
		predator = input.nextInt();
		if (predator == 1) 
		{
			playerCharacter.predatorType = "Alleycat";
			System.out.println("Add a specialty, Intimidation (Stickups), or Brawl (Grappling).");
			System.out.println("Gain a dot in either (1) Potence or (2) Celerity.");
			bonusDisciplineDot = input.nextInt();
			if (bonusDisciplineDot == 1) 
			{
				chosenDisDot = "Potence";
				if (chosenDisDot == playerCharacter.discipline1Name) 
				{
					playerCharacter.discipline1Rating++;
				} else if (chosenDisDot == playerCharacter.discipline2Name) 
				{
					playerCharacter.discipline2Rating++;
				} else if (chosenDisDot == playerCharacter.discipline3Name) 
				{
					playerCharacter.discipline3Rating++;
				} else 
				{
					playerCharacter.discipline4Name = chosenDisDot;
					playerCharacter.discipline4Rating = 1;
				}
			} else 
			{
				chosenDisDot = "Celerity";
				if (chosenDisDot == playerCharacter.discipline1Name) 
				{
					playerCharacter.discipline1Rating++;
				} else if (chosenDisDot == playerCharacter.discipline2Name) 
				{
					playerCharacter.discipline2Rating++;
				} else if (chosenDisDot == playerCharacter.discipline3Name) 
				{
					playerCharacter.discipline3Rating++;
				} else 
				{
					playerCharacter.discipline4Name = chosenDisDot;
					playerCharacter.discipline4Rating = 1;
				}
			}
			System.out.println("Gain 3 dots in criminal contacts.");
			System.out.println("You lose one dot in humanity.");
		} else if (predator == 2) 
		{
			playerCharacter.predatorType = "Bagger";
			System.out.println("Add a specialty, Larceny (Lockpicking), or Streetwise (Black Market).");
			System.out.println("Gain a dot in either (1) Blood Sorcery (Tremere Only) or (2) Obfuscate.");
			bonusDisciplineDot = input.nextInt();
			if ((bonusDisciplineDot == 1) && (playerCharacter.Clan == "Tremere")) 
			{
				chosenDisDot = "Blood Sorcery";
				if (chosenDisDot == playerCharacter.discipline1Name) 
				{
					playerCharacter.discipline1Rating++;
				} else if (chosenDisDot == playerCharacter.discipline2Name) 
				{
					playerCharacter.discipline2Rating++;
				} else if (chosenDisDot == playerCharacter.discipline3Name) 
				{
					playerCharacter.discipline3Rating++;
				} else 
				{
					playerCharacter.discipline4Name = chosenDisDot;
					playerCharacter.discipline4Rating = 1;
				}
			} 
			else 
			{
				chosenDisDot = "Obfuscate";
				if (chosenDisDot == playerCharacter.discipline1Name) 
				{
					playerCharacter.discipline1Rating++;
				} else if (chosenDisDot == playerCharacter.discipline2Name) 
				{
					playerCharacter.discipline2Rating++;
				} else if (chosenDisDot == playerCharacter.discipline3Name) 
				{
					playerCharacter.discipline3Rating++;
				} else
				{
					playerCharacter.discipline4Name = chosenDisDot;
					playerCharacter.discipline4Rating = 1;
				}
			}
			System.out.println("Gain the Feeding Merit: Iron Gullet");
			System.out.println("Gain the Enemy Flaw: Either someone believes you owe them, or there’s "
					+ "another reason you keep off the streets.");
		} else if (predator == 3) 
		{
			playerCharacter.predatorType = "Blood Leech";
			System.out.println("Add a specialty: Brawl (Kindred) or Stealth (against Kindred)");
			System.out.println("Gain a dot in either (1) Celerity or (2) Protean.");
			bonusDisciplineDot = input.nextInt();
			if (bonusDisciplineDot == 1) 
			{
				chosenDisDot = "Celerity";
				if (chosenDisDot == playerCharacter.discipline1Name) 
				{
					playerCharacter.discipline1Rating++;
				} else if (chosenDisDot == playerCharacter.discipline2Name) 
				{
					playerCharacter.discipline2Rating++;
				} else if (chosenDisDot == playerCharacter.discipline3Name) 
				{
					playerCharacter.discipline3Rating++;
				} else 
				{
					playerCharacter.discipline4Name = chosenDisDot;
					playerCharacter.discipline4Rating = 1;
				}
			} 
			else 
			{
				chosenDisDot = "Protean";
				if (chosenDisDot == playerCharacter.discipline1Name) 
				{
					playerCharacter.discipline1Rating++;
				} else if (chosenDisDot == playerCharacter.discipline2Name) 
				{
					playerCharacter.discipline2Rating++;
				} else if (chosenDisDot == playerCharacter.discipline3Name) 
				{
					playerCharacter.discipline3Rating++;
				} 
				else 
				{
					playerCharacter.discipline4Name = chosenDisDot;
					playerCharacter.discipline4Rating = 1;
				}
			}
			System.out.println("You lose one dot in humanity.");
			System.out.println("Increase blood potency by one.");
			System.out.println("Gain the Dark Secret Flaw: Diablerist, or the Shunned Flaw");
			System.out.println("Gain the Feeding Flaw: Prey Exclusion (mortals)");
		} else if (predator == 4) 
		{
			playerCharacter.predatorType = "Cleaver";
			System.out.println("Add a specialty: Persuasion (Gaslighting) or Subterfuge (Coverups)");
			System.out.println("Gain one dot of (1) Dominate or (2) Animalism");
			bonusDisciplineDot = input.nextInt();
			if (bonusDisciplineDot == 1) 
			{
				chosenDisDot = "Dominate";
				if (chosenDisDot == playerCharacter.discipline1Name) 
				{
					playerCharacter.discipline1Rating++;
				} else if (chosenDisDot == playerCharacter.discipline2Name) 
				{
					playerCharacter.discipline2Rating++;
				} else if (chosenDisDot == playerCharacter.discipline3Name) 
				{
					playerCharacter.discipline3Rating++;
				} 
				else 
				{
					playerCharacter.discipline4Name = chosenDisDot;
					playerCharacter.discipline4Rating = 1;
				}
			} 
			else 
			{
				chosenDisDot = "Animalism";
				if (chosenDisDot == playerCharacter.discipline1Name) 
				{
					playerCharacter.discipline1Rating++;
				} else if (chosenDisDot == playerCharacter.discipline2Name) 
				{
					playerCharacter.discipline2Rating++;
				} else if (chosenDisDot == playerCharacter.discipline3Name) 
				{
					playerCharacter.discipline3Rating++;
				} 
				else 
				{
					playerCharacter.discipline4Name = chosenDisDot;
					playerCharacter.discipline4Rating = 1;
				}
			}
			System.out.println("Gain the Dark Secret Flaw: Cleaver");
			System.out.println("Gain the Herd Advantage (2)");
		} else if (predator == 5) 
		{
			playerCharacter.predatorType = "Consenualist";
			System.out.println("Add a specialty: Medicine (Phlebotomy) or Persuasion (Vessels)");
			System.out.println("Gain one dot of (1) Auspex or (2) Fortitude");
			bonusDisciplineDot = input.nextInt();
			if (bonusDisciplineDot == 1) 
			{
				chosenDisDot = "Auspex";
				if (chosenDisDot == playerCharacter.discipline1Name) 
				{
					playerCharacter.discipline1Rating++;
				} else if (chosenDisDot == playerCharacter.discipline2Name) 
				{
					playerCharacter.discipline2Rating++;
				} else if (chosenDisDot == playerCharacter.discipline3Name) 
				{
					playerCharacter.discipline3Rating++;
				} 
				else 
				{
					playerCharacter.discipline4Name = chosenDisDot;
					playerCharacter.discipline4Rating = 1;
				}
			} 
			else 
			{
				chosenDisDot = "Fortitude";
				if (chosenDisDot == playerCharacter.discipline1Name)
				{
					playerCharacter.discipline1Rating++;
				} else if (chosenDisDot == playerCharacter.discipline2Name) 
				{
					playerCharacter.discipline2Rating++;
				} else if (chosenDisDot == playerCharacter.discipline3Name) 
				{
					playerCharacter.discipline3Rating++;
				} 
				else 
				{
					playerCharacter.discipline4Name = chosenDisDot;
					playerCharacter.discipline4Rating = 1;
				}
			}
			System.out.println("You gain one dot in humanity.");
			System.out.println("Gain the Dark Secret Flaw: Masquerade Breacher");
			System.out.println("Gain the Feeding Flaw: Prey Exclusion (nonconsenting)");
		} else if (predator == 6) 
		{
			playerCharacter.predatorType = "Farmer";
			System.out.println("Add a specialty: Animal Ken (Specific Animal) or Survival (Hunting)");
			System.out.println("Gain one dot of (1) Animalism or (2) Protean");
			bonusDisciplineDot = input.nextInt();
			if (bonusDisciplineDot == 1) 
			{
				chosenDisDot = "Animalism";
				if (chosenDisDot == playerCharacter.discipline1Name) 
				{
					playerCharacter.discipline1Rating++;
				} else if (chosenDisDot == playerCharacter.discipline2Name) 
				{
					playerCharacter.discipline2Rating++;
				} else if (chosenDisDot == playerCharacter.discipline3Name) 
				{
					playerCharacter.discipline3Rating++;
				} 
				else 
				{
					playerCharacter.discipline4Name = chosenDisDot;
					playerCharacter.discipline4Rating = 1;
				}
			} 
			else 
			{
				chosenDisDot = "Protean";
				if (chosenDisDot == playerCharacter.discipline1Name) 
				{
					playerCharacter.discipline1Rating++;
				} else if (chosenDisDot == playerCharacter.discipline2Name) 
				{
					playerCharacter.discipline2Rating++;
				} else if (chosenDisDot == playerCharacter.discipline3Name) 
				{
					playerCharacter.discipline3Rating++;
				} 
				else
				{
					playerCharacter.discipline4Name = chosenDisDot;
					playerCharacter.discipline4Rating = 1;
				}
			}
			System.out.println("You gain one dot in humanity.");
			System.out.println("Gain the Feeding Flaw: Farmer");
		} else if (predator == 7) 
		{
			playerCharacter.predatorType = "Osiris";
			System.out.println("Add a specialty: Occult (specific tradition) or Performance " 
			+ "(specific entertainment field)");
			System.out.println("Gain a dot in either (1) Blood Sorcery (Tremere Only) or (2) Presence.");
			bonusDisciplineDot = input.nextInt();
			if ((bonusDisciplineDot == 1) && (playerCharacter.Clan == "Tremere")) 
			{
				chosenDisDot = "Blood Sorcery";
				if (chosenDisDot == playerCharacter.discipline1Name) 
				{
					playerCharacter.discipline1Rating++;
				} else if (chosenDisDot == playerCharacter.discipline2Name) 
				{
					playerCharacter.discipline2Rating++;
				} else if (chosenDisDot == playerCharacter.discipline3Name) 
				{
					playerCharacter.discipline3Rating++;
				} 
				else 
				{
					playerCharacter.discipline4Name = chosenDisDot;
					playerCharacter.discipline4Rating = 1;
				}
			} 
			else 
			{
				chosenDisDot = "Presence";
				if (chosenDisDot == playerCharacter.discipline1Name) 
				{
					playerCharacter.discipline1Rating++;
				} else if (chosenDisDot == playerCharacter.discipline2Name) 
				{
					playerCharacter.discipline2Rating++;
				} else if (chosenDisDot == playerCharacter.discipline3Name) 
				{
					playerCharacter.discipline3Rating++;
				} 
				else 
				{
					playerCharacter.discipline4Name = chosenDisDot;
					playerCharacter.discipline4Rating = 1;
				}
			}
			System.out.println("Spend three dots between the Fame and Herd Backgrounds");
			System.out.println("Spend two dots between the Enemies and Mythic Flaws");
		} else if (predator == 8) 
		{
			playerCharacter.predatorType = "Sandman";
			System.out.println("Add a specialty: Medicine (Anesthetics) or Stealth (Break-in)");
			System.out.println("Gain one dot of (1) Auspex or (2) Obfuscate");
			bonusDisciplineDot = input.nextInt();
			if (bonusDisciplineDot == 1) 
			{
				chosenDisDot = "Auspex";
				if (chosenDisDot == playerCharacter.discipline1Name) 
				{
					playerCharacter.discipline1Rating++;
				} else if (chosenDisDot == playerCharacter.discipline2Name) 
				{
					playerCharacter.discipline2Rating++;
				} else if (chosenDisDot == playerCharacter.discipline3Name) 
				{
					playerCharacter.discipline3Rating++;
				} else 
				{
					playerCharacter.discipline4Name = chosenDisDot;
					playerCharacter.discipline4Rating = 1;
				}
			} 
			else 
			{
				chosenDisDot = "Obfuscate";
				if (chosenDisDot == playerCharacter.discipline1Name) 
				{
					playerCharacter.discipline1Rating++;
				} else if (chosenDisDot == playerCharacter.discipline2Name) 
				{
					playerCharacter.discipline2Rating++;
				} else if (chosenDisDot == playerCharacter.discipline3Name) 
				{
					playerCharacter.discipline3Rating++;
				} 
				else 
				{
					playerCharacter.discipline4Name = chosenDisDot;
					playerCharacter.discipline4Rating = 1;
				}
			}
			System.out.println("Gain one dot of Resources");
		} else if (predator == 9) 
		{
			playerCharacter.predatorType = "Scene Queen";
			System.out.println("Add a specialty: Etiquette (specific scene), Leadership "
					+ "(specific scene), or Streetwise (specific scene)");
			System.out.println("Gain one dot of (1) Dominate or (2) Potence");
			bonusDisciplineDot = input.nextInt();
			if (bonusDisciplineDot == 1) 
			{
				chosenDisDot = "Dominate";
				if (chosenDisDot == playerCharacter.discipline1Name) 
				{
					playerCharacter.discipline1Rating++;
				} else if (chosenDisDot == playerCharacter.discipline2Name) 
				{
					playerCharacter.discipline2Rating++;
				} else if (chosenDisDot == playerCharacter.discipline3Name) 
				{
					playerCharacter.discipline3Rating++;
				} 
				else 
				{
					playerCharacter.discipline4Name = chosenDisDot;
					playerCharacter.discipline4Rating = 1;
				}
			} 
			else 
			{
				chosenDisDot = "Potence";
				if (chosenDisDot == playerCharacter.discipline1Name) 
				{
					playerCharacter.discipline1Rating++;
				} else if (chosenDisDot == playerCharacter.discipline2Name) 
				{
					playerCharacter.discipline2Rating++;
				} else if (chosenDisDot == playerCharacter.discipline3Name) 
				{
					playerCharacter.discipline3Rating++;
				} 
				else 
				{
					playerCharacter.discipline4Name = chosenDisDot;
					playerCharacter.discipline4Rating = 1;
				}
			}
			System.out.println("Gain the Fame Advantage");
			System.out.println("Gain the Contact Advantage");
			System.out.println("Gain either the Influence Flaw: Disliked (outside "
				+ "your subculture) or the Feeding Flaw: Prey Exclusion (a " 
				+ "different subculture from yours)");
		} else if (predator == 10) 
		{
			playerCharacter.predatorType = "Siren";
			System.out.println("Add a specialty: Persuasion (Seduction) or Subterfuge (Seduction)");
			System.out.println("Gain one dot of (1) Fortitude or (2) Presence");
			bonusDisciplineDot = input.nextInt();
			if (bonusDisciplineDot == 1) 
			{
				chosenDisDot = "Fortitude";
				if (chosenDisDot == playerCharacter.discipline1Name) 
				{
					playerCharacter.discipline1Rating++;
				} else if (chosenDisDot == playerCharacter.discipline2Name) 
				{
					playerCharacter.discipline2Rating++;
				} else if (chosenDisDot == playerCharacter.discipline3Name) 
				{
					playerCharacter.discipline3Rating++;
				} 
				else 
				{
					playerCharacter.discipline4Name = chosenDisDot;
					playerCharacter.discipline4Rating = 1;
				}
			} 
			else 
			{
				chosenDisDot = "Presence";
				if (chosenDisDot == playerCharacter.discipline1Name) 
				{
					playerCharacter.discipline1Rating++;
				} else if (chosenDisDot == playerCharacter.discipline2Name) 
				{
					playerCharacter.discipline2Rating++;
				} else if (chosenDisDot == playerCharacter.discipline3Name) 
				{
					playerCharacter.discipline3Rating++;
				} 
				else 
				{
					playerCharacter.discipline4Name = chosenDisDot;
					playerCharacter.discipline4Rating = 1;
				}
			}
			System.out.println("Gain the Looks Merit: Beautiful");
			System.out.println("Gain the Enemy Flaw: A spurned lover or jealous partner");
		}
	}

	public void V5AdvantageSelect() 
	{
		// TODO Auto-generated method stub
		
	}

	public void V5Convictions() 
	{
		// TODO Auto-generated method stub
		
	}

	public void V5Touchstones() 
	{
		// TODO Auto-generated method stub
		
	}

	public void V5Generation() 
	{
		int generation = 0; // section of years turned in
		int generationAlso = 0; // number of generation
		int[][] generationArray;
		generationArray = new int[16][3];
		
		generationArray[0][0] = 4;
		generationArray[0][1] = 5;
		generationArray[0][2] = 10;
		generationArray[1][0] = 5;
		generationArray[1][1] = 2;
		generationArray[1][2] = 9;
		generationArray[2][0] = 6;
		generationArray[2][1] = 3;
		generationArray[2][2] = 8;
		generationArray[3][0] = 7;
		generationArray[3][1] = 3;
		generationArray[3][2] = 7;
		generationArray[4][0] = 8;
		generationArray[4][1] = 2;
		generationArray[4][2] = 6;
		generationArray[5][0] = 9;
		generationArray[5][1] = 2;
		generationArray[5][2] = 5;
		generationArray[6][0] = 10;
		generationArray[6][1] = 1;
		generationArray[6][2] = 4;
		generationArray[7][0] = 11;
		generationArray[7][1] = 1;
		generationArray[7][2] = 4;
		generationArray[8][0] = 12;
		generationArray[8][1] = 1;
		generationArray[8][2] = 3;
		generationArray[9][0] = 13;
		generationArray[9][1] = 1;
		generationArray[9][2] = 3;
		generationArray[10][0] = 14;
		generationArray[10][1] = 0;
		generationArray[10][2] = 0;
		generationArray[11][0] = 15;
		generationArray[11][1] = 0;
		generationArray[11][2] = 0;
		generationArray[12][0] = 16;
		generationArray[12][1] = 0;
		generationArray[12][2] = 0;
		
		
		System.out.println(generationArray);
		/* Generation || min blood potency || max blood potency  
		 * 4					5					10
		 * 5					4					9
		 * 6					3					8
		 * 7					3					7
		 * 8					2					6
		 * 9					2					5
		 * 10					1					4
		 * 11					1					4
		 * 12					1					3
		 * 13					1					3
		 * 14					0					0
		 * 15					0					0 
		 */
		
		if (playerReturns == 1) 
		{
			System.out.println("The only way to increase you generation (from say 13th "
					+ "to 12th) is to drink down another vampire of all of their blood "
					+ "and even devour their soul. Some have said to inherit parts of "
					+ "the memories of those they devour. This disgusting and terrible "
					+ "act is known as Diablerie, which leaves black veigns in the aura "
					+ "of the drinker for a certain length of time. If you are a known "
					+ "diablerist, you can be put to death. This however, is the fastest "
					+ "path to high power and a closer connection to The Dark Father Cain.");
		} else {;}

		System.out.println("Ask your storyteller at this point what the " 
			+ "generation will be before you move further. "
			+ "\nGeneration literally translates to the times removed "
			+ "from Cain you are. Cain is generation \n1, his "
			+ "children were generation 2, and the clan founders " 
			+ "were third generation.");

		System.out.println("(1) Childer: Kindred who have been embraced within "
			+ "the last 15 years from the current date in game "
			+ "\n(assuming it is set in modern times, after the year 2006.)");
		System.out.println();
		System.out.println("Thin Bloods are 14th, 15th, or 16th generation " 
			+ "and the player may choose.");
		System.out.println();
		System.out.println("If you are not a Duskborn/Thinblood, you may " 
			+ "be 12th or 13th generation.\n");
		System.out.println();
		System.out.println("(2) Neonates: Were embraced between 1940 and "
			+ "a decade ago. (2011) They may be either \n12th or 13th generation, "
			+ "and begin with 15 experience points.\n");
		System.out.println();
		System.out.println("(3) Ancillae: Were embraced between 1780 and 1940. "
			+ "They may begin as 10th or 11th generation and \nbegin with 2 "
			+ "extra points of advantages, 2 of flaws, subtracting 1 "
			+ "humanity, and begins with \n35 experience points.");
		System.out.println();
		System.out.println("Please enter the number of your selection, 1 for "
			+ "Childer who were embraced after the year 2006. \n2 for Neonates "
			+ "(1940-2011, or 3 for Ancillae (1780-1940)");
		generation = input.nextInt();
		if (generation == 1) 
		{
			System.out.println("You will be a Childer.");
			if (playerCharacter.Clan == "Duskborn")
			{
				playerCharacter.bloodPotency = 0;
				System.out.println("You have thin blood and are either 14th, 15th, or "
					+ "16th generation. Please enter 14, 15, or 16.");
				generationAlso = input.nextInt();
				while ((generationAlso < 14) && (generationAlso > 16)) 
				{
					System.out.println("This is not a valid generation for a thin blood, "
						+ "please enter a number that is 14, 15, or 16.");
					generationAlso = input.nextInt();
				}
				playerCharacter.Generation = generationAlso;
			}
			else
			{
				System.out.println("You will be a full blood. Are you (1) 12th or " 
					+ "(2) 13th generation?");
				generationAlso = input.nextInt();
				if (generationAlso == 1) 
				{
					playerCharacter.Generation = 12;
				} 
				else 
				{
					playerCharacter.Generation = 13;
				}
			}	
		} 
		else if (generation == 2) 
		{
			System.out.println("You will be a Neonate. Are you (1) 12th or " 
				+ "(2) 13th generation?");
			playerCharacter.bloodPotency = 1;
			generationAlso = input.nextInt();
			if (generationAlso == 1) 
			{
				playerCharacter.Generation = 12;
			} 
			else 
			{
				playerCharacter.Generation = 13;
			}
		} 
		else if (generation == 3) 
		{
			System.out.println("You will be an Ancillae who is either (1) 10th Generation, "
					+ "or (2) 11th Generation. Please enter 1 or 2 now.");
			playerCharacter.bloodPotency = 2;
			generationAlso = input.nextInt();
			if (generationAlso == 1) 
			{
				playerCharacter.Generation = 10;
			} 
			else 
			{
				playerCharacter.Generation = 11;
			}
		}
	}

	public void V5BloodStats() 
	{
		int bloodStatsPotency; // potency of blood
		bloodStatsPotency = playerCharacter.bloodPotency;
		int[][] bloodStatsArray;
		bloodStatsArray = new int [11][7];
		String[] feedingPenaltyArray;
		feedingPenaltyArray = new String[11];
		
		bloodStatsArray [0][0] = 0; //blood potency column start
		bloodStatsArray [1][0] = 1;
		bloodStatsArray [2][0] = 2;
		bloodStatsArray [3][0] = 3;
		bloodStatsArray [4][0] = 4;
		bloodStatsArray [5][0] = 5;
		bloodStatsArray [6][0] = 6;
		bloodStatsArray [7][0] = 7;
		bloodStatsArray [8][0] = 8;
		bloodStatsArray [9][0] = 9;
		bloodStatsArray [10][0] = 10;
		bloodStatsArray [0][1] = 1; //blood surge column start
		bloodStatsArray [1][1] = 2;
		bloodStatsArray [2][1] = 2;
		bloodStatsArray [3][1] = 3;
		bloodStatsArray [4][1] = 3;
		bloodStatsArray [5][1] = 4;
		bloodStatsArray [6][1] = 4;
		bloodStatsArray [7][1] = 5;
		bloodStatsArray [8][1] = 5;
		bloodStatsArray [9][1] = 6;
		bloodStatsArray [10][1] = 6;
		bloodStatsArray [0][2] = 1; //Damage Mended per Rouse Check column start
		bloodStatsArray [1][2] = 1;
		bloodStatsArray [2][2] = 2;
		bloodStatsArray [3][2] = 2;
		bloodStatsArray [4][2] = 3;
		bloodStatsArray [5][2] = 3;
		bloodStatsArray [6][2] = 3;
		bloodStatsArray [7][2] = 3;
		bloodStatsArray [8][2] = 4;
		bloodStatsArray [9][2] = 4;
		bloodStatsArray [10][2] = 5;
		bloodStatsArray [0][3] = 0; //Discipline Power Bonus column start
		bloodStatsArray [1][3] = 0;
		bloodStatsArray [2][3] = 1;
		bloodStatsArray [3][3] = 1;
		bloodStatsArray [4][3] = 2;
		bloodStatsArray [5][3] = 2;
		bloodStatsArray [6][3] = 3;
		bloodStatsArray [7][3] = 3;
		bloodStatsArray [8][3] = 4;
		bloodStatsArray [9][3] = 4;
		bloodStatsArray [10][3] = 5;
		bloodStatsArray [0][4] = 0; //Discipline Rouse Check Re-Roll column start
		bloodStatsArray [1][4] = 1;
		bloodStatsArray [2][4] = 1;
		bloodStatsArray [3][4] = 2;
		bloodStatsArray [4][4] = 2;
		bloodStatsArray [5][4] = 3;
		bloodStatsArray [6][4] = 3;
		bloodStatsArray [7][4] = 4;
		bloodStatsArray [8][4] = 4;
		bloodStatsArray [9][4] = 5;
		bloodStatsArray [10][4] = 5;		
		bloodStatsArray [0][5] = 0; //Bane Severity column start
		bloodStatsArray [1][5] = 2;
		bloodStatsArray [2][5] = 2;
		bloodStatsArray [3][5] = 3;
		bloodStatsArray [4][5] = 3;
		bloodStatsArray [5][5] = 4;
		bloodStatsArray [6][5] = 4;
		bloodStatsArray [7][5] = 5;
		bloodStatsArray [8][5] = 5;
		bloodStatsArray [9][5] = 6;
		bloodStatsArray [10][5] = 6;
		feedingPenaltyArray [0] = "None";
		feedingPenaltyArray [1] = "None";
		feedingPenaltyArray [2] = "Animal and bagged blood slakes half Hunger";
		feedingPenaltyArray [3] = "Animal and bagged blood slakes no Hunger";
		feedingPenaltyArray [4] = "Animal and bagged blood slakes no Hunger. "
				+ "Slake 1 less Hunger per human";
		feedingPenaltyArray [5] = "Animal and bagged blood slakes no Hunger. "
				+ "Slake 1 less Hunger per human. Must drain and kill a human to " 
				+ "reduce Hunger below 2";
		feedingPenaltyArray [6] = "Animal and bagged blood slakes no Hunger. "
				+ "Slake 2 less Hunger per human. Must drain and kill a human to " 
				+ "reduce Hunger below 2";
		feedingPenaltyArray [7] = "Animal and bagged blood slakes no Hunger. "
				+ "Slake 2 less Hunger per human. Must drain and kill a human to " 
				+ "reduce Hunger below 3";
		feedingPenaltyArray [8] = "Animal and bagged blood slakes no Hunger. "
				+ "Slake 2 less Hunger per human. Must drain and kill a human to " 
				+ "reduce Hunger below 3";
		feedingPenaltyArray [9] = "Animal and bagged blood slakes no Hunger. "
				+ "Slake 2 less Hunger per human. Must drain and kill a human to " 
				+ "reduce Hunger below 3";
		feedingPenaltyArray [10] = "Animal and bagged blood slakes no Hunger."
				+ "Slake 3 less Hunger per human. Must drain and kill a human to"
				+ "reduce Hunger below 3";
		
/* Blood Potency||Blood Surge||DamageMended Per RouseCheck||Discipline PowerBonus||Discipline RouseCheck Reroll||Bane Severity||Feeding penalty
* 0					1						1							0							0					0				None
* 1					2						1							0							1					2				None
* 2					2						2							1							1					2				None
* 3					3						2							1							2					3				None
* 4					3						3							2							2					3				None
* 5					4						3							2							3					4				None
* 6					4						3							3							3					4				None
* 7					5						3							3							4					5				None
* 8					5						4							4							4					5				None
* 9					6						4							4							5					6				None
* 10 				6						5							5							5					6				None
*/
		
		if (bloodStatsPotency == 0) 
		{
			playerCharacter.bloodSurge = bloodStatsArray[0][1];
			playerCharacter.mendAmount = bloodStatsArray[0][2];
			playerCharacter.powerBonus = bloodStatsArray[0][3];
			playerCharacter.rouseReroll = bloodStatsArray[0][4];
			playerCharacter.baneSeverity = bloodStatsArray[0][5];
			playerCharacter.feedingPenalty = feedingPenaltyArray [0];
		} else if (bloodStatsPotency == 1) 
		{
			playerCharacter.bloodSurge = bloodStatsArray[1][1];
			playerCharacter.mendAmount = bloodStatsArray[1][2];
			playerCharacter.powerBonus = bloodStatsArray[1][3];
			playerCharacter.rouseReroll = bloodStatsArray[1][4];
			playerCharacter.baneSeverity = bloodStatsArray[1][5];
			playerCharacter.feedingPenalty = feedingPenaltyArray [1];
		} else if (bloodStatsPotency == 2) 
		{
			playerCharacter.bloodSurge = bloodStatsArray[2][1];
			playerCharacter.mendAmount = bloodStatsArray[2][2];
			playerCharacter.powerBonus = bloodStatsArray[2][3];
			playerCharacter.rouseReroll = bloodStatsArray[2][4];
			playerCharacter.baneSeverity = bloodStatsArray[2][5];
			playerCharacter.feedingPenalty = feedingPenaltyArray [2];
		} else if (bloodStatsPotency == 3) 
		{
			playerCharacter.bloodSurge = bloodStatsArray[3][1];
			playerCharacter.mendAmount = bloodStatsArray[3][2];
			playerCharacter.powerBonus = bloodStatsArray[3][3];
			playerCharacter.rouseReroll = bloodStatsArray[3][4];
			playerCharacter.baneSeverity = bloodStatsArray[3][5];
			playerCharacter.feedingPenalty = feedingPenaltyArray [3];
		} else if (bloodStatsPotency == 4) 
		{
			playerCharacter.bloodSurge = bloodStatsArray[4][1];
			playerCharacter.mendAmount = bloodStatsArray[4][2];
			playerCharacter.powerBonus = bloodStatsArray[4][3];
			playerCharacter.rouseReroll = bloodStatsArray[4][4];
			playerCharacter.baneSeverity = bloodStatsArray[4][5];
			playerCharacter.feedingPenalty = feedingPenaltyArray [4];
		} else if (bloodStatsPotency == 5) 
		{
			playerCharacter.bloodSurge = bloodStatsArray[5][1];
			playerCharacter.mendAmount = bloodStatsArray[5][2];
			playerCharacter.powerBonus = bloodStatsArray[5][3];
			playerCharacter.rouseReroll = bloodStatsArray[5][4];
			playerCharacter.baneSeverity = bloodStatsArray[5][5];
			playerCharacter.feedingPenalty = feedingPenaltyArray [5];
		} else if (bloodStatsPotency == 6) 
		{
			playerCharacter.bloodSurge = bloodStatsArray[6][1];
			playerCharacter.mendAmount = bloodStatsArray[6][2];
			playerCharacter.powerBonus = bloodStatsArray[6][3];
			playerCharacter.rouseReroll = bloodStatsArray[6][4];
			playerCharacter.baneSeverity = bloodStatsArray[6][5];
			playerCharacter.feedingPenalty = feedingPenaltyArray [6];
		} else if (bloodStatsPotency == 7) 
		{
			playerCharacter.bloodSurge = bloodStatsArray[7][1];
			playerCharacter.mendAmount = bloodStatsArray[7][2];
			playerCharacter.powerBonus = bloodStatsArray[7][3];
			playerCharacter.rouseReroll = bloodStatsArray[7][4];
			playerCharacter.baneSeverity = bloodStatsArray[7][5];
			playerCharacter.feedingPenalty = feedingPenaltyArray [7];
		} else if (bloodStatsPotency == 8) 
		{
			playerCharacter.bloodSurge = bloodStatsArray[8][1];
			playerCharacter.mendAmount = bloodStatsArray[8][2];
			playerCharacter.powerBonus = bloodStatsArray[8][3];
			playerCharacter.rouseReroll = bloodStatsArray[8][4];
			playerCharacter.baneSeverity = bloodStatsArray[8][5];
			playerCharacter.feedingPenalty = feedingPenaltyArray [8];
		} else if (bloodStatsPotency == 9) 
		{
			playerCharacter.bloodSurge = bloodStatsArray[9][1];
			playerCharacter.mendAmount = bloodStatsArray[9][2];
			playerCharacter.powerBonus = bloodStatsArray[9][3];
			playerCharacter.rouseReroll = bloodStatsArray[9][4];
			playerCharacter.baneSeverity = bloodStatsArray[9][5];
			playerCharacter.feedingPenalty = feedingPenaltyArray [9];
		} else if (bloodStatsPotency == 10) 
		{
			playerCharacter.bloodSurge = bloodStatsArray[10][1];
			playerCharacter.mendAmount = bloodStatsArray[10][2];
			playerCharacter.powerBonus = bloodStatsArray[10][3];
			playerCharacter.rouseReroll = bloodStatsArray[10][4];
			playerCharacter.baneSeverity = bloodStatsArray[10][5];
			playerCharacter.feedingPenalty = feedingPenaltyArray [10];
		}
	}

	public void V5DisciplinePick() 
	{
		int higherDiscipline;
		int lowerDiscipline;

		if (playerReturns == 1) 
		{
			System.out.println("If you diablerize another vampire, you will gain access to "
				+ "all of the disciplines that they know. Otherwise, you would have to "
				+ "regularly drink the blood of another kindred so they could teach you "
				+ "their power, and also have control over you. Some disciplines are highly "
				+ "guarded as clan secrets, others having subsets of power that only a "
				+ "specific clan knows of.");
		} else {;}

		System.out.println("Each of the clans has their own vampiric powers "
			+ "called disciplines. Here are the ones that came with the "
			+ "clan you selected.\nIf you want to know the specific "
			+ "powers or just get more information about your " 
			+ "disciplines, type in (Ex: Read.Celerity.");

		System.out.println("Beginning vampires, or Kindred as they are " 
			+ "known to each other, begin with only so much power. "
			+ "You will be able to take two of \nthe disciplines your "
			+ "clan gives you access to, one of them can start at "
			+ "level 1, the other at level 2. The third \ndiscipline "
			+ "can be bought later with in game experience. \n");
		System.out.println("When you picked the clan " + playerCharacter.Clan 
			+ " you got three disciplines which you will have access to. They are\n " 
			+ "(1) " + playerCharacter.discipline1Name + ", "
			+ "(2) " + playerCharacter.discipline2Name + ", and " 
			+ "(3) " + playerCharacter.discipline3Name + ".");
		System.out.println("Which of the three disciplines would you like to be rated at 2?");
		higherDiscipline = input.nextInt();
		System.out.println("Which of the last two disciplines would you like to be rated at 1?");
		lowerDiscipline = input.nextInt();
		System.out.println();
	}

	public void V5CharacterDetails() 
	{
		int playerBirthDate; // character's birth date
		int playerTurnDate; // charater's turn-date
		int playerAge; // character's age
		String hairColor; // character's hair color
		String eyeColor; // character's eye color
		String originalNationality; // character's original nationality
		String currentNationality; // character's current nationality

		System.out.println("When was your character born? Please " 
			+ "enter it in the following format. "
			+ "(Month, Day, Year) 08301994");
		playerBirthDate = input.nextInt();
		playerCharacter.birthDate = playerBirthDate;
		System.out.println("When was your character " 
			+ "turned into a vampire?");
		playerTurnDate = input.nextInt();
		playerCharacter.turnDate = playerTurnDate;
		System.out.println("How old is your character?");
		playerAge = input.nextInt();
		playerCharacter.Age = playerAge;
		System.out.println("What is your character's hair color?");
		hairColor = input.next();
		playerCharacter.hairColor = hairColor;
		System.out.println("What is your character's eye color?");
		eyeColor = input.next();
		playerCharacter.eyeColor = eyeColor;
		System.out.println("What is your character's current " 
			+ "nationality?");
		currentNationality = input.next();
		playerCharacter.currentNationality = currentNationality;
		System.out.println("What is your character's original " 
			+ "nationality?");
		originalNationality = input.next();
		playerCharacter.originalNationality = originalNationality;
	}

	public void V5EquipShop() 
	{
		// TODO Auto-generated method stub
		
	}

	public void V5Stats2() 
	{
		// TODO Auto-generated method stub
		
	}

	public void V5CharReview() 
	{
//		Date date = new Date();//current date value
//		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
//		System.out.println(formatter.format(calendar.getTime()));

		System.out.println("Name: " + Character.name);
		System.out.println("Clan: " + playerCharacter.Clan);
		System.out.println("You were born: " + playerCharacter.birthDate 
			+ " and you were embraced on "	+ playerCharacter.turnDate);
		System.out.println("Apparent Age: " + (playerCharacter.turnDate - playerCharacter.birthDate));
		System.out.println("Actual Age: " + (2021 - playerCharacter.birthDate));
		System.out.println("Willpower: " + playerCharacter.Willpower);
		System.out.println("Humanity: " + playerCharacter.Humanity);
		System.out.println("Generation: " + playerCharacter.Generation);
		System.out.println("Predator Type: " + playerCharacter.predatorType);
		// attributes
		// talents, skills, knowledges
		System.out.println();
		System.out.println("Blood Surge: " + playerCharacter.bloodSurge);
		System.out.println("Blood Potency: " + playerCharacter.bloodPotency);
		System.out.println("Mend Amount: " + playerCharacter.mendAmount);
		System.out.println("Rouse ReRoll: " + playerCharacter.rouseReroll);
		System.out.println("Power Bonus: " + playerCharacter.powerBonus);
		System.out.println("Feeding Penalty: " + playerCharacter.feedingPenalty);
		System.out.println("Bane Severity: " + playerCharacter.baneSeverity);
		System.out.println("Your disciplines are: \n");
		System.out.println(playerCharacter.discipline1Name + ":" 
			+ playerCharacter.discipline1Rating);
		System.out.println(playerCharacter.discipline2Name + ":" 
			+ playerCharacter.discipline2Rating);
		System.out.println(playerCharacter.discipline3Name + ":" 
			+ playerCharacter.discipline3Rating);
		System.out.println(playerCharacter.discipline4Name + ":" 
			+ playerCharacter.discipline4Rating);
		System.out.println(playerCharacter.discipline5Name + ":" 
			+ playerCharacter.discipline5Rating);
		System.out.println(playerCharacter.discipline6Name + ":" 
			+ playerCharacter.discipline6Rating);
		System.out.println(playerCharacter.discipline7Name + ":" 
			+ playerCharacter.discipline7Rating);
		System.out.println(playerCharacter.discipline8Name + ":" 
			+ playerCharacter.discipline8Rating);
		System.out.println(playerCharacter.discipline9Name + ":" 
			+ playerCharacter.discipline9Rating);
		System.out.println(playerCharacter.discipline10Name + ":" 
			+ playerCharacter.discipline10Rating);
		System.out.println("You've earned a total of " + playerCharacter.totalExperience 
				+ " and currently have "+ playerCharacter.currentExperience);
		System.out.println("Hair Color: " + playerCharacter.hairColor);
		System.out.println("Eye Color: " + playerCharacter.eyeColor);
		System.out.println("Original Nationality: " + playerCharacter.originalNationality);
		System.out.println("Current Nationality: " + playerCharacter.currentNationality);
	}

	public void V5Export() 
	{
		// TODO Auto-generated method stub
		
	}
	
	public void V5ClanList() 
	{
		if (playerReturns1 == 1) 
		{
			System.out.println("The original clans were Assamites, Brujah, Cappadocian, "
					+ "Followers of Set, Gangrel, Lasombra, Malkavian, Nosferatu, Ravnos, "
					+ "Salubri, Toreador, Tzimisce, Ventrue.");
			System.out.println("The Tremere drank down the Salubri, The Giovanni drank "
					+ "the Cappadocians, The Assamites are now known as the Banu Haqim, "
					+ "and The Followers of Set are now The Ministry. The Brujah had an "
					+ "uprising, Troil drank down Brujah and the rest of his children "
					+ "became known as the Brujah clan. Those who are True Brujah, "
					+ "descended from the original elders are said to be manipulators "
					+ "of time and emotionless.");
			System.out.println("It was possible that there were others of the 2nd and "
					+ "3rd generation that had the potential too but never sired a clan.");
			System.out.println();
			System.out.println();
			System.out.println("The Camarilla: The Camarilla is an Alliance of various clans "
					+ "that are intent on keeping the Masquerade uphold and specific structures "
					+ "of power. It consists of The Banu Haqim, Brujah, Caitiff, Duskborn, "
					+ "Gangrel, Lasombra, Malkavian, Nosferatu, Toreador, Tremere, and Ventrue. "
					+ "They have a representative for each clan called a Primogen who reports to "
					+ "The Prince. The Lasombra and Banu Haqim are the most recent additions to "
					+ "The Camarilla, which was initially founded during The First Inquisition. "
					+ "They are ruthless to those who reject their laws.");
			
		} else {;}
		
		System.out.println("(1) Banu Haqim: An egyptian and arabian clan that has been "
			+ "consistently contracted for murder for hire, they fled their own \nclan "
			+ "who had a history of diablerie (the horrible act of drinking other "
			+ "vampires down to their very soul for their power \nand memories.) To "
			+ "avoid being slaughtered as a meal for one of their ancient, a large "
			+ "portion defected and ran to join other \nalliances. They are known for "
			+ "their stealth, combat ability, and speed.\n");
		System.out.println();/// bufferspace
		System.out.println("(2) Brujah: A clan of rebel punks who originally ruled "
			+ "carthage and pondered philosophy. When carthage burned, they became "
			+ "punks \nwho are desperate and willing to fight to change the system "
			+ "from the inside. They are outspoken, brash, and violent typically.\n");
		System.out.println();/// bufferspace
		System.out.println("(3) Caitiff: Also called 'The Clanless', they're made by "
			+ "accident and for an unknown reason when a kindred tries to turn \nsomeone "
			+ "into a vampire. Something goes wrong and the person who wakes up has no "
			+ "imprint of the clan weakness or features. \nThey typically have access to "
			+ "the disciplines of their sires clan, but have been known to be created "
			+ "with a talent for powers \nthat seemingly came from nowhere. They are hated "
			+ "as bastard children and band together to survive, previous regimes of "
			+ "kindred \nkilling them off for supposedly being a sign of an end time.\n");
		System.out.println();/// bufferspace
		System.out.println("(4) Duskborn aka (Thin Blood): These vampires are descended "
			+ "from Cain 14, 15, or even 16 times. They have been called half \nvampires "
			+ "and are depicted as semi vampiric mortals, or semi mortal vampires. They "
			+ "can walk the sun without completely burning \nbut will still feel pain. "
			+ "They have no ability to manifest the powers of the blood. They were "
			+ "treated as less than the Caitiff \nuntil it was realised that they could "
			+ "be used as pawns and daywalkers by other vampires. If they drink down "
			+ "the blood and soul \nof a vampire who is 13th generation or higher, "
			+ "they become full blooded of the clan they drank. Until then, they "
			+ "are cursed to \nlive with no true life on either side.\n");
		System.out.println();/// bufferspace
		System.out.println("(5) Gangrel: The wild dogs and animals of the vampire race, "
			+ "known for shapeshifting and running in packs. They are known for \nliving "
			+ "in the wild on their own and melting into the earth to sleep out the sun "
			+ "if they have to. Familiar to the wild, the \nhomeless, and the feral, the "
			+ "Gangrel are known for fighting with tooth and claw.\n");
		System.out.println();/// bufferspace
		System.out.println("(6) Hecata: A collection of multiple clans that had similar "
				+ "interests in survival, the hecata are classic necromancers as \nopposed "
				+ "to the traditional sorcerer that is a tremere. They consist of many "
				+ "'bloodlines' that come from their clan banding \ntogether in times of need.\n");
		System.out.println();/// bufferspace
		System.out.println("(7) Hecata (Giovanni): Incestuous, Capitalist, Murderous, all of "
				+ "these are second nature to the Giovanni blood of the Hecata. \nThey are "
				+ "disgustingly entangled, selecting only the best or the most cuthroat of "
				+ "their mortal relatives to make it into \nvampiric society.\n");
		System.out.println();/// bufferspace
		System.out.println("(8) Hecata (Harbingers of Skulls): The Cappadocian clan and The "
				+ "Harbingers of skulls were one of the original clans that Cain \nbrought into "
				+ "this world. They were sealed inside of a cave and emerged as a hideous "
				+ "reflection of who they used to be. Pledging \nrevenge, they originally "
				+ "targeted the Giovanni for drinking them down. Today they seek alliance "
				+ "with fellow practitioners of \ndeath.");
		System.out.println();/// bufferspace
		System.out.println("(9) Hecata (Lamiae)");
		System.out.println();/// bufferspace
		System.out.println("(10) Hecata (Nagaraja): Originally known as cannibals, they were the "
				+ "cannibalistic tribes that were embraced into vampirism. \nThey have been known "
				+ "to eat their entire victim.");
		System.out.println();/// bufferspace
		System.out.println("(11) Hecata (Samedi): The Samedi are called the children of the "
				+ "baron samedi. Originally from the culture and practices of \nhoodoo and "
				+ "voodoo, they are masters of decay.");
		System.out.println();/// bufferspace
		System.out.println("(12) Lasombra: Shadow manipulation is the primary art of the Lasombra, "
				+ "who have always had a connection to the church. They have \nbeen known to make "
				+ "their havens within places of religion to avoid detection. A different kind of "
				+ "lord, the lasombra cant cast a \nshadow and experience brutal pains from sunlight, "
				+ "even more so than the rest of the kindred.");
		System.out.println();/// bufferspace
		System.out.println("(13) Malkavian: The Loons or The Crazies. Malkav, the clan "
			+ "progenator was said to have built a statue of Cain as a joke that \ndefamed "
			+ "him (in what was possibly a sexual act). Malkav was smote by Cain with "
			+ "permanent and unflinching psychosis that would \nshatter his entire psyche. "
			+ "So powerful was his madness, that some believe he didnt die but now lives "
			+ "in the web of madness his \nclan now possesses. The Loons have been known "
			+ "to hear voices, recieve visions, and randomly gather for events they have "
			+ "no idea \nhave started. They have seen the future, but the price is carrying "
			+ "the same madness as their elder.\n");
		System.out.println();/// bufferspace
		System.out.println("(14) Nosferatu: Cursed with horrible ugliness or an aura that "
			+ "alerts everyone around them to being an obvious predator, the \nNosferatu are "
			+ "unable to see even the open streets. They are the clan of secrets and have "
			+ "long been information dealers to all \nparties. They are one of the few clans "
			+ "known to uphold extreme loyalty to their clan before any faction. Insane "
			+ "strength, \ninvisible eyes everywhere, and having strings in every city is "
			+ "the goal of a nosferatu.\n");
		System.out.println();/// bufferspace
		System.out.println("(15) Ravnos: True rogues who follow their own path, the Ravnos "
				+ "affliction of one of always following their desire. They have \nabilities of "
				+ "illusions and take on entirely new identities whenever they please. "
				+ "Vagabonds, performance artists, and self \ninterested kinrded make up the "
				+ "Ravnos.");
		System.out.println();/// bufferspace
		System.out.println("(16) Salubri: Gifted with a third eye in the center of their face, "
			+ "they were one of the orignal clans before they were drunk \ndown for their power "
			+ "by the Tremere. The Salubri were known healers who were also a holy warrior clan, "
			+ "a leftover sign that God \nhad never truly left hope or redeption out of the reach "
			+ "of vampires. They were removed from the earth almost entirely, and now \noperate "
			+ "as silently as possible for fear of being destroyed again.\n");
		System.out.println();/// bufferspace
		System.out.println("(17) The Ministry or Setites: The Ministry is the current name for "
			+ "Setites, or Followers of Set. They believed that Set was the \noriginal maker of "
			+ "all vampires. They are a sort of cult who weild favors and religious powers.\n");
		System.out.println();/// bufferspace
		System.out.println("(18) Toreador: This clan has kept so much more of their emotional depth "
			+ "and connection to what it was like to be human. They are \nthe artists, the musicians, "
			+ "the writers, the creators, the influencers, and those with a unique sort of gift that "
			+ "has drawn the \nattention of the clan. They are also ridiculed for being known to still "
			+ "engage in sex.\n");
		System.out.println();/// bufferspace
		System.out.println("(19) Tremere: A clan of sorcerers, fueled by blood to gain insane amounts of "
			+ "power. They singlehandedly waged war on behalf of \nthe Camarilla, and have continued to "
			+ "gain power. They were known to bond their underlings to the pyramid of power so no one "
			+ "\ndares break their rule.\n");
		System.out.println();/// bufferspace
		System.out.println("(20) Tzimisce: A clan of lords and terrible controllers, the Tzimisce have "
			+ "been known for fleshcrafting. They could pull flesh \nlike it was clay and make terrible "
			+ "creatures or shape themselves into true horror or true beauty.\n");
		System.out.println();/// bufferspace
		System.out.println("(21) Ventrue: The lords of the damned. The Ventrue are the CEO's of the "
			+ "vampire world. They rule in whatever they do. The \nVentrue nature is to be selective, deal "
			+ "in favors, and backstab like a king does to his subjects. They are the evil that lurks \n"
			+ "in a suit.\n");
		System.out.println();/// bufferspace
	}

	public void V5DisciplineList() 
	{
		System.out.println("(1) Auspex - Supernatural sensory enhancement, "
				+ "telepathy, psychic projection, & aura perception.");
			System.out.println("(2) Blood Sorcery - A form of magic that "
				+ "functions around a vampires blood, or uses it to grant " 
				+ "them other powers.");
			System.out.println("(3) Celerity - Enhanced speed, reactions, and movement.");
			System.out.println("(4) Dominate - Mental controlling of other people & "
				+ "forcing simple to complex actions inside their will.");
			System.out.println("(5) Fortitude - Enhanced resistence, enabling the user "
				+ "to withstand extremely high amounts of pain & still fight back.");
			System.out.println("(6) Obfuscate - Supernatural covering, invisibility, sensory "
				+ "masking, and manipulation of light or perceptions.");
			System.out.println("(7) Oblivion - Manipulation of shadows into deadly " 
				+ "weapons & cover to hide in.");
			System.out.println("(8) Potence - Enhanced strength, allowing the user to smash "
				+ "concrete, throw cars, and break enemies.");
			System.out.println("(9) Presence - Social manipulation that makes the victim "
				+ "believe they are wanting to do acts. Unlike dominate, this "
				+ "plays on the emotions of the victim. It can inspire love, "
				+ "jealousy, and spark riots.");
			System.out.println("(10) Protean - Supernatural manipulation of the flesh " 
				+ "and physical nature of being a vampire.");
			System.out.println("(11) Thin Blood Alchemy - A form of potion mixing with "
				+ "the strange nature of those so thin blooded they are "
				+ "halfway between human and vampire. They then use these " 
				+ "potions for various effects.");
	}
}//end of class