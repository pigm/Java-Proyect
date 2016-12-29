import java.util.ArrayList;
import java.util.Collections;
// @author Pablo
public class RegistroClientes {
    public static ArrayList <Cliente> clts = new ArrayList<>();
     
    public static boolean agregarClientes(Cliente cliente)throws Exception{
        boolean existe = false;
        for (Cliente aux : clts) {
            if (aux.getRut().equalsIgnoreCase(cliente.getRut()) && aux.getGuionRut().equalsIgnoreCase(cliente.getGuionRut())) {
                existe = true;
                break;
            }
        }
        if (existe) {
            throw new Exception("Cliente ya existe");
        } else {
            clts.add(cliente);
        }
        return existe;
    }

    public static ArrayList<Cliente> listarPersonas(){
        Collections.sort(clts);
        return clts;    
    }
    
    /*public static String buscarClientesPorLetra(String letra) throws Exception{
        
     for (Cliente aux : clts) {  
        if (aux.getNombre().substring(0,1).equalsIgnoreCase(letra) && 
            letra.equalsIgnoreCase("a") ||  letra.equalsIgnoreCase("b")
          ||letra.equalsIgnoreCase("c") ||  letra.equalsIgnoreCase("d")
          ||letra.equalsIgnoreCase("e") ||  letra.equalsIgnoreCase("f")
          ||letra.equalsIgnoreCase("g") ||  letra.equalsIgnoreCase("h")
          ||letra.equalsIgnoreCase("i") ||  letra.equalsIgnoreCase("j")
          ||letra.equalsIgnoreCase("k") ||  letra.equalsIgnoreCase("l")
          ||letra.equalsIgnoreCase("m") ||  letra.equalsIgnoreCase("n")
          ||letra.equalsIgnoreCase("ñ") ||  letra.equalsIgnoreCase("o")
          ||letra.equalsIgnoreCase("p") ||  letra.equalsIgnoreCase("q")
          ||letra.equalsIgnoreCase("r") ||  letra.equalsIgnoreCase("s")     
          ||letra.equalsIgnoreCase("t") ||  letra.equalsIgnoreCase("u")
          ||letra.equalsIgnoreCase("v") ||  letra.equalsIgnoreCase("w")
          ||letra.equalsIgnoreCase("x") ||  letra.equalsIgnoreCase("y")     
          ||letra.equalsIgnoreCase("z") ) {
            
            listarPersonas();
        }
        else{
            throw new Exception(", ingrese un caracter valido.");
        }
      }
       return "";
     
    }*/
    
    public static int cantidadDePersonas(){
        return clts.size();
    }
    
    
    public static String buscarXRut(String rut, String guionRut){
        String lisXrut = null;
        for (Cliente aux : clts) {
            if (aux.getRut().equalsIgnoreCase(rut) && aux.getGuionRut().equalsIgnoreCase(guionRut)) {
              lisXrut =  aux.toString();
              break;
            }
        }
        
        return lisXrut;
    }
    
      public static boolean editarCliente(Cliente cliente){
        boolean clienteEditado = false;
        for(int x = 0; x < clts.size(); x++){
            if(clts.get(x).getRut().equalsIgnoreCase(cliente.getRut()) && clts.get(x).getGuionRut().equalsIgnoreCase(cliente.getGuionRut())){
                try {
                    clts.get(x).setDireccion(cliente.getDireccion());
                    clts.get(x).setEstadoCivil(cliente.getEstadoCivil());
                    clts.get(x).setPais(cliente.getPais());
                    clienteEditado = true;
                    break;
                } catch (Exception ex) {
                    System.out.println("Se ha producido una excepcion de tipo "+ex);
                }
                
            }
        }
        return clienteEditado;
    }
    
   public static boolean eliminar(String rut, String guionRut){
      boolean eliminado = false;
       for (int x = 0; x < clts.size(); x++) {
           if (clts.get(x).getRut().equalsIgnoreCase(rut) && clts.get(x).getGuionRut().equalsIgnoreCase(guionRut)) {
              clts.remove(x);
              eliminado = true;
              break;
            }
       }
       return eliminado;
    } 

   public static Cliente buscarPersona(String rut, String guionRut){
        Cliente retorno = null;
        for(Cliente aux : clts){
           if(aux.getRut().equalsIgnoreCase(rut) && aux.getGuionRut().equalsIgnoreCase(guionRut)){
               retorno = aux;
               break;
           } 
        }
        return retorno;        
    }

   public static boolean validarUsuario(String nombre, String clave){
      boolean esValido = false;
       for (Cliente aux : clts) {
           if (aux.getNombre().equals(nombre)) {
               esValido = true;
               break;
           } 
       }
       return esValido;
   }


}   
