public class Termostato {
    private double temperaturactual;
    private String modoOperacion;

    public  Termostato(double temperaturactual, String modoOperacion){
        this.modoOperacion = modoOperacion;
        this.temperaturactual = temperaturactual;
    }
    public double getTemperatura() {
        return temperaturactual;
    }

    public String getModoOperacion() {
        return modoOperacion;
    }

    public void setTemperatura(double nuevaTemperatura) {
       if(nuevaTemperatura >= 15 && nuevaTemperatura <= 30){
           this.temperaturactual = nuevaTemperatura;
           System.out.println("Temperatura establecida con exito: " + this.temperaturactual + "C°");
       }else{
           System.out.println("La temperatura " + nuevaTemperatura + "se encuentra fuera del rango del termostato");
       }
    }


    public void setModoOperacion(String modoOperacion) {
        this.modoOperacion = modoOperacion;
    }

}
