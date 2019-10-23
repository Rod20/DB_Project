package com.donbosco.db_project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editTextToTranslate;
    Button buttonTranslate;
    TextView textViewTranslation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _initScreen();
    }

    String[] castellano = new String[]{"Abuelo","Viejito","Abuela","Viejita","Papá","Mamá","Hermano",
            "Hermana","Hombre","Mujer","Hijo","Hija","Muchacho","Muchacha","Suegro",
            "Suegra","Yerno","Nuera","Niño","Niña","Nieto","Nieta","Padrino","Madrina","Compadre",
            "Comadre","Ahijado","Ahijada","Tío","Tía","Concuñado","Concuñada","Novio","Novia",
            "Tía","Enamorado","Enamorada","Bebé","Amigo","Amiga","Huerfano","Huerfana","Viudo","Viuda",
            "Paisano","Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre",
            "Octubre","Noviembre","Diciembre","Otoño","Invierno","Primavera","Verano","Abeja",
            "Águila","Alpaca","Araña","Armadillo","Asno","Ave","Burro","Búho","Caballo","Caracol",
            "Cerdo","Ciervo","Codorniz","Colibrí","Cóndor","Conejo","Flamenco","Gallina","Gallinazo","Gallo",
            "Gato","Golondrina","Guanaco","Gusano","Hormiga","Jabalí","Jaguar","Lagartija","Lagarto",
            "Lechuza","Libélula","Liebre","Llama","Lombriz","Mariposa","Mariposa nocturna","Mono","Mosca",
            "Murciélago","Oveja","Oso","Pájaro","Paloma","Pato","Perro","Pez","Piojo",
            "Polilla","Pollo","Pulga","Ratón","Rana","Sapo","Serpiente","Tarántula","Topo","Toro",
            "Vaca","Vizcacha","Vicuña","Zorrillo","Zorro"};

    String[] aymara = new String[]{"Achachila","Awkili","Awicha","Taykali","Tata","Mama","Jilata",
            "Kullaka","Chacha","Warmi","Yuqa","Phuchha","Yuqalla","Imilla","Awkch'i",
            "Taykch'i","Tullqa","Yuxch'a","Jisk'a","Lulu","Allchhi","Allchhi","ichutata","ichumama","kumpari",
            "Kumasi","Ayjaru","Ayjara","Tiyu","Laqusita","Tullqa masi","Yuxch'a masi","Parlata","Parlata",
            "Ipala","Munata","Munata","Wawa","Masi","Masi","Wajcha","Wajcha","Ijma","Ijma",
            "Marka masi","Chinuqa","Anata","Achuqa","Qasiwi","Llamayu","Marat'aqa","Willkakuti","Llumpaqa","Sata",
            "Taypisata","Lapaqa","Jalluqallta","Awtipacha","Thayapacha","Lakakpacha","Jallupacha","Mamuraya",
            "Paka","Allpachu","Kusi kusi","Khirkhinchu","Asnu","Jamach'i","Qalakayu","Juku","Qaqilu","Ch'uru",
            "Khuchhi","Taruja","Khullu","Luli","Mallku","Wank'u","Pariwana","Wallpa","Siwiq'ara","K'ank'a",
            "Phisi","Q'illunchu","Wanaku","Laq'u","K'isimira","Ch'umi khuchhi","Uturunku","Sut'uwalla","Jararankhu",
            "Ch'usiqa","Chhixwiriri","Pampa wank'u","Qarwa","Sillq'u","Pilpintu","Taparaku","K'usillu","Chhichhillankha",
            "Chiñi","Iwija, Pachita","Jukumari","Jamach'i","Urphila","Unkalla","Anu","Challwa","Lap'a",
            "Khalla, Thuta","Chhilwi","K'uti","Achaku","K'ayra","Jamp'atu","Sikuri","Qampu","Tuju","Turu",
            "Waka","Wisk'acha","Wik'uña","Añuthaya","Pampa anu"};

    private void _initScreen() {
        Toolbar toolbar = findViewById(R.id.toolbar);

        toolbar.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
        toolbar.setTitleTextColor(getResources().getColor(R.color.coloWhite));

        editTextToTranslate = findViewById(R.id.word_to_translate);
        buttonTranslate = findViewById(R.id.btn_translate);
        textViewTranslation = findViewById(R.id.translation);

        buttonTranslate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("-----> La Traducción funciona <------");
                for (int i=0; i<castellano.length; i++){
                    System.out.println("-----> Cas: "+ castellano.length +" <------");
                    System.out.println("-----> Aym: "+ aymara.length +" <------");

                    String trans = String.valueOf(editTextToTranslate.getText());

                    System.out.println("-----> get "+ trans +" <------");

                    if (trans.equals(castellano[i])) {
                        textViewTranslation.setText(aymara[i]);
                    }
                }
            }
        });
    }
}
