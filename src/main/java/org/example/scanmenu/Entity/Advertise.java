package org.example.scanmenu.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "advertise")
@Setter
@Getter
public class Advertise {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long advertiseId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", referencedColumnName = "userId", nullable = false)
    private User user;

    @Column(name = "photo")
    private String photo;

    @Column(name = "position", nullable = false)
    private String position;

    @Column(name = "status", nullable = false)
    private String status;
}
