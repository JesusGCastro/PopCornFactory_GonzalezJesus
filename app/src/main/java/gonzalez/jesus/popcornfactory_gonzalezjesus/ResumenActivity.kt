package gonzalez.jesus.popcornfactory_gonzalezjesus

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Locale

class ResumenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resumen)

        val txtResumen: TextView = findViewById(R.id.resumenCompra)

        val calendar = Calendar.getInstance()
        val dateFormat = SimpleDateFormat("dd/MM/yyyy HH:mm", Locale.getDefault())
        val fechaHoraActual = dateFormat.format(calendar.time)

        val bundle = intent.extras
        val nombrePelicula = bundle?.getString("name") ?: "Película Desconocida"
        val nombreCliente = bundle?.getString("cliente") ?: "Cliente Desconocido"
        val asientoSeleccionado = bundle?.getString("seat") ?: "Asiento No Seleccionado"

        txtResumen.text = "Cliente: $nombreCliente\nPelícula: $nombrePelicula\nAsiento: $asientoSeleccionado\nFecha y Hora: $fechaHoraActual"
    }
}