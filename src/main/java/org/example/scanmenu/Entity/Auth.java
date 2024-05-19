package org.example.scanmenu.Entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "auth")
@Setter
@Getter

public class Auth {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long authId;

        @OneToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "user_id", referencedColumnName = "userId", foreignKey = @ForeignKey(name = "fk_user"))
        private User user;

        @Column(name = "password", nullable = false)
        private String password;

        @Column(name = "rt_token")
        private String rtToken;

}
