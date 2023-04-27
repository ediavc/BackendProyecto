
package com.portafolio.eavc.interfase;

import com.portafolio.eavc.entidad.Persona;
import java.util.List;


public interface IPersonaServicio {
   //Traer una lista de personas
    public List<Persona> getPersona();
    
    //Guardar un objeto de tipo Persona
    public void savePersona (Persona persona);
    
    //Eliminar un objeto pero lo buscamos por ID
    public void deletePersona (Long id);
            
    //Buscar una persona por ID
    public Persona findPersona (Long id);
    
  
}
