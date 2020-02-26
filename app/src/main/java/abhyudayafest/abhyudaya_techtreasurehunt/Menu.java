package abhyudayafest.abhyudaya_techtreasurehunt;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.support.annotation.DrawableRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Menu extends AppCompatActivity {


    public static int x=0;
    public static int check;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        SharedPreferences prefs = this.getSharedPreferences("myPrefsKey", Context.MODE_PRIVATE);
        check=prefs.getInt("key", 1);
        switch(check)
        {
            case 1: findViewById(R.id.b2).setEnabled(false);
                change(R.id.b2);
            case 2: findViewById(R.id.b3).setEnabled(false);
                change(R.id.b3);
            case 3: findViewById(R.id.b4).setEnabled(false);
                change(R.id.b4);
            case 4: findViewById(R.id.b5).setEnabled(false);
                change(R.id.b5);
            case 5: findViewById(R.id.b6).setEnabled(false);
                change(R.id.b6);
            case 6: findViewById(R.id.b7).setEnabled(false);
                change(R.id.b7);
            case 7: findViewById(R.id.b8).setEnabled(false);
                change(R.id.b8);
            case 8: findViewById(R.id.b9).setEnabled(false);
                change(R.id.b9);
            case 9: findViewById(R.id.b10).setEnabled(false);
                change(R.id.b10);
            case 10: findViewById(R.id.b11).setEnabled(false);
                change(R.id.b11);
            case 11: findViewById(R.id.b12).setEnabled(false);
                change(R.id.b12);
            default:
        }
    }
    void change(int i)
    {
        findViewById(i).setBackgroundResource(R.drawable.mybutton1);
        TextView textView1 = (TextView) findViewById(i);
        textView1.setTextColor(Color.parseColor("#ffcb00"));
    }
    @Override
    public void onBackPressed()
    {
        Intent intent = new Intent(this, Start.class);
        startActivity(intent);
    }
    public void choice1(View view){
        view.performHapticFeedback(1);
        Intent intent1 = new Intent(this, Scan.class);
        x=1;
        startActivity(intent1);
    }
    public void choice2(View view){
        view.performHapticFeedback(1);
        Intent intent1 = new Intent(this, Scan.class);
        x=2;

        startActivity(intent1);
    }
    public void choice3(View view){
        view.performHapticFeedback(1);
        Intent intent1 = new Intent(this, Scan.class);
        x=3;

        startActivity(intent1);
    }
    public void choice4(View view){
        view.performHapticFeedback(1);
        Intent intent1 = new Intent(this, Scan.class);
        x=4;

        startActivity(intent1);
    }
    public void choice5(View view){
        view.performHapticFeedback(1);
        Intent intent1 = new Intent(this, Scan.class);
        x=5;

        startActivity(intent1);
    }
    public void choice6(View view){
        view.performHapticFeedback(1);
        Intent intent1 = new Intent(this, Scan.class);
        x=6;

        startActivity(intent1);
    }
    public void choice7(View view){
        view.performHapticFeedback(1);
        Intent intent1 = new Intent(this, Scan.class);
        x=7;

        startActivity(intent1);
    }
    public void choice8(View view){
        view.performHapticFeedback(1);
        Intent intent1 = new Intent(this, Scan.class);
        x=8;

        startActivity(intent1);
    }
    public void choice9(View view){
        view.performHapticFeedback(1);
        Intent intent1 = new Intent(this,   Scan.class);
        x=9;

        startActivity(intent1);
    }
    public void choice10(View view){
        view.performHapticFeedback(1);
        Intent intent1 = new Intent(this,   Scan.class);
        x=10;

        startActivity(intent1);
    }
    public void choice11(View view){
        view.performHapticFeedback(1);
        Intent intent1 = new Intent(this,   Scan.class);
        x=11;

        startActivity(intent1);
    }
    public void choice12(View view){
        view.performHapticFeedback(1);
        Intent intent1 = new Intent(this,   Scan.class);
        x=12;

        startActivity(intent1);
    }
}
