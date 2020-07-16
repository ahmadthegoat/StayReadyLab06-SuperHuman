package Superpowers;

import java.time.*;

/**
 * *Complete the 'Human' class in the Superpowers Package that has fields for: name, age, gender,
 * occupation, and address. Also create methods for retreiving and outputing this data to screen.
 * Then create a SuperHuman class and UNIT TEST that subclasses the first with fields for good or bad,
 * hero name, super ability. As before, create methods for retrieving field data and printing to screen.
 */
public abstract class Human {

    private Integer id;
    private String gender;
    private String occupation;
    private String name;
    private LocalDate dob;
    protected Integer age ;


    public Human(String name, String gender, String occupation, LocalDate dob, Integer id) {
        this.name = name;
        this.gender = gender;
        this.occupation = occupation;
        this.dob = dob;
        this.id = id;
            }
    
    public LocalDate getDob(){
        return dob;
    }
    public void setDob(LocalDate dob){
        this.dob = dob;
    }
	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
  //  public void setAge(LocalDate dob){
      //  LocalDate today = LocalDate.of(2020, 07, 15);
       // LocalDate birthday = dob;
       // Period age = Period.between(birthday, today);
        //this.age = age.getYears();

    //}
    public Integer getAge(){
       return LocalDate.now().getYear() - dob.getYear() ;
    }
    @Override
    public boolean equals(Object obj)
{
    return this.toString().equals(obj.toString());
}
}
