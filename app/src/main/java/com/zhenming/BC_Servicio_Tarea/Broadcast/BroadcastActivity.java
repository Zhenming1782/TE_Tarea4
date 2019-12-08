package com.zhenming.BC_Servicio_Tarea.Broadcast;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

import com.zhenming.BC_Servicio_Tarea.R;

public class BroadcastActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_broadcast);

    }

    public void BC1(View v){
        Intent intBC1 = new Intent(this, Broadcast1.class);
        startActivity(intBC1);

    }

}
