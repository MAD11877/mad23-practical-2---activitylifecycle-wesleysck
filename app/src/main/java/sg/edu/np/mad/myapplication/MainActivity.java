package sg.edu.np.mad.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    boolean hasFollowed = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String randomint = getIntent().getStringExtra("randomint");
       // Toast.makeText(getApplicationContext(), randomint, Toast.LENGTH_LONG).show();

        TextView maintext = (TextView) findViewById(R.id.textView2);

        maintext.setText("MAD " + randomint);


        Button aButton = findViewById(R.id.button);

        aButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                hasFollowed = !hasFollowed;

                //Log.v(TITLE, String.valueOf(hasFollowed));
                if (!hasFollowed) {
                    aButton.setText("Unfollow");}
                else { aButton.setText("Follow"); }
            }
        });


    }
}