/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author user
 */
public class Empleado extends Persona{
    private String codigo_empleado, puesto;

    public Empleado(){}
    public Empleado(String codigo_empleado, String puesto, String nombre, String apellido, String direccion, String telefono, String fecha_nacimiento) {
        super(nombre, apellido, direccion, telefono, fecha_nacimiento);
        this.codigo_empleado = codigo_empleado;
        this.puesto = puesto;
    }

    public String getCodigo_empleado() {
        return codigo_empleado;
    }

    public void setCodigo_empleado(String codigo_empleado) {
        this.codigo_empleado = codigo_empleado;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    
    @Override
    public void agregar(){
        System.out.println("Codigo Empleado: "+this.getCodigo_empleado());
        System.out.println("Puesto: "+this.getPuesto());
        System.out.println("Nombre: "+this.getNombre());
        System.out.println("Apellidos: "+this.getApellido());
        System.out.println("Direccion: "+this.getDireccion());
        System.out.println("Telefono: "+this.getTelefono());
        System.out.println("Fecha Nacimiento: "+this.getFecha_nacimiento());
        System.out.println("--------------------------------");
    }

    
}
