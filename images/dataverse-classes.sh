#!/bin/bash -x
FILES=`find src/main/java/com/greptilian/javaone2014bof5619/dataverse | grep \.java$ | egrep -v '(DvObject|Dataverse|Exception)\.java$'`
UML='images/dataverse-classes.uml'
javadoc -private -quiet -J-DdestinationFile=$UML -J-DcreatePackages=false -J-DshowPublicMethods=true -J-DshowPublicConstructors=false -J-DshowPublicFields=false -doclet de.mallox.doclet.PlantUMLDoclet -docletpath ~/bin/plantUmlDoclet.jar -sourcepath . $FILES
#java -jar ~/bin/plantuml.jar -graphvizdot ~/.homebrew/bin/dot -tpng $UML
java -jar ~/bin/plantuml.jar -tpng $UML
