package acanfora.sidebar.chat.controller.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import acanfora.sidebar.chat.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent toMainChatActivity = new Intent(this, MainChatActivity.class);
        startActivity(toMainChatActivity);
    }
}
