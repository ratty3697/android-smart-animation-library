# android-smart-animation-library



this library is extended from -> http://www.github.com/JakeWharton/NineOldAndroids  && https://github.com/daimajia/AnimationEasingFunctions && https://github.com/daimajia/AndroidViewAnimations

<div>
    <img src="http://www.hackingsimplified.com/front.gif"  height="250" width="125" />
    <img src="http://www.hackingsimplified.com/attention.gif" height="250" width="125" />
    <img src="http://www.hackingsimplified.com/bouncein.gif" height="250" width="125" />
    <img src="http://www.hackingsimplified.com/zoomin.gif" height="250" width="125" />
</div>

If you like this library then plz hit the star at the top right corner ;)

For any query or suggestion mail me at --> programer.prabhat@gmail.com<br><br>

<b>You can Download sample app from google play store --></b>https://play.google.com/store/apps/details?id=com.podcopic.animationlib.androidsimplifiedanimation&hl=en<br><br>


**This Library Contains <b>64</b> beautiful different Animations for android

This is android library for adding smart animation in any view of android(i.e. TextView , EditText ,LinearLayout etc...and everything ;)  )

Features --><br>
1.)You can select any animation listed below on any view of android.<br>
2.)you can set delay in ms to any animation acording to your need .<br>
3.)for moving animation(i.e. Sliding from one point to other). you can set sliding length acording to you by default it is 1000 dp  ;)<br>
4.)you can set duration of animation in ms.<br>
5.)you can control fading effect in animation using boolean variable.<br>
6.)animation are already in diffrent thread so you dont have to add threads ...just simply add a single line of code and animation is done :D<br>

<h1>How to Import this Library in Your Android studio Project?</h1>
step1 --><br>
click on FIRST(project's gradle file) gradle file (build.gradle) highlighted in yellow.<br>
<img src="http://hackingsimplified.com/ex1.PNG"><br>
In this file ,You will see "alprojects" block where "jcenter()" is included<br>
add this line of code just below "jcenter()"--> <br><br>
maven { url "https://jitpack.io" }<br><br>
It should look like this --><br>
<br>
<img src="http://hackingsimplified.com/ex2.PNG"><br>

step2 -->
click on second(app's gradle file) gradle file(gradle.build) highlighted in yellow.<br>
<img src="http://hackingsimplified.com/ex3.PNG"><br>
now in this file add this code in dependencies block<br><br>
<b><i>compile 'com.github.ratty3697:android-smart-animation-library:1.3'</i></b><br><br>
it should look like this --><br>
<img src="http://hackingsimplified.com/ex5.PNG"><br><br>
<u>NOTE</u>--> <b>In this file</b> <br>

1.)"compileSdkVersion" should be greater than or equals to 23<br>
2.)"buildToolsVersion" should be greater than or equals to 23.0.1<br>
3.)"minSdkVersion" should be greater than or equal to 10<br>
4.)"targetSdkVersion" should be greater than or equal to 23<br>


Now build your Project<br>
if build successfull appeared then everything is done ;)<br>
<br>
<h2>How to use this library</h2>
Now this is SIMPLIEST part<br>
You can animate anything like --> textview , edittext ,linearlayout ,relativelayout ..etc and everything present in android<br> all you have to do is get its "id"<br>
suppose my LinearLayout id is "layout21"<br>
then to animate this LinearLayout simply add this code  when you want to animate--><br>
<br>
<b><i>StartSmartAnimation.startAnimation(  findViewById(R.id.layout21)  ,  AnimationType.BounceInDown  ,  2000  , 0 , true );</i></b>
<br><br>
<br>where --><br>   1st parameter is view to whom we want to animate <br>   2nd paramenter is defining animation (you can get list of different animation at the bottom of page)<br>  3rd parameter is animation duration in mili secind<br>  4th parameter is delay before animation in mili second<br>    5th parameter is boolean variable to enable/disable fading effect in animation.<br> <br><br>
           "BounceInDown" refers animation should be of bounce in down type You can use any type of animation code <b>listed below</b>.<br>
          
<b>You can also change the slide length of the animation</b>
for those animation who also have slide effects(i.e. sliding from 1 position of screen to others ) you can adjust its sliding length(by default length is set to 1000 dp).<br>for this just add another int variable for slide length(in dp) <br><br>
it will look like this --><br><br>
<b><i>StartSmartAnimation.startAnimation(  findViewById(R.id.layout21) ,  AnimationType.BounceInDown ,  2000 , 0 , true , 300 );</i></b><br>where <b>300</b> is 300 dp sliding length for animation.<br>
<h3>How to change animation type></h3>
you can replace "BounceInDown" given in the code with these animation--><br><br>
e.g. --> StartSmartAnimation.startAnimation( findViewById(R.id.layout21) ,  AnimationType.ShakeBand ,  2000 , 0 , true );<br><br>
<b>NON - sliding animation</b><br>
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
33.)ZoomInRubberBand<br>
34.)ZoomOut<br>
<br>
<b>Sliding type animation</b><br>
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






 




