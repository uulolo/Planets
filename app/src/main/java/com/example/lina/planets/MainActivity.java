package com.example.lina.planets;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //final EditText setAge = (EditText)findViewById(R.id.setAge);

    }

    public void calculate(View view) {
         EditText setAge = (EditText)findViewById(R.id.setAge);

      /* AgeFragment ageFragment = new AgeFragment();
        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.fragmentAge,ageFragment);
        ft.commit();*/

        AgeFragment ageFragment = new AgeFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("Age", Integer.parseInt(Integer.valueOf(String.valueOf(setAge)).toString()));
        ageFragment.setArguments(bundle);
        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.fragmentAge, ageFragment);//هاد ال فراجمنت الموجود في الواجهه الأساسيه  R.id.fragment/*الداله ft.replace علشان يعملي تبديل*/
        ft.commit();

       // android:name="com.example.lina.planets.AgeFragment"





    }
}
