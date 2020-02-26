package abhyudayafest.abhyudaya_techtreasurehunt;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

import org.json.JSONException;
import org.json.JSONObject;

public class Scan extends AppCompatActivity {

    private IntentIntegrator qrScan;
    private TextView textViewName;
    int x=Menu.x;
    String ans[]={"17478d326908dc37e36c8f868a8fcc78","59fb1d4e8402f450c2f5493054aab806",
                  "5b48b837c7fb4ed7eb98d8c3464987ed","fb51ae66df3b728966430fb5ca35989d",
                  "bc9bf7bb6c4ab8d0daf374963110f4a7","5d293e751543eb0cc7c6339d0062f023",
                  "70d0ec259b1568c7bcb0763a70a8e4dc","b85cae11da792b6dc0d8be65821081c5",
                  "02b562fd8c1adc4fe44a307b19a7469c","25ec3828bed0c81fbde5970467041770",
                  "fdd8404c01233fc738ed7ae1704f6e57","39d7a84c9df6b1d6d24935957bef9af1"};
    String ques[]={"question 1","question 2","question 3","question 4","question 5","question 6","question 7","question 8","question 9","question 10","question 11","question 12",};
    String scan="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scan);
        qrScan = new IntentIntegrator(this);
        textViewName = (TextView) findViewById(R.id.textView);
        textViewName.setText(ques[x-1]);
        ImageView iv=(ImageView) findViewById(R.id.imageView2);
        iv.setVisibility(View.INVISIBLE);
    }
    @Override
    public void onBackPressed()
    {
        Intent intent = new Intent(this, Menu.class);
        startActivity(intent);
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        IntentResult result = IntentIntegrator.parseActivityResult(requestCode, resultCode, data);
        if (result != null) {
            //if qrcode has nothing in it
            if (result.getContents() == null) {
                Toast.makeText(this, "Result Not Found", Toast.LENGTH_LONG).show();
            } else {
                try {
                    JSONObject obj = new JSONObject(result.getContents());
                    scan=result.getContents();
                } catch (JSONException e) {
                    scan=result.getContents();
                }
            }
        } else {
            super.onActivityResult(requestCode, resultCode, data);
        }
        SharedPreferences prefs = this.getSharedPreferences("myPrefsKey", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        if (scan.compareTo(ans[x-1])==0)
        {
            editor.putInt("key", (x+1));
            editor.commit();
            Intent intent1 = new Intent(this, Clue.class);
            startActivity(intent1);
        }
        else
        {
            textViewName.setText("Wrong QR Code, Try Again");
        }
    }
    public void sc(View view)
    {
        view.performHapticFeedback(1);
        if(x<Menu.check)
        {
        Intent intent1 = new Intent(this, Clue.class);
        startActivity(intent1);
        }
        else
        {
            qrScan.initiateScan();
        }

    }
}
