package in.blogspot.tecnopandit.intentsandactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void nextact(View v) {
        Intent i1=new Intent(this,Main2Activity.class);
        startActivity(i1);
    }
}
