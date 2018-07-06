## Arduino GUI

A small example that shows how you can build a GUI that controls an Arduino using 
[Ardulink](http://www.arulink.org). It features a slider that controls a servo motor.

#### Test it out

If you want to test it out, you can clone the project, upload code to your Arduino that can
understand Ardulink Protocol, then listen for the custom action 'ssrv'. The angle can be found
in the serial command with inputString.substring(16, 19).toInt().

If you have no idea what I'm talking about, read up on [Ardulink](http://www.arulink.org) first,
it's a great project.
