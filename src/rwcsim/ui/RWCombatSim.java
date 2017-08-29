package rwcsim.ui;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ToggleButton;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import rwcsim.utils.runes.RuneManager;


public class RWCombatSim extends Application {

    public ToggleButton rune1;
    public ImageView rune1ImageView = new ImageView();

    public ToggleButton rune2;
    public ImageView rune2ImageView = new ImageView();

    public ToggleButton rune3;
    public ImageView rune3ImageView = new ImageView();

    public ToggleButton rune4;
    public ImageView rune4ImageView = new ImageView();

    public ToggleButton rune5;
    public ImageView rune5ImageView = new ImageView();


    public void initializeRunes(Stage primaryStage) {
        rune1 = (ToggleButton) primaryStage.getScene().lookup("#rune1");
        rune1.setGraphic(rune1ImageView);
        rune1ImageView.imageProperty().bind(Bindings.when(rune1.selectedProperty())
                .then(RuneManager.getInstance().getRuneToken(0, 0).getImage())
                .otherwise(RuneManager.getInstance().getRuneToken(0, 1).getImage())
        );


        rune2 = (ToggleButton) primaryStage.getScene().lookup("#rune2");
        rune2.setGraphic(rune2ImageView);
        rune2ImageView.imageProperty().bind(Bindings.when(rune2.selectedProperty())
                .then(RuneManager.getInstance().getRuneToken(1, 0).getImage())
                .otherwise(RuneManager.getInstance().getRuneToken(1, 1).getImage())
        );


        rune3 = (ToggleButton) primaryStage.getScene().lookup("#rune3");
        rune3.setGraphic(rune3ImageView);
        rune3ImageView.imageProperty().bind(Bindings.when(rune3.selectedProperty())
                .then(RuneManager.getInstance().getRuneToken(2, 0).getImage())
                .otherwise(RuneManager.getInstance().getRuneToken(2, 1).getImage())
        );


        rune4 = (ToggleButton) primaryStage.getScene().lookup("#rune4");
        rune4.setGraphic(rune4ImageView);
        rune4ImageView.imageProperty().bind(Bindings.when(rune4.selectedProperty())
                .then(RuneManager.getInstance().getRuneToken(3, 0).getImage())
                .otherwise(RuneManager.getInstance().getRuneToken(3, 1).getImage())
        );


        rune5 = (ToggleButton) primaryStage.getScene().lookup("#rune5");
        rune5.setGraphic(rune5ImageView);
        rune5ImageView.imageProperty().bind(Bindings.when(rune5.selectedProperty())
                .then(RuneManager.getInstance().getRuneToken(4, 0).getImage())
                .otherwise(RuneManager.getInstance().getRuneToken(4, 1).getImage())
        );
    }

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("RWCombatSim.fxml"));
        primaryStage.setTitle("RuneWars Combat Simulator");
        primaryStage.setScene(new Scene(root, 640, 480));
        primaryStage.show();

        initializeRunes(primaryStage);
    }
}
