
package entidades;

public class Alumno {
    private String nombre;
    private String apellido;
    private int edad;
    private String hobbie;
    private String editorCodPreferido;
    private String sistOperativo;

    public Alumno(String nombre, String apellido, int edad, String hobbie, String editorCodPreferido, String sistOperativo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.hobbie = hobbie;
        this.editorCodPreferido = editorCodPreferido;
        this.sistOperativo = sistOperativo;
    }

    public Alumno() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getHobbie() {
        return hobbie;
    }

    public void setHobbie(String hobbie) {
        this.hobbie = hobbie;
    }

    public String getEditorCodPreferido() {
        return editorCodPreferido;
    }

    public void setEditorCodPreferido(String editorCodPreferido) {
        this.editorCodPreferido = editorCodPreferido;
    }

    public String getSistOperativo() {
        return sistOperativo;
    }

    public void setSistOperativo(String sistOperativo) {
        this.sistOperativo = sistOperativo;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", hobbie=" + hobbie + ", editorCodPreferido=" + editorCodPreferido + ", sistOperativo=" + sistOperativo + '}';
    }
    
    
}
