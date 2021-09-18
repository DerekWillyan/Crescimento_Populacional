module URI_GUI2 {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
	
	opens application to javafx.graphics, javafx.fxml, javafx.controls;
	opens gui_class to javafx.graphics, javafx.fxml, javafx.controls;
	
}
