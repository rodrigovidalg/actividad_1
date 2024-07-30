/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author user
 */
public class Cliente extends Persona{
    private String nit;
public Cliente(){}
    public Cliente(String nit, String nombre, String apellido, String direccion, String telefono, String fecha_nacimiento) {
        super(nombre, apellido, direccion, telefono, fecha_nacimiento);
        this.nit = nit;
    }
      public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }
   
    @Override
    public void agregar(){
        System.out.println("Nit: "+this.getNit());
        System.out.println("Nombre: "+this.getNombre());
        System.out.println("Apellido: "+this.getApellido());
        System.out.println("Direccion: "+this.getDireccion());
        System.out.println("Telefono: "+this.getTelefono());
        System.out.println("Fecha Nacimiento: "+this.getFecha_nacimiento());
        System.out.println("---------------------------------");
    }

  
}
