package org.example;

import workers.Employee;
import workers.Manager;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {


        Employee employee1 = new Employee ();
        employee1.setName("Иван");
        employee1.setSurname("Разколбаскин");
        employee1.setPosition("Наводчик -Испытатель");
        employee1.setExperience(5);
        employee1.setEducation("Специальносекретное");
        employee1.setSalaryLevel(5_000_000);
        employee1.setDay1(5);
        employee1.setMonth1(8);
        employee1.setYear1(2005);

        Employee employee2 = new Employee ();
        employee2.setName("Григорий");
        employee2.setSurname("Свистопукин");
        employee2.setPosition("Минер-моторист");
        employee2.setExperience(12);
        employee2.setEducation("Специальносекретнотехническое");
        employee2.setSalaryLevel(20_000_000);
        employee2.setDay1(12);
        employee2.setMonth1(10);
        employee2.setYear1(2002);



        // Задание 1.
        // Написать прототип компаратора - метод внутри класса сотрудника, сравнивающий две даты,
        // представленные в виде трёх чисел гггг-мм-дд, без использования условного оператора.

        int result = employee1.compareDates(employee2.getYear1(),employee2.getMonth1(),employee2.getDay1());

        if (result < 0) {
            System.out.println(employee1);
            System.out.println(" появился на свет раньше чем ");
            System.out.println(employee2);
        } else if (result > 0) {
            System.out.println(employee2);
            System.out.println(" появился на свет раньше чем ");
            System.out.println(employee1);
        } else {
            System.out.println(employee1);
            System.out.println(" с одного года ");
            System.out.println(employee2);
        }

        // Задание 2.
        // Опишите класс руководителя, наследник от сотрудника.
        // Перенесите статический метод повышения зарплаты в класс руководителя,
        // модифицируйте метод таким образом, чтобы он мог поднять заработную плату всем, кроме руководителей.
        // В основной программе создайте руководителя и поместите его в общий массив сотрудников.
        // Повысьте зарплату всем сотрудникам и проследите, чтобы зарплата руководителя не повысилась.

        Manager manager = new Manager();
        manager.setName("Селиван");
        manager.setSurname("Главнотухин");
        manager.setPosition("Начальник мачального сектора");
        manager.setExperience(50);
        manager.setEducation("Специальновредительское");
        manager.setSalaryLevel(100);
        manager.setDay1(01);
        manager.setMonth1(01);
        manager.setYear1(1970);

        Employee[] employees = new Employee[3];
        employees[0] = manager;
        employees[1] = employee1;
        employees[2] = employee2;

        manager.increaseSalary(employees, 500);

        for (Employee employee : employees) {
            System.out.println(employee.getName() +" "+employee.getSurname()+ ": " + employee.getSalaryLevel());
        }


    }
    }