package spinner.thiyagu.com.projectspinner;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import android.widget.ArrayAdapter;

import fr.ganfra.materialspinner.MaterialSpinner;


public class MainActivity extends AppCompatActivity {


    private static final String[] ITEMS = {"Item 1", "Item 2", "Item 3", "Item 4", "Item 5", "Item 6"};

    private ArrayAdapter<String> adapter;

    MaterialSpinner spinner1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, ITEMS);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);


        initSpinnerHintAndFloatingLabel();


    }



    private void initSpinnerHintAndFloatingLabel() {
        spinner1 = findViewById(R.id.spinner1);
        spinner1.setAdapter(adapter);
        spinner1.setPaddingSafe(0, 0, 0, 0);
    }





}