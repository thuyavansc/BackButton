package au.com.softclient.backbutton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import au.com.softclient.backbutton.views.FirstFragment;
import au.com.softclient.backbutton.views.SecondFragment;

public class SecondActivity extends AppCompatActivity {

    Button btnN1;
    Button btnB1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        btnN1 =(Button)findViewById(R.id.NextA2F1);
        btnB1 = (Button)findViewById(R.id.BackA2);

        //NextButton -> FirstFragment
        btnN1.setOnClickListener(v-> {
            openFirstFragment();
            hideButton();
        });

        //Back Button in SecondActivity
        btnB1.setOnClickListener(v->{
            openMainActivity();
            hideButton();
        });




        /*
        btnN1.setOnClickListener((v)->{
            btnN1.setVisibility(View.GONE);
            btnB1.setVisibility(View.GONE);
            Fragment fragment1 = new FirstFragment();
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.SecondActivity,fragment1).commit();
        });
        */
    }

    public void openFirstFragment(){
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.SecondActivity,new FirstFragment())
                .addToBackStack(null)
                .commit();
    }

    public void openMainActivity(){
        startActivity(new Intent(this, MainActivity.class));
        finish(); // this for close the current activity
    }

    // Define a method to open the SecondFragment
    public void openSecondFragment() {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.Activity2Frag, new SecondFragment())
                .addToBackStack(null)
                .commit();
    }
    public void hideButton(){
        //btnN1.setVisibility(View.GONE);
        //btnB1.setVisibility(View.GONE);
    }
}