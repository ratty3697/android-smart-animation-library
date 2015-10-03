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
click on FIRST gradle file (build.gradle) highlighted in yellow.<br>
<img src="http://udharimanager.in/first.PNG"><br>
then replace your allprojects columb with this code --><br>
<br>
allprojects {<br>
        repositories {<br>
                jcenter()<br>
                maven { url "https://jitpack.io" }<br>
        }
}



