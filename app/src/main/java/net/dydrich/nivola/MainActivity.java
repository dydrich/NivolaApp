package net.dydrich.nivola;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnHome;
    Button btnContacts;
    Button btnAboutUs;
    Button btnHead;
    Button btnSecretary;
    Button btnKindergarden;
    Button btnPrimary;
    Button btnSecondary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnHome = (Button) findViewById(R.id.button);
        btnContacts = (Button) findViewById(R.id.button2);
        btnAboutUs = (Button) findViewById(R.id.button3);
        btnHead = (Button) findViewById(R.id.button4);
        btnSecretary = (Button) findViewById(R.id.button5);
        btnKindergarden = (Button) findViewById(R.id.button6);
        btnPrimary = (Button) findViewById(R.id.button7);
        btnSecondary = (Button) findViewById(R.id.button8);

        btnHome.setOnClickListener(this);
        btnContacts.setOnClickListener(this);
        btnAboutUs.setOnClickListener(this);
        btnHead.setOnClickListener(this);
        btnSecretary.setOnClickListener(this);
        btnKindergarden.setOnClickListener(this);
        btnPrimary.setOnClickListener(this);
        btnSecondary.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(this, PageActivity.class);
        if(view.getId() == R.id.button) {
            intent.putExtra("url", "http://www.istitutoiglesiasserraperdosa.gov.it/");
            intent.putExtra("label", "Home Page");
        }
        if(view.getId() == R.id.button2) {
            intent.putExtra("url", "http://www.istitutoiglesiasserraperdosa.gov.it/chi-siamo/");
            intent.putExtra("label", "Chi siamo");
        }
        if(view.getId() == R.id.button3) {
            intent.putExtra("url", "http://www.istitutoiglesiasserraperdosa.gov.it/contatti/");
            intent.putExtra("label", "Contatti");
        }
        if(view.getId() == R.id.button4) {
            intent.putExtra("url", "http://www.istitutoiglesiasserraperdosa.gov.it/dirigenza/");
            intent.putExtra("label", "Dirigenza");
        }
        if(view.getId() == R.id.button5) {
            intent.putExtra("url", "http://www.istitutoiglesiasserraperdosa.gov.it/segreteria/");
            intent.putExtra("label", "Segreteria");
        }
        if(view.getId() == R.id.button6) {
            intent.putExtra("url", "http://www.istitutoiglesiasserraperdosa.gov.it/scuole/scuola-dellinfanzia/");
            intent.putExtra("label", "Scuola dell'infanzia");
        }
        if(view.getId() == R.id.button7) {
            intent.putExtra("url", "http://www.istitutoiglesiasserraperdosa.gov.it/scuole/scuola-primaria/");
            intent.putExtra("label", "Scuola primaria");
        }
        if(view.getId() == R.id.button8) {
            intent.putExtra("url", "http://www.istitutoiglesiasserraperdosa.gov.it/scuole/scuola-secondaria/");
            intent.putExtra("label", "Scuola secondaria");
        }
        startActivity(intent);

    }
}
