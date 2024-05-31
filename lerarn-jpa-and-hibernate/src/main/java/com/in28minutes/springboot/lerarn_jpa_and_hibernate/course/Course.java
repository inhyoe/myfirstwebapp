package com.in28minutes.springboot.lerarn_jpa_and_hibernate.course;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
//        (name = "Course_Details")
public class Course {

   @Id
   private long id;
   //   @Column(name = "name")
   private String name;
   //   @Column(name = "author")
   private String author;

   public Course() {
   }

   public Course(long id, String name, String author) {
      this.id = id;
      this.name = name;
      this.author = author;
   }

   public long getId() {
      return id;
   }

   public String getName() {
      return name;
   }

   public String getAuthor() {
      return author;
   }

   @Override
   public String toString() {
      return "Course{" +
              "id=" + id +
              ", name='" + name + '\'' +
              ", author='" + author + '\'' +
              '}';
   }
}
