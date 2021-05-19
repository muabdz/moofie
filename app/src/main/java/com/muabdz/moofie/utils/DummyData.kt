package com.muabdz.moofie.utils

import com.muabdz.moofie.data.MovieEntity

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
                arrayListOf("Action", "Science Fiction", "Adventure"),
                "2h 2m",
                "file://android_asset/movies/poster_alita.jpg"
        ))

        movies.add(
            MovieEntity(
            "m02",
            "Aquaman",
            "Once home to the most advanced civilization on Earth, Atlantis is now an underwater kingdom ruled by the power-hungry King Orm. With a vast army at his disposal, Orm plans to conquer the remaining oceanic people and then the surface world. Standing in his way is Arthur Curry, Orm's half-human, half-Atlantean brother and true heir to the throne.",
            "12/21/2018",
            "PG-13",
            69,
            arrayListOf("Action", "Adventure", "Fantasy"),
                "2h 23m",
                "file://android_asset/movies/poster_aquaman.jpg"
        ))

        movies.add(
            MovieEntity(
                "m03",
                "Bohemian Rhapsody",
                "Singer Freddie Mercury, guitarist Brian May, drummer Roger Taylor and bass guitarist John Deacon take the music world by storm when they form the rock 'n' roll band Queen in 1970. Hit songs become instant classics. When Mercury's increasingly wild lifestyle starts to spiral out of control, Queen soon faces its greatest challenge yet – finding a way to keep the band together amid the success and excess.",
                "11/02/2018",
                "PG-13",
                80,
                arrayListOf("Music", "Drama", "History"),
                "2h 15m",
                "file://android_asset/movies/poster_bohemian.jpg"
            ))

        movies.add(
            MovieEntity(
                "m04",
                "Creed II",
                "Between personal obligations and training for his next big fight against an opponent with ties to his family's past, Adonis Creed is up against the challenge of his life.",
                "11/21/2018",
                "PG-13",
                69,
                arrayListOf("Drama"),
                "2h 10m",
                "file://android_asset/movies/poster_creed.jpg"
            ))

        movies.add(
            MovieEntity(
                "m05",
                "Fantastic Beasts: The Crimes of Grindelwald",
                "Gellert Grindelwald has escaped imprisonment and has begun gathering followers to his cause—elevating wizards above all non-magical beings. The only one capable of putting a stop to him is the wizard he once called his closest friend, Albus Dumbledore. However, Dumbledore will need to seek help from the wizard who had thwarted Grindelwald once before, his former student Newt Scamander, who agrees to help, unaware of the dangers that lie ahead. Lines are drawn as love and loyalty are tested, even among the truest friends and family, in an increasingly divided wizarding world.",
                "11/16/2018",
                "PG-13",
                69,
                arrayListOf("Adventure", "Fantasy", "Drama"),
                "2h 14m",
                "file://android_asset/movies/poster_crimes.jpg"
            ))

        movies.add(
            MovieEntity(
                "m06",
                "Glass",
                "In a series of escalating encounters, former security guard David Dunn uses his supernatural abilities to track Kevin Wendell Crumb, a disturbed man who has twenty-four personalities. Meanwhile, the shadowy presence of Elijah Price emerges as an orchestrator who holds secrets critical to both men.",
                "01/18/2019",
                "PG-13",
                67,
                arrayListOf("Thriller", "Drama", "Science Fiction"),
                "2h 9m",
                "file://android_asset/movies/poster_glass.jpg"
            ))

        movies.add(
            MovieEntity(
                "m07",
                "How to Train Your Dragon: The Hidden World",
                "As Hiccup fulfills his dream of creating a peaceful dragon utopia, Toothless’ discovery of an untamed, elusive mate draws the Night Fury away. When danger mounts at home and Hiccup’s reign as village chief is tested, both dragon and rider must make impossible decisions to save their kind.",
                "01/09/2019",
                "G",
                78,
                arrayListOf("Animation", "Family", "Adventure"),
                "1h 44m",
                "file://android_asset/movies/poster_how_to_train.jpg"
            ))

        movies.add(
            MovieEntity(
                "m08",
                "Avengers: Infinity War",
                "As the Avengers and their allies have continued to protect the world from threats too large for any one hero to handle, a new danger has emerged from the cosmic shadows: Thanos. A despot of intergalactic infamy, his goal is to collect all six Infinity Stones, artifacts of unimaginable power, and use them to inflict his twisted will on all of reality. Everything the Avengers have fought for has led up to this moment - the fate of Earth and existence itself has never been more uncertain.",
                "04/27/2018",
                "PG-13",
                83,
                arrayListOf("Adventure", "Action", "Science Fiction"),
                "2h 29m",
                "file://android_asset/movies/poster_infinity_war.jpg"
            ))

        movies.add(
            MovieEntity(
                "m09",
                "Mortal Engines",
                "Many thousands of years in the future, Earth’s cities roam the globe on huge wheels, devouring each other in a struggle for ever diminishing resources. On one of these massive traction cities, the old London, Tom Natsworthy has an unexpected encounter with a mysterious young woman from the wastelands who will change the course of his life forever.",
                "12/14/2018",
                "PG-13",
                61,
                arrayListOf("Adventure", "Science Fiction"),
                "2h 9m",
                "file://android_asset/movies/poster_mortal_engines.jpg"
            ))

        movies.add(
            MovieEntity(
                "m10",
                "Overlord",
                "France, June 1944. On the eve of D-Day, some American paratroopers fall behind enemy lines after their aircraft crashes while on a mission to destroy a radio tower in a small village near the beaches of Normandy. After reaching their target, the surviving paratroopers realise that, in addition to fighting the Nazi troops that patrol the village, they also must fight against something else.",
                "11/09/2018",
                "R",
                67,
                arrayListOf("Horror", "War", "Science Fiction"),
                "1h 50m",
                "file://android_asset/movies/poster_overlord.jpg"
            ))

        movies.add(
            MovieEntity(
                "m11",
                "Ralph Breaks the Internet",
                "Video game bad guy Ralph and fellow misfit Vanellope von Schweetz must risk it all by traveling to the World Wide Web in search of a replacement part to save Vanellope's video game, Sugar Rush. In way over their heads, Ralph and Vanellope rely on the citizens of the internet — the netizens — to help navigate their way, including an entrepreneur named Yesss, who is the head algorithm and the heart and soul of trend-making site BuzzzTube.",
                "11/21/2018",
                "PG-13",
                72,
                arrayListOf("Family", "Animation", "Comedy", "Adventure"),
                "1h 52m",
                "file://android_asset/movies/poster_ralph.jpg"
            ))

        movies.add(
            MovieEntity(
                "m12",
                "Spider-Man: Into the Spider-Verse",
                "Miles Morales is juggling his life between being a high school student and being a spider-man. When Wilson \"Kingpin\" Fisk uses a super collider, others from across the Spider-Verse are transported to this dimension.",
                "12/14/2018",
                "PG-13",
                84,
                arrayListOf("Action", "Adventure", "Animation", "Science Fiction", "Comedy"),
                "1h 57m",
                "file://android_asset/movies/poster_spiderman.jpg"
            ))

        return movies
    }
}