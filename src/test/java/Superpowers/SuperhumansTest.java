package Superpowers;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class SuperhumansTest {

    @Test
    public void constructorTest(){
        // Given
        String expectedName = "Toshinori Yagi";
        String expectedGender = "Male";
        String expectedOccupation = "Pro Hero";
        String expectedAlias = "All Might";
        String expectedCatchPhrase = "I am.. the Symbol of Peace!";
        String expectedAbility = "One for All";
        Integer expectedId = 01;
        //Affliation goodOrBad = Affliation.good;
        LocalDate expectedDOB = LocalDate.of(1972,6,10);
        // When
        Superhumans AllMight = new Superhumans(expectedName, expectedGender, expectedOccupation, expectedDOB, expectedId, expectedAlias, expectedCatchPhrase, expectedAbility);
        // getters
        String actualAlias = AllMight.getAlias();
        Assert.assertEquals(expectedAlias, actualAlias); // alias test

        String actualName = AllMight.getName();
        Assert.assertEquals(expectedName, actualName); // name test

        String actualGender = AllMight.getGender();
        Assert.assertEquals(expectedGender, actualGender); // gender test

        String actualOccupation = AllMight.getOccupation();
        Assert.assertEquals(expectedOccupation, actualOccupation); // occupation test

        String actualCatchPhrase = AllMight.getCatchPhrase();
        Assert.assertEquals(expectedCatchPhrase, actualCatchPhrase); // catch phrase test

        String actualAbility = AllMight.getAbility();
        Assert.assertEquals(expectedAbility, actualAbility); // ability
    }
}
