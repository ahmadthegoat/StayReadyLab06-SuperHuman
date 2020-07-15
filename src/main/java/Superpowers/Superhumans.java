package Superpowers;

import java.time.LocalDate;

public class Superhumans extends Human {

    private String alias;
    private String ability;
    private String catchPhrase;

    public Superhumans(Integer id, String gender, String occupation, String name, LocalDate dob, String alias, String catchPhrase, String ability) {
        super(id, gender, occupation, name, dob);
        this.alias = alias;
        this.ability = ability;
        this.catchPhrase = catchPhrase;
    }

    public enum affiliation {
        GOOD,
        BAD
    }

    public void setCatchPhrase(String s){
        this.catchPhrase = s;
    }

    public String getCatchPhrase(){
        return catchPhrase;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }

    @Override
    public Integer getId() {
        return super.getId();
    }

    @Override
    public void setId(Integer id) {
        super.setId(id);
    }

    @Override
    public String getGender() {
        return super.getGender();
    }

    @Override
    public void setGender(String gender) {
        super.setGender(gender);
    }

    @Override
    public String getOccupation() {
        return super.getOccupation();
    }

    @Override
    public void setOccupation(String occupation) {
        super.setOccupation(occupation);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
