package cs301.birthdaycake;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);
        CakeView cakeV = findViewById(R.id.cakeview);
        CakeController cakeC = new CakeController(cakeV);
        Button blowO = findViewById(R.id.blowout);
        blowO.setOnClickListener(cakeC);
        Switch candle = findViewById(R.id.candles);
        candle.setOnCheckedChangeListener(cakeC);
        SeekBar seek = findViewById(R.id.candleSeek);
        seek.setOnSeekBarChangeListener(cakeC);
    }

    public void goodbye(View button) {
        Log.i("button","Goodbye!");
    }
}
