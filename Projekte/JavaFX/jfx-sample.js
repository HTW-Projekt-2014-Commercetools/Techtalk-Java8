load("fx:base.js");
load("fx:controls.js");
load("fx:graphics.js");

// Automatische Aufruf durch -fx Parameter, stage Objekt bereits ezeugt
function start(stage)
{
	stage.title = "Hello World";
	var button = new Button();
	button.text = "Say Hello";
	button.onAction = function() print("Hello everyone!") ;

	var root = new StackPane();

	root.children.add(button);

	stage.scene = new Scene(root, 300, 250);

	stage.show();

}