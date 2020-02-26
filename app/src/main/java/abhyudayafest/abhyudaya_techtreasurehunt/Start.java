package abhyudayafest.abhyudaya_techtreasurehunt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Start extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
    }
    @Override
    public void onBackPressed()
    {
        finishAffinity();
    }
    public void play(View view) {
        view.performHapticFeedback(1);
        Intent intent = new Intent(this, Menu.class);
        startActivity(intent);
    }
}
