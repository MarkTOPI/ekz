package com.example.changecolor;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.Theme_AppCompat_Light_NoActionBar);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void white(View view) {
        Toast toast = Toast.makeText(getApplicationContext(), "Белый", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void purple(View view) {
        Toast toast = Toast.makeText(getApplicationContext(), "Розовый", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void black(View view) {
        Toast toast = Toast.makeText(getApplicationContext(), "Черный", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void blue(View view) {
        Toast toast = Toast.makeText(getApplicationContext(), "Голубой", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void people(View view) {
//        Toast toast = Toast.makeText(getApplicationContext(), "Создал приложение Роман Скорик", Toast.LENGTH_SHORT);
////        toast.show();
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("Информация о разработчике")
        .setMessage("Приложенние разработал Скорик Роман")
        .setPositiveButton("Закрыть", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
}