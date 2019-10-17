
package examen2.inscripciones;

import java.util.ArrayList;
import java.util.List;


public class Curso {
    private String nombreCurso;
    private int cupo;
    private float notaAprovacion;
    private List<Inscripcion> inscripciones;

    public Curso(int cupo,float notaAprovacion) {
        super();
        this.cupo = cupo;
        this.notaAprovacion = notaAprovacion;
        this.inscripciones = new ArrayList();
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }
    
    

    public void setInscripciones(List<Inscripcion> inscripciones) {
        this.inscripciones = inscripciones;
    }

    public List<Inscripcion> getInscripciones() {
        return inscripciones;
    }

    @Override
    public String toString() {
        return "Curso{" + "nombreCurso=" + nombreCurso + ", cupo=" + cupo + ", notaAprovacion=" + notaAprovacion + '}';
    }

    
    
    

    

    

    

    
    
    

    
    
        
}
