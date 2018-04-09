package com.example.sar.bitfiledsparser;

import java.io.Serializable;

public class User implements Serializable {

        private String user_name;
        private Integer height;
        private Integer gender;
        private Integer age;

	  public User(String user_name, Integer height, Integer gender, Integer age){
        this.user_name = user_name;
        this.height = height;
        this.gender = gender;
        this.age = age;
    }

        public String getUser_name() {
        return user_name;
    }
        public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

        public Integer getHeight() {
        return height;
    }
        public void setHeight(Integer height) {
        this.height = height;
    }

        public Integer getGender() {
        return gender;
    }
        public void setGender(Integer gender) {
        this.gender = gender;
    }

        public Integer getAge() {
        return age;
    }
        public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_name='" + user_name + '\'' +
                ", height=" + height +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
