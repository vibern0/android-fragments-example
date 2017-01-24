# Android Fragments

### Descritpion:
This is only an example of fragments running on an application.<br/>
If you are asking yourself, "What this is useful for?" the answer is something like "do once, dont waste screen space".<br/>
Not obvious ?<br/>
Well, here is two pictures.<br/>
(add pictures)<br/>
<br/>
### How to use:
The *LeftUpFragment* is the more basic. You can just copy and paste to use.<br/>
The other one has a button to ckick and text to be changed. Then, at the activity in portrait orientation use a *LinearLayout* with *vertical* orientation and put the xml code to call the fragments.<br/>
Then copy the same file from *layout* folder to *layout-land* folder and change layout orientation to *horizontal*.<br/>
In the vertical orientation the fragments should be above and below, in horizontal they should be left and right.<br/>
<br/>
### Restrictions:
**Buttons**<br/>
If you have a button in on of the fragments, the function should be at the activity and nor in fragment class. (The case is in the example)
