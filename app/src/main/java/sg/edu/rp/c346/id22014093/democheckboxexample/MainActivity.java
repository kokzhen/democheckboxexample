package sg.edu.rp.c346.id22014093.democheckboxexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox cbEnabled;
    Button btncheck;
    TextView tvShow;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cbEnabled = findViewById(R.id.checkBoxDiscount);
        btncheck = findViewById(R.id.buttonCheck);
        tvShow = findViewById(R.id.textView);

        btncheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cbEnabled.isChecked()) {
                    tvShow.setText("The discount is given");
                    Toast.makeText(MainActivity.this,"Button click",Toast.LENGTH_LONG).show();
                }
                else {
                    tvShow.setText("The discount is not given");
                }
            }
        });


    }
}