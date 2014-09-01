#!/bin/bash -x
FILES=`find src/main/java/com/greptilian/javaone2014bof5619/starwars | grep \.java$`
UMLPRE='images/starwarspre.uml'
UMLPOST='images/starwars-classes.uml'
javadoc -private -quiet -J-DdestinationFile=$UMLPRE -J-DcreatePackages=false -J-DshowPublicMethods=true -J-DshowPublicConstructors=false -J-DshowPublicFields=false -doclet de.mallox.doclet.PlantUMLDoclet -docletpath ~/bin/plantUmlDoclet.jar -sourcepath . $FILES
cat $UMLPRE | grep -v Type > $UMLPOST
rm $UMLPRE
#java -jar ~/bin/plantuml.jar -graphvizdot ~/.homebrew/bin/dot -tpng $UML
#java -jar ~/bin/plantuml.jar -graphvizdot ~/.homebrew/bin/dot -tsvg $UML
java -jar ~/bin/plantuml.jar -tpng $UMLPOST
#java -jar ~/bin/plantuml.jar -tsvg $UMLPOST
