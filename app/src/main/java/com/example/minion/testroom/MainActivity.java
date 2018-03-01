package com.example.minion.testroom;

import android.arch.persistence.room.Room;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {
private EditText uid,pass;
private Button b1,b2,b3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        uid=findViewById(R.id.uid);
        pass=findViewById(R.id.pass);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
         final AppDatabase db= Room.databaseBuilder(getApplicationContext(),AppDatabase.class,"production")
                .allowMainThreadQueries()
                .build();
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                User user = new User(uid.getText().toString(),pass.getText().toString());
                db.getUserDao().insert(user);
                Toast.makeText(MainActivity.this, "user details inserted", Toast.LENGTH_SHORT).show();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             User u= db.getUserDao().getPass(uid.getText().toString());
                Toast.makeText(MainActivity.this, "pass is :"+u.getPass(), Toast.LENGTH_SHORT).show();
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                User user =new User(uid.getText().toString(),pass.getText().toString());
                db.getUserDao().update(user);
            }
        });

    }
}
