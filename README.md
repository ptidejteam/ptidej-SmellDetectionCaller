# SmellDetectionCaller

The content of this Java project divides essentially in two.

The Eclipse Java project "0 - SmellDetectionCaller" contains all you need to identify occurrences of code and design smells in Java source code, Java binary classfiles, or C++ source code. You must modify the class "ptidej.sad.smelldetectioncaller.SmellDetectionCaller" to change the path to a folder or a JAR file in which is located the code of the program that you want to analyse.

The remaining Eclipse Java projects are only used to regenerate the JAR files necessary to run the class "ptidej.sad.smelldetectioncaller.SmellDetectionCaller". These JAR files are "Ptidej.jar", which contains the bare minimum code from Ptidej, and the JAR files in "Ptidej_lib", which contains all the JAR supporting Ptidej.


How to Build JAR Version

1. Execute once "/SmellDetectionCaller/src/ptidej/sad/smelldetectioncaller/SmellDetectionCaller.java" 
	as launch configuration "SmellDetectionCaller"

2. Select "/SmellDetectionCaller/src/ptidej/sad/smelldetectioncaller/SmellDetectionCaller.java"
	2.1. Export as "Java/Runnable JAR file"
		2.1.1. Select as launch configuration "SmellDetectionCaller"
		2.1.2. Slection as export destination "0 - SmellDetectionCaller\Ptidej.jar"
		2.1.3. Select "Copy required libraries into a sub-folder next to the generated JAR"
		2.1.4. Check "Save as ANT script"
		2.1.5. Select as ANT script location "\0 - SmellDetectionCaller\Generate JARs.xml"