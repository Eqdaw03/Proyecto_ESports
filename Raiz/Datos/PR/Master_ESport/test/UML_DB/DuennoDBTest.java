package UML_DB;

import UML.Duenno;
import UML.Equipo;
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
 * Test de insertar dueño
 */

public class DuennoDBTest {
    
    public DuennoDBTest() {
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
     * Test para insertar un dueño correcto
     */
    
    static Duenno aduenno = new Duenno("Pkaka","Kaka","Lopez","123","duenno");

    @Test
    public void testRegistrarDuenno() throws Exception {
        System.out.println("registrarDuenno");
        Duenno duenno = aduenno;
        DuennoDB instance = new DuennoDB();
        instance.registrarDuenno(duenno);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}
