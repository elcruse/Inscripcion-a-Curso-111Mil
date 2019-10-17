
package Main;
import examen2.inscripciones.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//Jimmy Coa
public  class Test {
    private Curso curso;
    private Alumno alumno;
    private Inscripcion inscripcion;
    private Colegio colegio=new Colegio();
    private List<Curso> cargarColegio= new ArrayList();//pertenece a esta clase
    private List<Inscripcion> listInscripcion= new ArrayList();//pertenece a esta clase
    private int num;
    private Scanner sc= new Scanner(System.in);
    private float nota;
   
    public static void main(String[] args) {
        
        
        Test test=new Test();
        Curso curso = new Curso(50,20);
        curso.setNombreCurso("Tecnicas de Programacion");
        Curso curso1= new Curso(45,18);
        curso1.setNombreCurso("Base de Datos");
        Curso curso2= new Curso(50,19);
        curso2.setNombreCurso("Programacion Orientada a Objetos");
        Curso curso3= new Curso(35,17);
        curso3.setNombreCurso("Desarrollo de Software");
        test.cargarCursoP(curso);
        test.cargarCursoP(curso1);
        test.cargarCursoP(curso2);
        test.cargarCursoP(curso3);
        
        test.alumno = new Alumno(85478589,"vivian","Rodriguez",10);
        test.nota=8;
        Inscripcion inscripcion1=new Inscripcion();
        inscripcion1.setAlumno(test.alumno);
        inscripcion1.setNota(test.nota);
        inscripcion1.setCurso(curso2);
        test.listInscripcion.add(inscripcion1);//aca lo guarde en la lista de esta clase ahora lo tengo que pasar a la otra
        test.curso.setInscripciones(test.listInscripcion);
        
        test.alumno = new Alumno(95692723,"Jimmy","Coa",40);
        test.nota=10;  
        
        Inscripcion inscripcion2=new Inscripcion();
        inscripcion2.setAlumno(test.alumno);
        inscripcion2.setNota(test.nota);
        inscripcion2.setCurso(curso3);
        test.listInscripcion.add(inscripcion2);//aca lo guarde en la lista de esta clase ahora lo tengo que pasar a la otra
        test.curso.setInscripciones(test.listInscripcion);
        
        test.menu();
        
        switch(test.num){
            
            case 1:
                   test.buscarC();
                   break;
            case 2:
               test.sc.nextLine();
               System.out.println("Nombre:"); 
               String nomA=test.sc.nextLine();
               System.out.println("Apellido:");
               String ape=test.sc.nextLine();
               System.out.println("Edad:");
               int edad=test.sc.nextInt();
               System.out.println("DNI:");
               int dni=test.sc.nextInt();
               Alumno alumno=new Alumno(dni,nomA,ape,edad);
               System.out.println("A continuacion Los Cursos y Cupos disponibles:");
               test.buscarC();
               test.sc.nextLine();
               System.out.println("Ingrese Nombre del Curso.");
               String nomC=test.sc.nextLine();
               System.out.println("Ingrese Nota Aprobacion.");
               test.nota=test.sc.nextFloat();
               System.out.println("Ingrese cupos.");
               int cupo=test.sc.nextInt();
               Curso cursox=new Curso(cupo,test.nota);
               cursox.setNombreCurso(nomC);
               test.cargInsc(alumno, cursox, test.nota);//aca paso los datos para la inscripcion
               break;
            case 3:
               
                System.out.println("En construccion");
                break;
            case 4:
                System.out.println("Consultar Notas: ");
                int cod=0;
                for (Inscripcion listaA:test.listInscripcion){
                    System.out.println("Codigo Alumno: "+cod++);
                    System.out.println("Nota: "+listaA.getNota());
                    System.out.println("DNI: "+listaA.getAlumno().getDni());
                    System.out.println("Nombre: "+listaA.getAlumno().getNombre());
                    System.out.println("Apellido: "+listaA.getAlumno().getApellido());
                    System.out.println("Curso: "+listaA.getCurso().getNombreCurso());
                    System.out.println("");
                }
                break;
                
            case 5:
                System.out.println("Cargar Notas:");
                System.out.println("Ingrese el Codigo Alumno:");
                int codi=test.sc.nextInt();
                System.out.println(test.listInscripcion.get(codi).getAlumno().getNombre());
                System.out.println(test.listInscripcion.get(codi).getAlumno().getApellido());
                System.out.println(test.listInscripcion.get(codi).getAlumno().getDni());
                System.out.println("Nota actual:"+test.listInscripcion.get(codi).getNota());
                System.out.println("Ingrese Nota Actualizar: ");
                test.nota=test.sc.nextFloat();
                test.listInscripcion.get(codi).setNota(test.nota);
                System.out.println("Nota Actualizada satisfactoriamente: ");
                System.out.println("Nombre: "+test.listInscripcion.get(codi).getAlumno().getNombre());
                System.out.println("Apellido: "+test.listInscripcion.get(codi).getAlumno().getApellido());
                System.out.println("DNI: "+test.listInscripcion.get(codi).getAlumno().getDni());
                System.out.println("Curso: "+test.listInscripcion.get(codi).getCurso().getNombreCurso());
                System.out.println("Nota: "+test.listInscripcion.get(codi).getNota());         
        }
               
    }
    
    private void cargarCursoP(Curso cur){
        curso=cur;
        cargarColegio.add(curso);
        colegio.setCurso(cargarColegio);
    }
    
    private void buscarC(){
        for(Curso col:cargarColegio){
            System.out.println(col);
        }
    }
    
    private void cargInsc(Alumno alumno,Curso curso,float getNota){
        this.alumno=alumno;
        this.curso=curso;
        this.nota=getNota;
        this.inscripcion=new Inscripcion();
        this.inscripcion.setAlumno(this.alumno);
        this.inscripcion.setCurso(this.curso);
        this.inscripcion.setNota(this.nota);
        this.listInscripcion.add(this.inscripcion);
        curso.setInscripciones(this.listInscripcion);
        
    }
    
    private void menu(){
       
    System.out.println("Introduce un 'Numero' para continuar.");
    System.out.println("1: Consultar Cupos Para un Curso");
    System.out.println("2: Inscripcion de un alumno un curso");
    System.out.println("3: Consultar Fecha de Inscripcion o de Examenes");
    System.out.println("4: Consultar Notas");
    System.out.println("5: Cargar notas");
    System.out.println("6: Cantidad de Alumnos por Curso");
    System.out.println("7: Salir");
    
    num=sc.nextInt();
    
   }
    
    
}
