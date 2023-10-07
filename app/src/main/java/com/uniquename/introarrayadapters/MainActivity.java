package com.uniquename.introarrayadapters;

import androidx.appcompat.app.AppCompatActivity;

import android.app.LauncherActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView mListItems;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buildArrayAdapter();
    }

    public void buildArrayAdapter(){
        mListItems=findViewById(R.id.list_items);
        // ici je declare un simple tableau de noms;
        String[] names={"Travis","Eli","Jeremy","Johnny","Plaxico","Tom"};
        /*
            Que se passe t'il si je veux afficher ce tableau de maniere dynamique. Nous avons une classe trés pratique pour pouvoir afficher les contenus d'un tableau simple sans devoir boucler directement, nous pouvons utiliser la classe ArrayAdapter!
            ArrayAdapter prends trois arguments:
            1) Le contexte dans lequelle il sera crée (en l'occurence, il sera crée en MainActivity
            2) Le type de View que il va utiliser. Dans ce cas, il va traiter la donnée simple_list_item_1 qui est un type de TextView nattif dans android
            3) Les données que il va vouloir afficher. Dans ce cas la, il va vouloir afficher notre tableau names
         */
        ArrayAdapter newArrayAdapter=new ArrayAdapter(MainActivity.this,android.R.layout.simple_list_item_1,names);
        // Maintenant je vais dire a ma ListView de prendre l'adapteur ArrayAdapter et ainsi ma ListView va afficher dynamiquement tous mes names qui seront stocké dans la TextView simple_list_item_1 natif a android

        mListItems.setAdapter(newArrayAdapter);
    }


}