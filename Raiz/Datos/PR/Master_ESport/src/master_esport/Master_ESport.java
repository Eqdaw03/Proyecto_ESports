
package master_esport;
import PARSES.ValidarXml;
import PARSES.clasificacionParse;
import PARSES.todasJornadasParse;
import PARSES.ultimaJornadaParse;
import UML.*;
import UML_DB.*;
import Views.*;
import exceptions.MyException;
import java.text.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import static javax.swing.JOptionPane.showMessageDialog;

public class Master_ESport{
    
    public static DefaultListModel list; //lista de peticiones
    
    static DuennoDB d_DB;
    static EquipoDB e_DB;
    static JugadorDB j_DB;
    static PeticionDB p_DB;
    
    
    public static void main(String[] args) {
            Login login = new Login();
            login.setVisible(true);
    }
    
    public static void crearCalendario(String fecha){
         try {
            ArrayList nombresEquipos = new <String> ArrayList();
            ArrayList equipos = EquipoDB.listaEquipo();
            
            for (int i = 0; i < equipos.size(); i++) {
                Equipo e = (Equipo) equipos.get(i);
                if (e.getJugador().size()>4) {
                    nombresEquipos.add(e.getNombre());
                }
            }
            new Calendario(nombresEquipos, crearFecha(fecha));

        } catch (Exception ex) {
            Logger.getLogger(Master_ESport.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }
    
    /**
     * Esta función nos permite transformar una cadena de texto string en una fecha date
     * y dicha fecha date en una fecha sql
     */
    public static java.sql.Date crearFecha(String stringFecha){
        try {

            SimpleDateFormat format = new SimpleDateFormat("yy/MM/dd");
            Date parsed = format.parse(stringFecha);
            java.sql.Date sql = new java.sql.Date(parsed.getTime());
            return sql;
        } catch (ParseException ex) {
            Logger.getLogger(Master_ESport.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    /**
     * Esta función nos permite cambiar el formato de una fecha
     */
    public static String cambiarFormato(String fecha){
            fecha = fecha.replace("-", "/");
            return fecha;
    }
    
    /**
     * Función para sumar los dias transcurridos en una jornada
     */
    
    public static java.sql.Date sumarDias(java.sql.Date fechaI, ArrayList equipos){
            Calendar cal = Calendar.getInstance();
            cal.setTime(fechaI);
            cal.add(Calendar.DAY_OF_YEAR, 1);
            
            SimpleDateFormat format1 = new SimpleDateFormat("yy/MM/dd");
            String formatted = format1.format(cal.getTime());
            java.sql.Date fechaF = crearFecha(formatted);
            return fechaF;
    }
    
    /**
     * Función para insertar una jornada con sus fechas
     */
    
    public static Jornada insertarJornada(java.sql.Date fechaI, java.sql.Date fechaF){
        Jornada jornada = new Jornada(fechaI, fechaF);
        try {
            jornada = new JornadaDB().inVerJornada(jornada);
        } catch (Exception ex) {
            Logger.getLogger(Master_ESport.class.getName()).log(Level.SEVERE, null, ex);
        }
        return jornada;
    }
    
    /**
     * Función para cargar los parsers
     */
    
    public static void cargarParses(){
        try {
            String[] args = null;
            new clasificacionParse().main(args);
            new todasJornadasParse().main(args);
            new ultimaJornadaParse().main(args);
        } catch (Exception ex) {
            Logger.getLogger(Master_ESport.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Función para validar los xml creados por los parser con xsd
     */
    
    public static void validarXmlvsXsd(){
    
        ValidarXml.validarXmlvsXsd("src/archivosParses/clasificacion.xml", "src/archivosParses/clasificacion.xsd");
        ValidarXml.validarXmlvsXsd("src/archivosParses/resultadoLiga.xml", "src/archivosParses/resultadoLiga.xsd");
    }
    
    public static void insertarPartido(Jornada jornada, java.sql.Date fecha, String equipoLocalNombre, String equipoVisitanteNombre){
    try {
        Partido partido = new Partido();
        partido.setFecha(jornada.getFechaInicio());
        partido.setHora("14:00");
        partido.setJugado(false);
        
        Equipo equipoLocal = EquipoDB.consultarEquipoNom(equipoLocalNombre);
        Equipo equipoVisitante = EquipoDB.consultarEquipoNom(equipoVisitanteNombre);
        new PartidoDB().registrarPartido(partido, jornada,equipoVisitante, equipoLocal);
    } catch (Exception ex) {
        Logger.getLogger(Master_ESport.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
    
    /**
     * Esta función nos permite recoger los datos de un miembro(usuario)
     * y pasarlos a la clase MiembroDB para poder insertar dicho miembro
     */
    public static void crearMiembro(String nickname, String nombre, String apellido, String contrasenna, String permiso) throws Exception{
    
        Miembro m1 = new Miembro(nickname, nombre, apellido, contrasenna, permiso);
        
        MiembroDB.registrarUsuario(m1);

    }

    /**
     * Esta función nos permite recoger los datos de una peticion tipo dueño
     * y pasarlos a la clase PeticionDB para poder realizar dicha peticion
     */
    public static void peticionDuenno(String nickname, String nombre, String apellido, String contrasena, String permiso, String tipo) throws Exception{
    
        p_DB = new PeticionDB();
        
        Duenno d2 = new Duenno();
        
        d2.setNickname(nickname);
        d2.setNombre(nombre);
        d2.setApellido(apellido);
        d2.setContrasenna(contrasena);
        d2.setPermiso(permiso);
        
        p_DB.peticionDuenno(d2, tipo);
    }
    
    /**
     * Esta función nos permite recoger todas las peticiones de tipo dueño que tengamos
     */
    public static ArrayList verPeticionDuenno() throws Exception{
    
        p_DB = new PeticionDB();
        
        return p_DB.listaPetiDuenno();
    }
    
    /**
     * Esta función nos permite ver una peticion de tipo dueño
     */
    public static String verTipoDuenno(){
        
        return PeticionDB.tipoDuenno;
    }
    
    /**
     * Esta función nos permite recoger el nickname de una peticion
     * de tipo dueño o jugador y borrar dicha peticion
     */
    public static void borrarPeticion(String nickname) throws Exception{
        
        p_DB.borrarPeticionDJ(nickname);
    }
    
    /**
     * Esta función nos permite ver todas las peticiones de tipo dueño
     * y meterlas en una lista con su tipo de peticion, su nombre y que permiso tiene
     */
    public static void verPeticionDuennos() throws Exception{
    
        p_DB = new PeticionDB();
        
        list = new DefaultListModel();
        
        try {
                                 
            ArrayList <Duenno> d = p_DB.listaPetiDuenno();
            
            for(int x = 0; x < d.size(); x++){
                
                list.addElement("Tipo Peticion: "+Master_ESport.verTipoDuenno()+ " ,  Nombre: "+d.get(x).getNombre() +" ,  Permiso: "+d.get(x).getPermiso());                                
            }

        }
        catch(Exception e){}

    }
    
    /**
     * Esta función nos permite recoger una peticion de tipo dueño
     * y añadir dicho dueño a la base de datos
     */
    public static void anadirDuenno(Duenno duenno) throws Exception{
    
        d_DB = new DuennoDB();

        d_DB.registrarDuenno(duenno);
    }
    
    /**
     * Esta función nos permite recoger los datos de una peticion tipo equipo con su dueño
     * y pasarlos a la clase PeticionDB para poder realizar dicha peticion
     */
    public static void peticionEquipo(Equipo equipo, Duenno duenno, String tipo) throws Exception{
    
        p_DB = new PeticionDB();
        
        p_DB.peticionEquipo(equipo, duenno, tipo);
    }
    
    /**
     * Esta función nos permite recoger todas las peticiones de tipo equipo que tengamos
     */
    public static ArrayList verPeticionEquipo() throws Exception{
    
        p_DB = new PeticionDB();
        
        return p_DB.listaPetiEquipo();
    }
    
    /**
     * Esta función nos permite ver una peticion de tipo equipo
     */
    public static String verTipoEquipo(){
        
        return PeticionDB.tipoEquipo;
    }
    
    /**
     * Esta función nos permite recoger el nombre de una peticion
     * de tipo equipo y borrar dicha peticion
     */
    public static void borrarPeticionN(String nombre) throws Exception{
    
        p_DB.borrarPeticionE(nombre);
    }
    
    /**
     * Esta función nos permite ver todas las peticiones de tipo equipo
     * y meterlas en una lista con su tipo de peticion, su nombre y que su dueño
     */
    public static void verPeticionEquipos() throws Exception{
        
        p_DB = new PeticionDB();
    
        try {
                                 
            ArrayList <Equipo> d = p_DB.listaPetiEquipo();
            
            for(int x = 0; x < d.size(); x++){
                
                list.addElement("Tipo Peticion: "+Master_ESport.verTipoEquipo()+" ,  Nombre: "+d.get(x).getNombre()+" ,  Dueño: "+d.get(x).getDuenno().getNickname());                                
            }

        }
        catch(Exception e){}
               
    }
    
    /**
     * Esta función nos permite recoger una peticion de tipo equipo con su dueño
     * y añadir dicho equipo a la base de datos
     */
    public static void anadirEquipo(Equipo equipo) throws Exception{
    
        e_DB = new EquipoDB();
        
        Duenno d1 = equipo.getDuenno();
        
        e_DB.registrarEquipo(equipo, d1);
    }
    
    /**
     * Esta función nos permite recoger los datos de una peticion tipo jugador con su equipo
     * y pasarlos a la clase PeticionDB para poder realizar dicha peticion
     */
    public static void peticionJugador(Jugador jugador, Equipo equipo, String tipo) throws Exception{
    
        p_DB = new PeticionDB();
        
        if(equipo == null){
        
            p_DB.peticionJugadorSin(jugador, tipo);
        }
        else{
            
            p_DB.peticionJugadorEquipo(jugador, equipo, tipo);
        }
    }
    
    /**
     * Esta función nos permite recoger todas las peticiones de tipo jugador que tengamos
     */
    public static ArrayList verPeticionJugador() throws Exception{
    
        p_DB = new PeticionDB();
        
        return p_DB.listaPetiJugador();
    }
    
    /**
     * Esta función nos permite ver una peticion de tipo jugador
     */
    public static String verTipoJugador(){
        
        return PeticionDB.tipoJugador;
    }
    
    /**
     * Esta función nos permite ver todas las peticiones de tipo jugador
     * y meterlas en una lista con su tipo de peticion y su nombre
     */
    public static void verPeticionJugadores() throws Exception{
        
        p_DB = new PeticionDB();
    
        try {
                                 
            ArrayList <Jugador> d = p_DB.listaPetiJugador();
            
            for(int x = 0; x < d.size(); x++){
                
                list.addElement("Tipo Peticion: "+Master_ESport.verTipoJugador()+" ,  Nombre: "+d.get(x).getNombre());                                
            }

        }
        catch(Exception e){}
    }
    
    /**
     * Esta función nos permite recoger una peticion de tipo jugador
     * y añadir dicho jugador a la base de datos
     */
    public static void anadirJugador(Jugador jugador) throws Exception{
        
        if(jugador.getEquipo()==null){
        
            JugadorDB.registrarJugadorS(jugador);
        }
        else{
            
            JugadorDB.registrarJugadorConEquipo(jugador);
        }
    }
    
    /**
     * Esta función nos permite ver los equipos
     */
    public static JComboBox datosEquipos(JComboBox jcombo) throws Exception{
    
        ArrayList <Equipo> equipo = EquipoDB.listaEquipo();
        
        for(int x = 0; x < equipo.size(); x++){
        
            jcombo.addItem(equipo.get(x).getNombre());
        }
        
        return jcombo;
    }
    
    /**
     * Esta función nos permite ver que tipo de usuario es
     */
    public static Usuario tipoUsuario(String nickname) throws Exception{
    
        Usuario n1 = AdminDB.consultarUsuarioNik(nickname);
        
        return n1;
    }
    
    /**
     * Esta función nos permite borrar un usuario por su nickname
     */
    public static void borrarUsuario(String nickname) throws Exception{
    
        AdminDB.borrarUsuario(nickname);
    }
    
    /**
     * Esta función nos permite ver los usuarios
     */
    public static JComboBox datosUsuarios(JComboBox jcombo) throws Exception{
    
        ArrayList <Usuario> usuario = AdminDB.listaUsuarios();
        
        for(int x = 0; x < usuario.size(); x++){
          
            jcombo.addItem(usuario.get(x).getNickname());
        }
        
        return jcombo;
    }
    
    /**
     * Esta función nos permite ver los jugadores
     */
    public static JComboBox datosJugadores(JComboBox jcombo) throws Exception{
    
        ArrayList <Jugador> jugador = JugadorDB.listaJugador();
        
        for(int x = 0; x < jugador.size(); x++){
          
            jcombo.addItem(jugador.get(x).getNickname());
        }
        
        return jcombo;
    }

    /**
     * Esta función nos permite saber si un jugador tiene equipo o no
     */
    public static Jugador verJugadorES(String nickname) throws Exception{
    
        Jugador n1 = JugadorDB.consultarJugadorES(nickname);
        
        return n1;
    }
    
    /**
     * Esta función nos permite borrar un jugador
     */
    public static void borrarJugador(String nickname) throws Exception{
    
        JugadorDB.borrarJugadorN(nickname);
    }
    
    /**
     * Función para expreciones irregulares
     */
    public static void validar(int error, String valor, String condicion) throws MyException{
    
        Pattern patron = Pattern.compile(condicion);
        Matcher mat = patron.matcher(valor);
        if(!mat.matches()){
        
            throw new MyException(error);
        }

    }
}
