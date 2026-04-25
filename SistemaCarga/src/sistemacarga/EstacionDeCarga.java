package sistemacarga;

import java.util.ArrayList;

public class EstacionDeCarga {
    // lista de objetos tipo VehiculoElectrico (AGREGACIÓN: la estación usa vehículos externos)
    private ArrayList<VehiculoElectrico> vehiculos;
    //constructor de estacionDeCarga e nicializa la lista de vehículos
    public EstacionDeCarga() {
        vehiculos = new ArrayList<>();
    }
    //metodo para registrar (agrega) un vehículo existente a la estación
    public void registrarVehiculo(VehiculoElectrico v) {
        if (v == null) {
            System.out.println("No se puede registrar un vehículo nulo");
            return;
        }
        vehiculos.add(v);
    }
    //metodo para suministrar la energia a todos los vehiculos dentro del objeto de estacion de carga
    public void suministrarEnergia() {
        for (VehiculoElectrico v : vehiculos) {
            v.cargar(15.0);
        }
    }
    //muestra la informacion con el metodo mostrar estado de cada vehiculo
    public void mostrarVehiculos() {
        for (VehiculoElectrico v : vehiculos) {
            v.mostrarEstado();
        }
    }
}