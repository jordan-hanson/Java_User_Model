package com.lambdaschool.usermodel.models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "userroles")
public class UserRoles implements Serializable {
    @Id
    @ManyToOne
    @JoinColumn(name = "userid")
    @JsonIgnoreProperties(value = "roles")
    private User user;

    @ManyToOne
    @JoinColumn(name = "roleid")
    @JsonIgnoreProperties(value = "users")
    @Id
    private Role role;

    public UserRoles(User user, Role role) {
        this.user = user;
        this.role = role;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
//        definitely return true of it equals itself
        if (this == o) return true;
//        If 0 isn't even a UserRole object then definitely it is false.
        if (!(o instanceof UserRoles)) return false;


//        Now lets compare a This and That Object
        UserRoles that = (UserRoles) o; // This converts o our (object) into a type of UserRole called that.

        return ((this.user == null) ? 0 : this.user.getUserid()) ==
                ((that.getUser() == null) ? 0 : that.getUser().getUserid()) &&
                ((this.role == null) ? 0 : this.role.getRoleid()) ==
                        ((that.getRole() == null) ? 0: that.getRole().getRoleid());
    }

    @Override
    public int hashCode() {
        return 1;
    }
}
