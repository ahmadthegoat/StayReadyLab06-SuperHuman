package Superpowers;

import java.time.LocalDate;

public class Superhumans extends Human {

    private String alias;
    private String ability;
    private String catchPhrase;
    private String power;

    public Superhumans(String name, String gender, String occupation, LocalDate dob, Integer id, String alias, String catchPhrase, String ability) {
        super(name, gender, occupation, dob, id);
        this.alias = alias;
        this.ability = ability;
        this.catchPhrase = catchPhrase;
    }

    public void setPower(String power){
        this.power = power;
    }
    public String getPower(String catchPhrase){
        return " ' "+catchPhrase+"'!"+ " "+ power;
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
