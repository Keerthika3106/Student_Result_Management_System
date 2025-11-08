@FXML
private void handleAddResult() {
    try {
        Student s = new Student(txtId.getText(), txtName.getText(),
            txtSubject.getText(), Double.parseDouble(txtMarks.getText()));
        service.addResult(s);
        showAlert("Success", "Result added successfully!");
    } catch (Exception e) {
        showAlert("Error", e.getMessage());
    }
}
