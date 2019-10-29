
package array2;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;

public  class Persona {

    int ta = Integer.parseInt(JOptionPane.showInputDialog("Digite numero de personas alas que le va a tomar sus datos"));
    
    DatosPersona[] datos = new DatosPersona [ta];
    
    
    public Persona(){
    
      this.mostrarMenu();
}

    private void mostrarMenu(){
        
        int opcion = Integer.parseInt(JOptionPane.showInputDialog("Personas\n"
                + "1-ingresar datos de las personas\n"
                + "2-Mostrar datos persona\n"
                + "3-lista por orden alfabetico\n"
                + "4-cerrar\n"
                + "elija una opcion"));
        this.cargarOpcion(opcion);
    }
     
    public void LeerPersona(){
        JOptionPane.showInputDialog(null, "usted ha escogido ingresar datos de persona");
        for (int i = 0; i < datos.length; i ++){
            datos [i] = new DatosPersona();
            
            int np=i+1;
            
            JOptionPane.showInputDialog("digite los datos de las persona #"+np);
            datos[i].nombre = JOptionPane.showInputDialog("Nombres");
            datos[i].apellido = JOptionPane.showInputDialog("Apellidos");
            datos[i].identificacion = JOptionPane.showInputDialog("Identificacion");
            datos[i].nombre = JOptionPane.showInputDialog("home","3103587248");
            datos[i].fecha_naci = JOptionPane.showInputDialog("Fecha de nacimiento");
            datos[i].calcEdad();
        }
        this.mostrarMenu();
    }

    public void escrbirPersona(){
        for (int i = 0; i<datos.length; i++){
            
            
            int np=i+1;
            
            JOptionPane.showMessageDialog(null, "los datos de la persona #" + np +"son:");
            
            JOptionPane.showMessageDialog(null, "Nombre:" + datos[i].nombre+"\n"
                    + "Apellido:"+ datos[i].apellido+"\n"
                            + "Identificacion:"+ datos[i].identificacion+"\n"
                                    + "Tipo de telefono:"+ datos[i].telefonos.get(0).tipo+" "+datos[i].telefonos.get(0).tipo+"\n"
                    + "Fecha de nacimiento:"+datos[i].fecha_naci+"\n"
                            + "Edad: "+datos[i].calcEdad());
        }
        this.mostrarMenu();
    }
    public  void ordenarPersona(){
        List nombres = new LinkedList<>();
        for (int i=0; i<datos.length; i++){
            
            nombres.add(datos[i].nombre + datos[i].apellido);
        }
        
        Collections.sort(nombres);
        
        for(Object nombre: nombres){
            JOptionPane.showMessageDialog(null,nombre+"\n");
        }
    }
    
    public void cargarOpcion(int op){
        
        switch (op){
            
            case 1:
                this.LeerPersona();
                break;
                
            case 2:
                this.escrbirPersona();
                break;
                
            case 3:
                this.ordenarPersona();
                break;
                
            case 4: 
                JOptionPane.showMessageDialog(null,"Usted ha finalizado el programa");
                break;
                
            default:
                JOptionPane.showMessageDialog(null,"Opcion invalida");
                break;

        }
    }

   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}




