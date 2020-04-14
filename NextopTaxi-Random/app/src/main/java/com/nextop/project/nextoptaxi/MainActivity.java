package com.nextop.project.nextoptaxi;

import java.util.Random;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private double latitude = 37.5571992;
    private double longitude = 126.970536;
    private double lat_init=latitude;
    private double long_init=longitude;
    Random rand=new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView latText = findViewById(R.id.latitude);
        final TextView lonText = findViewById(R.id.longitude);

        latText.setText(String.format("%f", this.latitude));
        lonText.setText(String.format("%f", this.longitude));
    }

    public void generateCoordinate(View view) {
        latitude=33+rand.nextInt(4)+rand.nextDouble();
        longitude=127+rand.nextInt(5)+rand.nextDouble();

        final TextView latText = findViewById(R.id.latitude);
        final TextView lonText = findViewById(R.id.longitude);

        latText.setText(String.format("%f", this.latitude));
        lonText.setText(String.format("%f", this.longitude));

        Toast.makeText(this, "Randomize", (short)500).show();
    }

    public void generateInit(View view) {
        latitude=lat_init;
        longitude=long_init;

        final TextView latText = findViewById(R.id.latitude);
        final TextView lonText = findViewById(R.id.longitude);

        latText.setText(String.format("%f", this.latitude));
        lonText.setText(String.format("%f", this.longitude));

        Toast.makeText(this, "Initiallize", (short)500).show();
    }
}
