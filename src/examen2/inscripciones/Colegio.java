
package examen2.inscripciones;

import java.util.ArrayList;
import java.util.List;


public class Colegio {
    private List<Curso> curso;

    public Colegio() {
        curso=new ArrayList();
    }

    public void setCurso(List<Curso> curso) {
        this.curso = curso;
    }
    
    


    @Override
    public String toString() {
        return "Colegio{" + "curso=" + curso + '}';
    }
    
    
}
