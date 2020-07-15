package Superpowers;


import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class HumanTest {

    @Test
    public void setIdTest(){
        // Given
        Superhumans superhuman = new Superhumans();

        // When
        superhuman.setId(01);
        Integer expected = 01;
        Integer actual = superhuman.getId();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getIdTest(){
        // Given
        Superhumans superhuman = new Superhumans();
        // When
        superhuman.setId(02);
        Integer expected = 02;
        Integer actual = superhuman.getId();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setGenderTest(){
        // Given
        Superhumans superhuman = new Superhumans();
        // When
        superhuman.setGender("Male");
        String expected = "Male";
        String actual = superhuman.getGender();
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getGenderTest(){
        // Given
        Superhumans superhuman = new Superhumans();
        // When
        superhuman.setGender("Female");
        String expected = "Female";
        String actual = superhuman.getGender();
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setOccupationTest(){
        // Given
        Superhumans superhuman = new Superhumans();

        // When
        superhuman.setOccupation("Janitor");
        String expected = "Janitor";
        String actual = superhuman.getOccupation();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getOccupationTest(){
        // Given
        Human superhuman = new Superhumans();

        // When
        superhuman.setOccupation("Software Engineer");
        String expected = "Software Engineer";
        String actual = superhuman.getOccupation();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setNameTest(){
        // Given
        Superhumans superhuman = new Superhumans();
        // When
        superhuman.setName("All Might");
        String expected = "All Might";
        String actual = superhuman.getName();
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getNameTest(){
        // Given
        Superhumans superhumans = new Superhumans();

        // When
        superhumans.setName("Lemillion");
        String expected = "Lemillion";
        String actual = superhumans.getName();
        // Then
        Assert.assertEquals(expected, actual);
    }
}
