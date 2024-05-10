package Interfac;

import Interfac.Person.Family;

class InnerClass
{
    public static void main(String[] args) 
    {
        Person p=new Person();
        p.dispPerson();

        Person.Address a=p.new Address(); // after outer class object
        a.dispPersonAdd();

     //  Person.Family f=new Person.Family();
      // f.dispPersonFamily();
      // Person.Family.dispPersonFamily();
        Family.dispPersonFamily();
    }
}
class Person
{
    String name;
    int age;

    public void dispPerson()
    {
        System.out.println("person class details outer class");
    }

    class Address
    {
        String state;
        String city;
        int pincode;

        public void dispPersonAdd()
    {
        System.out.println("adress class details inner class");
    }
    }

    static class Family
    {
        int familyMember;
        String Surname;

        public static void dispPersonFamily()
        {
            System.out.println("family class details inner class static");
        }

    }

}
