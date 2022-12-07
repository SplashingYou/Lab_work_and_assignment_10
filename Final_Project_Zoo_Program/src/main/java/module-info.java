module com.mycompany.final_project_zoo_program {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.final_project_zoo_program to javafx.fxml;
    exports com.mycompany.final_project_zoo_program;
}
