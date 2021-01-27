package com.lambdaschool.usermodel.models;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class UserRolesId implements Serializable {
    private long user;
    private long role;

    public UserRolesId() {
    }

    public UserRolesId(long user, long role) {
        this.user = user;
        this.role = role;
    }

    public long getUser() {
        return user;
    }

    public void setUser(long user) {
        this.user = user;
    }

    public long getRole() {
        return role;
    }

    public void setRole(long role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
//        definitely return true of it equals itself
        if (this == o) return true;
//        If o isn't even a UserRole object then definitely it is false.


//        Johns lecture comparison
        if ( o == null || this.getClass() !=o.getClass()) return false;

//        Now lets compare a This and That Object
        UserRolesId that = (UserRolesId) o; // This converts o our (object) into a type of UserRole called that.

//        Johns lecture comparison
        return this.user == that.user &&
                this.role == that.role;

    }

    //    Skip the hashcode when using Spring.
    @Override
    public int hashCode() {
//        Return any number you want.
        return 22;
    }
}
