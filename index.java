import com.lynden.gmapsfx.GoogleMapView;
import com.lynden.gmapsfx.MapComponentInitializedListener;
import com.lynden.gmapsfx.javascript.object.GoogleMap;
import com.lynden.gmapsfx.javascript.object.LatLong;
import com.lynden.gmapsfx.javascript.object.MapOptions;
import com.lynden.gmapsfx.javascript.object.MapType;
import com.lynden.gmapsfx.javascript.object.Marker;
import com.lynden.gmapsfx.javascript.object.MarkerOptions;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;



public class index extends Application{
public String version = new String("Alpha 0.1");

  public static void main(String []args) {

        System.out.println("\n                                   Tama OS Alpha 0.1"); // statement to display on start of program
        System.out.println("Authors: Abdullah Chaudhry, Kavinath Kanesalingam, Ryan Lawson, Vedha Rajan"); //statement to display Authors
        System.out.println("The following program is confidential and eyes only for the duration of the development period. \n");  //warning
        System.out.println("CODE - GUNDAM");
        System.out.println("G - eneral \n U - nilateral \n N - eurolink \n D - ispersive \n A - utonomic M - anuever");


        launch(args);


     }

     public void start(stage primaryStage) throws Exception{
      primaryStage.setTitle("Tama OS -" + version);

      button = new Button();
      button.setText();

     }




}
