cd Framework
javac -parameters -d . *.java
jar cvf framework.jar etu2043
move framework.jar ../Test_Framework/lib
cd ../