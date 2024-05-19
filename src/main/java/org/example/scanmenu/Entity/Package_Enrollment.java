package org.example.scanmenu.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

public class Package_Enrollment {

    @Entity
    @Table(name = "package_enrollment")
    @Setter
    @Getter
    public class PackageEnrollment {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long packageEnrollmentId;

        @OneToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "package_id", referencedColumnName = "packageId", foreignKey = @ForeignKey(name = "fk_package"))
        private Package packageEntity;

        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "user_id", referencedColumnName = "userId", foreignKey = @ForeignKey(name = "fk_user"))
        private User user;

        @Column(name = "status", nullable = false)
        private String status;

        @Column(name = "discount")
        private Double discount;

        @Column(name = "expire_date")
        private LocalDate expireDate;

    }


}
