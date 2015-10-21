package com.gelitenight.waveview.sample;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RadioGroup;
import android.widget.SeekBar;

import com.gelitenight.waveview.library.WaveView;

public class MainActivity extends AppCompatActivity {

    private WaveHelper mWaveHelper;

    private int mBorderColor = Color.parseColor("#44FFFFFF");
    private int mBorderWidth = 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final WaveView waveView = (WaveView) findViewById(R.id.wave);
        waveView.setBorder(mBorderWidth, mBorderColor);

        mWaveHelper = new WaveHelper(waveView);

        ((RadioGroup) findViewById(R.id.shapeChoice))
        .setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i) {
                    case R.id.shapeCircle:
                        waveView.setShapeType(WaveView.ShapeType.CIRCLE);
                        break;
                    case R.id.shapeSquare:
                        waveView.setShapeType(WaveView.ShapeType.SQUARE);
                        break;
                    default:
                        break;
                }
            }
        });

        ((SeekBar) findViewById(R.id.seekBar))
        .setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                mBorderWidth = i;
                waveView.setBorder(mBorderWidth, mBorderColor);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        ((RadioGroup) findViewById(R.id.colorChoice))
            .setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int i) {
                    switch (i) {
                        case R.id.colorRed:
                            waveView.setWaveColor(Color.parseColor("#f16d7a"));
                            mBorderColor = Color.parseColor("#f16d7a");
                            waveView.setBorder(mBorderWidth, mBorderColor);
                            break;
                        case R.id.colorGreen:
                            waveView.setWaveColor(Color.parseColor("#b7d28d"));
                            mBorderColor = Color.parseColor("#b7d28d");
                            waveView.setBorder(mBorderWidth, mBorderColor);
                            break;
                        case R.id.colorBlue:
                            waveView.setWaveColor(Color.parseColor("#b8f1ed"));
                            mBorderColor = Color.parseColor("#b8f1ed");
                            waveView.setBorder(mBorderWidth, mBorderColor);
                            break;
                        default:
                            waveView.setWaveColor(WaveView.DEFAULT_WAVE_COLOR);
                            mBorderColor = Color.parseColor("#44FFFFFF");
                            waveView.setBorder(mBorderWidth, mBorderColor);
                            break;
                    }
                }
            });
    }

    @Override
    protected void onPause() {
        super.onPause();
        mWaveHelper.cancel();
    }

    @Override
    protected void onResume() {
        super.onResume();
        mWaveHelper.start();
    }
}
