package ru.artbmstu.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.artbmstu.enums.RoleType;

import javax.persistence.*;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "app_Role")
public class Role {

    @ManyToOne
    private User user;

    @Column
    @Enumerated(EnumType.STRING)
    private RoleType roleType = RoleType.USER;

    public Role(User user, RoleType roleType){
        this.user = user;
        this.roleType = roleType;
    }

    @Override
    public String toString(){
        return roleType.name();
    }

}
