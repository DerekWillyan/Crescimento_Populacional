package gui_class;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainController {
	
	@FXML
	private TextField cidA;
	@FXML
	private TextField cidB;
	@FXML
	private TextField percentA;
	@FXML
	private TextField percentB;
	@FXML
	private Label anos;
	@FXML
	private Button gerar;
	
	@FXML
	public void onbtnGerar() {
		
		Integer cidA = Integer.parseInt(this.cidA.getText());
		Integer cidB = Integer.parseInt(this.cidB.getText());
		Double percentA = Double.parseDouble(this.percentA.getText());
		Double percentB = Double.parseDouble(this.percentB.getText());
		
		int aux = 0;
		
		if(cidA > cidB) {
			
			while(cidB <= cidA) {
				
				cidA = (int) ((cidA*(percentA/100)) + cidA);	
				cidB = (int) ((cidB*(percentB/100)) + cidB);
				aux++;
			}
			
		}
		
		if(cidB > cidA) {
			
			while(cidA <= cidB) {
				
				cidA = (int) ((cidA*(percentA/100)) + cidA);	
				cidB = (int) ((cidB*(percentB/100)) + cidB);
				aux++;
			}
		
		}
		
		if(aux > 100) {
			
			this.anos.setText(String.format("Mais de 1 século (%d anos)", aux));
			
		} else {

			this.anos.setText(String.format("%d anos", aux));
			
		}

	}
	

}
