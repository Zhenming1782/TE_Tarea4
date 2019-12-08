package com.zhenming.BC_Servicio_Tarea.Main;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.zhenming.BC_Servicio_Tarea.Broadcast.Broadcast1;
import com.zhenming.BC_Servicio_Tarea.R;
import com.zhenming.BC_Servicio_Tarea.Servicios.Servicio2;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnServ(View v){
        Intent intS = new Intent(this, Servicio2.class);
        startActivity(intS);
    }

    public void btnBC(View v){
        Intent intB = new Intent(this, Broadcast1.class);
        startActivity(intB);

    }

}
