package org.example.scanmenu.Entity;


import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "package")
@Setter
@Getter
public class Package{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long packageId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", referencedColumnName = "userId", foreignKey = @ForeignKey(name = "fk_user"))
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id", referencedColumnName = "productId", foreignKey = @ForeignKey(name = "fk_product"))
    private Product product;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "banner_id", referencedColumnName = "bannerId", foreignKey = @ForeignKey(name = "fk_banner"))
    private Banner banner;

    @Column(name = "home_delivery")
    private boolean homeDelivery;

    @Column(name = "price")
    private double price;

}

