package com.patterns.creational.prototype;

public class Person implements Cloneable {
    String name;
    int age;
    String nationality;
    String state;
    String language;

    public Person(String name, int age){
        this.age=age;
        this.name=name;
    }

    //Assume Loads data from Database
    public void loadDetails(){

        this.nationality = "Indian";
        this.state = "Karnataka";
        this.language = "Kannada";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void getDetails(){
        System.out.println("Name : "+this.name +" Age : "+this.age+" Nationality : "+this.nationality+
                " State :"+this.state +" Language : "+this.language);
    }
    @Override
    protected Person clone() throws CloneNotSupportedException {
        Object obj = null;
        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        return (Person) obj;
    }
}
