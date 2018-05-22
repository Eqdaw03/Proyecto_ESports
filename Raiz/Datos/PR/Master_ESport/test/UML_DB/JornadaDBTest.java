package UML_DB;

import UML.Jornada;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import master_esport.Master_ESport;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Eqdaw03
 */

/**
 * Test para insertar jornada
 */

public class JornadaDBTest {
    
    public JornadaDBTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

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
     * Test para insertar una jornada
     */
    
    @Test
    public void testInVerJornada() throws Exception {
        
        Jornada ajornada = new Jornada(crearFecha("12/05/20"),crearFecha("12/06/21"));
        
        System.out.println("inVerJornada");
        Jornada jornada = ajornada;
        JornadaDB instance = new JornadaDB();
        Jornada expResult = ajornada;
        Jornada result = instance.inVerJornada(jornada);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
