package com.example.examen

import com.example.examen.heroes.Hero

// Lista de heroes
class HeroList {
    companion object {
        val HeroesList: List<Hero> = listOf(
            // DC
            Hero(1, "Batman", "DC", "https://getwallpapers.com/wallpaper/full/6/2/2/649245.jpg",
                "After his parents were murdered by a criminal, Bruce Wayne trained his mind and body to fight crime as Batman, using the image of the bat to strike terror into the hearts of criminals."),
            Hero(2, "Superman", "DC", "https://insidepulse.com/wp-content/uploads/2010/10/All-Star-Superman.jpg",
                "The last son of a dying world, a young Kal-El was sent to Earth before his homeworld was destroyed and was adopted by a couple. Learning that he had powers greater than those of mortal men and chose to use those to help others as Superman."),
            Hero(3, "Flash", "DC", "https://thereelbits.com/wp-content/uploads/2012/04/flashpoint-cover01f.jpg",
                "When police scientist Barry Allen is struck by lightning while handling strange chemicals, he discovers he's gained the ability to move much faster than the speed of sound. Taking on a costume, he fights crime as The Flash, the Fastest Man Alive! "),
            Hero(4, "Snowflame", "DC", "https://s3.amazonaws.com/comicgeeks/characters/avatars/37313.jpg",
                "Snowflame first appeared in the 1988 comic book New Guardians #2 in a story titled Jungle Snow. In it, he meets the New Guardians in Colombia as the leader of a drug cartel. In their first encounter he defeats the superhero team, but is later killed by them in a chemical shed explosion."),
            Hero(5, "Aquaman", "DC", "https://i.pinimg.com/originals/5d/d8/d6/5dd8d69931dd03764a8a729fac36d686.jpg",
                "A half-human/half-Atlantean, Arthur Curry was raised by a human and learned at a young age to use his powers to live aquatically to help people before taking up the throne of Atlantis."),
            Hero(6, "Cyborg", "DC", "https://i.pinimg.com/originals/51/3f/ad/513fad730a2b13ed1b4bdf77f08165eb.jpg",
                "His father was a scientist who had been studying how to subdue the superhumans. When Darkside attacked the lab, Victor was caught in an explosion in the lab and his father saved him by making him from the latest technology and transforming him into a cyborg (half man, half machine)."),
            Hero(7, "Robin", "DC", "https://i.pinimg.com/originals/1b/41/b8/1b41b89303b2c384b1d43da24e80483c.jpg",
                "Richard Grayson was once a circus acrobat along with his parents, until they were murdered by a criminal who sabotaged their act. Dick was soon taken in by Bruce Wayne, who sympathized with his plight and revealed that he was actually Batman, a superhero. Bruce trained Dick to fight crime as his ally and protege, Robin."),
            Hero(8, "Green Arrow", "DC", "https://static.dc.com/dc/files/default_images/Char_Profile_GreenArrow_5c4915494b4039.94050514.jpg",
                "Oliver Queen was a rich playboy who accidentally ended up stranded on a deserted island.  To survive, he learned archery and when he finally returned home decided to use his new skill to hunt criminals as the Green Arrow."),
            Hero(9, "Green Lantern", "DC", "https://i.pinimg.com/originals/2e/3e/c9/2e3ec980832089196929e72cdc91b3e3.jpg",
                "Hal Jordan was a test pilot who found a dying alien named Abin Sur. Abin gave him a ring that allows constructs consisting of pure willpower to be made, limited only by the users imagination."),
            Hero(10, "Martian Manhunter", "DC", "https://assets2.ignimgs.com/2015/12/08/2apng-c732ce_1280w.png",
                "After being teleported from his home planet of Mars, J'onn J'onzz decided to use his fantastic Martian super-powers to defend the Earth as the Martian Manhunter."),
            // Marvel
            Hero(11, "Iron Man", "Marvel", "https://i.pinimg.com/originals/44/40/8c/44408c65b1dd35cff4ac71ba694e4291.jpg",
                "Born Anthony Edward \"Tony\" Stark, he is an industrialist playboy and genius engineer who suffers a severe heart injury during a kidnapping in which his captors attempt to force him to build a massively destructive weapon. He instead creates a powered suit of armor to save his life and escape captivity. He later decides to use the suit to protect the world as Iron Man."),
            Hero(12, "Spider-Man", "Marvel", "https://wallpaperaccess.com/full/930248.jpg",
                "When nerdy high school student Peter Parker was bitten by a radioactive spider during a science demonstration, he found he had gained super-human abilities. Peter first began to use his powers to gain fame and fortune as Spider-Man, but after his beloved uncle was killed by a criminal that Peter didn't stop, Peter realized his great power came with great responsibility to help others. From that day Spider-Man eschewed fame and fortune in favor of using his powers to help others and fight evil."),
            Hero(13, "Captain America", "Marvel", "https://i.pinimg.com/originals/1e/d7/e7/1ed7e72dbbf386b835de5e190cb8af24.jpg",
                "Steve Rogers was a scrawny young man who desperately wanted to fight for his country. When given the opportunity by Dr. Eskine and the U.S. government, they used the Super Soldier formula to transform Sonny Rogers' physique into peak physical condition. However, Dr. Erskine was murdered almost immediately afterwards, making Sonny the only super soldier of his kind. Dedicated to fighting for freedom and the values of his homeland, Sonny Rogers dedicated his life to fighting evil and tyranny at home and abroad as Captain America."),
            Hero(14, "Wolverine", "Marvel", "https://www.comicartcommunity.com/gallery/data/media/59/L034.jpg",
                "When he was a young man, James Howlett discovered he was different when claws popped out of his hands and ran away from home, becoming a hardened outsider. He eventually became a soldier, gaining the attention of Weapon X who intended to turn him into a living weapon. After escaping, he ended up joining the superhero team Alpha Flight before finally finding a family with the mutant team of heroes who fight for civil rights, the X-Men."),
            Hero(15, "Deadpool", "Marvel", "https://images4.alphacoders.com/596/thumb-1920-596145.jpg",
                "Experimented on by Weapon X in the attempt to create a powerful soldier, assassin Wade Wilson (known for targeting only those he felt \"deserved to die\") was somewhat cured of his cancer by being given a power healing factor. However, the trauma drove Wade mad (or perhaps madder) and he left to become a mercenary with a warped sense of humor."),
            Hero(16, "Hawkeye", "Marvel", "https://www.writeups.org/wp-content/uploads/Hawkeye-Avengers-Marvel-Comics-Clint-Barton-h5.jpg",
                "A young circus performer, trained by The Swordsman, Clint Barton became an extremely skilled marksman - keen to show off his skills and show up the “fool” heroes in costumes, Clint was convinced to prove his skill against the superheroes Iron Man by the spy Black Widow. Eventually, after realizing he was being used, he decided to use his skills for good and joined the Avengers along with also recently reformed Quicksilver and Scarlet Witch."),
            Hero(17, "Hulk", "Marvel", "https://i.pinimg.com/originals/92/a8/6d/92a86dd9f4be2d9609815a1f02afc28c.jpg",
                "When scientist Dr. Bruce Banner was testing a bomb he developed for the military, he discovered a young man, Rick Jones, on the testing site, oblivious to the threat of the bomb. Bruce went out to help him got him to safety but was bombarded with the bomb's unique gamma radiation. Afterward, Bruce discovers whenever he is mad, scared, or under some similar form of stress, he becomes a strong man. The monster, called the Hulk, simply wants to be left alone and lashes out at anyone he perceives as an enemy, but is also heroic, willing to fight for those he cares about."),
            Hero(18, "Thor", "Marvel", "https://images2.fanpop.com/image/photos/10100000/thor-marvel-comics-10113598-1000-1044.jpg",
                "Thor Odinson was a powerful Norse god. When his father, Odin, decided his son was too arrogant, he turned him mortal (Donald Blake) and placed him on Earth. He was cursed to become mortal only when he found his magic hammer and became a god on Earth, defending his new home with his restored powers."),
            Hero(19, "Black Widow", "Marvel", "https://i.pinimg.com/originals/9e/5a/40/9e5a40e839ebcee65b25d91b40be46c3.jpg",
                "A former Russian spy, Natasha Romanoff (AKA Black Widow) defected and began working with the Avengers and then on her own as a superhero."),
            Hero(20, "Moon Knight", "Marvel", "https://i.pinimg.com/originals/9e/2b/39/9e2b398db4281495b4dd53a84e7d461e.jpg",
                "Marc Spector, a former Marine and CIA operative, becomes a mercenary with his friend Jean-Paul \"Frenchie\" DuChamp. In Sudan, after opposing fellow mercenary Raoul Bushman’s brutal actions, Spector is left for dead. Reviving in front of a statue of the Egyptian moon god Khonshu, he believes Khonshu has chosen him to protect the innocent as \"Moon Knight\"."),
        )
    }
}