package sistemacarga;

public class Bateria {
    double capacidadActual;
    int estadoSalud;
    
    public Bateria(double capacidadInicial, int estadoSalud) {
        this.capacidadActual = capacidadInicial;
        this.estadoSalud = estadoSalud;
    }


    public double getCapacidadActual() {
        return capacidadActual;
    }

    public void setCapacidadActual(double capacidadActual) {
        this.capacidadActual = capacidadActual;
    }

    public int getEstadoSalud() {
        return estadoSalud;
    }
    public void setEstadoSalud(int estadoSalud) {
        //valida la entrada para q sea de 100 a 0
        if (estadoSalud < 0) {
            this.estadoSalud = 0;
        } else if (estadoSalud > 100) {
            this.estadoSalud = 100;
        } else {
            this.estadoSalud = estadoSalud;
        }
    }
    
    
    
    public void usar(double cantidad){
        if(cantidad <= 0){
            System.out.println("Cantidad inválida");
            return;
        }

        if(cantidad > capacidadActual){
            capacidadActual = 0;
        } else {
            capacidadActual = capacidadActual - cantidad;
        }
        // degradación de salud a medida q se usa la bateria
        estadoSalud = estadoSalud-1;
        if(estadoSalud < 0){
            estadoSalud = 0;
        }
    }
}
