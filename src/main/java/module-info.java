module com.iagorussi.mininavegadorweb {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.iagorussi.mininavegadorweb to javafx.fxml;
    exports com.iagorussi.mininavegadorweb;
}