package gonzalez.jesus.popcornfactory_gonzalezjesus

import android.content.Context
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    var adapter: PeliculaAdapter? = null
    var peliculas = ArrayList<Pelicula>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        cargarPeliculas()

        adapter = PeliculaAdapter(this,peliculas)
        //gridview.adapter = adapter

    }

    fun cargarPeliculas(){
        fun cargarPeliculas() {
            peliculas.add(Pelicula("Big Hero 6", R.drawable.bighero6, R.drawable.headerbighero6, "When a devastating event befalls the city of San Fransokyo and catapults Hiro into the\n" +
                    "midst of danger, he turns to Baymax and his close friends adrenaline junkie Go Go\n" +
                    "Tomago, neatnik Wasabi, chemistry whiz Honey Lemon and fanboy Fred. Determined to\n" +
                    "uncover the mystery, Hiro transforms his friends into a band of high-tech heroes called\n" +
                    "\"Big Hero 6.\""))

            peliculas.add(Pelicula("1917", R.drawable.milnueve, R.drawable.milnueveheader, "British trenches somewhere in France. World war has been going on for the third year,\n" +
                    "heroic illusions have dissipated; general mood - boredom and fatigue. Stuff the belly,\n" +
                    "sleep, return home to Christmas Eve. On another quiet day, when nothing happens, two\n" +
                    "young soldiers, Blake and Schofield, are summoned to the general, who instructs them to\n" +
                    "send an important message to Colonel MacKenzie in the Second Devonshire Battalion,\n" +
                    "whose telephone connection was cut off by the enemy."))

            peliculas.add(Pelicula("Leap Year", R.drawable.leapyear, R.drawable.leapyearheader, "A woman who has an elaborate scheme to propose to her boyfriend on Leap Day, an Irish\n" +
                    "tradition which occurs every time the date February 29 rolls around, faces a major setback\n" +
                    "when bad weather threatens to derail her planned trip to Dublin. With the help of an innkeeper,\n" +
                    "however, her cross-country odyssey just might result in her getting engaged."))

            peliculas.add(Pelicula("Men in Black", R.drawable.mib, R.drawable.mibheader, "Based off of the comic book. Unbeknownst to other people, there is a private agency code\n" +
                    "named MiB. This agency is some kind of extra terrestrial surveillance corporation. Then,\n" +
                    "one of the agency's finest men only going by the name \"K\" (Tommy Lee Jones) , is recruiting\n" +
                    "for a new addition to the agency. He has chosen James Edwards (Will Smith) of the N.Y.P.D.\n" +
                    "Then, one day, a flying saucer crashes into Earth. This was an alien a part of the \"Bug\" race.\n" +
                    "He takes the body of a farmer (Vincent D'Onofrio) and heads to New York. He is searching for a\n" +
                    "super energy source called \"The Galaxy\". Now, Agents J and K must stop the bug before it can\n" +
                    "escape with the galaxy."))

            peliculas.add(Pelicula("Toy Story", R.drawable.toystory, R.drawable.toystoryheader, "Toy Story is about the 'secret life of toys' when people are not around. When Buzz\n" +
                    "Lightyear, a space-ranger, takes Woody's place as Andy's favorite toy, Woody doesn't like\n" +
                    "the situation and gets into a fight with Buzz. Accidentaly Buzz falls out the window and\n" +
                    "Woody is accused by all the other toys of having killed him. He has to go out of the house to\n" +
                    "look for him so that they can both return to Andy's room. But while on the outside they get into\n" +
                    "all kind of trouble while trying to get home."))

            peliculas.add(Pelicula("Inception", R.drawable.inception, R.drawable.inceptionheader, "Dom Cobb is a skilled thief, the absolute best in the dangerous art of extraction,\n" +
                    "stealing valuable secrets from deep within the subconscious during the dream state,\n" +
                    "when the mind is at its most vulnerable. Cobb's rare ability has made him a coveted player\n" +
                    "in this treacherous new world of corporate espionage, but it has also made him an\n" +
                    "international fugitive and cost him everything he has ever loved. Now Cobb is being offered\n" +
                    "a chance at redemption. One last job could give him his life back but only if he can accomplish\n" +
                    "the impossible, inception. Instead of the perfect heist, Cobb and his team of specialists have\n" +
                    "to pull off the reverse: their task is not to steal an idea, but to plant one. If they succeed,\n" +
                    "it could be the perfect crime. But no amount of careful planning or expertise can prepare the\n" +
                    "team for the dangerous enemy that seems to predict their every move. An enemy that only Cobb\n" +
                    "could have seen coming."))
        }

    }
}

class PeliculaAdapter: BaseAdapter{
    var peliculas = ArrayList<Pelicula>()
    var context: Context? = null

    constructor(context: Context, pelculas: ArrayList<Pelicula>){
        this.context = context
        this.peliculas = pelculas
    }

    override fun getCount(): Int {
        TODO("Not yet implemented")
    }

    override fun getItem(position: Int): Any {
        TODO("Not yet implemented")
    }

    override fun getItemId(position: Int): Long {
        TODO("Not yet implemented")
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        TODO("Not yet implemented")
    }


}