package mx.com.gm.jdbc.mavenproject2.logica;

import java.util.List;
import mx.com.gm.jdbc.mavenproject2.persistencia.ControladoraPersistencia;


public class ControladoraLogica {
    
    ControladoraPersistencia controlPersistencia = new ControladoraPersistencia();

    public void crearAutomovil(String modelo, String marca, String motor, String color, String patente, String cantPuertas) {
        
        Automovil auto = new Automovil();
        
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setMotor(motor);
        auto.setColor(color);
        auto.setPatente(patente);
        auto.setCantPuertas(cantPuertas);
        
        controlPersistencia.crearAutomovil(auto);
        
    }

    public List<Automovil> traerCoches() {
        return controlPersistencia.traerCoches();
    }

    public void eliminarRegistro(int id_auto) {
        controlPersistencia.eliminarRegistro(id_auto);
    }

    public Automovil traerAutomovil(int id_auto) {
       return controlPersistencia.traerAutomovil(id_auto);
    }

    public void EditarAutomovil(Automovil auto,String modelo, String marca, String motor, String color, String patente, String cantPuertas) {
        
        auto.setCantPuertas(cantPuertas);
        auto.setColor(color);
        auto.setMarca(marca);
        auto.setModelo(modelo);
        auto.setMotor(motor);
        auto.setPatente(patente);
        
        controlPersistencia.EditarAutomovil(auto);
    }
    
}
