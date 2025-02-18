package gonzalez.jesus.popcornfactory_gonzalezjesus

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DetallePelicula : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalle_pelicula)

        var imagen: ImageView = findViewById(R.id.movie_header)
        var nombre: TextView = findViewById(R.id.movie_title_detail) as TextView
        var descripcion: TextView = findViewById(R.id.movie_summary) as TextView
        var seatsLeft: TextView = findViewById(R.id.seatsLeft) as TextView
        var buyTickets: Button = findViewById(R.id.buyTickets) as Button

        var bundle = intent.extras
        var ns = 0
        var id = -1
        var title = ""

        if(bundle != null ){

            ns = bundle.getInt("numberSeats")
            title = bundle.getString("titulo")!!

            imagen.setImageResource(bundle.getInt("header"))
            nombre.setText(bundle.getString("nombre"))
            descripcion.setText(bundle.getString("sipnosis"))
            seatsLeft.setText("$ns seats available")
            id = bundle.getInt("pos")

        }

        if (ns == 0){
            buyTickets.isEnabled = false
        } else {
            buyTickets.isEnabled = true
            buyTickets.setOnClickListener {
                val intent: Intent = Intent(this, SeatSelection::class.java)

                intent.putExtra("id", id)
                intent.putExtra("name", title)

                this.startActivity(intent)
            }
        }
    }
}