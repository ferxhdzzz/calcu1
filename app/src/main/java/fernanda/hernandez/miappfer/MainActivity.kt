package fernanda.hernandez.miappfer

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // 1- mandar a llamar a todos los elementos
        val txtnum1 =  findViewById<EditText>(R.id.txtnum1)
        val txtnum2 =  findViewById<EditText>(R.id.txtnum2)
        val btnsum =  findViewById<Button>(R.id.btnsum)

       //creo objeto para mandar a llamar el objeto de la calcu

        val objCalculadora = calculadora()


        //programar
        btnsum.setOnClickListener {
            objCalculadora.sumar(txtnum1.text.toString().toInt(), txtnum2.text.toString().toInt())


        }


    }
}