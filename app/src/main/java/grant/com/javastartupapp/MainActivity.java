package grant.com.javastartupapp;

import androidx.annotation.ContentView;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;

public class MainActivity extends AppCompatActivity {

    private int ourAddingNumber = 1;

    public int addOurNumber(int ourAddingNumber) {
        return ourAddingNumber+=1;
    }

    public int add(int num1, int num2){
        return num1+num2;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MaterialButton button = findViewById(R.id.button);
        MaterialTextView textView = findViewById(R.id.text_view);

        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                ourAddingNumber = addOurNumber(ourAddingNumber);
                textView.setText("Yo"+ourAddingNumber);
            }
        });

    }
}