package ceb.assetManager.domain;

import java.io.Serializable;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="usr")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value={"createdAt","updatedAt"}, allowGetters=true)
public class User extends BaseEntity implements Serializable{
    private static final long serialVersionUID = 8998670127960703252L;
    private String firstName;
    private String lastname;

    @NotBlank
    private String email;

    @NotBlank
    private String password;

    @NotNull
    private Long authorityLevelTypeId;

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return this.lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getAuthorityLevelTypeId() {
        return this.authorityLevelTypeId;
    }

    public void setAuthorityLevelTypeId(Long authorityLevelTypeId) {
        this.authorityLevelTypeId = authorityLevelTypeId;
    }
    
    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void deepCopy(User newUserData){
        this.email = newUserData.getEmail();
        this.firstName = newUserData.getFirstName();
        this.lastname = newUserData.getLastname();
        this.authorityLevelTypeId = newUserData.getAuthorityLevelTypeId();
        this.password = newUserData.getPassword();
    }
}