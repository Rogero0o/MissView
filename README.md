# MissView
This project is a part of Muzei,(https://github.com/romannurik/muzei) .<br>
Thanks for Roman Nurik..<br>

I like the animation in that project...so i studied his codes and make this..<br>

![](https://github.com/Rogero0o/MissView/raw/master/missview.gif)

..as you see right now,wish you like it.

### Step

Import this project into android studio..it's built with it.

###  Usage

#### Jcenter

gradle
```
compile 'com.roger.missview.library:library:1.0.0'
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

## License

	The MIT License (MIT)

	Copyright © 2015 Roger

	Permission is hereby granted, free of charge, to any person obtaining a copy
	of this software and associated documentation files (the "Software"), to deal
	in the Software without restriction, including without limitation the rights
	to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
	copies of the Software, and to permit persons to whom the Software is
	furnished to do so, subject to the following conditions:

	The above copyright notice and this permission notice shall be included in
	all copies or substantial portions of the Software.

	THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
	IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
	FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
	AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
	LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
	OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
	THE SOFTWARE.
