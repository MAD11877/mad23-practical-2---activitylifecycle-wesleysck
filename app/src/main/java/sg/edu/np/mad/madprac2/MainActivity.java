package sg.edu.np.mad.madprac2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        User user = new User ("bruh", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua bfhewjdqwfbehqdwnkjbfehdwkdjbcqdwnjbfhewjdqwfbehqdwnkjbfehdwkdjbcqdwnjbfhewjdqwfbehqdwnkjbfehdwkdjbcqdwnjbfhewjdqwfbehqdwnkjbfehdwkdjbcqdwnjbfhewjdqwfbehqdwnkjbfehdwkdjbcqdwnjbfhewjdqwfbehqdwnkjbfehdwkdjbcqdwnj.", 1, true);

        TextView name = findViewById(R.id.textView2);
        name.setText(user.name);

        TextView desc = findViewById(R.id.textView);
        desc.setText((user.description));

        Button followBtn = findViewById(R.id.button);
        followBtn.setOnClickListener(v -> {
            user.followed = !user.followed;
            followBtn.setText(user.followed ? "UNFOLLOW" : "FOLLOW");
        });
    }
}