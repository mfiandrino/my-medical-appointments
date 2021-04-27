package models;

import java.util.ArrayList;
import java.util.Date;

public class Patient extends User
{
    //------ATTRIBUTES----//
    private String birthday;
    private double weight;
    private double height;
    private String blood;
    private ArrayList<AppointmentDoctor> appointmentDoctors = new ArrayList<>();

    //--------CONSTRUCTOR--------------//
    public Patient(String name, String email)
    {
        super(name,email);
    }

    //-------GETTERS AND SETTERS---------//
    public ArrayList<AppointmentDoctor> getAppointmentDoctors()
    {
        return appointmentDoctors;
    }

    public void addAppointmentDoctors(Doctor doctor, Date date, String time)
    {
        AppointmentDoctor appointmentDoctor = new AppointmentDoctor(this, doctor);
        appointmentDoctor.schedule(date,time);
        appointmentDoctors.add(appointmentDoctor);
    }

    public void setWeight(double weight)
    {
        this.weight = weight;
    }

    public String getWeight()
    {
        return this.weight + " Kg.";
    }

    public String getHeight()
    {
        return height + " Mts.";
    }

    public void setHeight(double height)
    {
        this.height = height;
    }

    public String getBirthday()
    {
        return birthday;
    }

    public void setBirthday(String birthday)
    {
        this.birthday = birthday;
    }

    public String getBlood()
    {
        return blood;
    }

    public void setBlood(String blood)
    {
        this.blood = blood;
    }

    //-----TO STRING-----//
    @Override
    public String toString()
    {
        return super.toString() + "\nAge: " + birthday + "\n Weight: " +getWeight()+ "\n Height"+getHeight()+"\nBlood"+blood;
    }

    //--------ABSTRACT METHOD IMPLEMENTATION--------/
    @Override
    public void showDataUser()
    {
        System.out.println(toString());
    }

}