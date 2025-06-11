package io.github.seon.nirvana;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView againTv = findViewById(R.id.again_tv);
        againTv.setText("再次见到你！");


        findViewById(R.id.you_have_brave_btn).setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, MainActivityCopy.class);
            startActivity(intent, savedInstanceState);
        });
    }
}