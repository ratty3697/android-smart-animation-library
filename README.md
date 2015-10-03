# android-smart-animation-library
<div>
    <img src="http://udharimanager.in/animation1.gif"  height="250" width="125" />
    <img src="http://udharimanager.in/a2.gif" height="250" width="125" />
    <img src="http://udharimanager.in/a3.gif" height="250" width="125" />
    <img src="http://udharimanager.in/a4.png.gif" height="250" width="125" />
</div>

this library is drived from nineoldandroid library

This is android library for adding smart animation in its any element (i.e. TextView , EditText ,LinearLayout etc...and everything ;)  )

Features --><br>
1.)You can select any animation listed below on any element of endroid.<br>
2.)you can set delay to animation acording to you.<br>
3.)for the animation for moving animation(i.e. Sliding from one point to other). you can set sliding length acording to you and can also set delay  ;)<br>
4.)for non moving animation(i.e. animating on one place only e.g.-> shaking). you can set delay.<br>
5.)animation are already in diffrent thread so you dont have to add threads ...just simply add a single line of code and animation is done :D<br>

<h1>How to Import this Library in Your Android studio Project?</h1>
step1 --><br>
click on FIRST gradle file (build.gradle) highlighted in yellow.<br>
<img src="http://udharimanager.in/first.PNG"><br>
then replace your allprojects columb with this code --><br>
<br>
<img src="http://udharimanager.in/code1gradle.PNG"><br>

step2 -->
click on second gradle file(gradle.build) highlighted in yellow.<br>
<img src="http://udharimanager.in/second.PNG"><br>
now in this file add this code in dependencies block<br><br>
compile 'com.github.ratty3697:android-smart-animation-library:d0223c31f7ef4d33e1fc9e926b6c28ffe4e8f694'<br><br>
it should look like this --><br>
<img src="http://udharimanager.in/code2gradle.PNG"><br>
Now build your Project<br>
if build successfull appeared then everything is done ;)<br>
<br>
<h2>How to use this library</h2>
Now this is SIMPLIEST part<br>
You can animate anything like --> textview , edittext ,linearlayout ,relativelayout ..etc and everythin present in android all you have to do is get its "id"<br>
suppose my LinearLayout id is "layout21"<br>
then to animate simply add this code  when you want to animate--><br>
<br>
<b>SmartAnimation.with(AnimationType.Bounce).duration(1000).playOn(findViewById(R.id.layout21));</b>
<br><br>
 




