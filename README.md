# MissView
This project is a part of Muzei,(https://github.com/romannurik/muzei) .<br>
Thanks for Roman Nurik..<br>

I like the animation in that project...so i studied his codes and make this..<br>

![](http://ww3.sinaimg.cn/mw690/a695acdegw1es9pdp7jwug20cc0m5qvi.gif)

..as you see right now,wish you like it.

### Step

Import this project into android studio..it's build with it.

###  Usage

#### Maven Central

gradle
```
compile project(':library')
```

##### Config in xml

```xml
    <com.roger.missview.library.MissView
        android:id="@+id/missview"
        android:layout_width="match_parent"
        android:layout_height="match_parent" />
```

##### and init in java code

```java
 mMissview = (MissView) findViewById(R.id.missview);
 mMissview.initPicture(path);//path is the String of background picture path
```


## About me

A small guy  in mainland FUJIAN China.

If you have any new idea about this project, feel free to tell me ,Tks. :smiley:
