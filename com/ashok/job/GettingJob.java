package com.ashok.job;
 
import java.util.ArrayList;
import java.util.List;
 
class Person {
   private String name;
   private List<String> skills;
   private String type ;
 
   @SuppressWarnings("unused")
public Person(String name, List<String> skills, String type) {
      http://this.name = name;
      this.skills = skills;
      this.type = type;
   }
 
   @Override
   public String toString() {
      return "Person [name=" + name + ", skills=" + skills + ", type=" + type + "]";
   }
}
 
public class GettingJob {
   public static void main(String[] args) {
      List<String> fresherSkills = new ArrayList<String>();
      fresherSkills.add("Java Core Basics");
      fresherSkills.add("Arrays");
      fresherSkills.add("Operators");
      fresherSkills.add("Flow Controls");
      fresherSkills.add("OOP Concepts");
      fresherSkills.add("Classes");
      fresherSkills.add("Interfaces");
      fresherSkills.add("Collection Framework");
      fresherSkills.add("Multithreading");
      fresherSkills.add("Exception Handling");
      fresherSkills.add("Files");
 
      Person fresher = new Person("Ashok", fresherSkills, "Fresher");
      System.out.println(fresher);
      
      List<String> expSkills = new ArrayList<String>();
      expSkills.add("Java Indepth Concepts");
      expSkills.add("JVM Internal Structure");
      expSkills.add("Design Patterns");
      expSkills.add("Regular Expressions");
      expSkills.add("OO Design");
      expSkills.add("MVC");
      expSkills.add("Java Frameworks (Spring, Hibernate etc)");
      expSkills.add("Loggers");
      expSkills.add("JSVC");
      expSkills.add("Multithreading Locking Mechanism");
 
      Person exp = new Person("Ashok", expSkills, "Fresher");
      System.out.println(exp);
   }
}
