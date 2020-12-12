package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.GridPane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

public class Controller {
    @FXML
    private Label label;

    @FXML
    private Button button4;

    @FXML
    private GridPane gridPane;

    @FXML
    private WebView webView;

    public void initialize() {
        button4.setEffect(new DropShadow());
    }

    @FXML
    public void handleMouseEnter() {
        label.setScaleX(2.0);
        label.setScaleY(2.0);
    }

    @FXML
    public void handleMouseExit() {
        label.setScaleX(1.0);
        label.setScaleY(1.0);
    }

    @FXML
    public void handleClick() {
        FileChooser chooser = new FileChooser(); //choosers (for navigating to a file in the system)
        chooser.setTitle("Save Application File");
        chooser.getExtensionFilters().addAll( //file extension filter
                new FileChooser.ExtensionFilter("Zip", "*.zip"),
                new FileChooser.ExtensionFilter("PDF", "*.pdf"),
                new FileChooser.ExtensionFilter("All Files", "*.*"),
                new FileChooser.ExtensionFilter("Image Files", "*.jpg", "*.png", "*.gif")
        );
//        DirectoryChooser chooser = new DirectoryChooser();
        List<File> file = chooser.showOpenMultipleDialog(gridPane.getScene().getWindow());
        if (file!=  null) {
            for (int i = 0;i<file.size(); i++) {
                System.out.println(file.get(i));
            }
//            System.out.println(file.getPath());
        } else {
            System.out.println("Chooser was cancelled");
        }
    }

    @FXML
    public void handleLinkClick() {
//        try {
//            Desktop.getDesktop().browse(new URI("http://www.javafx.com")); //using the system's default browser
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (URISyntaxException e) {
//            e.printStackTrace();
//        }
        WebEngine engine = webView.getEngine();
        engine.load("http://www.javafx.com");
    }
}
