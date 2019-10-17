
package examen2.inscripciones;

//jimmy coa
public class Inscripcion {
    private Alumno alumno;
    private Curso curso;
    private float nota;

    public Inscripcion() {
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public float getNota() {
        return nota;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public Curso getCurso() {
        return curso;
    }
    

    @Override
    public String toString() {
        return "Inscripcion{" + "alumno=" + alumno + ", curso=" + curso + ", nota=" + nota + '}';
    }
    
    
}
