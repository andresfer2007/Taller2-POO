package sistemacarga;

public class VehiculoElectrico implements Carga  {
    String marca; 
    String modelo;
    Bateria bateria1;
    
    public VehiculoElectrico(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.bateria1 = new Bateria(100.0, 100); 
    /* esto es composicion pq el objeto se crea dentro de la clase vehiculoElectrico 
        y no desde afuera*/
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Bateria getBateria1() {
        return bateria1;
    }

    public void setBateria1(Bateria bateria1) {
        this.bateria1 = bateria1;
    }
    public void mostrarEstado() {
        System.out.println("Vehículo: " + marca + " " + modelo);
        System.out.println("Capacidad: " + bateria1.getCapacidadActual() + " kWh");
        System.out.println("Salud: " + bateria1.getEstadoSalud() + "%");
        System.out.println("--------------------------");
    }
    @Override
    public void cargar(double kwh) {
        if (kwh <= 0) {
            System.out.println("Cantidad inválida");
            return;
        }

        double nuevaCarga = bateria1.getCapacidadActual() + kwh;

        if (nuevaCarga > 100) {
            bateria1.setCapacidadActual(100);
        } else {
            bateria1.setCapacidadActual(nuevaCarga);
        }
    }
    
}
