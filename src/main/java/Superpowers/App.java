package Superpowers;
import java.time.LocalDate;

import Superpowers.Human;

public class App {
    public static void main(String[] args) {
        Human Jimmy = new Person("Adam Reynolds", "Male", "Engineer", LocalDate.of(1998, 1, 11), 54321);
        System.out.println("Age:"+ Jimmy.getAge()+" \nSex:"+ Jimmy.getGender()+ " \nName:"+ Jimmy.getName() + " \nDOB:"+ Jimmy.getDob()+ " \nID:" + Jimmy.getId());
        Superhumans Megaman = new Superhumans("Reece White", "Obsidian", "Hero", LocalDate.of(1846, 1, 30), 90009, "Iron Shield", "Take that", "Inpenetrable Skin");
        System.out.println("\nAge:"+ Megaman.getAge()+" \nSex:"+ Megaman.getGender()+ " \nName:"+ Megaman.getName() + " \nDOB:"+ Megaman.getDob()+ " \nID:" + Megaman.getId() +" \n\nAlias:"+ Megaman.getAlias()
                + "\nAbility:" + Megaman.getAbility()+"\nCatchphrase:"+ Megaman.getCatchPhrase());
        Megaman.setPower("Clink!");
        System.out.println(Megaman.getPower(Megaman.getCatchPhrase()));;
    }
}
