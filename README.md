gldt
===

Golo Language Development Tools (Eclipse)

<b>Manual installation</b>

Once you've cloned the repository, run mvn package.

This should produce an update site under org.gololang.gldt.site/target/repository.

Under Eclipse, add this folder as a local software site and give it a name (GLDT for example).

Then, click on Help -> Install new software, and select the software site you just created.

After a short time, you should see two items, GLDT and Xtext.

If Xtext is not installed on your Eclipse, select the two items and proceed to the installation.

If Xtext is already installed on your Eclipse, select only the GLDT item and proceed to the installation.

Restart Eclipse.

GLDT should be installed and the GDLT editor should be run on each .golo file.

<b>IRC<b>

Log into the #gldt IRC channel on irc.freenode.net or with <a href="http://webchat.freenode.net">web irc client</a> 

![Build Status](https://travis-ci.org/jeffmaury/gldt.png?branch=master) https://travis-ci.org/jeffmaury/gldt
