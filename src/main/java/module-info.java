module org.example.fazenda {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.mongodb.driver.sync.client;
    requires org.mongodb.bson;
    requires org.mongodb.driver.core;

    // Exporta o pacote do modelo para que o MongoDB PojoCodecProvider consiga acessá-lo
    opens org.example.fazenda.modelo to org.mongodb.bson, javafx.fxml;

    exports org.example.fazenda;
    exports org.example.fazenda.util;
    exports org.example.fazenda.modelo;
}