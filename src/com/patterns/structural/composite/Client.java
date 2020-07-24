package com.patterns.structural.composite;

public class Client {
    public static void main(String[] args) {

        CEO ceo = new CEO("MF001","Stephen Murdoch","CEO, Micro Focus");
        CTO cto = new CTO("MF002","John Delk","CTO, Micro Foucs");

        VP VP1  = new VP("MF003","Shreehari Seetaramashastry","VP, Micro Focus");
        VP VP2  = new VP("MF004","Baha Masoud","VP, Micro Focus");
        VP vp3 = new VP("MF005","Tony Donn","VP, Micro Focus");

        Director director = new Director("MF006","Jotya Shetty","Director, Micro Focus");
        Director director2 = new Director("MF007","Rekha B","Director, Micro Focus");
        Director director3 = new Director("MF017","XYZ B","Director, Micro Focus");

        Manager manager1 = new Manager("MF008","Vinayak Hegde","Manager, MF");
        Manager manager2 = new Manager("MF009","Nesbat Farnadis","Manager, MF");
        Manager manager3 = new Manager("MF019","Abhishek Farnadis","Manager, MF");

        Employee emp1 = new Employee("MF100","Abhi Patil","SDE, MF");
        Employee emp2 = new Employee("MF101","Krish kadka","SDE, MF");
        Employee emp3 = new Employee("MF103","Shek Patil","SDE, Micro Focus");
        Intern emp4 = new Intern("MF105","intern 1","SDE Intern, MF");
        Intern emp5 = new Intern("MF106","intern 2","SDE Intern, MF");
        Intern emp6 = new Intern("MF107","intern 3","SDE Intern, MF");

        ceo.setEmployees(cto);

        cto.setEmployees(VP1);
        cto.setEmployees(VP2);
        cto.setEmployees(vp3);

        VP1.setEmployees(director);
        VP2.setEmployees(director2);
        vp3.setEmployees(director3);

        director.setEmployees(manager1);
        director2.setEmployees(manager2);
        director3.setEmployees(manager3);

        manager1.setEmployees(emp1);
        manager1.setEmployees(emp4);
        manager2.setEmployees(emp2);
        manager2.setEmployees(emp5);
        manager3.setEmployees(emp3);
        manager3.setEmployees(emp6);

        ceo.getDetails();
        System.out.println("------------------------*************************---------------------");

        cto.getDetails();
        System.out.println("------------------------*************************---------------------");

        director.getDetails();
        System.out.println("------------------------*************************---------------------");

        director2.getDetails();
        System.out.println("------------------------*************************---------------------");

        director3.getDetails();
        System.out.println("------------------------*************************---------------------");

        manager1.getDetails();
        System.out.println("------------------------*************************---------------------");

        manager2.getDetails();
        System.out.println("------------------------*************************---------------------");

        manager3.getDetails();
        System.out.println("------------------------*************************---------------------");

        emp1.getDetails();
        emp5.getDetails();

    }
}
