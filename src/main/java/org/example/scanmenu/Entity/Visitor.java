package org.example.scanmenu.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name="Visitor")
@Setter
@Getter
public class Visitor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long VisitorID;

    @Column (name = "name", nullable = false)
    private String name;

    @Column(name = "contact")
    private String contact;

    @Column(name = "address")
    private String address;


    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn(name = "table_id", referencedColumnName = "tableId", foreignKey = @ForeignKey(name = "fk_table"))
    private TableDetails table;

    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn(name = "user_id", referencedColumnName = "userId", foreignKey = @ForeignKey(name = "fk_user"))
    private User user;

}
