/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {
   View numbersView;
   View familyView;
   View colorView;
   View phrasesView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);
        numbersView=findViewById(R.id.numbers);
        numbersView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNumbers();
            }
        });

        familyView=findViewById(R.id.family);
        familyView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFamily();
            }
        });
        phrasesView=findViewById(R.id.phrases);
        phrasesView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPhrases();
            }
        });
        colorView=findViewById(R.id.colors);
        colorView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openColors();
            }
        });




    };

    public void openNumbers(){
        Intent n=new Intent(this,activity_number.class);
        startActivity(n);

    }
    public void openPhrases(){
        Intent n=new Intent(this,activity_phrases.class);
        startActivity(n);

    }
    public void openFamily(){
        Intent n=new Intent(this,activity_family.class);
        startActivity(n);

    }
    public void openColors(){
        Intent n=new Intent(this,activity_colors.class);
        startActivity(n);

    }
}
