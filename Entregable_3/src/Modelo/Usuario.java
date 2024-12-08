package Modelo;

public class Usuario {
    private int ID;
    private int IDPersona;
    private String email;
    private String password;
    private boolean aceptaTerminos;
    
    public Usuario() {				//para UsuarioDAOImpl
    	
    }

    public Usuario(int ID, int IDPersona, String email, String password, boolean aceptaTerminos) {
        super();
        this.ID = ID;
        this.IDPersona = IDPersona;
        this.email = email;
        this.password = password;
        this.aceptaTerminos = aceptaTerminos;
    }

    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
    public int getIDPersona() {
        return IDPersona;
    }
    public void setIDPersona(int IDPersona) {
        this.IDPersona = IDPersona;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public boolean getAceptaTerminos() {
        return aceptaTerminos;
    }
    public void setAceptaTerminos(boolean aceptaTerminos) {
        this.aceptaTerminos = aceptaTerminos;
    }



}