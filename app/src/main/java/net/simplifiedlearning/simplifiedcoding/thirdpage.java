package net.simplifiedlearning.simplifiedcoding;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class thirdpage extends AppCompatActivity {

     Button  b;
    EditText editText2, editText4;
    Spinner spinner, s1, s2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.thirdpage);

        spinner = (Spinner) findViewById(R.id.planets_spinner);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.planets_array, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        editText2 = (EditText) findViewById(R.id.editText2);//address first line
        editText4 = (EditText) findViewById(R.id.editText4);//address second line
        b         = (Button) findViewById(R.id.button);

        s1 = (Spinner) findViewById(R.id.planets_spinner2);
        s2 = (Spinner) findViewById(R.id.planets_spinner3);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intObj = new Intent(thirdpage.this,fourthpage.class);
                startActivity(intObj);
            }
        });
        s1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,
                                       long arg3) {
                // TODO Auto-generated method stub
                String sp1 = String.valueOf(s1.getSelectedItem());
                //Toast.makeText(getBaseContext(), sp1, Toast.LENGTH_SHORT).show();


                if (sp1.contentEquals("Brazil")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Rio de Janeiro");
                    list.add("Ceara");
                    list.add("Santa Catarina");
                    list.add("Espirito Santo");
                    list.add("Bahia");
                    list.add("Sao Paulo");
                    list.add("Rio Grande do Sul");
                    list.add("Minas Gerais");
                    list.add("Para");
                    list.add("Parana");
                    list.add("Pernambuco");
                    list.add("Amazonas");
                    list.add("Distrito Federal");
                    list.add("Goias");
                    list.add("Sergipe");
                    list.add("Mato Grosso do Sul");
                    list.add("Rio Grande do Norte");
                    list.add("Paraiba");
                    list.add("Piaui");
                    list.add("Maranhao");
                    list.add("Mato Grosso");
                    list.add("Alagoas");
                    list.add("Tocantins");
                    list.add("Roraima");
                    list.add("Rondonia");
                    list.add("Amapa");
                    list.add("Acre");
                    ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(getBaseContext(),
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter.notifyDataSetChanged();
                    s2.setAdapter(dataAdapter);
                }
                if (sp1.contentEquals("China")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Beijing");
                    list.add("Hebei");
                    list.add("Jiangsu");
                    list.add("Guangdong");
                    list.add("Zhejiang");
                    list.add("Liaoning");
                    list.add("Shanghai");
                    list.add("Tianjin");
                    list.add("Fujian");
                    list.add("Guangxi");
                    list.add("Yunnan");
                    list.add("Shandong");
                    list.add("Hubei");
                    list.add("Heilongjiang");
                    list.add("Shanxi");
                    list.add("Hunan");
                    list.add("Hainan");
                    list.add("Sichuan");
                    list.add("Henan");
                    list.add("Anhui");
                    list.add("Shaanxi");
                    list.add("Nei Mongol");
                    list.add("Jilin");
                    list.add("Guizhou");
                    list.add("Jiangxi");
                    list.add("Gansu");
                    list.add("Xizang");
                    list.add("Ningxia");
                    list.add("Xinjiang");
                    list.add("Qinghai");
                    ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(getBaseContext(),
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter2.notifyDataSetChanged();
                    s2.setAdapter(dataAdapter2);
                }

                if (sp1.contentEquals("France")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Ile-de-France");
                    list.add("");
                    list.add("Purchase");
                    list.add("Midi-Pyrenees");
                    list.add("Picardie");
                    list.add("Franche-Comte");
                    list.add("Alsace");
                    list.add("Languedoc-Roussillon");
                    list.add("Centre");
                    list.add("Champagne-Ardenne");
                    list.add("Bretagne");
                    list.add("Rhone-Alpes");
                    list.add("Nord-Pas-de-Calais");
                    list.add("Lorraine");
                    list.add("Provence-Alpes-Cote d'Azur");
                    list.add("Limousin");
                    list.add("Haute-Normandie");
                    list.add("Poitou-Charentes");
                    list.add("Basse-Normandie");
                    list.add("Aquitaine");
                    list.add("Auvergne");
                    list.add("Pays de la Loire");
                    list.add("Bourgogne");
                    list.add("Corse");
                    ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(getBaseContext(),
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter2.notifyDataSetChanged();
                    s2.setAdapter(dataAdapter2);

                }


                if (sp1.contentEquals("India")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Haryana");
                    list.add("Andhra Pradesh");
                    list.add("Nagaland");
                    list.add("Sikkim");
                    list.add("Tripura");
                    list.add("Arunachal Pradesh");
                    list.add("Dadra and Nagar Haveli");
                    list.add("Mizoram");
                    list.add("Manipur");
                    list.add("Goa");
                    list.add("Puducherry");
                    list.add("Jammu and Kashmir");
                    list.add("Meghalaya");
                    list.add("Uttarakhand");
                    list.add("Himachal Pradesh");
                    list.add("Bihar");
                    list.add("Daman and Diu");
                    list.add("Assam");
                    list.add("Punjab");
                    list.add("Chandigarh");
                    list.add("Jharkhand");
                    list.add("Orissa");
                    list.add("Rajasthan");
                    list.add("Gujarat");
                    list.add("Madhya Pradesh");
                    list.add("West Bengal");
                    list.add("Chhattisgarh");
                    list.add("Kerala");
                    list.add("Maharashtra");
                    list.add("Karnataka");
                    list.add("Uttar Pradesh");
                    list.add("Delhi");
                    list.add("Tamil Nadu");
                    ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(getBaseContext(),
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter2.notifyDataSetChanged();
                    s2.setAdapter(dataAdapter2);

                }


                if (sp1.contentEquals("USA")) {
                    List<String> list = new ArrayList<String>();
                    list.add("California");
                    list.add("New York");
                    list.add("Iowa");
                    list.add("New Jersey");
                    list.add("Connecticut");   //
                    list.add("Massachusetts");
                    list.add("Florida");
                    list.add("Texas");
                    list.add("Armed Forces US");
                    list.add("Tennessee");
                    list.add("Kentucky");
                    list.add("Georgia");
                    list.add("Illinois");
                    list.add("Colorado");
                    list.add("Utah");
                    list.add("Maryland");
                    list.add("South Carolina");
                    list.add("Montana");
                    list.add("Louisiana");
                    list.add("Washington");
                    list.add("Pennsylvania");
                    list.add("North Carolina");
                    list.add("Michigan");
                    list.add("Arkansas");
                    list.add("Wisconsin");
                    list.add("Ohio");
                    list.add("New Mexico");
                    list.add("Kansas");
                    list.add("Oregon");
                    list.add("Nebraska");
                    list.add("Ohio");
                    list.add("New Mexico");
                    list.add("Kansas");
                    list.add("Oregon");
                    list.add("Nebraska");
                    list.add("West Virginia");
                    list.add("Virginia");
                    list.add("Missouri");
                    list.add("Mississippi");
                    list.add("Rhode Island");
                    list.add("Indiana");
                    list.add("Oklahoma");
                    list.add("Minnesota");
                    list.add("Alabama");
                    list.add("Arizona");
                    list.add("South Dakota");
                    list.add("Nevada");
                    list.add("New Hampshire");
                    list.add("Maine");
                    list.add("Hawaii");
                    list.add("District of Columbia");
                    list.add("Delaware");
                    list.add("daho");
                    list.add("Wyoming");
                    list.add("North Dakota");


                    ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(getBaseContext(),
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter2.notifyDataSetChanged();
                    s2.setAdapter(dataAdapter2);


                }


            }

            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub

            }





        });


    }

}