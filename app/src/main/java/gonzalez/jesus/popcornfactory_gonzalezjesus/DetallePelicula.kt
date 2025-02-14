package gonzalez.jesus.popcornfactory_gonzalezjesus

import android.os.Bundle
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

        var imagen: ImageView = findViewById(R.id.iv_pelicula_imagen) as ImageView
        var nombre: TextView = findViewById(R.id.tv_nombre_pelicula) as TextView
        var descripcion: TextView = findViewById(R.id.tv_pelicula_desc) as TextView

        var bundle = intent.extras

        if(bundle != null ){
            imagen.setImageResource(bundle.getInt("header"))
            nombre.setText(bundle.getString("nombre"))
            descripcion.setText(bundle.getString("sipnosis"))
        }

    }
}