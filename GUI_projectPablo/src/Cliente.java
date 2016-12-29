import java.util.Locale;

public class Cliente implements Comparable<Cliente> {

    private String nombre;
    private String rut;
    private String guionRut;
    private int edad;
    private String estadoCivil;
    private String direccion;
    private String sexo;
    private String pais;

    public Cliente() {
    }

    public Cliente(String nombre, String rut, String guionRut, int edad,
            String estadoCivil, String direccion,
            String sexo, String pais) throws Exception {
        setNombre(nombre);
        setRut(rut);
        setGuionRut(guionRut);
        setEdad(edad);
        setEstadoCivil(estadoCivil);
        setDireccion(direccion);
        setSexo(sexo);
        setPais(pais);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws Exception {
        if (nombre.trim().length() >= 3 && nombre.trim().length() <= 20) {
            this.nombre = nombre;
        } else {
            throw new Exception(", nombre ingresado no valido.");
        }
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) throws Exception {
        if (pais.trim().length() >= 1) {
            this.pais = pais;
        } else {
            throw new Exception(", pais ingresado no valido.");
        }
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) throws Exception {
        if (rut.trim().length() >= 7 && rut.trim().length() <= 8) {
        this.rut = rut;
        } else {
         throw new Exception(", rut ingresado no valido.");
        }
    }

    public String getGuionRut() {
        return guionRut;
    }

    public void setGuionRut(String guionRut) throws Exception {
        if (guionRut.equalsIgnoreCase("0")
        || guionRut.equalsIgnoreCase("1")
        || guionRut.equalsIgnoreCase("2")
        || guionRut.equalsIgnoreCase("3")
        || guionRut.equalsIgnoreCase("4")
        || guionRut.equalsIgnoreCase("5")
        || guionRut.equalsIgnoreCase("6")
        || guionRut.equalsIgnoreCase("7")
        || guionRut.equalsIgnoreCase("8")
        || guionRut.equalsIgnoreCase("9")
        || guionRut.equalsIgnoreCase("K")) {
        this.guionRut = guionRut;
       } else {
          throw new Exception(", digito verificador ingresado no valido.");
          }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws Exception {
        if (edad >= 18 && edad <= 65) {
            this.edad = edad;
        } else {
            throw new Exception(", edad ingresada no valida.");
        }
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) throws Exception {
        if (estadoCivil.equalsIgnoreCase("Soltero")
                || estadoCivil.equalsIgnoreCase("Casado")
                || estadoCivil.equalsIgnoreCase("Divorsiado")
                || estadoCivil.equalsIgnoreCase("Viudo")) {
            this.estadoCivil = estadoCivil;
        } else {
            throw new Exception(", estado civil ingresado no valido.");
        }
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) throws Exception {
        if (direccion.trim().length() >= 5 && direccion.trim().length() <= 30) {
            this.direccion = direccion;
        } else {
            throw new Exception(", dirección ingresada no valida.");
        }
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) throws Exception {
        if (sexo.equals("Hombre") || sexo.equals("Mujer")) {
            this.sexo = sexo;
        } else {
            throw new Exception(", sexo ingresado no valido.");
        }
    }

    @Override
    public String toString() {
        return "-----------------------------Lista de datos cliente-----------------------------"
                + "\nNombre\t:\t " + getNombre() + "."
                + "\nRut \t:\t " + getRut() + " - " + getGuionRut() + "."
                + "\nEdad\t:\t " + getEdad() + " años."
                + "\nEstado Civil\t:\t " + getEstadoCivil() + "."
                + "\nDirrección\t:\t " + getDireccion() + "."
                + "\nPais\t:\t " + getPais() + "."
                + "\nSexo\t:\t " + getSexo() + "."
                + "\n------------------------------------------------------------------------------------"
                + "\n"
                + "\n";
    }

    @Override
    public int compareTo(Cliente cliente){
        return nombre.compareToIgnoreCase(cliente.getNombre());
    }

    public boolean validacionQl()throws Exception{
        Boolean devuelve = false;
        
        int largo = this.rut.length() -1;
        int constante = 2;
        int suma = 0;
        int valueDigito = this.guionRut.length();
        valueDigito = 0;
        for (int i = largo; i >= 0; i--) {

            suma = suma + Integer.parseInt(this.rut.substring(i,i + 1)) * constante;
            constante++;
            if (constante == 8) {
                constante = 2;
            }
        }
        String ultimo = this.guionRut.substring(0,1).toUpperCase();
        valueDigito = 11 - (suma % 11);
        if (valueDigito == 10 && ultimo.equalsIgnoreCase("K")) {
            devuelve = true;
        } else  if (valueDigito == 11 && ultimo.equalsIgnoreCase("0")) {
            devuelve = true;
        } else if (valueDigito == Integer.parseInt(ultimo)) {
            devuelve = true; 
        }
        else{
          throw new Exception(", rut invalido.");
        }

        return devuelve;

    }

}
