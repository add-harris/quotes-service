package uk.co.binxly.repository

import org.slf4j.LoggerFactory
import uk.co.binxly.models.Quote
import javax.enterprise.context.ApplicationScoped

const val KANYE_WEST = "Kanye West"

@ApplicationScoped
object KanyeQuotes {

    private val logger = LoggerFactory.getLogger(KanyeQuotes::class.java)

    private val quote000 = Quote("000", "All you have to be is yourself", KANYE_WEST)
    private val quote001 = Quote("001", "Believe in your flyness...conquer your shyness.", KANYE_WEST)
    private val quote002 = Quote("002", "Burn that excel spread sheet", KANYE_WEST)
    private val quote003 = Quote("003", "Decentralize", KANYE_WEST)
    private val quote004 = Quote("004", "Distraction is the enemy of vision", KANYE_WEST)
    private val quote005 = Quote("005", "Everything you do in life stems from either fear or love", KANYE_WEST)
    private val quote006 = Quote("006", "For me giving up is way harder than trying.", KANYE_WEST)
    private val quote007 = Quote("007", "For me, money is not my definition of success. Inspiring people is a definition of success", KANYE_WEST)
    private val quote008 = Quote("008", "Fur pillows are hard to actually sleep on", KANYE_WEST)
    private val quote009 = Quote("009", "Have you ever thought you were in love with someone but then realized you were just staring in a mirror for 20 minutes?", KANYE_WEST)
    private val quote010 = Quote("010", "I feel calm but energized", KANYE_WEST)
    private val quote011 = Quote("011", "I feel like I'm too busy writing history to read it.", KANYE_WEST)
    private val quote012 = Quote("012", "I give up drinking every week", KANYE_WEST)
    private val quote013 = Quote("013", "I leave my emojis bart Simpson color", KANYE_WEST)
    private val quote014 = Quote("014", "I love sleep; it's my favorite.", KANYE_WEST)
    private val quote015 = Quote("015", "I make awesome decisions in bike stores!!!", KANYE_WEST)
    private val quote016 = Quote("016", "I really love my Tesla. I'm in the future. Thank you Elon.", KANYE_WEST)
    private val quote017 = Quote("017", "I still think I am the greatest.", KANYE_WEST)
    private val quote018 = Quote("018", "I think I do myself a disservice by comparing myself to Steve Jobs and Walt Disney and human beings that we've seen before. It should be more like Willy Wonka...and welcome to my chocolate factory.", KANYE_WEST)
    private val quote019 = Quote("019", "I want the world to be better! All I want is positive! All I want is dopeness!", KANYE_WEST)
    private val quote020 = Quote("020", "I wish I had a friend like me", KANYE_WEST)
    private val quote021 = Quote("021", "I'd like to meet with Tim Cook. I got some ideas", KANYE_WEST)
    private val quote022 = Quote("022", "I'll say things that are serious and put them in a joke form so people can enjoy them. We laugh to keep from crying.", KANYE_WEST)
    private val quote023 = Quote("023", "I'm a creative genius", KANYE_WEST)
    private val quote024 = Quote("024", "I'm nice at ping pong", KANYE_WEST)
    private val quote025 = Quote("025", "I'm the best", KANYE_WEST)
    private val quote026 = Quote("026", "If I don't scream, if I don't say something then no one's going to say anything.", KANYE_WEST)
    private val quote027 = Quote("027", "If I got any cooler I would freeze to death", KANYE_WEST)
    private val quote028 = Quote("028", "Keep squares out yo circle", KANYE_WEST)
    private val quote029 = Quote("029", "Keep your nose out the sky, keep your heart to god, and keep your face to the rising sun.", KANYE_WEST)
    private val quote030 = Quote("030", "Let's be like water", KANYE_WEST)
    private val quote031 = Quote("031", "Man... whatever happened to my antique fish tank?", KANYE_WEST)
    private val quote032 = Quote("032", "My dad got me a drone for Christmas", KANYE_WEST)
    private val quote033 = Quote("033", "My greatest award is what I'm about to do.", KANYE_WEST)
    private val quote034 = Quote("034", "My greatest pain in life is that I will never be able to see myself perform live.", KANYE_WEST)
    private val quote035 = Quote("035", "Only free thinkers", KANYE_WEST)
    private val quote036 = Quote("036", "People always say that you can't please everybody. I think that's a cop-out. Why not attempt it? Cause think of all the people that you will please if you try.", KANYE_WEST)
    private val quote037 = Quote("037", "People always tell you 'Be humble. Be humble.' When was the last time someone told you to be amazing? Be great! Be awesome! Be awesome!", KANYE_WEST)
    private val quote038 = Quote("038", "People only get jealous when they care.", KANYE_WEST)
    private val quote039 = Quote("039", "Perhaps I should have been more like water today", KANYE_WEST)
    private val quote040 = Quote("040", "Sometimes I push the door close button on people running towards the elevator. I just need my own elevator sometimes. My sanctuary.", KANYE_WEST)
    private val quote041 = Quote("041", "Sometimes you have to get rid of everything", KANYE_WEST)
    private val quote042 = Quote("042", "Style is genderless", KANYE_WEST)
    private val quote043 = Quote("043", "The thought police want to suppress freedom of thought", KANYE_WEST)
    private val quote044 = Quote("044", "The world is our family", KANYE_WEST)
    private val quote045 = Quote("045", "The world is our office", KANYE_WEST)
    private val quote046 = Quote("046", "Today is the best day ever and tomorrow's going to be even better", KANYE_WEST)
    private val quote047 = Quote("047", "Truth is my goal. Controversy is my gym. I'll do a hundred reps of controversy for a 6 pack of truth", KANYE_WEST)
    private val quote048 = Quote("048", "Tweeting is legal and also therapeutic", KANYE_WEST)
    private val quote049 = Quote("049", "We all self-conscious. I'm just the first to admit it.", KANYE_WEST)
    private val quote050 = Quote("050", "We came into a broken world. And we're the cleanup crew.", KANYE_WEST)
    private val quote051 = Quote("051", "You can't look at a glass half full or empty if it's overflowing.", KANYE_WEST)
    private val quote052 = Quote("052", "I hate when I'm on a flight and I wake up with a water bottle next to me like oh great now I gotta be responsible for this water bottle", KANYE_WEST)
    private val quote053 = Quote("053", "All the musicians will be free", KANYE_WEST)
    private val quote054 = Quote("054", "Artists are founders", KANYE_WEST)
    private val quote055 = Quote("055", "Buy property", KANYE_WEST)
    private val quote056 = Quote("056", "Culture is the most powerful force in humanity under God", KANYE_WEST)
    private val quote057 = Quote("057", "Empathy is the glue", KANYE_WEST)
    private val quote058 = Quote("058", "I am one of the most famous people on the planet", KANYE_WEST)
    private val quote059 = Quote("059", "I am running for President of the United States", KANYE_WEST)
    private val quote060 = Quote("060", "I am the head of Adidas. I will bring Adidas and Puma back together and bring me and jay back together", KANYE_WEST)
    private val quote061 = Quote("061", "I channel Will Ferrell when I'm at the daddy daughter dances", KANYE_WEST)
    private val quote062 = Quote("062", "I don't wanna see no woke tweets or hear no woke raps ... it's show time ... it's a whole different energy right now", KANYE_WEST)
    private val quote063 = Quote("063", "I hear people say this person is cool and this person is not cool. People are cool. Man has never invented anything as awesome as a an actual person but sometimes we value the objects we create over life itself", KANYE_WEST)
    private val quote064 = Quote("064", "I honestly need all my Royeres to be museum quality... if I see a fake Royere Ima have to Rick James your couch", KANYE_WEST)
    private val quote065 = Quote("065", "I love UZI. I be saying the same thing about Steve Jobs. I be feeling just like UZI", KANYE_WEST)
    private val quote066 = Quote("066", "I need an army of angels to cover me while I pull this sword out of the stone", KANYE_WEST)
    private val quote067 = Quote("067", "I spoke to Dave Chapelle for two hours this morning. He is our modern day Socrates", KANYE_WEST)
    private val quote068 = Quote("068", "I was just speaking with someone that told me their life story and they used to be homeless.", KANYE_WEST)
    private val quote069 = Quote("069", "I watch Bladerunner on repeat", KANYE_WEST)
    private val quote070 = Quote("070", "I'm giving all Good music artists back the 50% share I have of their masters", KANYE_WEST)
    private val quote071 = Quote("071", "I'm going to personally see to it that Taylor Swift gets her masters back. Scooter is a close family friend", KANYE_WEST)
    private val quote072 = Quote("072", "I'm the new Moses", KANYE_WEST)
    private val quote073 = Quote("073", "Life is the ultimate gift", KANYE_WEST)
    private val quote074 = Quote("074", "Ma\$e is one of my favorite rappers and I based a lot of my flows off of him", KANYE_WEST)
    private val quote075 = Quote("075", "Manga all day", KANYE_WEST)
    private val quote076 = Quote("076", "My first pillar when I'm on the board of adidas will be an adidas Nike collaboration to support community growth", KANYE_WEST)
    private val quote077 = Quote("077", "My mama was a' English teacher. I know how to use correct English but sometimes I just don't feel like it aaaand I ain't got to", KANYE_WEST)
    private val quote078 = Quote("078", "My memories are from the future", KANYE_WEST)
    private val quote079 = Quote("079", "My mother in law Kris Jenner ... makes the best music playlist", KANYE_WEST)
    private val quote080 = Quote("080", "People say it's enough and I got my point across ... the point isn't across until we cross the point", KANYE_WEST)
    private val quote081 = Quote("081", "People tried to talk me out of running for President. Never let weak controlling people kill your spirit", KANYE_WEST)
    private val quote082 = Quote("082", "So many of us need so much less than we have especially when so many of us are in need", KANYE_WEST)
    private val quote083 = Quote("083", "The media tries to kill our heroes one at a time", KANYE_WEST)
    private val quote084 = Quote("084", "The world needs more Joy... this idea is super fresh", KANYE_WEST)
    private val quote085 = Quote("085", "There are 5 main pillars in a professional musicians business - Recording, Publishing, Touring, Merchandise & Name and likeness", KANYE_WEST)
    private val quote086 = Quote("086", "There are people sleeping in parking lots", KANYE_WEST)
    private val quote087 = Quote("087", "There's a crying need for civility across the board. We need to and will come together in the name of Jesus.", KANYE_WEST)
    private val quote088 = Quote("088", "There's so many lonely emojis man", KANYE_WEST)
    private val quote089 = Quote("089", "Trust me ... I won't stop", KANYE_WEST)
    private val quote090 = Quote("090", "Two years ago we had 50 million people subscribed to music streaming services around the world. Today we have 400 million.", KANYE_WEST)
    private val quote091 = Quote("091", "We are here to complete the revolution. We are building the future", KANYE_WEST)
    private val quote092 = Quote("092", "We as a people will heal. We will insure the well being of each other", KANYE_WEST)
    private val quote093 = Quote("093", "We have to evolve", KANYE_WEST)
    private val quote094 = Quote("094", "We must and will cure homelessness and hunger. We have the capability as a species", KANYE_WEST)
    private val quote095 = Quote("095", "We must form a union. We must unify", KANYE_WEST)
    private val quote096 = Quote("096", "We used to diss Michael Jackson the media made us call him crazy ... then they killed him", KANYE_WEST)
    private val quote097 = Quote("097", "We will be recognized", KANYE_WEST)
    private val quote098 = Quote("098", "We will change the paradigm", KANYE_WEST)
    private val quote099 = Quote("099", "We will cure hunger", KANYE_WEST)
    private val quote100 = Quote("100", "We will heal. We will cure.", KANYE_WEST)
    private val quote101 = Quote("101", "We're going to move the entire music industry into the 21st Century", KANYE_WEST)
    private val quote102 = Quote("102", "We've gotten comfortable with not having what we deserve", KANYE_WEST)
    private val quote103 = Quote("103", "Who made up the term major label in the first place???", KANYE_WEST)
    private val quote104 = Quote("104", "Winning is the only option", KANYE_WEST)

    private val kanyeQuotes = mapOf<String, Quote>(
        Pair(this.quote000.id, quote000),
        Pair(this.quote001.id, quote001),
        Pair(this.quote002.id, quote002),
        Pair(this.quote003.id, quote003),
        Pair(this.quote004.id, quote004),
        Pair(this.quote005.id, quote005),
        Pair(this.quote006.id, quote006),
        Pair(this.quote007.id, quote007),
        Pair(this.quote008.id, quote008),
        Pair(this.quote009.id, quote009),
        Pair(this.quote010.id, quote010),
        Pair(this.quote011.id, quote011),
        Pair(this.quote012.id, quote012),
        Pair(this.quote013.id, quote013),
        Pair(this.quote014.id, quote014),
        Pair(this.quote015.id, quote015),
        Pair(this.quote016.id, quote016),
        Pair(this.quote017.id, quote017),
        Pair(this.quote018.id, quote018),
        Pair(this.quote019.id, quote019),
        Pair(this.quote020.id, quote020),
        Pair(this.quote021.id, quote021),
        Pair(this.quote022.id, quote022),
        Pair(this.quote023.id, quote023),
        Pair(this.quote024.id, quote024),
        Pair(this.quote025.id, quote025),
        Pair(this.quote026.id, quote026),
        Pair(this.quote027.id, quote027),
        Pair(this.quote028.id, quote028),
        Pair(this.quote029.id, quote029),
        Pair(this.quote030.id, quote030),
        Pair(this.quote031.id, quote031),
        Pair(this.quote032.id, quote032),
        Pair(this.quote033.id, quote033),
        Pair(this.quote034.id, quote034),
        Pair(this.quote035.id, quote035),
        Pair(this.quote036.id, quote036),
        Pair(this.quote037.id, quote037),
        Pair(this.quote038.id, quote038),
        Pair(this.quote039.id, quote039),
        Pair(this.quote040.id, quote040),
        Pair(this.quote041.id, quote041),
        Pair(this.quote042.id, quote042),
        Pair(this.quote043.id, quote043),
        Pair(this.quote044.id, quote044),
        Pair(this.quote045.id, quote045),
        Pair(this.quote046.id, quote046),
        Pair(this.quote047.id, quote047),
        Pair(this.quote048.id, quote048),
        Pair(this.quote049.id, quote049),
        Pair(this.quote050.id, quote050),
        Pair(this.quote051.id, quote051),
        Pair(this.quote052.id, quote052),
        Pair(this.quote053.id, quote053),
        Pair(this.quote054.id, quote054),
        Pair(this.quote055.id, quote055),
        Pair(this.quote056.id, quote056),
        Pair(this.quote057.id, quote057),
        Pair(this.quote058.id, quote058),
        Pair(this.quote059.id, quote059),
        Pair(this.quote060.id, quote060),
        Pair(this.quote061.id, quote061),
        Pair(this.quote062.id, quote062),
        Pair(this.quote063.id, quote063),
        Pair(this.quote064.id, quote064),
        Pair(this.quote065.id, quote065),
        Pair(this.quote066.id, quote066),
        Pair(this.quote067.id, quote067),
        Pair(this.quote068.id, quote068),
        Pair(this.quote069.id, quote069),
        Pair(this.quote070.id, quote070),
        Pair(this.quote071.id, quote071),
        Pair(this.quote072.id, quote072),
        Pair(this.quote073.id, quote073),
        Pair(this.quote074.id, quote074),
        Pair(this.quote075.id, quote075),
        Pair(this.quote076.id, quote076),
        Pair(this.quote077.id, quote077),
        Pair(this.quote078.id, quote078),
        Pair(this.quote079.id, quote079),
        Pair(this.quote080.id, quote080),
        Pair(this.quote081.id, quote081),
        Pair(this.quote082.id, quote082),
        Pair(this.quote083.id, quote083),
        Pair(this.quote084.id, quote084),
        Pair(this.quote085.id, quote085),
        Pair(this.quote086.id, quote086),
        Pair(this.quote087.id, quote087),
        Pair(this.quote088.id, quote088),
        Pair(this.quote089.id, quote089),
        Pair(this.quote090.id, quote090),
        Pair(this.quote091.id, quote091),
        Pair(this.quote092.id, quote092),
        Pair(this.quote093.id, quote093),
        Pair(this.quote094.id, quote094),
        Pair(this.quote095.id, quote095),
        Pair(this.quote096.id, quote096),
        Pair(this.quote097.id, quote097),
        Pair(this.quote098.id, quote098),
        Pair(this.quote099.id, quote099),
        Pair(this.quote100.id, quote100),
        Pair(this.quote101.id, quote101),
        Pair(this.quote102.id, quote102),
        Pair(this.quote103.id, quote103),
        Pair(this.quote104.id, quote104),
    )

    fun getQuote(): Quote? {
        val quoteId = (0..104).random().toString()
        val paddedQuoteId = quoteId.padStart(3, '0')
        return getQuoteById(paddedQuoteId)
    }

    fun getQuoteById(id : String): Quote? {
        logger.info("retrieving quote id: $id")
        return kanyeQuotes[id]
    }

}