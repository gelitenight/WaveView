[中文介绍](https://www.jianshu.com/p/e711e22e053e)

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

---

### 打个广告
美团平台及酒旅事业群招人啦，欢迎加入我们！
我可以帮忙内推，简历请发到我邮箱<gelitenight@gmail.com>
>【美团网】高级Android开发工程师
> 工作内容: 负责美团酒店、旅游产品 Android 客户端的设计、开发与改进。
> 1. 3年以上工作经验，2年以上Android开发经验；
> 2. 熟悉Android系统，熟悉Android软件的开发、测试、分发流程；
> 3. 良好的编程风格，扎实的编程基础和数据结构算法基础；
> 4. 熟悉移动网络的特性，对网络编程和常用网络协议有较深刻理解和经验；
> 5. 有一定的架构设计能力，良好的编码能力，编写文档能力；
> 6. 热爱互联网和新技术，具有极强的快速学习能力；
> 7. 有以下特征优先考虑：
>     * 有开源作品或技术博客（需原创技术文章）；
>     * 熟悉Socket编程。

北京、上海、厦门、成都都有职位，更多职位请见[职位列表](https://job.meituan.com/job-list?city=001001&department=5&jobFamily=26&pageNo=1)。
