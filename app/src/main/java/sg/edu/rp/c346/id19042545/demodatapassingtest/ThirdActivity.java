package sg.edu.rp.c346.id19042545.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    TextView tvAnswer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        tvAnswer = findViewById(R.id.textView);
        Intent intent = getIntent();
        char value = intent.getCharExtra("character",'A');
        tvAnswer.setText("Integer value received is: " + value);
    }
}
