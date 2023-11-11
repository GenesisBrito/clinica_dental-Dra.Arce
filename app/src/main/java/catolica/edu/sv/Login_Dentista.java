package catolica.edu.sv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Login_Dentista extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_dentista);

        Button buttonLoginDentista = findViewById(R.id.buttonLoginDentista);
        buttonLoginDentista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Iniciar la nueva actividad al hacer clic en el botón
                Intent intent = new Intent(Login_Dentista.this, Pantalla_1_Dentista.class);
                startActivity(intent);
            }
        });
    }
}


