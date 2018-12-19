package com.example.weronika.wskazniekppm;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }




    public void mClick(View view) {
        TextView wynik = (TextView) findViewById(R.id.Wynik);

        Spinner spinner_wzrost = (Spinner) findViewById(R.id.opcjaWzrostu);
        String jednostkaWzrostu = String.valueOf(spinner_wzrost.getSelectedItem());

        Spinner spinner_plec = findViewById(R.id.plec_opcja);
        String plec = String.valueOf(spinner_plec.getSelectedItem());

        Spinner spinner_sposob = findViewById(R.id.sposób_opcje);
        String sposobPPM = String.valueOf(spinner_sposob.getSelectedItem());

        EditText txtwzrost = (EditText) findViewById(R.id.wzrost);
        EditText txtmasa = (EditText) findViewById(R.id.masa);
        EditText txtwiek = findViewById(R.id.wiek);

        double wzrost = 0;
        double masa = 0;
        int wiek = 0;

        try {
            wzrost = Double.valueOf(txtwzrost.getText().toString());
            masa = Double.valueOf(txtmasa.getText().toString());
            wiek = Integer.valueOf(txtwiek.getText().toString());
        } catch (NumberFormatException e) {
            wynik.setText("Invalid arguments");
        }

        if(jednostkaWzrostu=="m"){
            wzrost=wzrost*100;
        }

        double PPMwynik = 0;

        PPM ppm = new PPM(wzrost, wiek, masa, plec);

        if (sposobPPM.equals("Sposob Benedicta-Harrisa"))
            PPMwynik = ppm.Benedicta_Harrisa();
        else
            PPMwynik = ppm.Mufflin();

        wynik.setText(String.valueOf(PPMwynik));

    }



}
