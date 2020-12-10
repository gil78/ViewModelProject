package pt.atp.viewmodelproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    MainActivityViewModel vModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vModel = new ViewModelProvider(this).get(MainActivityViewModel.class);
        ((TextView)findViewById(R.id.txtScore)).setText(String.valueOf(vModel.getScore()));

        ((Button)findViewById(R.id.btnScore)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //txtContar.setText(String.valueOf(Integer.valueOf(txtContar.getText().toString()).intValue() + 1));
                vModel.setScore(1);
                ((TextView)findViewById(R.id.txtScore)).setText(String.valueOf(vModel.getScore()));
            }
        });

    }


}