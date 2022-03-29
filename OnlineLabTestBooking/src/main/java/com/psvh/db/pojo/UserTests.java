package com.psvh.db.pojo;

 

import java.text.SimpleDateFormat;

import java.util.Date;

 

import javax.persistence.Column;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;

import javax.persistence.GenerationType;

import javax.persistence.Id;

import javax.persistence.SequenceGenerator;

import javax.persistence.Table;

import javax.persistence.Temporal;

import javax.persistence.TemporalType;

 

@Entity @Table(name="Tests")

public class UserTests {

          

           @Id

           @SequenceGenerator(name="seq_UserTests", sequenceName = "sqUserTests", initialValue = 1, allocationSize=1)

           @GeneratedValue(generator="seq_UserTests", strategy=GenerationType.SEQUENCE)

           @Column(name="OrderNo")

           private int id;

           @Column(length=20)

           private String username;

           @Column(length=30)

           private String name;

           @Column(length=3)

           private int age;

           @Column(length=30)

           private String address1;

           @Column(length=30)

           private String address2;

           @Column(length=15)

           private String city;

           @Column(length=12)

           private String test;

           @Column(length=8)

           private String rate;

           @Temporal(TemporalType.DATE)

           private Date testdate;

           @Column(length=20)

           private String status;

          

           public int getId() {

                      return id;

           }

           public void setId(int id) {

                      this.id = id;

           }

           public String getUsername() {

                      return username;

           }

           public void setUsername(String username) {

                      this.username = username;

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

           public String getAddress1() {

                      return address1;

           }

           public void setAddress1(String address1) {

                      this.address1 = address1;

           }

           public String getAddress2() {

                      return address2;

           }

           public void setAddress2(String address2) {

                      this.address2 = address2;

           }

           public String getCity() {

                      return city;

           }

           public void setCity(String city) {

                      this.city = city;

           }

           public String getTest() {

                      return test;

           }

           public void setTest(String test) {

                      this.test = test;

           }

           public String getRate() {

                      return rate;

           }

           public void setRate(String rate) {

                      this.rate = rate;

           }

          

           public Date getTestdate() {

                      return testdate;

           }

           public void setTestdate(Date testdate) {

                      this.testdate = testdate;

           }

           public String getStatus() {

                      return status;

           }

           public void setStatus(String status) {

                      this.status = status;

           }

          

           public UserTests() {};

          

          

           public UserTests(String username, String name, int age, String address1, String address2, String city, String test,

                                 String rate, Date testdate, String status) {

                      super();

                      this.username = username;

                      this.name = name;

                      this.age = age;

                      this.address1 = address1;

                      this.address2 = address2;

                      this.city = city;

                      this.test = test;

                      this.rate = rate;

                      this.testdate = testdate;

                      this.status = status;

           }

          

          

}