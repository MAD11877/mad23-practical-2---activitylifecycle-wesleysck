package sg.edu.np.mad.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ImageView img = (ImageView) findViewById(R.id.imageView);

       img.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(ListActivity.this);
                builder.setTitle("Profile");
                builder.setMessage("MADness");
                builder.setCancelable(true);
                builder.setPositiveButton("VIEW", new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int id){
                        Random random = new Random();

                        int i = random.nextInt();
                        if (i < 0) {
                            i = -i;
                        }

                        Intent intent = new Intent(v.getContext(), MainActivity.class);
                        intent.putExtra("randomint", Integer.toString(i));
                        v.getContext().startActivity(intent);

                    }
                });
                builder.setNegativeButton("CLOSE", new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int id){

                    }
                });

                AlertDialog alert = builder.create();
                alert.show();


            }
        });
    }
}