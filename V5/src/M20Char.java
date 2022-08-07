/*began 1.31.22 
 * Emily Lederman
 */

import java.util.Random;
import java.util.Scanner;
public class M20Char implements charactermaker
{
	String charName;
	String hairColor;
	String eyeColor;
	String originalNationality;
	String currentNationality;
	String faction; //9 traditions, dispartes, technocracy, mauraders, nephandi
	String sect; //orphan, order of hermes, iteration X
	int charStrength;
	int charDexterity;
	int charStamina;
	int charManipulation;
	int charCharisma;
	int charAppearance;
	int charIntelligence;
	int charWits;
	int charPerception;
	int birthDate;
	int age;
	int correspondenceRating; //sphere
	int entropyRating;//sphere
	int forcesRating;//sphere
	int lifeRating;//sphere
	int matterRating;//sphere
	int mindRating;//sphere
	int primeRating;//sphere
	int spiritRating;//sphere
	int timeRating;//sphere
	int dimensionalScienceRating;//alt sphere
	int dataRating;//alt sphere
	int primalUtilityRating;//alt sphere
	int areteRating;
	int maximumQuintessence;
	int maximumParadox;
	int currentQuintessence;
	int currentParadox;
	int willpowerRating;
	int alertness;
	int art;
	int awareness;
	int brawl;
	int empathy;
	int expression;
	int intimidation;
	int leadership;
	int streetwise;
	int subterfuge;
	int crafts;
	int drive;
	int etiquette;
	int firearms;
	int martialArts;
	int meditation;
	int melee;
	int research;
	int stealth;
	int survival;
	int technology;
	int academics;
	int computer;
	int cosmology;
	int enigmas;
	int esoterica;
	int investigation;
	int law;
	int medicine;
	int occult;
	int politics;
	int science;
	int currentExperience;
	int totalExperienceEarned;
	int experienceSpent;
	String paradigm;
	String practice1;
	String practice2;
	String practice3;
	String instrument1;
	String instrument2;
	String instrument3;
	String instrument4;
	String instrument5;
	String instrument6;
	String instrument7;
	String instrument8;
	String instrument9;
	String instrument10;
	String instrument11;
	String instrument12;
	String instrument13;
	String instrument14;
	String instrument15;
	String instrument16;
	String instrument17;
	String instrument18;
	String instrument19;
	String instrument20;
	String instrument21;	
	String instrument22;
	String instrument23;
	String instrument24;
	String instrument25;
	int ageOfAwakening;
	String gender;
	String height;
	String weight;
	String eyes;
	String hair;
	int apparentAge;
	int totalSeekings;
	int totalQuiets;
	String avatarEssence;
	String nature;
	String demeanor;
	String concept;
	int tempWillpower;
	String affinitySphere;
	
	static Scanner input = new Scanner(System.in);
	static Random randGen = new Random();

	
	public M20Char() //default constructor
	{
		this.charName = "Blank Name";
		this.hairColor = "hair";
		this.eyeColor = "eyes";
		this.originalNationality = "country";
		this.currentNationality = "current country";
		this.faction = "faction"; //9 traditions, dispartes, technocracy, mauraders, nephandi
		this.sect = "faction"; //orphan, order of hermes, iteration X
		this.charStrength = 0;
		this.charDexterity = 0;
		this.charStamina = 0;
		this.charManipulation = 0;
		this.charCharisma = 0;
		this.charAppearance = 0;
		this.charIntelligence = 0;
		this.charWits = 0;
		this.charPerception = 0;
		this.birthDate = 0;
		this.age = 0;
		this.correspondenceRating = 0; //sphere
		this.entropyRating = 0;//sphere
		this.forcesRating = 0;//sphere
		this.lifeRating = 0;//sphere
		this.matterRating = 0;//sphere
		this.mindRating = 0;//sphere
		this.primeRating = 0;//sphere
		this.spiritRating = 0;//sphere
		this.timeRating = 0;//sphere
		this.dimensionalScienceRating = 0;//alt sphere
		this.dataRating = 0;//alt sphere
		this.primalUtilityRating = 0;//alt sphere
		this.areteRating = 0;
		this.maximumQuintessence = 0;
		this.maximumParadox = 0;
		this.currentQuintessence = 0;
		this.currentParadox = 0;
		this.willpowerRating = 0;
		this.alertness = 0;
		this.art = 0;
		this.awareness = 0;
		this.brawl = 0;
		this.empathy = 0;
		this.expression = 0;
		this.intimidation = 0;
		this.leadership = 0;
		this.streetwise = 0;
		this.subterfuge = 0;
		this.crafts = 0;
		this.drive = 0;
		this.etiquette = 0;
		this.firearms = 0;
		this.martialArts = 0;
		this.meditation = 0;
		this.melee = 0;
		this.research = 0;
		this.stealth = 0;
		this.survival = 0;
		this.technology = 0;
		this.academics = 0;
		this.computer = 0;
		this.cosmology = 0;
		this.enigmas = 0;
		this.esoterica = 0;
		this.investigation = 0;
		this.law = 0;
		this.medicine = 0;
		this.occult = 0;
		this.politics = 0;
		this.science = 0;
		this.currentExperience = 0;
		this.totalExperienceEarned = 0;
		this.experienceSpent = 0;
		this.paradigm = "";
		this.practice1 = "";
		this.practice2 = "";
		this.practice3 = "";
		this.instrument1 = "";
		this.instrument2 = "";
		this.instrument3 = "";
		this.instrument4 = "";
		this.instrument5 = "";
		this.instrument6 = "";
		this.instrument7 = "";
		this.instrument8 = "";
		this.instrument9 = "";
		this.instrument10 = "";
		this.instrument11 = "";
		this.instrument12 = "";
		this.instrument13 = "";
		this.instrument14 = "";
		this.instrument15 = "";
		this.instrument16 = "";
		this.instrument17 = "";
		this.instrument18 = "";
		this.instrument19 = "";
		this.instrument20 = "";
		this.instrument21 = "";	
		this.instrument22 = "";
		this.instrument23 = "";
		this.instrument24 = "";
		this.instrument25 = "";
		this.ageOfAwakening = 0;
		this.gender = "";
		this.height = "";
		this.weight = "";
		this.eyes = "";
		this.hair = "";
		this.apparentAge = 0;
		this.totalSeekings = 0;
		this.totalQuiets = 0;
		this.avatarEssence = "";
		this.nature = "";
		this.demeanor = "";
		this.concept = "";
		this.affinitySphere = "";
	}

	
	public void openingDialog() 
	{
		System.out.println("Welcome to the Mage The Ascension 20th Anniversary "
				+ "character creator. In Mage you play a human who has awakened "
				+ "to the undeniable fact that magic is real. In this game, you strive "
				+ "to save the world with the help of other mages while keeping the "
				+ "secrets of magic hidden from humanity.");
	}
	
	public void attributePicker() 
	{
		System.out.println("The attributes are divided into social, mental, and physical. "
				+ "They are listed as follows.");
		System.out.println("Physical: Strength, Dexterity, and Stamina");
		System.out.println("Social: Charisma, Manipulation, and Appearance.");
		System.out.println("Mental: Intelligence, Wits, and Perception");
		
		System.out.println("You must select a Primary, Secondary, and Tertiary category"
				+ " with each recieving points based on which is selected.");
		System.out.println("Please select a Primary.");
	}

	public void skillPicker() 
	{
		// TODO Auto-generated method stub
	}
	
	public void factionpick() 
	{
		int factionSelect = 0;
		int sectSelect = 0;
		
		System.out.println("Mage is a 5 way struggle for reality. The following "
				+ "factions are battling for control of what everyone believes "
				+ "in. They stand as a face to all practices that order and "
				+ "tradition can withstand anything if they stick together. "
				+ "They are collectively some of the oldest and strongest "
				+ "groups.");
		System.out.println("1. The 9 Traditions: Who believe that magic is "
				+ "fantastical and reality should be fluid and shifting.");
		System.out.println("2. The Technocracy: Who view magic as an enlightened "
				+ "science. Who aim to purge reality of paradigms that dont align "
				+ "with the scientific mindset that can pair with magic. They bond "
				+ "together in conventions of men in black style congregations, "
				+ "for science that can save humankind.");
		System.out.println("3. The Disparates Alliance: Traditions, practices, and"
				+ " magical practices who were not invited or were not interested "
				+ "in the 9 traditions. They are a loose collection who believe "
				+ "individual traditions should honor each other while pursuing "
				+ "their own goals. They include the practices that had been "
				+ "subjected to the trials of history and humanity.");
		System.out.println("4. The Mauraders: Who have achieved magic so vast it "
				+ "has cracked them into unending madness that bends reality around "
				+ "them. They are permanently lost and true master of their own made "
				+ "world, as it's always second to their insanity. They are an "
				+ "example of true power at the cost of everything you knew.");
		System.out.println("5. The Nephandi: Who believe that humanity should not ascend, "
				+ "but descend. The merciful thing to do is abuse everyone around you and "
				+ "shed humanity so they can snuff out reality in a blink. They are the "
				+ "worst killers, abusers, and manipulators who were awakened and choose "
				+ "now to pour reality down the drain.");
		System.out.println("The Mauraders and The Nephandi are not for player characters. "
				+ "Select the one you want.");
		factionSelect = input.nextInt();
				
		if (factionSelect == 1) 
		{
			System.out.println("You have chosen The 9 Traditions. Pick from the 9 traditons "
					+ "or if allowed, The Orphans or The Hollow Ones.");
			System.out.println("1. The Akashayana (Formerly the Akashic Brotherhood): ");
			System.out.println("2. The Celestial Chorus: ");
			System.out.println("3. The Chakravanti (Formerly The Euthantos): ");
			System.out.println("4. The Kha'vadi (Formerly The Dreamspeakers): ");
			System.out.println("5. The Mercurial Elite (Formerly The Virtual Adepts): ");
			System.out.println("6. The Order of Hermes: ");
			System.out.println("7. The Sahajiya (Formerly The Cult of Ecstasy): ");
			System.out.println("8. The Society of Ether:");
			System.out.println("9. The Verbena");
			System.out.println("10. The Hollow Ones");
			System.out.println("11. The Orphans");
			faction = "The 9 Traditions";
			
			sectSelect = input.nextInt();
			
				if (sectSelect == 1) 
				{
					sect = "The Akashayana";
				} else if (sectSelect == 2) 
				{
					sect = "The Celestial Chorus";
				} else if (sectSelect == 3) 
				{
					sect = "The Chakravanti";
				} else if (sectSelect == 4) 
				{
					sect = "The Kha'vadi";
				} else if (sectSelect == 5) 
				{
					sect = "The Mercurial Elite";
				} else if (sectSelect == 6) 
				{
					sect = "The Order of Hermes";
				} else if (sectSelect == 7) 
				{
					sect = "The Sahajiya";
				} else if (sectSelect == 8) 
				{
					sect = "The Society of Ether";
				} else if (sectSelect == 9) 
				{
					sect = "The Verbena";
				} else if (sectSelect == 10) 
				{
					sect = "The Hollow Ones";
				} else if (sectSelect == 11) 
				{
					sect = "The Orphans";
				}
			
		} else if (factionSelect == 2) 
		{
			faction = "The Technocracy";
			System.out.println("You have chosen The Technocracy, now select a sect.");
			System.out.println("1. Interation X:");
			System.out.println("2. The New World Order:");
			System.out.println("3. The Progenitors:");
			System.out.println("4. The Syndicate:");
			System.out.println("5. The Void Engineers:");

			sectSelect = input.nextInt();
			
			if (sectSelect == 1) 
			{
				sect = "Iteration X";
			} else if (sectSelect == 2) 
			{
				sect = "The New World Order";
			} else if (sectSelect == 3) 
			{
				sect = "The Progenitors";
			} else if (sectSelect == 4) 
			{
				sect = "The Syndicate";
			} else if (sectSelect == 5) 
			{
				sect = "The Void Engineers";
			}
			
		} else if (factionSelect == 3) 
		{
			System.out.println("You have chosen The Disparate Alliance, now select a sect..");
			System.out.println("1. The Ahl-i-Batin:");
			System.out.println("2. The Bata'a:");
			System.out.println("3. The Chidren of Knowledge (aka The True Solifacti):");
			System.out.println("4. The Hollow Ones");
			System.out.println("5. The Kopa Loei:");
			System.out.println("6. The Ngoma:");
			System.out.println("7. The Orphans");
			System.out.println("8. The Sisters of Hippolyta (aka the Hippolytoi):");
			System.out.println("9. The Taftani:");
			System.out.println("10. The Templar Knights:");
			System.out.println("11. The Wu Lung:");
			faction = "The Disparate Alliance";
			sectSelect = input.nextInt();
			
			if (sectSelect == 1) 
			{
				sect = "The Ahl-i-Batin";
			} else if (sectSelect == 2) 
			{
				sect = "The Bata'a";
			} else if (sectSelect == 3) 
			{
				sect = "The Children of Knowledge";
			} else if (sectSelect == 4) 
			{
				sect = "The Hollow Ones";
			} else if (sectSelect == 5) 
			{
				sect = "The Kopa Loei";
			} else if (sectSelect == 6) 
			{
				sect = "The Ngoma";
			} else if (sectSelect == 7) 
			{
				sect = "The Orphans";
			} else if (sectSelect == 8) 
			{
				sect = "The Sisters of Hippolyta";
			} else if (sectSelect == 9) 
			{
				sect = "The Taftani";
			} else if (sectSelect == 10) 
			{
				sect = "The Templar Knights";
			} else if (sectSelect == 11) 
			{
				sect = "The Wu Lung";
			}
		
		} else if (factionSelect == 4) 
		{ 
			System.out.println("Maurader");
			faction = "Maurader";
			
		} else if (factionSelect == 5) 
		{
			System.out.println("1. Infernalists: ");
			System.out.println("2. K’llashaa: ");
			System.out.println("3. Malfeans: ");
			System.out.println("4. Baphies (Goatkids): ");
			System.out.println("5. Exies (Obliviates): ");
			System.out.println("6. Heralds of The Basilisk (Basks): ");
			System.out.println("7. Iron Hands: ");
			System.out.println("8. Mammonites: ");
			faction = "Nephandi";
			
			sectSelect = input.nextInt();
			if (sectSelect == 1) 
			{
				sect = "Infernalists";
			} else if (sectSelect == 2) 
			{
				sect = "K'llashaa";
			} else if (sectSelect == 3) 
			{
				sect = "Malfeans";
			} else if (sectSelect == 4) 
			{
				sect = "Baphies (Goatkids)";
			} else if (sectSelect == 5) 
			{
				sect = "Exies (Obliviates)";
			} else if (sectSelect == 6) 
			{
				sect = "Heralds of The Basilisk";
			} else if (sectSelect == 7) 
			{
				sect = "Iron Hands";
			} else if (sectSelect == 8) 
			{
				sect = "Mammonites";
			}	
		}
		
       
		System.out.println("Regardless, each mage has an essence. An essence is a reflection of their"
				+ " avatar, or the second soul that each mage has. The avatar compels the mage to act "
				+ "and leads them to enlightenment.");
		
		if (faction == "Nephandi") 
		{
			System.out.println("Please select an essence.");
			System.out.println("1. Tormented (Questing): Unsettled. Unmoored. Maybe even guilty. The Essence\r\n"
					+ "of which, un-Fallen, drives its human self from place to\r\n"
					+ "place and passion to passion finds itself, under Qlippothic\r\n"
					+ "influence, Tormented. Pounded by the hammer blows of\r\n"
					+ "Gha’agsheblah, perhaps bathed in Thagirion’s Black Sun,\r\n"
					+ "this soul cloaks its human host in spiritual nettles. Nowhere\r\n"
					+ "will she find rest. Never can she know peace. All Nephandi\r\n"
					+ "feel a certain prick of restlessness. To a Tormented Avatar,\r\n"
					+ "that restlessness remains eternal.\r\n"
					+ "It’s been said that those Fallen with a Tormented Essence\r\n"
					+ "are the dreamers of their kind — mages with big plans and\r\n"
					+ "depthless curiosity. It’s tempting to feel admiration, pity,\r\n"
					+ "even hope for them, as if perhaps the long Path they’re\r\n"
					+ "drifting along could wind up someplace better than a hell\r\n"
					+ "or ultimate extinction. Those hopes, though, are probably\r\n"
					+ "unfounded. If anything, such Torment may drive these Fallen\r\n"
					+ "mages harder to achieve ultimate godhood, at which point\r\n"
					+ "whatever good qualities they possess would pale in comparison\r\n"
					+ "to the horrors they might craft for the inhabitants of\r\n"
					+ "their new universes.");
			System.out.println("2. Destructive (Dynamic): Where Chaos is disruptive, Destruction is volatile. In\r\n"
					+ "Destructive Avatars, the urge to create becomes the urge\r\n"
					+ "to destroy in the name of new creations which might result\r\n"
					+ "from the ruins. That future potential, though, is a pretext;\r\n"
					+ "for while the Dynamic Avatar pursues constant change, the\r\n"
					+ "Nephandic twist pushes it toward annihilation.\r\n"
					+ "Dynamic people are volatile by nature to begin with. Once\r\n"
					+ "infused with the savage fires of Golchab or the rampant lust\r\n"
					+ "of Lilith, however, that volatility hits a frightening degree.\r\n"
					+ "It’s sexy in a terrifying way, really, and terrifying in sexy ways,\r\n"
					+ "as well. Whatever restraints a person might have had before\r\n"
					+ "Awakening or (in the case of barabbi) Falling are burned away\r\n"
					+ "in the hot blast of a Destructive Essence.");
			System.out.println("3. Chaotic (Primordial): All things must return to their primordial state, preferably\r\n"
					+ "by way of Chaos. This Essence disintegrates illusions of stability\r\n"
					+ "from its human host, inspiring mercurial activities and\r\n"
					+ "unpredictable actions. Fallen mages of a Chaotic persuasion\r\n"
					+ "can whiplash from kindness to cruelty without warning, betray\r\n"
					+ "their closest associates, fall deeply in love with someone,\r\n"
					+ "sacrifice him to a Goetic manifestation, and weep sincerely\r\n"
					+ "while doing so… anything that subverts predictability, even by\r\n"
					+ "Nephandic standards, sounds like a good idea to a Chaotic\r\n"
					+ "Essence Nephandus. Although most obviously associated\r\n"
					+ "with the K’llashaa sect, this capricious energy can be found\r\n"
					+ "among any sort of Fallen One.\r\n"
					+ "Mages who Awakened with a Primordial Essence before\r\n"
					+ "their Nephandic conversation find themselves drawn, after\r\n"
					+ "the Fall, toward intensifying storms of chaos. Once Fallen,\r\n"
					+ "such people seem to flutter on the black wings of A’arab\r\n"
					+ "Zaraq, the Qlipha of dispersion. It’s been said (often unfairly)\r\n"
					+ "that the Primordial Essence is closest to the cosmic\r\n"
					+ "forces that flow through the Cauls, and so people with\r\n"
					+ "that Essence seem potentially suspect even if they never\r\n"
					+ "Fall. Those who do, however, embody that ageless Absolute\r\n"
					+ "in its most implacable form — not merely malicious but\r\n"
					+ "cosmically alien.");
			System.out.println("4. Frozen (Pattern): Cold: That’s the word for mages with this Essence.\r\n"
					+ "While the Pattern Essence cultivates patience and stability,\r\n"
					+ "its Qlippothic manifestation assumes the alien stillness and\r\n"
					+ "emotionless gleam of the Black Diamond itself. Influenced\r\n"
					+ "by the spider-web corridors of Satariel or the arid expanse\r\n"
					+ "of Samael, an Avatar with this disposition retains the chilly\r\n"
					+ "flatness of an obsidian monolith.\r\n"
					+ "Frozen Avatars plot, plan, and execute with unnerving\r\n"
					+ "precision. Their stratagems are as ruthless as the tortures they\r\n"
					+ "inflict. There’s no pity to be found in the eyes or heart of such\r\n"
					+ "a person. Though Nephandi are predatory by definition, those\r\n"
					+ "with a Frozen Essence are the most implacable of their kind.");
			int essenceselect = input.nextInt();
			if (essenceselect == 1) 
			{
				avatarEssence = "Tormented";
			} else if (essenceselect == 2) 
			{
				avatarEssence = "Destructive";
			} else if (essenceselect == 3) 
			{
				avatarEssence = "Chaotic";
			} else if (essenceselect == 4) 
			{
				avatarEssence = "Frozen";
			}
		}
		else 
		{
			System.out.println("Please select an essence.");
			System.out.println("1. Questing: Wherever windmills beckon, you’ll find Questing mages\r\n"
					+ "preparing to tilt. Vagabonds and errants, pilgrims, and pioneers,\r\n"
					+ "these people prefer the open road and a worthy cause. Epitomizing\r\n"
					+ "Balance in the Trinity, this Essence avoids extremes. Questing\r\n"
					+ "Avatars tend to manifest as yearning; wanderlust; bright spots on\r\n"
					+ "the horizon; and people, beasts, or entities associated with travel.\r\n"
					+ "One might look like a stray hound, another like a kaleidoscope,\r\n"
					+ "and a third like a hitchhiker on the side of the road. Whereas\r\n"
					+ "the Primordial mage curls up in the shadows, the Questing\r\n"
					+ "mage straps on her backpack, straps on or discards entirely her\r\n"
					+ "shoes, and heads off to face adventures in the Great Unknown.\r\n"
					+ "“Call Me the Breeze” makes a good theme song for such\r\n"
					+ "characters. Their Avatars draw them ever onward. Sure, these\r\n"
					+ "souls might seem friendly and fun enough; in time, however,\r\n"
					+ "they’ll disappear into the rising dawn, secure in the knowledge\r\n"
					+ "that someone else will follow the trails they’ve blazed.");
			System.out.println("2. Dynamic: The Dynamic Essence embodies Change itself. Manifesting\r\n"
					+ "as a mercurial temperament, passionate emotions, restless drive,\r\n"
					+ "and fickle spirits, Dynamic Avatars compel their mages toward\r\n"
					+ "daring experiences. Such people are never boring company! A\r\n"
					+ "Dynamic mage might drag you out for a night on the town that\r\n"
					+ "includes hijacking a taxi, skateboarding down a railroad track,\r\n"
					+ "and slumping into bed just after dawn with a huge grin (or a\r\n"
					+ "terrified grimace) on your face, just to wake up a few hours\r\n"
					+ "later and see what trouble you can get into next.\r\n"
					+ "In more subtle forms, this Essence inspires curiosity,\r\n"
					+ "impatience, and sudden flashes of brilliance. Appearing in\r\n"
					+ "the form of shadows, whispers, and poor impulse control, it\r\n"
					+ "goads a mage to treat every day like an adventure. At higher\r\n"
					+ "levels, a Dynamic Avatar can nag a person mercilessly, leaving\r\n"
					+ "half-finished projects and shattered relationships in the wake\r\n"
					+ "of a mage who rarely sits still for long.");
			System.out.println("3. Primordial: Before light and order existed, Primordial Chaos was\r\n"
					+ "the Essence of the universe. Even now, that eternal enigma\r\n"
					+ "beckons to the human soul in the shape of eerie and often\r\n"
					+ "sinister Avatar-forms. Manifesting as shadows; half-heard cries;\r\n"
					+ "swirling vortices of pulsating energy; or the disconcerting figures\r\n"
					+ "of madmen, ghosts, and squamous things, this Essence reflects\r\n"
					+ "the depthless reaches of cosmic potential. Mages connected to\r\n"
					+ "this Essence tend to be abrupt and secretive, or else seductive\r\n"
					+ "in ways that Fallen souls can best appreciate.\r\n"
					+ "A Primordial mage loves mystery. Like deep water, she seeps\r\n"
					+ "into hidden places and defies easy understanding. Whereas\r\n"
					+ "Pattern people are bricks or stone, Primordial folks are riptides\r\n"
					+ "and dark pools. The few Technocrats who favor this Essence\r\n"
					+ "understand that no science can penetrate the richest mysteries\r\n"
					+ "of the universe; they’ll give lip service to technology, but they\r\n"
					+ "always keep a few extra cards up their sleeves for the time when\r\n"
					+ "the light fails and order becomes a punch line in the cosmic jest.");
			System.out.println("4. Pattern: The very opposite of Dynamism, the Pattern Essence provides\r\n"
					+ "stability and order. If Dynamism is fire, then Pattern is stone.\r\n"
					+ "Pattern mages approach things with deliberate intent, speaking\r\n"
					+ "slowly and taking time to consider the potential risks and benefits\r\n"
					+ "of a task. Manifesting as calm temperament, sound logic, stable\r\n"
					+ "emotions, and authority figures (often in dreams, perhaps as\r\n"
					+ "people only the mage herself can see), Pattern Avatars settle the\r\n"
					+ "capricious whims of reality into solid, dependable forms.\r\n"
					+ "Because every war needs fortifications and dependable\r\n"
					+ "souls, the Pattern Essence is a valued asset. Such Avatars inspire\r\n"
					+ "their mages to be prudent, constructive, and trustworthy – real\r\n"
					+ "bricks, to use the British slang. Honor, stability, and good\r\n"
					+ "judgment are hallmarks of such people. If they seem stodgy or\r\n"
					+ "uninspired, it’s simply because other people are too shortsighted\r\n"
					+ "to recognize a true friend when they have one.");
			int essenceselect = input.nextInt();
			if (essenceselect == 1) 
			{
				avatarEssence = "Questing";
			} else if (essenceselect == 2) 
			{
				avatarEssence = "Dynamic";
			} else if (essenceselect == 3) 
			{
				avatarEssence = "Primordial";
			} else if (essenceselect == 4) 
			{
				avatarEssence = "Pattern";
			}
		}
	}
	
	public void backgrounds() 
	{
		
	}
	
	public void powerpick() 
	{
		int affinityPick = 0;
		
		System.out.println("Every mage has a dedicated sphere that comes naturally called "
				+ "an affinity sphere. The 9 spheres govern all the elements of the "
				+ "universe and are how mages tap into their power. The 9 spheres are "
				+ "Correspondence, Entropy, Forces, Life, Matter, Mind, Prime, and Time. If you're "
				+ "part of a tradition, they each have affinity spheres you must pick "
				+ "from. Picking an affinity sphere means that leveling it up will be "
				+ "easier later, and its most likely the one your mage first "
				+ "experienced.");	
		if (sect == "The Akashayana") 
		{
			System.out.println("Select Mind (1) or Life (2) as your affinity sphere.");
			affinityPick = input.nextInt();
			if (affinityPick == 1) 
			{
				affinitySphere = "Mind";
			} else if (affinityPick == 2) 
			{
				affinitySphere = "Life";
			}
			//mind or life
		} else if (sect == "The Celestial Chorus") 
		{
			System.out.println("Select Prime (1), Forces (2), or Spirit (3) as your affinity sphere.");
			affinityPick = input.nextInt();
			if (affinityPick == 1) 
			{
				affinitySphere = "Prime";
			} else if (affinityPick == 2) 
			{
				affinitySphere = "Forces";
			} else if (affinityPick == 3) 
			{
				affinitySphere = "Spirit";
			}
			//prime, forces, or spirit
		} else if (sect == "The Chakravanti") 
		{
			System.out.println("Select Entropy (1), Life (2), or Spirit (3) as your affinity sphere.");
			affinityPick = input.nextInt();
			if (affinityPick == 1) 
			{
				affinitySphere = "Entropy";
			} else if (affinityPick == 2) 
			{
				affinitySphere = "Life";
			} else if (affinityPick == 3) 
			{
				affinitySphere = "Spirit";
			}
			//Entropy; Life or Spirit.
		} else if (sect == "The Kha'vadi") 
		{
			System.out.println("Select Force (1), Life (2), or Matter (3) as your affinity sphere.");
			affinityPick = input.nextInt();
			if (affinityPick == 1) 
			{
				affinitySphere = "Forces";
			} else if (affinityPick == 2) 
			{
				affinitySphere = "Life";
			} else if (affinityPick == 3) 
			{
				affinitySphere = "Matter";
			}
			//Spirit; Force, Life, or Matter
		} else if (sect == "The Mercurial Elite") 
		{
			System.out.println("Select Correspondence/Data (1),  or Forces (2), as your affinity sphere.");
			affinityPick = input.nextInt();
			if (affinityPick == 1) 
			{
				affinitySphere = "Correspondence/Data";
			} else if (affinityPick == 2) 
			{
				affinitySphere = "Forces";
			}
			//Correspondence/Data; Forces.
		} else if (sect == "The Order of Hermes") 
		{
			System.out.println("Select Forces (1), as your affinity sphere. Forces provides the core of "
					+ "Hermetic training. Certain Houses favor Life, Matter, Mind, and Spirit as "
					+ "secondary pursuits, but Forces is always essential.");
			affinityPick = input.nextInt();
		} else if (sect == "The Sahajiya") 
		{
			System.out.println("Select Time (1), Life (2), or Mind (3) as your affinity sphere.");
			affinityPick = input.nextInt();
			if (affinityPick == 1) 
			{
				affinitySphere = "Time";
			} else if (affinityPick == 2) 
			{
				affinitySphere = "Life";
			} else if (affinityPick == 3) 
			{
				affinitySphere = "Mind";
			}
			//time, life, or mind
		} else if (sect == "The Society of Ether") 
		{
			System.out.println("Select Matter (1), Forces (2), or Prime (3) as your affinity sphere.");
			affinityPick = input.nextInt();
			if (affinityPick == 1) 
			{
				affinitySphere = "Matter";
			} else if (affinityPick == 2) 
			{
				affinitySphere = "Forces";
			} else if (affinityPick == 3) 
			{
				affinitySphere = "Prime";
			}
			//Matter; Forces or Prime
		} else if (sect == "The Verbena") 
		{
			System.out.println("Select Life (1), Forces (2), as your affinity sphere.");
			affinityPick = input.nextInt();
			if (affinityPick == 1) 
			{
				affinitySphere = "Life";
			} else if (affinityPick == 2) 
			{
				affinitySphere = "Forces";
			}
			//Life; Forces
		} else if (sect == "The Hollow Ones") 
		{
			System.out.println("Select Correspondence (1), Entropy (2), Forces (3), Life (4), Matter (5), "
					+ "Mind (6), Prime (7), Spirit (8), Time (9) as your affinity sphere.");
			affinityPick = input.nextInt();
			if (affinityPick == 1) 
			{
				affinitySphere = "Correspondence";
			} else if (affinityPick == 2) 
			{
				affinitySphere = "Entropy";
			} else if (affinityPick == 3) 
			{
				affinitySphere = "Forces";
			} else if (affinityPick == 4) 
			{
				affinitySphere = "Life";
			} else if (affinityPick == 5) 
			{
				affinitySphere = "Matter";
			} else if (affinityPick == 6) 
			{
				affinitySphere = "Mind";
			} else if (affinityPick == 7) 
			{
				affinitySphere = "Prime";
			} else if (affinityPick == 8) 
			{
				affinitySphere = "Spirit";
			} else if (affinityPick == 9) 
			{
				affinitySphere = "Time";
			}
			//Any.
		} else if (sect == "The Orphans") 
		{
			System.out.println("Select Correspondence (1), Entropy (2), Forces (3), Life (4), Matter (5), "
					+ "Mind (6), Prime (7), Spirit (8), Time (9) as your affinity sphere.");
			affinityPick = input.nextInt();
			if (affinityPick == 1) 
			{
				affinitySphere = "Correspondence";
			} else if (affinityPick == 2) 
			{
				affinitySphere = "Entropy";
			} else if (affinityPick == 3) 
			{
				affinitySphere = "Forces";
			} else if (affinityPick == 4) 
			{
				affinitySphere = "Life";
			} else if (affinityPick == 5) 
			{
				affinitySphere = "Matter";
			} else if (affinityPick == 6) 
			{
				affinitySphere = "Mind";
			} else if (affinityPick == 7) 
			{
				affinitySphere = "Prime";
			} else if (affinityPick == 8) 
			{
				affinitySphere = "Spirit";
			} else if (affinityPick == 9) 
			{
				affinitySphere = "Time";
			}
			//Any
		} else if (sect == "Iteration X") 
		{
			System.out.println("Select Forces (1), Matter (2), or Time (3) as your affinity sphere.");
			affinityPick = input.nextInt();
			if (affinityPick == 1) 
			{
				affinitySphere = "Forces";
			} else if (affinityPick == 2) 
			{
				affinitySphere = "Matter";
			} else if (affinityPick == 3) 
			{
				affinitySphere = "Time";
			}
			//Forces, Matter, or Time.
		} else if (sect == "The New World Order") 
		{
			System.out.println("Select Mind (1), or Correspondence/Data (2), as your affinity sphere.");
			affinityPick = input.nextInt();
			if (affinityPick == 1) 
			{
				affinitySphere = "Correspondence/Data";
			} else if (affinityPick == 2) 
			{
				affinitySphere = "Forces";
			}
			//Mind or Correspondence/Data.
		} else if (sect == "The Progenitors") 
		{
			System.out.println("Select Life (1), or Prime (2), as your affinity sphere.");
			affinityPick = input.nextInt();
			if (affinityPick == 1) 
			{
				affinitySphere = "Life";
			} else if (affinityPick == 2) 
			{
				affinitySphere = "Prime";
			}
			//Life or Prime
		} else if (sect == "The Syndicate") 
		{
			System.out.println("Select Entropy (1), Mind (2), or Primal Utility (3) as your affinity sphere.");
			affinityPick = input.nextInt();
			if (affinityPick == 1) 
			{
				affinitySphere = "Entropy";
			} else if (affinityPick == 2) 
			{
				affinitySphere = "Mind";
			} else if (affinityPick == 3) 
			{
				affinitySphere = "Primal Utility";
			}
			//Entropy, Mind or Primal Utility
		} else if (sect == "The Void Engineers") 
		{
			System.out.println("Select Dimensional Science (1), Correspondence (2), or "
					+ "Force (3) as your affinity sphere.");
			affinityPick = input.nextInt();
			if (affinityPick == 1) 
			{
				affinitySphere = "Dimensional Science";
			} else if (affinityPick == 2) 
			{
				affinitySphere = "Correspondence";
			} else if (affinityPick == 3) 
			{
				affinitySphere = "Forces";
			}
			//Dimensional Science (Spirit), Correspondence, or Forces.
		} else if (sect == "The Ahl-i-Batin") 
		{
			System.out.println("Select Correspondence (1), Mind (2), as your affinity sphere. You may never "
					+ "take Entropy.");
			affinityPick = input.nextInt();
			if (affinityPick == 1) 
			{
				affinitySphere = "Correspondence";
			} else if (affinityPick == 2) 
			{
				affinitySphere = "Mind";
			}
			//Correspondence or Mind – but never Entropy
		} else if (sect == "The Bata'a") 
		{
			System.out.println("Select Spirit (1), or Life (2), as your affinity sphere.");
			affinityPick = input.nextInt();	
			if (affinityPick == 1) 
			{
				affinitySphere = "Spirit";
			} else if (affinityPick == 2) 
			{
				affinitySphere = "Life";
			}
			//Spirit or Life
		} else if (sect == "The Children of Knowledge") 
		{
			System.out.println("Select Matter (1), Forces (2), Prime (3), or Entropy (4) as your affinity sphere.");
			affinityPick = input.nextInt();	
			if (affinityPick == 1) 
			{
				affinitySphere = "Matter";
			} else if (affinityPick == 2) 
			{
				affinitySphere = "Forces";
			} else if (affinityPick == 3) 
			{
				affinitySphere = "Prime";
			} else if (affinityPick == 4) 
			{
				affinitySphere = "Entropy";
			}
			//Traditionally Matter, though some groups prefer Forces, Prime, or Entropy.
		} else if (sect == "The Kopa Loei") 
		{
			System.out.println("Kopa Loei don’t believe in spheres. Game-wise, their Sphere Traits depend "
					+ "on the things they do, not on training given by the group.");
		} else if (sect == "The Ngoma") 
		{
			System.out.println("Select Life (1), Mind (2), Prime (3), or Spirit (4) as your affinity sphere.");
			affinityPick = input.nextInt();
			if (affinityPick == 1) 
			{
				affinitySphere = "Life";
			} else if (affinityPick == 2) 
			{
				affinitySphere = "Mind";
			} else if (affinityPick == 3) 
			{
				affinitySphere = "Prime";
			} else if (affinityPick == 4) 
			{
				affinitySphere = "Spirit";
			}
			//Life, Mind, Prime, or Spirit.
		} else if (sect == "The Sisters of Hippolyta") 
		{
			System.out.println("Select Life (1), or Mind (2), as your affinity sphere.");
			affinityPick = input.nextInt();
			if (affinityPick == 1) 
			{
				affinitySphere = "Life";
			} else if (affinityPick == 2) 
			{
				affinitySphere = "Mind";
			}
			//Life or Mind
		} else if (sect == "The Taftani") 
		{
			System.out.println("Select Forces (1), Matter (2), Prime (3), or Spirit (4) as your affinity sphere.");
			affinityPick = input.nextInt();
			if (affinityPick == 1) 
			{
				affinitySphere = "Forces";
			} else if (affinityPick == 2) 
			{
				affinitySphere = "Matter";
			} else if (affinityPick == 3) 
			{
				affinitySphere = "Prime";
			} else if (affinityPick == 4) 
			{
				affinitySphere = "Spirit";
			}
			//Forces, Matter, Prime, or Spirit.
		} else if (sect == "The Templar Knights") 
		{
			System.out.println("Select Forces (1), Life (2), Mind (3), or Prime (4) as your affinity sphere.");
			affinityPick = input.nextInt();
			if (affinityPick == 1) 
			{
				affinitySphere = "Forces";
			} else if (affinityPick == 2) 
			{
				affinitySphere = "Life";
			} else if (affinityPick == 3) 
			{
				affinitySphere = "Mind";
			} else if (affinityPick == 4) 
			{
				affinitySphere = "Mind";
			}
			//Forces, Life, Mind, or Prime.
		} else if (sect == "The Wu Lung") 
		{
			System.out.println("Select Spirit (1), Forces (2), Matter (3), or Life (4) as your affinity sphere. "
					+ "Though they shun such degraded terminology!");
			affinityPick = input.nextInt();
			if (affinityPick == 1) 
			{
				affinitySphere = "Spirit";
			} else if (affinityPick == 2) 
			{
				affinitySphere = "Forces";
			} else if (affinityPick == 3) 
			{
				affinitySphere = "Matter";
			} else if (affinityPick == 4) 
			{
				affinitySphere = "Life";
			}
			//Spirit, Forces, Matter, or Life… though they shun such degraded terminology!
		} else if (sect == "Infernalists") 
		{
			
		} else if (sect == "K'llashaa") 
		{
			
		} else if (sect == "Malfeans") 
		{
			
		} else if (sect == "Baphies (Goatkids)") 
		{
			
		} else if (sect == "Exies (Obliviates)") 
		{
			
		} else if (sect == "Heralds of The Basilisk") 
		{
			
		} else if (sect == "Iron Hands") 
		{
			
		} else if (sect == "Mammonites") 
		{
			
		} else if (faction == "Maurader") 
		{
			
		}
		
		System.out.println("The affinity sphere you picked automatically recieves one of the 6 dots you can spend on spheres.");
		Map <String, Int> dictionary = new HashMap <String, Int>();
		
		
		//auto rotes maker
		
	}
	
	public void characterdetails() 
	{
		if (sect == "The Akashayana") 
		{
			System.out.println("Select a paradigm offered by your sect.");
			System.out.println("1. Bring Back The Golden Age:  ");
			System.out.println("2. Everything's an Illusion, Prison, Or Mistake: ");
			System.out.println("3. It's all good, Have Faith!: ");
			System.out.println("4. Might is Right: ");
			
			System.out.println("Now pick a Practice which is given by your sect.");
			
		} else if (sect == "The Celestial Chorus") 
		{
			System.out.println("Select a paradigm offered by your sect.");
			System.out.println("1. Creation is Divine and Alive: ");
			System.out.println("2. Divine Order and Earthly Chaos: ");
			System.out.println("3. It's all good, Have Faith!: ");

			System.out.println("Now pick a Practice which is given by your sect.");
			
		} else if (sect == "The Chakravanti") 
		{
			System.out.println("Select a paradigm offered by your sect.");
			System.out.println("1. Divine Order and Earthly Chaos: ");
			System.out.println("2. Everything's an Illusion, Prison, Or Mistake: ");
			System.out.println("3. Creation is Divine and Alive: ");
			System.out.println("4. It's all good, Have Faith!: ");
		
			System.out.println("Now pick a Practice which is given by your sect.");
			
		} else if (sect == "The Kha'vadi") 
		{
			System.out.println("Select a paradigm offered by your sect.");
			System.out.println("1. A World of Gods and Monsters: ");
			System.out.println("2. Creation is Divine and Alive: ");
			System.out.println("3. Bring Back The Golden Age: ");
			System.out.println("4. Might is Right: ");
			
			System.out.println("Now pick a Practice which is given by your sect.");
			
		} else if (sect == "The Mercurial Elite") 
		{
			System.out.println("Select a paradigm offered by your sect.");
			System.out.println("1. Everything is Data: ");
			System.out.println("2. A Mechanistic Cosmos: ");
			
		} else if (sect == "The Order of Hermes") 
		{
			System.out.println("Select a paradigm offered by your sect.");
			System.out.println("1. A Mechanistic Cosmos: ");
			System.out.println("2. Divine Order and Earthly Chaos: ");
			System.out.println("3. Might is Right: ");
			System.out.println("4. Tech Holds All The Answers: ");
			System.out.println("5. Bring Back The Golden Age: ");
			
		} else if (sect == "The Sahajiya") 
		{
			System.out.println("Select a paradigm offered by your sect.");
			System.out.println("1. Creation is Divine and Alive: ");
			System.out.println("2. Everything is Chaos: ");
			System.out.println("3. It's all good, Have Faith!: ");
			System.out.println("4. Everything's an Illusion, Prison, Or Mistake: ");
			
		} else if (sect == "The Society of Ether") 
		{
			System.out.println("Select a paradigm offered by your sect.");
			System.out.println("1. A Mechanistic Cosmos: ");
			System.out.println("2. Everything is Data: ");
			System.out.println("3. Might is Right: ");
			System.out.println("4. Everything's an Illusion, Prison, Or Mistake: ");
			System.out.println("5. Tech Holds All The Answers: ");
			
		} else if (sect == "The Verbena") 
		{
			System.out.println("Select a paradigm offered by your sect.");
			System.out.println("1. A World of Gods and Monsters: ");
			System.out.println("2. Might is Right: ");
			System.out.println("3. Bring Back The Golden Age: ");
			System.out.println("4. Everything is Chaos: ");
			
		} else if (sect == "The Hollow Ones") 
		{
			System.out.println("Select a paradigm offered by your sect.");
			System.out.println("1. Everything is Chaos: ");
			System.out.println("2. Everything's an Illusion, Prison, Or Mistake: ");
			System.out.println("3. One-Way Trip to Oblivion: ");
			
		} else if (sect == "The Orphans") 
		{
			System.out.println("Select a paradigm offered by your sect.");
			System.out.println("1. ");
			
		} else if (sect == "Iteration X") 
		{
			System.out.println("Select a paradigm offered by your sect.");
			System.out.println("1. A Mechanistic Cosmos: ");
			System.out.println("2. Everything is Data: ");
			System.out.println("3. Tech Holds All The Answers: ");
			
		} else if (sect == "The New World Order") 
		{
			System.out.println("Select a paradigm offered by your sect.");
			System.out.println("1. A World of Gods and Monsters: ");
			System.out.println("2. Might is Right: ");
			System.out.println("3. Tech Holds All The Answers: ");
			
		} else if (sect == "The Progenitors") 
		{
			System.out.println("Select a paradigm offered by your sect.");
			System.out.println("1. Might is Right: ");
			System.out.println("2. Creation is Divine and Alive: ");
			
		} else if (sect == "The Syndicate") 
		{
			System.out.println("Select a paradigm offered by your sect.");
			System.out.println("1. Might is Right: ");
			System.out.println("2. One-Way Trip to Oblivion: ");
			
		} else if (sect == "The Void Engineers") 
		{
			System.out.println("Select a paradigm offered by your sect.");
			System.out.println("1. Tech Holds All The Answers: ");
			System.out.println("2. A World of Gods and Monsters: ");
			System.out.println("3. Everything is Chaos: ");
			
		} else if (sect == "The Ahl-i-Batin") 
		{
			System.out.println("Select a paradigm offered by your sect.");
			System.out.println("1. Divine Order and Earthly Chaos: ");
			System.out.println("2. It's all good, Have Faith!: ");
			System.out.println("3. Everything's an Illusion, Prison, Or Mistake: ");
			
		} else if (sect == "The Bata'a") 
		{
			System.out.println("Select a paradigm offered by your sect.");
			System.out.println("1. Creation is Divine and Alive: ");
			System.out.println("2. A World of Gods and Monsters: ");
			System.out.println("3. Everything is Chaos: ");
			
		} else if (sect == "The Chidren of Knowledge") 
		{
			System.out.println("Select a paradigm offered by your sect.");
			System.out.println("1. Everything is Data: ");
			System.out.println("2. Everything is Chaos: ");
			System.out.println("3. Everything's an Illusion, Prison, Or Mistake: ");
			
		} else if (sect == "The Kopa Loei") 
		{
			System.out.println("Select a paradigm offered by your sect.");
			System.out.println("1. Creation is Divine and Alive: ");
			System.out.println("2. Divine Order and Earthly Chaos: ");
			
		} else if (sect == "The Ngoma") 
		{
			System.out.println("Select a paradigm offered by your sect.");
			System.out.println("1. Divine Order and Earthly Chaos: ");
			System.out.println("2. Tech Holds All The Answers: ");
			
		} else if (sect == "The Sisters of Hippolyta") 
		{
			System.out.println("Select a paradigm offered by your sect.");
			System.out.println("1. Creation is Divine and Alive: ");
			System.out.println("2. Might is Right: ");
			System.out.println("3. It's all good, Have Faith!: ");
			
		} else if (sect == "The Taftani") 
		{
			System.out.println("Select a paradigm offered by your sect.");
			System.out.println("1. Might is Right: ");
			System.out.println("2. Divine Order and Earthly Chaos: ");

		} else if (sect == "The Templar Knights") 
		{
			System.out.println("Select a paradigm offered by your sect.");
			System.out.println("1. A World of Gods and Monsters: ");
			System.out.println("2. Divine Order and Earthly Chaos: ");
			System.out.println("3. Might is Right: ");
			
		} else if (sect == "The Wu Lung") 
		{
			System.out.println("Select a paradigm offered by your sect.");
			System.out.println("1. Divine Order and Earthly Chaos: ");
			System.out.println("2. Bring Back The Golden Age: ");
						
		}
		
		
		System.out.println("Select a practice, offered by your sect.");

		
		//		if (paradigm == "A Mechanistic Cosmos") 
//		{
//			
//		} else if (paradigm == "A World of Gods and Monsters") 
//		{
//			
//		} else if (paradigm == "Bring Back The Golden Age") 
//		{
//			
//		} else if (paradigm == "Creation is Divine and Alive") 
//		{
//			
//		} else if (paradigm == "Divine Order and Earthly Chaos") 
//		{
//			
//		} else if (paradigm == "Everything is Chaos") 
//		{
//			
//		} else if (paradigm == "Everything is Data") 
//		{
//			
//		} else if (paradigm == "Everything's an Illusion, Prison, Or Mistake") 
//		{
//			
//		} else if (paradigm == "It's all good, Have Faith!") 
//		{
//			
//		} else if (paradigm == "Might is Right") 
//		{
//			
//		} else if (paradigm == "One-Way Trip to Oblivion") 
//		{
//			
//		} else if (paradigm == "Tech Holds All The Answers") 
//		{
//			
//		} else if (paradigm == "Alien's Make Us What We Are") 
//		{
//			
//		} else if (paradigm == "All Power Comes from God(s)") 
//		{
//			
//		} else if (paradigm == "All the World's a Stage") 
//		{
//			
//		} else if (paradigm == "Ancient Wisdom is the Key") 
//		{
//			
//		} else if (paradigm == "Consciousness is The Only True Reality") 
//		{
//			
//		} else if (paradigm == "Embrace the Threshold") 
//		{
//			
//		} else if (paradigm == "A Holographic Reality") 
//		{
//			
//		} else if (paradigm == "Transcend Your Limits") 
//		{
//			
//		} else if (paradigm == "Turning the Keys to Reality") 
//		{
//			
//		} else if (paradigm == "We are Meant to be Wild") 
//		{
//			
//		} else if (paradigm == "We Are NOT Men!") 
//		{
//			
//		} else if (paradigm == "We're all God(s) in Disguise") 
//		{
//			
//		} else if (paradigm == "Ancestor Veneration") 
//		{
//			
//		} else if (paradigm == "All Power Comes from Sin") 
//		{
//			
//		} else if (paradigm == "Barbarism is the Truest State of Man") 
//		{
//			
//		} else if (paradigm == "Cosmic Horror is the Only Truth") 
//		{
//			
//		} else if (paradigm == "Everyone’s Against Me, so Whatever I do is Justified") 
//		{
//			
//		} else if (paradigm == "Evil is Necessary, and so I am Evil") 
//		{
//			
//		} else if (paradigm == "Existence is Unknowable, Irrational, and Sublime ") 
//		{
//			
//		} else if (paradigm == "Forbidden Wisdom is the Truest Source of Power") 
//		{
//			
//		} else if (paradigm == "I Am All") 
//		{
//			
//		} else if (paradigm == "I’m a Predator, and the World is My Prey") 
//		{
//			
//		} else if (paradigm == "Indulgence is Nature’s Only Law") 
//		{
//			
//		} else if (paradigm == "Only the Strongest Deserve to Survive") 
//		{
//			
//		} else if (paradigm == "People = Shit") 
//		{
//			
//		} else if (paradigm == "Rebellion is the Road to Transcendence") 
//		{
//			
//		} else if (paradigm == "We are Stormtroopers of the Abyss") 
//		{
//			
//		}
		
		//Paradigm
		//Practice
		//Instruments
	}
	
	public void flawsandmerits() 
	{
		
	}
	
	public void charreview() 
	{
		
	}
	
	public void naturedemeanor() 
	{
		
	}
	
	public void export() 
	{
		
	}
	
	public void freebiepoints() 
	{
		
	}
	
	public void statcrunch() 
	{
		
	}
	

//		while (sphereDots != 0) 
//		{
//			System.out.println("You have " + sphereDots + " left. Select the sphere "
//					+ "you would like to increase.");
//			
//			System.out.println("1. Correspondence");
//			System.out.println("2. Data (Instead of Correspondence)");
//			System.out.println("3. Dimensional Science (Instead of Spirit)");
//			System.out.println("4. Entropy");
//			System.out.println("5. Forces");
//			System.out.println("6. Life");
//			System.out.println("7. Matter");
//			System.out.println("8. Mind");
//			System.out.println("9. Prime");
//			System.out.println("10. Primal Utility (Instead of Prime)");
//			System.out.println("11. Spirit");
//			System.out.println("12. Time");
//			
//			sphereSelect = input.nextInt();
//			
//			if (sphereSelect == 1) 
//			{
//				corrRating++;
//			} else if  (sphereSelect == 2)
//			{
//				dataRating++;
//			} else if  (sphereSelect == 3)
//			{
//				dimsciRating++;
//			} else if  (sphereSelect == 4)
//			{
//				entropyRating++;
//			} else if  (sphereSelect == 5)
//			{
//				forcesRating++;
//			} else if  (sphereSelect == 6)
//			{
//				lifeRating++;
//			} else if  (sphereSelect == 7)
//			{
//				matterRating++;
//			} else if  (sphereSelect == 8)
//			{
//				mindRating++;
//			} else if  (sphereSelect == 9)
//			{
//				primeRating++;
//			} else if  (sphereSelect == 10)
//			{
//				primalUtilRating++;
//			} else if  (sphereSelect == 11)
//			{
//				spiritRating++;
//			} else if  (sphereSelect == 12)
//			{
//				timeRating++;
//			}
//			sphereDots--;
//			
//			if (corrRating + dataRating + dimsciRating + entropyRating 
//					+ forcesRating + lifeRating + matterRating 
//					+ mindRating + primeRating + primalUtilRating 
//					+ spiritRating + timeRating == 6) 
//			{				
//				System.out.println("You have aligned alll of your spheres, they are currently:");
//				System.out.println("Correspondence: " + corrRating);
//				System.out.println("Data: " + dataRating);
//				System.out.println("Dimensional Science: " + dimsciRating);
//				System.out.println("Entropy: " + entropyRating);
//				System.out.println("Forces: " + forcesRating);
//				System.out.println("Life: " + lifeRating);
//				System.out.println("Matter: " + matterRating);
//				System.out.println("Mind: " + mindRating);
//				System.out.println("Prime: " + primeRating);
//				System.out.println("Primal Utility: " + primalUtilRating);
//				System.out.println("Spirit: " + spiritRating);
//				System.out.println("Time: " + timeRating);
//				System.out.println();
//			}//end of sphere printing
//		}//end of while
//		character.correspondenceRating = corrRating;
//		character.dataRating = dataRating;
//		character.dimensionalScienceRating = dimsciRating;
//		character.entropyRating = entropyRating;
//		character.forcesRating = forcesRating;
//		character.lifeRating = lifeRating;
//		character.matterRating = matterRating;
//		character.mindRating = mindRating;
//		character.primeRating = primeRating;
//		character.primalUtilityRating = primalUtilRating;
//		character.spiritRating = spiritRating;
//		character.timeRating = timeRating;
//	}
//	

	
//		}
//	}
//	

}

	


