package gonzalez.jesus.popcornfactory_gonzalezjesus

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SeatSelection : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seat_selection)

        val title: TextView = findViewById(R.id.titleSeats)
        val confirm: Button = findViewById(R.id.confirm) as Button
        var posMovie = -1

        val bundle = intent.extras

        if (bundle != null){
            title.setText(bundle.getString("name"))
            posMovie = bundle.getInt("id")
        }

        val row1: RadioGroup =  findViewById(R.id.row1)
        val row2: RadioGroup =  findViewById(R.id.row2)
        val row3: RadioGroup =  findViewById(R.id.row3)
        val row4: RadioGroup =  findViewById(R.id.row4)

        row1.setOnCheckedChangeListener { group, checkedId ->
            if (checkedId > -1){
                row2.clearCheck()
                row3.clearCheck()
                row4.clearCheck()

                row1.check(checkedId)
            }
        }

        row2.setOnCheckedChangeListener { group, checkedId ->
            if (checkedId > -1){
                row1.clearCheck()
                row3.clearCheck()
                row4.clearCheck()

                row2.check(checkedId)
            }
        }

        row3.setOnCheckedChangeListener { group, checkedId ->
            if (checkedId > -1){
                row1.clearCheck()
                row2.clearCheck()
                row4.clearCheck()

                row3.check(checkedId)
            }
        }

        row4.setOnCheckedChangeListener { group, checkedId ->
            if (checkedId > -1){
                row1.clearCheck()
                row2.clearCheck()
                row3.clearCheck()

                row4.check(checkedId)
            }
        }

        confirm.setOnClickListener {
            val nombreCliente = findViewById<EditText>(R.id.nombreCliente).text.toString()

            if (nombreCliente.isBlank()) {
                Toast.makeText(this, "Por favor, ingrese su nombre", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val intent = Intent(this, ResumenActivity::class.java)
            intent.putExtra("name", title.text.toString()) // Nombre de la película
            intent.putExtra("cliente", nombreCliente) // Nombre del usuario

            val asientoSeleccionado = when {
                row1.checkedRadioButtonId != -1 -> findViewById<RadioButton>(row1.checkedRadioButtonId).text.toString()
                row2.checkedRadioButtonId != -1 -> findViewById<RadioButton>(row2.checkedRadioButtonId).text.toString()
                row3.checkedRadioButtonId != -1 -> findViewById<RadioButton>(row3.checkedRadioButtonId).text.toString()
                row4.checkedRadioButtonId != -1 -> findViewById<RadioButton>(row4.checkedRadioButtonId).text.toString()
                else -> "Ninguno"
            }

            if (asientoSeleccionado == "Ninguno") {
                Toast.makeText(this, "Por favor, seleccione un asiento", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            intent.putExtra("seat", asientoSeleccionado)
            Toast.makeText(this, "Enjoy your movie!!", Toast.LENGTH_LONG).show()
            startActivity(intent)
        }
    }
}