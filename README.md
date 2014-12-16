Java Circles
==========

Inspired by Daniel Bernier's generative art which he dubbed [Circle Pictures](http://invisibleblocks.com/2014/09/29/circle-pictures-redux/ "Circle Pictures Redux"); I have created a Java wrapper for his code. His code was originally done in [Processing](https://processing.org/ "Processing Homepage"). Processing is based on Java but uses a simplified syntax and graphics programming model. 

***

**Some notes about the code...**

To use this code you will need to have Processing on your Mac/PC. You will then need to add the core.jar file as a global library to your IDE of choice. ~~At a later date I'll write how to do this in IntelliJ IDEA.~~ Later date is now! If you already know how to do this and you have Processing already, then you can find core.jar here on Mac: `/Applications/Processing.app/Contents/Java/core/library/core.jar`. For Windows folk it'll be here-ish... `C:\Program Files\processing-2.2.1\core\library\core.jar`.

For those who don't know how to do the above, just follow these steps:

1. Download and install Processing (link above).
2. Create a normal Java project in IntelliJ.
3. After that, go to file -> Project Structure (Ctrl+Alt+Shift+S on Windows).
4. Under Platform Settings at the left, click on Global Libraries.
5. Click the wee green plus sign in the middle column and choose 'from Java'.
6. Navigate to wherever you installed processing to (files paths are above); then just choose core.jar and click OK.
7. The path to core.jar should appear in the far right column under classes... And that's it! :)

Also... This code is just for fun and is absolutely not ready for any real deployment! It's greedy with the memory! Happy generative picture making!

***

Here's an example output of a picture I ran through the code...

![alt text](https://raw.githubusercontent.com/sjblair/JavaCircles/master/src/examples/Screen%20Shot%202014-12-15%20at%2021.06.38.png?token=AEO3HOI4kqCXIFEradrGrAdxSBLaPE3_ks5UmIpcwA%3D%3D "Example output!")

P.S. It's a pug by the way... :)
