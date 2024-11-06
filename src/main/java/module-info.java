module org.example.fazenda {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.mongodb.bson;
    requires org.mongodb.driver.core;
    requires org.mongodb.driver.sync.client;


    opens org.example.fazenda to javafx.fxml;
    exports org.example.fazenda;
    exports org.example.fazenda.controle;
    opens org.example.fazenda.controle to javafx.fxml;
}