//  TODO: ここでパスの管理をする
package com.in28minutes.rest.webservices.restfulwebservices.user;

import java.util.Date;

import javax.validation.constraints.Size;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.Past;

// notes for Swagger
@ApiModel(description = "All details about the user. ")
public class User {

    private Integer id;

    // Validation
    @Size(min = 2, message = "Name should have atleast 2 characters")
    // notes for Swagger
    @ApiModelProperty(notes = "Name should have atleast 2 character")
    private String name;

    // Validation
    @Past
    // notes for Swagger
    @ApiModelProperty(notes = "Birth date should be in the past")
    private Date birthDate;

    protected User() {
    }

    public User(Integer id, String name, Date birthDate) {
        super();
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return String.format("User [id=%s, name=%s, birthDate=%s]", id, name, birthDate);
    }
}
