import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.FactoryConfiguration;


public class AppInitializer extends Application {
    public static void main(String[] args) {launch(args);}

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setScene(new Scene(FXMLLoader.load(getClass().getResource("view/DashBoardForm.fxml"))));
        primaryStage.show();
    }

    Session session = FactoryConfiguration.getInstance().getSession();
    Transaction transaction = session.beginTransaction();
}
