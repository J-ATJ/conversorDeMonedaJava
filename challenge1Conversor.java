import javax.swing.JOptionPane;

public class challenge1Conversor {

	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null, "Programa iniciado", "Conversor",JOptionPane.INFORMATION_MESSAGE);
		int salir = 0;
	
		while(salir == 0){
			Object tipo = JOptionPane.showInputDialog(null, "Selecciona el tipo de conversión", "Conversor",JOptionPane.QUESTION_MESSAGE, null, new Object[] { "Moneda", "Distancia" }, null);
			
			if(tipo == "Moneda") {
				Object conversion = JOptionPane.showInputDialog(null, "Selecciona una opción", "Conversor - "+tipo,JOptionPane.QUESTION_MESSAGE, null,
						new Object[] {"MXN a USD","MXN a EUR","MXN a GBP","MXN a JPY","MXN a KRW","USD a MXN","EUR a MXN","GBP a MXN","JPY a MXN","KRW a MXN"} , null);
				String cantidadSTR= JOptionPane.showInputDialog(null,"Ingresa la cantidad:", "0.00");
				double cantidad = 0.0;
				int errores = 0;
				try{
					cantidad=Double.parseDouble(cantidadSTR);
				}catch(NumberFormatException ex){
					errores = 1;
					JOptionPane.showMessageDialog(null, "El dato ingresado debe ser un número", "ERROR",JOptionPane.ERROR_MESSAGE);
				}
				String moneda1 = "";
				String moneda2 = "";
				
				if(conversion == "MXN a USD") {
					cantidad = cantidad * (0.050);
					moneda1 = "MXN";
					moneda2 = "USD";
				}
				else if(conversion == "MXN a EUR") {
					cantidad = cantidad * (0.049);
					moneda1 = "MXN";
					moneda2 = "EUR";
				}
				else if(conversion == "MXN a GBP") {
					cantidad = cantidad * (0.042);
					moneda1 = "MXN";
					moneda2 = "GBP";
				}
				else if(conversion == "MXN a JPY") {
					cantidad = cantidad * (6.77);
					moneda1 = "MXN";
					moneda2 = "JPY";
				}
				else if(conversion == "MXN a KRW") {
					cantidad = cantidad * (65.77);
					moneda1 = "MXN";
					moneda2 = "KRW";
				}
				else if(conversion == "USD a MXN") {
					cantidad = cantidad * (20.18);
					moneda1 = "USD";
					moneda2 = "MXN";
				}
				else if(conversion == "EUR a MXN") {
					cantidad = cantidad * (20.35);
					moneda1 = "EUR";
					moneda2 = "MXN";
				}
				else if(conversion == "GBP a MXN") {
					cantidad = cantidad * (24.05);
					moneda1 = "GBP";
					moneda2 = "MXN";
				}
				else if(conversion == "JPY a MXN") {
					cantidad = cantidad * (0.15);
					moneda1 = "JPY";
					moneda2 = "MXN";
				}
				else if(conversion == "KRW a MXN") {
					cantidad = cantidad * (0.015);
					moneda1 = "KRW";
					moneda2 = "MXN";
				}
				
				if(errores != 1){
					cantidad = Math.round(cantidad*100.0)/100.0;
					JOptionPane.showMessageDialog(null,"Entrada:   "+cantidadSTR +"  " +moneda1 +"\nSalida:      " +cantidad +"  " +moneda2, "Resultados", JOptionPane.INFORMATION_MESSAGE); 
				}
				
			}
			
			if(tipo == "Distancia") {
				Object conversion = JOptionPane.showInputDialog(null, "Selecciona una opción", "Conversor - "+tipo, JOptionPane.QUESTION_MESSAGE, null,
					new Object[] {"metro a pie","centímetro a pulgada","pie a metro","pulgada a centimetro"} , null);
				String cantidadSTR= JOptionPane.showInputDialog(null,"Ingresa la cantidad:", "0.00");
				
				double cantidad = 0.0;
				int errores = 0;
				try{
					cantidad=Double.parseDouble(cantidadSTR);
				}catch(NumberFormatException ex){
					errores = 1;
					JOptionPane.showMessageDialog(null, "El dato ingresado debe ser un número", "ERROR",JOptionPane.ERROR_MESSAGE);
				}
				
				String longitud1 = "";
				String longitud2 = "";
				
				if(conversion == "metro a pie") {
					cantidad = cantidad * (3.28084);
					longitud1 = "metro";
					longitud2 = "pie";
				}
				else if(conversion == "centímetro a pulgada") {
					cantidad = cantidad * (0.393701);
					longitud1 = "centímetro";
					longitud2 = "pulgada";
				}
				else if(conversion == "pie a metro") {
					cantidad = cantidad * (0.3048);
					longitud1 = "pie";
					longitud2 = "metro";
				}
				else if(conversion == "pulgada a centimetro") {
					cantidad = cantidad * (2.54);
					longitud1 = "pulgada";
					longitud2 = "centímetro";
				}
				
				if(errores != 1){
					cantidad = Math.round(cantidad*1000.0)/1000.0;
					JOptionPane.showMessageDialog(null,"Entrada:   "+cantidadSTR +"  " +longitud1 +"\nSalida:      " +cantidad +"  " +longitud2, "Resultados", JOptionPane.INFORMATION_MESSAGE);
				}
			}
				
			salir = JOptionPane.showConfirmDialog(null, "¿Deseas hacer otra conversión?","Finalizar", JOptionPane.YES_NO_OPTION);
			if(salir == 1){
				JOptionPane.showMessageDialog(null, "Fin del Programa", "Conversor",JOptionPane.INFORMATION_MESSAGE);
			}
			
		}
		
	}

}
