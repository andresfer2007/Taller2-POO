package sistemacarga;

public class SistemaCarga {

    public static void main(String[] args) {
        EstacionDeCarga estacion = new EstacionDeCarga();

        VehiculoElectrico v1 = new VehiculoElectrico("Tesla", "Model 3");
        VehiculoElectrico v2 = new VehiculoElectrico("Nissan", "Leaf");
        VehiculoElectrico v3 = new VehiculoElectrico("Chevrolet", "Bolt");

        estacion.registrarVehiculo(v1);
        estacion.registrarVehiculo(v2);
        estacion.registrarVehiculo(v3);

        System.out.println("=== ANTES DE CARGAR ===");
        estacion.mostrarVehiculos();

        estacion.suministrarEnergia();

        System.out.println("=== DESPUÉS DE CARGAR ===");
        estacion.mostrarVehiculos();
    }
    
}
