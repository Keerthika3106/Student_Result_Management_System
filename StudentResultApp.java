public class StudentResultApp extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxml = new FXMLLoader(getClass().getResource("student_result.fxml"));
        Scene scene = new Scene(fxml.load());
        stage.setScene(scene);
        stage.setTitle("Student Result Management System");
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}

