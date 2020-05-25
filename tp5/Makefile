#EXEC = test/CellTest.class test/SeaTest.class test/ShipTest.class test/PositionTest.class test/GameTest.class
EXEC = classes/battleship/Cell.class classes/battleship/Game.class classes/battleship/Sea.class classes/battleship/Ship.class classes/battleship/MainGame.class classes/io/Answer.class classes/io/Input.class classes/io/Position.class

all: $(EXEC)

classes/battleship/Cell.class:  src/battleship/Cell.java
	cd src/; \
		javac battleship/Cell.java  -d ../classes

classes/battleship/Game.class:  src/battleship/Game.java
	cd src/; \
	javac battleship/Game.java  -d ../classes

classes/battleship/Sea.class:  src/battleship/Sea.java
	cd src/; \
	javac battleship/Sea.java  -d ../classes

classes/battleship/Ship.class:  src/battleship/Ship.java
	cd src/; \
	javac battleship/Ship.java  -d ../classes

classes/battleship/MainGame.class:  src/battleship/MainGame.java
	cd src/; \
	javac battleship/MainGame.java  -d ../classes

classes/io/Answer.class: src/io/Answer.java
	cd src/; \
	javac io/Answer.java  -d ../classes

classes/io/Input.class: src/io/Input.java
	cd src/; \
	javac io/Input.java  -d ../classes

classes/io/Position.class: src/io/Position.java
	cd src/; \
	javac io/Position.java  -d ../classes

doc:
	cd src/; \
	javadoc -d ../docs -subpackages battleship
	cd src/; \
	javadoc -d ../docs -subpackages io

CellTest: test/CellTest.java
	javac -classpath test-1.7.jar test/CellTest.java
	java -jar test-1.7.jar CellTest

SeaTest: test/SeaTest.java
	javac -classpath test-1.7.jar test/SeaTest.java
	java -jar test-1.7.jar SeaTest

ShipTest: test/ShipTest.java
	javac -classpath test-1.7.jar test/ShipTest.java
	java -jar test-1.7.jar ShipTest

PositionTest: test/PositionTest.java
	javac -classpath test-1.7.jar test/PositionTest.java
	java -jar test-1.7.jar PositionTest

GameTest: test/GameTest.java
	javac -classpath test-1.7.jar test/GameTest.java
	java -jar test-1.7.jar GameTest

jar:
	cd classes/; \
		jar cvfm ../battleship.jar ../manifest-ex battleship io

play:
	cd classes/; \
		java battleship.MainGame

playjar:
	java -jar  battleship.jar
		
