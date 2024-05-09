package formulario;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Crear los elementos de la GUI
        AnchorPane root = new AnchorPane();
        ListView<String> listView = new ListView<>();
        TextField textField = new TextField();
        ScrollBar scrollBar = new ScrollBar();
        Label[] labels = new Label[5];
        ImageView[] imageViews = new ImageView[5];

        // Configurar la lista
        listView.setLayoutX(367);
        listView.setLayoutY(30);
        listView.setPrefSize(241, 367);
        listView.setStyle("-fx-background-color: black;");

        // Configurar el campo de texto
        textField.setLayoutX(378);
        textField.setLayoutY(447);
        textField.setPrefSize(220, 26);
        textField.setStyle("-fx-background-color: blue;");

        // Configurar la barra de desplazamiento
        scrollBar.setLayoutX(4);
        scrollBar.setLayoutY(14);
        scrollBar.setPrefSize(20, 238);

        //5

        // Configurar las etiquetas y las imágenes
        for (int i = 0; i < 5; i++) {
            labels[i] = new Label("Texto(nombre y apellido)");
            labels[i].setLayoutX(86);
            labels[i].setLayoutY(30 + 62 * i);
            labels[i].setPrefSize(189, 42);
            labels[i].setStyle("-fx-background-color: grey;");

            // Cargar la imagen desde el directorio local
            Image image = new Image("file:///D:/Documentos/PYTHON/TAREA 1/user.jpg"); // Ruta completa de la imagen
            imageViews[i] = new ImageView(image);
            imageViews[i].setLayoutX(33);
            imageViews[i].setLayoutY(30 + 61 * i);
            imageViews[i].setFitWidth(42);
            imageViews[i].setFitHeight(42);
            imageViews[i].setPreserveRatio(true);
        }

        // Agregar los elementos al panel raíz
        root.getChildren().addAll(listView, textField, scrollBar);
        root.getChildren().addAll(labels);
        root.getChildren().addAll(imageViews);

        // Configurar y mostrar la escena
        Scene scene = new Scene(root, 669, 533);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
