        Parent root = FXMLLoader.load(getClass().getResource("buyscreen.fxml"));
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root, 650, 400));
