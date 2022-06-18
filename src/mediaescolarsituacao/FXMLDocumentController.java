package mediaescolarsituacao;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLDocumentController {
String aluno;
Double nota1, nota2, nota3, media, situacao;
    
    @FXML
    private Button button;


    @FXML
    private Label label;
    @FXML
    private Label label1;
    @FXML
    private Label label11;
    @FXML
    private Label label12;
    @FXML
    private TextField cxaluno;
    @FXML
    private TextField cxnota1;
    @FXML
    private TextField cxnota2;
    @FXML
    private TextField cxnota3;
    @FXML
    private TextArea cxresult;


    @FXML
    void calcular(ActionEvent event) {
        aluno=String.valueOf(cxaluno.getText());
        nota1=Double.valueOf(cxnota1.getText());
        nota2=Double.valueOf(cxnota2.getText());
        nota3=Double.valueOf(cxnota3.getText());
        media=(nota1+nota2+nota3)/3;
        cxresult.setText(verificaNota(media));
        
    }

    private String verificaNota(Double media) {
        String situacao=null;
        if (media >=7)
            situacao="O aluno "+aluno+" está APROVADO com \na média semestral igual á "+media;
        else if (media <=5)
            situacao="O aluno "+aluno+" está REPROVADO com \na média semestral igual á "+media;
        else
            situacao="O aluno "+aluno+" está RECUPERAÇÃO com \na média semestral igual á "+media;
        return situacao;
    }


}