package com.example.student.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Data
@Table(name = "students_list")
public class Students {
    @Id
    private long id;
    private String name;
    private int english;
    private int maths;
    private int social;
    private int tamil;
    private int science;

    private Students(){

    }
    public Students(String name, int english_marks, int maths_marks, int social_marks, int tamil_marks, int science_marks){
        super();
        this.name = name;
        this.english = english_marks;
        this.maths = maths_marks;
        this.social = social_marks;
        this.tamil = tamil_marks;
        this.science = science_marks;

    }

}
