# android-smart-animation-library
<div>
    <img src="http://udharimanager.in/animation1.gif"  height="250" width="125" />
    <img src="http://udharimanager.in/a2.gif" height="250" width="125" />
    <img src="http://udharimanager.in/a3.gif" height="250" width="125" />
    <img src="http://udharimanager.in/a4.png.gif" height="250" width="125" />
</div>

**This Library Contains <b>63</b> beautiful different Animations for android

This is android library for adding smart animation in any element of android(i.e. TextView , EditText ,LinearLayout etc...and everything ;)  )

Features --><br>
1.)You can select any animation listed below on any element of android.<br>
2.)you can set delay to any animation acording to your need (by default it is 0).<br>
3.)for moving animation(i.e. Sliding from one point to other). you can set sliding length acording to you  ;)<br>
4.)animation are already in diffrent thread so you dont have to add threads ...just simply add a single line of code and animation is done :D<br>

<h1>How to Import this Library in Your Android studio Project?</h1>
step1 --><br>
click on FIRST gradle file (build.gradle) highlighted in yellow.<br>
<img src="http://udharimanager.in/first.PNG"><br>
In this file add this code in "allprojects" block --> maven { url "https://jitpack.io" }<br>
It should look like this<br>
<br>
<img src="http://udharimanager.in/code1gradle.PNG"><br>

step2 -->
click on second gradle file(gradle.build) highlighted in yellow.<br>
<img src="http://udharimanager.in/second.PNG"><br>
now in this file add this code in dependencies block<br><br>
compile 'com.github.ratty3697:android-smart-animation-library:d0223c31f7'<br><br>
it should look like this --><br>
<img src="http://udharimanager.in/code22gradle.PNG"><br>
Now build your Project<br>
if build successfull appeared then everything is done ;)<br>
<br>
<h2>How to use this library</h2>
Now this is SIMPLIEST part<br>
You can animate anything like --> textview , edittext ,linearlayout ,relativelayout ..etc and everything present in android all you have to do is get its "id"<br>
suppose my LinearLayout id is "layout21"<br>
then to animate this LinearLayout simply add this code  when you want to animate--><br>
<br>
<b>SmartAnimation.with(AnimationType.BounceInDown).duration(1000).playOn(findViewById(R.id.layout21));</b>
<br><br>
where ---> <br>".duration(1000)" refers that animation will occour for 1000 mili seconds.<br><br>
           "BounceInDown" refers animation should be of bounce in down type You can use any type of animation code <b>listed below</b>.<br><br>
           ".playOn(findViewById(R.id.layout21)" refers playing animation on the element of this id = "layout21".<br><br>
           
<br>
To make delay in animation just add ".delay(1000)" --> which refers to 1000 mili seconds delay<br>
code will look like -->
<br><br>
<b>SmartAnimation.with(AnimationType.BounceInDown).duration(1000).delay(1000).playOn(findViewById(R.id.layout21));</b>
<br><br>
this code will make animation 1000 mili sec after execution of this code.<br>
<br>
<b>You can also change the slide length of the animation</b>
for those animation who also have slide effects(i.e. sliding from 1 position of screen to others ) you can adjust its sliding length(by defauly length is set to 1000dp).<br>for this just add this --> ".slideLength(500)"  500 refers to 500dp.<br><br>
it will look like this --><br><br>
<b>SmartAnimation.with(AnimationType.BounceInDown).duration(1000).delay(1000).slideLength(500).playOn(findViewById(R.id.layout21));</b><br><br>
<h3>How to change animation type></h3>
you can replace "BounceInDown" given in the code with these animation--><br><br>
e.g. --> SmartAnimation.with(AnimationType.ShakeBand).duration(1000).playOn(findViewById(R.id.layout21));<br><br>
<b>simple type animation</b><br>
1.)ShakeBand<br>
2.)TakingOff<br>
3.)Flash<br>
4.)Pulse<br>
5.)RubberBand<br>
6.)Landing<br>
7.)Shake<br>
8.)Swing<br>
9.)Wobble<br>
10.)Bounce<br>
11.)Tada<br>
12.)StandUp<br>
13.)Wave<br>
14.)Hinge<br>
15.)BounceIn<br>
16.)FadeIn<br>
17.)FadeOut<br>
18.)FlipInX<br>
19.)FlipInY<br>
20.)FlipOutX<br>
21.)FlipOutY<br>
22.)RotateIn<br>
23.)RotateInDownLeft<br>
24.)RotateInDownRight<br>
25.)RotateInUpLeft<br>
26.)RotateInUpRight<br>
27.)RotateOut<br>
28.)RotateOutDownLeft<br>
29.)RotateOutDownRight<br>
30.)RotateOutUpLeft<br>
31.)RotateOutUpRight<br>
32.)ZoomIn<br>
33.)ZoomOut<br>
<br>
<b>Sliding type animation(i.e. in which ".slideLength()" can be used)</b><br>
1.)DropOut<br>
2.)RollIn<br>
3.)RollOut<br>
4.)BounceInDown<br>
5.)BounceInUp<br>
5.)BounceInLeft<br>
6.)BounceInRight<br>
7.)FadeInUp<br>
8.)FadeInDown<br>
9.)FadeInRight<br>
10.)FadeInLeft<br>
11.)FadeOutUp<br>
12.)FadeOutDown<br>
13.)FadeOutRight<br>
14.)FadeOutLeft<br>
15.)SlideInLeft<br>
16.)SlideInUp<br>
17.)SlideInDown<br>
18.)SlideInRight<br>
19.)SlideOutLeft<br>
20.)SlideOutUp<br>
21.)SlideOutDown<br>
22.)SlideOutRight<br>
23.)ZoomInDown<br>
24.)ZoomInLeft<br>
25.)ZoomInRight<br>
26.)ZoomInUp<br>
27.)ZoomOutDown<br>
28.)ZoomOutLeft<br>
29.)ZoomOutRight<br>
30.)ZoomOutUp<br>






 




