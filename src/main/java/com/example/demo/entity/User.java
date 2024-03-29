package com.example.demo.entity;
import java.util.List;
import javax.persistence.*;
import java.util.ArrayList;

// Add the lombok dependency
import lombok.*;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
public class User {

    private static final long serialVersionUID = 1l;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private long id;
    

    @Column(nullable=false)
    private String name;

        @Column(nullable=false,unique=true)
        private String email;

        @Column(nullable=false)
        private String password;

        @ManyToMany(fetch = FetchType.EAGER, cascade=CascadeType.ALL)
        @JoinTable(
            name="user_roles",
            joinColumns = {@JoinColumn(name="user_id",referencedColumnName="ID")},
            inverseJoinColumns = {@JoinColumn(name="role_id",referencedColumnName="ID")}
        )
        private List<Role> roles=new ArrayList<>();

}

