module org.example.fazendateste {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.mongodb.bson;
    requires org.mongodb.driver.core;
    requires org.mongodb.driver.sync.client;
    requires junit;


    opens org.example.fazendateste to javafx.fxml;
    exports org.example.fazendateste;
    exports org.example.fazendateste.controle;
    opens org.example.fazendateste.controle to javafx.fxml;
}