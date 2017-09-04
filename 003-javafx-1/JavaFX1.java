import javafx.application.Application;
import javafx.scene.canvas.Canvas;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.shape.ArcType;

public class JavaFX1 extends Application
{
  public static void main(String[] args)
  {
    launch(args);
  }
  @Override
  public void start(Stage primaryStage) throws Exception
  {
    Group root = new Group();
    Scene scene = new Scene(root);
    Canvas canvas = new Canvas(148, 148);
    GraphicsContext gc = canvas.getGraphicsContext2D();

    gc.strokeOval(24, 24, 100, 100);
    gc.strokeArc(24, 48, 100, 50, 180, 180, ArcType.OPEN);
    gc.fillOval(64, 88, 20, 20);
    gc.setFill(Color.WHITE);
    gc.fillOval(66, 90, 16, 16);

    root.getChildren().add(canvas);
    primaryStage.setTitle("Pokeball");
    primaryStage.setScene(scene);
    primaryStage.show();
  }
}
