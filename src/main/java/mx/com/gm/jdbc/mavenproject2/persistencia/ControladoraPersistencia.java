package mx.com.gm.jdbc.mavenproject2.persistencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import mx.com.gm.jdbc.mavenproject2.logica.Automovil;
import mx.com.gm.jdbc.mavenproject2.persistencia.exceptions.NonexistentEntityException;


public class ControladoraPersistencia {

    AutomovilJpaController autoJpa = new AutomovilJpaController();
    
    
    public void crearAutomovil(Automovil auto) {
        autoJpa.create(auto);
    }

    public List<Automovil> traerCoches() {
        return autoJpa.findAutomovilEntities();
    }

    public void eliminarRegistro(int id_auto) {
        try {
            autoJpa.destroy(id_auto);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Automovil traerAutomovil(int id_auto) {
        return autoJpa.findAutomovil(id_auto);
    }

    public void EditarAutomovil(Automovil auto) {
        try {
            autoJpa.edit(auto);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
}
