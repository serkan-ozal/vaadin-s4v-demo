vaadin-s4v-demo
===============

Demo of vaadin-s4v

Usage
===============

If you have got an error like this

~~~~~ java
...

com.sun.tools.attach.AttachNotSupportedException: Unable to open socket file: target process not responding or HotSpot VM not loaded

...
~~~~~

You must explicitly enable attach listener flag by `-XX:+StartAttachListener` as VM argument.
This error is caused by a bug of JVM on **MacOS** operating system.
