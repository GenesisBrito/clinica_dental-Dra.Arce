package catolica.edu.sv;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class paciente extends AppCompatActivity {

    DrawerLayout drawerLayout;
    ImageView menu;

    LinearLayout grupo_citas, grupo_pacientes, grupo_tratamientos, grupo_comunicacion, grupo_configuracion, grupo_salir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paciente);

        drawerLayout = findViewById(R.id.drawerLayout);
        menu = findViewById(R.id.menu);
        grupo_citas = findViewById(R.id.grupo_citas);
        grupo_pacientes = findViewById(R.id.grupo_pacientes);
        grupo_tratamientos = findViewById(R.id.grupo_tratamientos);
        grupo_comunicacion = findViewById(R.id.grupo_comunicacion);
        grupo_configuracion = findViewById(R.id.grupo_configuracion);
        grupo_salir = findViewById(R.id.grupo_salir);

        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDrawer(drawerLayout);
            }
        });

        grupo_citas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                redirectActivity(paciente.this, citas.class);
            }
        });

        grupo_pacientes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Abre el drawer
                openDrawer(drawerLayout);
            }
        });

        grupo_tratamientos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                redirectActivity(paciente.this, tratamientos.class);
            }
        });

        grupo_comunicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                redirectActivity(paciente.this, comunicacion.class);
            }
        });

        grupo_configuracion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                redirectActivity(paciente.this, configuracion.class);
            }
        });

        grupo_salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(paciente.this, "salir", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public static void openDrawer(DrawerLayout drawerLayout) {
        drawerLayout.openDrawer(GravityCompat.START);
    }

    public static void closeDrawer(DrawerLayout drawerLayout) {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        }
    }

    public static void redirectActivity(Activity activity, Class secondActivity) {
        Intent intent = new Intent(activity, secondActivity);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        activity.startActivity(intent);
    }
}
