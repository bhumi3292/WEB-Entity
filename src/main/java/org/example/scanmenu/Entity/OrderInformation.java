package org.example.scanmenu.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "order_information")
@Setter
@Getter
public class OrderInformation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderInfoId;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id", referencedColumnName = "orderId", foreignKey = @ForeignKey(name = "fk_order"))
    private Order order;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "visitor_id", referencedColumnName = "visitorID", foreignKey = @ForeignKey(name = "fk_visitor"))
    private Visitor visitor;
}
