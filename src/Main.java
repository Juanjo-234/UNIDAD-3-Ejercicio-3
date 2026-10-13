//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
Termostato termostato = new Termostato(25.0, "Calefacción");

System.out.println("Temperatura inicial: " + termostato.getTemperatura());

termostato.setTemperatura(29.0);
System.out.println("Temperatura actual: " + termostato.getTemperatura() + "°C");

System.out.println("=============================");
System.out.println("CAMBIANDO A 10° (INVALIDA)");
termostato.setTemperatura(10);

}
