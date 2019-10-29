

package array2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;


public class DatosPersona {
    
    public String nombre;
    public String apellido;
    public String fecha_naci;
    public String año_actual;
    public String tipo_sangre;
    public String nacionalidad;
    public String identificacion;
    public String telefono;
    public String direccion;
    public String correo_electronico;
    public String genero;

    
    ArrayList<Telefonos> telefonos = new ArrayList<Telefonos>();
    
    public  String  getNombre () {
        return nombre;
    }

    public  void setNombre ( String  nombre ) {
        this.nombre = nombre;
        
    }

    public  String getApellido () {
        return apellido;
    }

    public  void   getApellido ( String  apellido ) {
        this.apellido = apellido;
        
    }

    
    public  String  getTipo_sangre () {
        return tipo_sangre;
    }

    public  void  setTipo_sangre ( String  tipo_sangre ) {
        this.tipo_sangre = tipo_sangre;
    }

    public  String  getNacionalidad () {
        return nacionalidad;
    }

    public  void setNacionalidad ( String  nacionalidad ) {
        this.nacionalidad = nacionalidad;
    }

    public  String  getIdentificacion () {
        return identificacion;
    }

    public  void  setIdentificacion ( String identificación  ) {
        this.identificacion = identificacion;
    }

    public  String  getTelefono () {
        return telefono;
    }

    public  void  setTelefono ( String  telefono ) {
        this.telefono = telefono;
    }

    public  String  getDireccion () {
       return direccion;
    }

    public  void  setDireccion ( String  direccion ) {
        this.direccion = direccion;
    }

    public  String  getCorreo_electronico () {
        return correo_electronico;
    }

    public  int  setCorreo_electronico ( String  correo_electronico ) {
        this.correo_electronico = correo_electronico;
        return 0;
    }

    public  String  getGenero () {
        return genero;
    }

   
    public  void setGenero ( String  genero ) {
        this.genero = genero;
    }

    public void printName () {
        
        System.out.println(this.nombre +" "+this.apellido);      
    }       
       
    public  int  calcEdad () {
           DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
           LocalDate dob = LocalDate.parse(this.fecha_naci, fmt);
           LocalDate newDate = LocalDate.now();
           Period period = Period.between(dob, newDate);
           return period.getYears();


    }

}
