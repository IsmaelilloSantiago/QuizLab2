package es.ulpgc.eite.da.lhdez.quizlab2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Cheat extends AppCompatActivity {

    private TextView pregunta;
    private Button Byes,Bno;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cheat);

        linkelementos();
        llenarElementos();
    }

    private void llenarElementos() {
        pregunta.setText(R.string.pregunta_cheat);
    }

    private void linkelementos() {
        pregunta = (TextView)findViewById(R.id.cheat);

    }

}