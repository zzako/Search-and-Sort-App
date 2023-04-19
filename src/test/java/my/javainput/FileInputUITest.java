/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package my.javainput;

import java.sql.SQLException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author user
 */
public class FileInputUITest {
    FileInputUI fi= new FileInputUI();
    
    public FileInputUITest() {
    }


    /**
     * Test of upload method, of class FileInputUI.
     */
    @Test
    public void testUpload() {     
    }

    /**
     * Test of search method, of class FileInputUI.
     */
    @Test
    public void testSearch() {
        fi.connectToDatabase();
        fi.search();
            assertEquals(0, fi.model.getRowCount());      
    }

    /**
     * Test of sort method, of class FileInputUI.
     */
    @Test
    public void testSort() {
        fi.connectToDatabase();
        fi.sort();
        if(fi.selectedValue.equals("ID"))
        {
            assertEquals("1", fi.model.getValueAt(0,0));
        }     
        else if(fi.selectedValue.equals("Name"))
        {
            assertEquals("Aiden", fi.model.getValueAt(0,1));
        }
        else if(fi.selectedValue.equals("Surname"))
        {
            assertEquals("Branson", fi.model.getValueAt(0,2));
        }
        else if(fi.selectedValue.equals("Age"))
        {
            assertEquals("21", fi.model.getValueAt(0,3));
        }
        else if(fi.selectedValue.equals("Phonenumber"))
        {
            assertEquals("0115897456", fi.model.getValueAt(0,4));
        }
        else if(fi.selectedValue.equals("Location"))
        {
            assertEquals("CapeTown", fi.model.getValueAt(0,5));
        }
    }

    /**
     * Test of viewAll method, of class FileInputUI.
     */
    @Test
    public void testViewAll() {
        fi.connectToDatabase();
        fi.viewAll();
        assertEquals(20,fi.model.getRowCount());
    }

    /**
     * Test of connectToDatabase method, of class FileInputUI.
     */
    @Test
    public void testConnectToDatabase() {
        String result;
        fi.connectToDatabase();
        try{
        result = fi.con.getCatalog();
        }
        catch(SQLException e){
            result = e.getMessage();
        }
       assertEquals("customerinfo", result);
    }

    /**
     * Test of showData method, of class FileInputUI.
     */
    @Test
    public void testShowData() {
        fi.connectToDatabase();
        fi.showData();
        assertEquals(20,fi.model.getRowCount());
    }

    /**
     * Test of main method, of class FileInputUI.
     */
    @Test
    public void testMain() {
    }
    
}
