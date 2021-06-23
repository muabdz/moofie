package com.muabdz.moofie.utils

import com.muabdz.moofie.R
import com.muabdz.moofie.data.MovieEntity
import com.muabdz.moofie.data.TvShowEntity

object DummyData {

    fun generateDummyMovies(): List<MovieEntity> {

        val movies = ArrayList<MovieEntity>()

        movies.add(MovieEntity(
            "m01",
            "Alita: Battle Angel",
                "When Alita awakens with no memory of who she is in a future world she does not recognize, she is taken in by Ido, a compassionate doctor who realizes that somewhere in this abandoned cyborg shell is the heart and soul of a young woman with an extraordinary past.",
                "02/14/2019",
                "PG-13",
                72,
                "Action, Science Fiction, Adventure",
                "2h 2m",
                R.drawable.poster_alita
        ))

        movies.add(
            MovieEntity(
            "m02",
            "Aquaman",
            "Once home to the most advanced civilization on Earth, Atlantis is now an underwater kingdom ruled by the power-hungry King Orm. With a vast army at his disposal, Orm plans to conquer the remaining oceanic people and then the surface world. Standing in his way is Arthur Curry, Orm's half-human, half-Atlantean brother and true heir to the throne.",
            "12/21/2018",
            "PG-13",
            69,
            "Action, Adventure, Fantasy",
                "2h 23m",
                R.drawable.poster_aquaman
        ))

        movies.add(
            MovieEntity(
                "m03",
                "Bohemian Rhapsody",
                "Singer Freddie Mercury, guitarist Brian May, drummer Roger Taylor and bass guitarist John Deacon take the music world by storm when they form the rock 'n' roll band Queen in 1970. Hit songs become instant classics. When Mercury's increasingly wild lifestyle starts to spiral out of control, Queen soon faces its greatest challenge yet – finding a way to keep the band together amid the success and excess.",
                "11/02/2018",
                "PG-13",
                80,
                "Music, Drama, History",
                "2h 15m",
                R.drawable.poster_bohemian
            ))

        movies.add(
            MovieEntity(
                "m04",
                "Creed II",
                "Between personal obligations and training for his next big fight against an opponent with ties to his family's past, Adonis Creed is up against the challenge of his life.",
                "11/21/2018",
                "PG-13",
                69,
                "Drama",
                "2h 10m",
                R.drawable.poster_creed
            ))

        movies.add(
            MovieEntity(
                "m05",
                "Fantastic Beasts: The Crimes of Grindelwald",
                "Gellert Grindelwald has escaped imprisonment and has begun gathering followers to his cause—elevating wizards above all non-magical beings. The only one capable of putting a stop to him is the wizard he once called his closest friend, Albus Dumbledore. However, Dumbledore will need to seek help from the wizard who had thwarted Grindelwald once before, his former student Newt Scamander, who agrees to help, unaware of the dangers that lie ahead. Lines are drawn as love and loyalty are tested, even among the truest friends and family, in an increasingly divided wizarding world.",
                "11/16/2018",
                "PG-13",
                69,
                "Adventure, Fantasy, Drama",
                "2h 14m",
                R.drawable.poster_crimes
            ))

        movies.add(
            MovieEntity(
                "m06",
                "Glass",
                "In a series of escalating encounters, former security guard David Dunn uses his supernatural abilities to track Kevin Wendell Crumb, a disturbed man who has twenty-four personalities. Meanwhile, the shadowy presence of Elijah Price emerges as an orchestrator who holds secrets critical to both men.",
                "01/18/2019",
                "PG-13",
                67,
                "Thriller, Drama, Science Fiction",
                "2h 9m",
                R.drawable.poster_glass
            ))

        movies.add(
            MovieEntity(
                "m07",
                "How to Train Your Dragon: The Hidden World",
                "As Hiccup fulfills his dream of creating a peaceful dragon utopia, Toothless’ discovery of an untamed, elusive mate draws the Night Fury away. When danger mounts at home and Hiccup’s reign as village chief is tested, both dragon and rider must make impossible decisions to save their kind.",
                "01/09/2019",
                "G",
                78,
                "Animation, Family, Adventure",
                "1h 44m",
                R.drawable.poster_how_to_train
            ))

        movies.add(
            MovieEntity(
                "m08",
                "Avengers: Infinity War",
                "As the Avengers and their allies have continued to protect the world from threats too large for any one hero to handle, a new danger has emerged from the cosmic shadows: Thanos. A despot of intergalactic infamy, his goal is to collect all six Infinity Stones, artifacts of unimaginable power, and use them to inflict his twisted will on all of reality. Everything the Avengers have fought for has led up to this moment - the fate of Earth and existence itself has never been more uncertain.",
                "04/27/2018",
                "PG-13",
                83,
                "Adventure, Action, Science Fiction",
                "2h 29m",
                R.drawable.poster_infinity_war
            ))

        movies.add(
            MovieEntity(
                "m09",
                "Mortal Engines",
                "Many thousands of years in the future, Earth’s cities roam the globe on huge wheels, devouring each other in a struggle for ever diminishing resources. On one of these massive traction cities, the old London, Tom Natsworthy has an unexpected encounter with a mysterious young woman from the wastelands who will change the course of his life forever.",
                "12/14/2018",
                "PG-13",
                61,
                "Adventure, Science Fiction",
                "2h 9m",
                R.drawable.poster_mortal_engines
            ))

        movies.add(
            MovieEntity(
                "m10",
                "Overlord",
                "France, June 1944. On the eve of D-Day, some American paratroopers fall behind enemy lines after their aircraft crashes while on a mission to destroy a radio tower in a small village near the beaches of Normandy. After reaching their target, the surviving paratroopers realise that, in addition to fighting the Nazi troops that patrol the village, they also must fight against something else.",
                "11/09/2018",
                "R",
                67,
                "Horror, War, Science Fiction",
                "1h 50m",
                R.drawable.poster_overlord
            ))

        movies.add(
            MovieEntity(
                "m11",
                "Ralph Breaks the Internet",
                "Video game bad guy Ralph and fellow misfit Vanellope von Schweetz must risk it all by traveling to the World Wide Web in search of a replacement part to save Vanellope's video game, Sugar Rush. In way over their heads, Ralph and Vanellope rely on the citizens of the internet — the netizens — to help navigate their way, including an entrepreneur named Yesss, who is the head algorithm and the heart and soul of trend-making site BuzzzTube.",
                "11/21/2018",
                "PG-13",
                72,
                "Family, Animation, Comedy, Adventure",
                "1h 52m",
                R.drawable.poster_ralph
            ))

        movies.add(
            MovieEntity(
                "m12",
                "Spider-Man: Into the Spider-Verse",
                "Miles Morales is juggling his life between being a high school student and being a spider-man. When Wilson \"Kingpin\" Fisk uses a super collider, others from across the Spider-Verse are transported to this dimension.",
                "12/14/2018",
                "PG-13",
                84,
                "Action, Adventure, Animation, Science Fiction, Comedy",
                "1h 57m",
                R.drawable.poster_spiderman
            ))

        return movies
    }

    fun generateDummyTvShows(): List<TvShowEntity> {

        val tvShows = ArrayList<TvShowEntity>()

        tvShows.add(
            TvShowEntity(
                "ts1",
                "Arrow",
                "Spoiled billionaire playboy Oliver Queen is missing and presumed dead when his yacht is lost at sea. He returns five years later a changed man, determined to clean up the city as a hooded vigilante armed with a bow.",
                "2012",
                67,
                "Crime, Drama, Mystery, Action & Adventure",
                R.drawable.poster_arrow
            )
        )

        tvShows.add(
            TvShowEntity(
                "ts2",
                "Dragon Ball",
                "Long ago in the mountains, a fighting master known as Gohan discovered a strange boy whom he named Goku. Gohan raised him and trained Goku in martial arts until he died. The young and very strong boy was on his own, but easily managed. Then one day, Goku met a teenage girl named Bulma, whose search for the mystical Dragon Balls brought her to Goku's home. Together, they set off to find all seven and to grant her wish.",
                "1986",
                81,
                "Animation, Action & Adventure, Sci-Fi & Fantasy",
                R.drawable.poster_dragon_ball
            )
        )

        tvShows.add(
            TvShowEntity(
                "ts3",
                "Fairy Tail",
                "Lucy is a 17-year-old girl, who wants to be a full-fledged mage. One day when visiting Harujion Town, she meets Natsu, a young man who gets sick easily by any type of transportation. But Natsu isn't just any ordinary kid, he's a member of one of the world's most infamous mage guilds: Fairy Tail.",
                "2009",
                78,
                "Action & Adventure, Animation, Comedy, Sci-Fi & Fantasy, Mystery",
                R.drawable.poster_fairytail
            )
        )

        tvShows.add(
            TvShowEntity(
                "ts4",
                "Family Guy",
                "Sick, twisted, politically incorrect and Freakin' Sweet animated series featuring the adventures of the dysfunctional Griffin family. Bumbling Peter and long-suffering Lois have three kids. Stewie (a brilliant but sadistic baby bent on killing his mother and taking over the world), Meg (the oldest, and is the most unpopular girl in town) and Chris (the middle kid, he's not very bright but has a passion for movies). The final member of the family is Brian - a talking dog and much more than a pet, he keeps Stewie in check whilst sipping Martinis and sorting through his own life issues.",
                "1999",
                70,
                "Animation, Comedy",
                R.drawable.poster_family_guy
            )
        )

        tvShows.add(
            TvShowEntity(
                "ts5",
                "The Flash",
                "After a particle accelerator causes a freak storm, CSI Investigator Barry Allen is struck by lightning and falls into a coma. Months later he awakens with the power of super speed, granting him the ability to move through Central City like an unseen guardian angel. Though initially excited by his newfound powers, Barry is shocked to discover he is not the only \"meta-human\" who was created in the wake of the accelerator explosion -- and not everyone is using their new powers for good. Barry partners with S.T.A.R. Labs and dedicates his life to protect the innocent. For now, only a few close friends and associates know that Barry is literally the fastest man alive, but it won't be long before the world learns what Barry Allen has become...The Flash.",
                "2014",
                77,
                "Drama, Sci-Fi & Fantasy",
                R.drawable.poster_flash
            )
        )

        tvShows.add(
            TvShowEntity(
                "ts6",
                "Game of Thrones",
                "Seven noble families fight for control of the mythical land of Westeros. Friction between the houses leads to full-scale war. All while a very ancient evil awakens in the farthest north. Amidst the war, a neglected military order of misfits, the Night's Watch, is all that stands between the realms of men and icy horrors beyond.",
                "2011",
                84,
                "Sci-Fi & Fantasy, Drama, Action & Adventure",
                R.drawable.poster_got
            )
        )

        tvShows.add(
            TvShowEntity(
                "ts7",
                "Gotham",
                "Everyone knows the name Commissioner Gordon. He is one of the crime world's greatest foes, a man whose reputation is synonymous with law and order. But what is known of Gordon's story and his rise from rookie detective to Police Commissioner? What did it take to navigate the multiple layers of corruption that secretly ruled Gotham City, the spawning ground of the world's most iconic villains? And what circumstances created them – the larger-than-life personas who would become Catwoman, The Penguin, The Riddler, Two-Face and The Joker?",
                "2014",
                75,
                "Drama, Crime, Sci-Fi & Fantasy",
                R.drawable.poster_gotham
            )
        )

        tvShows.add(
            TvShowEntity(
                "ts8",
                "Grey's Anatomy",
                "Follows the personal and professional lives of a group of doctors at Seattle’s Grey Sloan Memorial Hospital.",
                "2005",
                82,
                "Drama",
                R.drawable.poster_grey_anatomy
            )
        )

        tvShows.add(
            TvShowEntity(
                "ts9",
                "Marvel's Iron Fist",
                "Danny Rand resurfaces 15 years after being presumed dead. Now, with the power of the Iron Fist, he seeks to reclaim his past and fulfill his destiny.",
                "2017",
                66,
                "Action & Adventure, Drama, Sci-Fi & Fantasy",
                R.drawable.poster_iron_fist
            )
        )

        tvShows.add(
            TvShowEntity(
                "ts10",
                "Naruto Shippūden",
                "Naruto Shippuuden is the continuation of the original animated TV series Naruto.The story revolves around an older and slightly more matured Uzumaki Naruto and his quest to save his friend Uchiha Sasuke from the grips of the snake-like Shinobi, Orochimaru. After 2 and a half years Naruto finally returns to his village of Konoha, and sets about putting his ambitions to work, though it will not be easy, as He has amassed a few (more dangerous) enemies, in the likes of the shinobi organization; Akatsuki.",
                "2007",
                86,
                "Animation, Action & Adventure, Sci-Fi & Fantasy",
                R.drawable.poster_naruto_shipudden
            )
        )

        tvShows.add(
            TvShowEntity(
                "ts11",
                "NCIS",
                "From murder and espionage to terrorism and stolen submarines, a team of special agents investigates any crime that has a shred of evidence connected to Navy and Marine Corps personnel, regardless of rank or position.",
                "2003",
                75,
                "Crime, Action & Adventure, Drama",
                R.drawable.poster_ncis
            )
        )

        tvShows.add(
            TvShowEntity(
                "ts12",
                "The Simpsons",
                "Set in Springfield, the average American town, the show focuses on the antics and everyday adventures of the Simpson family; Homer, Marge, Bart, Lisa and Maggie, as well as a virtual cast of thousands. Since the beginning, the series has been a pop culture icon, attracting hundreds of celebrities to guest star. The show has also made name for itself in its fearless satirical take on politics, media and American life in general.",
                "1989",
                79,
                "Family, Animation, Comedy, Drama",
                R.drawable.poster_the_simpson
            )
        )

        return tvShows
    }
}