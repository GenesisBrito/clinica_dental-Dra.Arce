package catolica.edu.sv;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selectRole(View view) {
        String selectedRole = "";
        // esta es la configuracion para llamar los botones
        if (view.getId() == R.id.buttonDentista) {
            selectedRole = "Dentista";
            Intent intentDentista = new Intent(this, Login_Dentista.class);
            intentDentista.putExtra("selectedRole", selectedRole);
            startActivity(intentDentista);
        } else if (view.getId() == R.id.buttonAsistente) {
            selectedRole = "Asistente";
            Intent intentAsistente = new Intent(this, Login_Asistente.class);
            intentAsistente.putExtra("selectedRole", selectedRole);
            startActivity(intentAsistente);
        }
    }
}

