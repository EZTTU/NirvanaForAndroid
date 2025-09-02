package io.github.seon.nirvana.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import io.github.seon.nirvana.R;

public class CalculatorActivity extends AppCompatActivity {
    private TextView tvExpression;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_calculator);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        GridLayout buttonField = findViewById(R.id.gl_btn_field);

        for (int i = 0; i < buttonField.getChildCount(); i++) {
            View childAt = buttonField.getChildAt(i);
            if (childAt instanceof Button) {
                Button button = (Button) childAt;
                switch (button.getText().toString()) {
                    case "=":
                        break;
                    case "C":
                        break;
                    case "CE":
                        break;
                    default:
                        break;
                }
            }
        }
    }


}