package PARSES;

import UML.Equipo;
import UML_DB.EquipoDB;
import java.util.ArrayList;
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
 * Test de crear xml
 */

public class clasificacionParseTest {
    
    public clasificacionParseTest() {
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
    
    /**
     * test generar xml con la clasificación de los equipos
     */
    
    @Test
    public void testGenerate() throws Exception {
        
        ArrayList <Equipo> aequipo = EquipoDB.listaEquipo();//Recoger los equipos de la base de datos
        
        System.out.println("generate");
        ArrayList ListaEquipos = aequipo;
        String name = "Papa";
        new clasificacionParse().generate(ListaEquipos, name);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
