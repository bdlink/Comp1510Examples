module ca.bcit.comp1510.examples {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.media;
	requires transitive javafx.graphics;
	requires org.junit.jupiter.api;
	requires org.junit.platform.runner;
	
	opens ca.bcit.comp1510.ch03 to javafx.fxml;
	exports ca.bcit.comp1510.ch03;
	opens ca.bcit.comp1510.ch04 to javafx.fxml;
	exports ca.bcit.comp1510.ch04;
	opens ca.bcit.comp1510.ch05 to javafx.fxml;
	exports ca.bcit.comp1510.ch05;
	opens ca.bcit.comp1510.ch06 to javafx.fxml;
	exports ca.bcit.comp1510.ch06;
	opens ca.bcit.comp1510.ch07 to javafx.fxml;
	exports ca.bcit.comp1510.ch07;
	opens ca.bcit.comp1510.ch08 to javafx.fxml;
	exports ca.bcit.comp1510.ch08;
	opens ca.bcit.comp1510.ch09 to javafx.fxml;
	exports ca.bcit.comp1510.ch09;
}