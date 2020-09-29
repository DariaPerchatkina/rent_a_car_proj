package ru.training;
//класс пользователь с полями:
//фамилия
//имя
//номер паспорта (строка из-за пробела междусерией ии номером)
//номер водительского удостоврения (строка из-за пробела междусерией ии номером)
//стаж вождения
public class User {

    private String lastName;
    private String firstName;
    private String passportNumber;
    private String driversLicense;
    private int drivingExp;

    public User(){}

    public User(String lastName, String firstName){
        this.lastName = lastName;
        this.firstName = firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String LastName){
        this.lastName = lastName;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName= firstName;
    }
    public String getPassportNumber(){
        return passportNumber;
    }
    public void setPassNumber(String passportNumber){
        this.passportNumber = passportNumber;
    }
    public  String getDriversLicense(){
        return driversLicense;
    }
    public void setDriversLicense(String driversLicense){
        this.driversLicense= driversLicense;
    }

    public int getDrivingExp() {
        return drivingExp;
    }

    public void setDrivingExp(int drivingExp) {
        this.drivingExp = drivingExp;
    }
}
