package cs301.birthdaycake;
import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.SeekBar;

public class CakeController implements View.OnClickListener, CompoundButton.OnCheckedChangeListener, SeekBar.OnSeekBarChangeListener {
    private CakeView cakeView;
    private CakeModel cakeModel1;

    public CakeController(CakeView cakeView1) {
        cakeView = cakeView1;
        cakeModel1 = cakeView.getCakeModel();
    }

    @Override
    public void onClick(View v) {
        Log.d("click1","click");
        cakeModel1.candleIsLit = false;
        cakeView.invalidate();
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        Log.d("check1","check");
        cakeModel1.hasCandles = !cakeModel1.hasCandles;
        cakeView.invalidate();
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        Log.d("change1","change");
        cakeModel1.candleNum = progress;
        cakeView.invalidate();
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}