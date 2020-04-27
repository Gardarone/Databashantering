package com.example.databashantering;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class NewItem extends AppCompatActivity {

        public static final String EXTRA_REPLY = "com.example.android.wordlistsql.REPLY";

        private  EditText mEditWordView;

        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_new_item);
            mEditWordView = findViewById(R.id.edit_word);

            final Button button = findViewById(R.id.button_save);
            button.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent replyIntent = new Intent();
                    if (TextUtils.isEmpty(mEditWordView.getText())) {
                        setResult(RESULT_CANCELED, replyIntent);
                    } else {
                        String word = mEditWordView.getText().toString();
                        replyIntent.putExtra(EXTRA_REPLY, word);
                        setResult(RESULT_OK, replyIntent);
                    }
                    finish();
                }
            });
        }
    }


