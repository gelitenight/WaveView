# WaveView
A view to display wave effect.

## Screenshot
![Screenshot](screenshot.gif)

## Integration
```
compile 'com.gelitenight.waveview:waveview:1.0.0'
```

Setter methods:
 * `setWaveShiftRatio` - Shift the wave horizontally.
 * `setWaterLevelRatio` - Set water level.
 * `setAmplitudeRatio`  - Set vertical size of wave.
 * `setWaveLengthRatio` - Set horizontal size of wave.

You can use [Property Animation](https://developer.android.com/guide/topics/graphics/prop-animation.html) to animate WaveView.
```
// horizontal animation.
// wave waves infinitely.
ObjectAnimator waveShiftAnim = ObjectAnimator.ofFloat(
        mWaveView, "waveShiftRatio", 0f, 1f);
waveShiftAnim.setRepeatCount(ValueAnimator.INFINITE);
waveShiftAnim.setDuration(1000);
waveShiftAnim.setInterpolator(new LinearInterpolator());

// vertical animation.
// water level increases from 0 to center of WaveView
ObjectAnimator waterLevelAnim = ObjectAnimator.ofFloat(
        mWaveView, "waterLevelRatio", 0f, 0.5f);
waterLevelAnim.setDuration(10000);
waterLevelAnim.setInterpolator(new DecelerateInterpolator());
animators.add(waterLevelAnim);

// amplitude animation.
// wave grows big then grows small, repeatedly
ObjectAnimator amplitudeAnim = ObjectAnimator.ofFloat(
        mWaveView, "amplitudeRatio", 0f, 0.05f);
amplitudeAnim.setRepeatCount(ValueAnimator.INFINITE);
amplitudeAnim.setRepeatMode(ValueAnimator.REVERSE);
amplitudeAnim.setDuration(5000);
amplitudeAnim.setInterpolator(new LinearInterpolator());
animators.add(amplitudeAnim);
```