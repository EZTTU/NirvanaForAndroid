package io.github.seon.nirvana;

import android.graphics.Color;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivityCopy extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_copy);
        TextView colorTest = findViewById(R.id.color_test_textview);
        colorTest.setTextColor(Color.RED);
        colorTest.setBackgroundColor(Color.GREEN);

        ViewGroup.LayoutParams layoutParams = colorTest.getLayoutParams();
        /*
       px = dip * dpi / 160
         */

    }
}
