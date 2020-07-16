package Superpowers;


import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class HumanTest {

    @Test
    public void constructorTest(){
        String expectedName = "Andre Benjamin";
        String expectedGender = "Male";
        String expectedOccupation = "Janitor";
        LocalDate expecteddob = LocalDate.of(2001,10,19);
        Integer expectedid = 9801;
        Integer expectedyear = 19;

        Human person = new Person(expectedName, expectedGender, expectedOccupation, expecteddob, expectedid);
        person.setName(expectedName);
        person.setGender(expectedGender);
        person.setOccupation(expectedOccupation);
        person.setDob(expecteddob);
        person.setId(expectedid);
        
        Assert.assertEquals("Andre Benjamin", person.getName());
        Assert.assertEquals("Male", person.getGender());
        Assert.assertEquals("Janitor", person.getOccupation());
        Assert.assertEquals(expecteddob,person.getDob());
        Assert.assertEquals(expectedid, person.getId());
        Assert.assertEquals(expectedyear, person.getAge());
        //String expectedString = expectedName + " " + expectedGender + " " + expectedOccupation +" "+ expecteddob +" "+ expectedid;

        //Assert.assertTrue(expectedString.equals(human.toString()));
    }
}
