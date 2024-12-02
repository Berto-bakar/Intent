package com.tarea02.intent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText userNameEditText, userPasswordEditText;
    Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inicializar las vistas
        userNameEditText = findViewById(R.id.userNameTest);
        userPasswordEditText = findViewById(R.id.userPasswordTest);
        loginButton = findViewById(R.id.button1);

        // Configurar el botón de login
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = userNameEditText.getText().toString();
                String password = userPasswordEditText.getText().toString();

                // Verificar las credenciales
                if (username.isEmpty() || password.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Por favor ingrese nombre de usuario y contraseña", Toast.LENGTH_SHORT).show();
                } else if (username.equals("Berto") && password.equals("bakar")) {
                    Intent intent = new Intent(MainActivity.this, Activity2.class);
                    intent.putExtra("username", username);
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this, "Credenciales incorrectas", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}