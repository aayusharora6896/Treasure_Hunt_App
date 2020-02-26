package abhyudayafest.abhyudaya_techtreasurehunt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Clue extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clue);
    }
    @Override
    public void onBackPressed()
    {
        Intent intent = new Intent(this, Menu.class);
        startActivity(intent);
    }
    public void choice(View view){
        view.performHapticFeedback(1);
        Intent intent1 = new Intent(this, Menu.class);
        startActivity(intent1);
    }
}
