package com.example.xsizero;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class PlayerSetup extends AppCompatActivity {

    private EditText player1;
    private EditText player2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.player_setup);
        
        player1 = findViewById(R.id.player1Edit);
        player2 = findViewById(R.id.player2Edit);
    }

    public void submitButtonClick (View view){
        String player1Edit = player1.getText().toString();
        String player2Edit = player2.getText().toString();

        Intent intent = new Intent(this, GameDisplay.class);
        intent.putExtra("PLAYER_NAMES", new String[] {player1Edit, player2Edit});
        startActivity(intent);
    }
}