package id.co.aplikasimobile;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etNama;
    TextView tvNama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNama = findViewById(R.id.et_name);
        tvNama = findViewById(R.id.tv_name);
    }

    public void tampilNama(View view) {
        tvNama.setText(String.format("Nama Anda: %s", etNama.getText().toString()));
    }
}