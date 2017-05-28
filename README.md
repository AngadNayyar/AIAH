Pretend You're Xyzzy
===================


THIS IS HOW YOU RUN YOUR OWN SERVER:

Unzip the source code into some directory. Open a command prompt in that directory. Copy build.properties.example to build.properties; the defaults work for a quick-and-dirty server. Run mvn ```clean package war:exploded jetty:run```. Open http://localhost:8080/game.jsp. You're done.

To skip tests add this to the mvn command ```-DskipTests```
















A Cards Against Humanity clone, server and web client. See WebContent/license.html for full details.

Note: This project is only known to work with Tomcat 7, all other versions are unsupported. 
Currently, the only way to build PYX is using Maven via ```mvn clean package war:war``` in the project's directory.


If you're doing ```mvn clean package jetty:run```, you now need to add ```-Dmaven.buildNumber.doCheck=false -Dmaven.buildNumber.doUpdate=false``` to make the buildnumber plugin allow you to run with uncommited changes.

