package com.example.Student._Libraray_mangement.RequestDto;

import com.example.Student._Libraray_mangement.Enums.CardStatus;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

public class CardrequestDto {
    @Column(name="createddate")
    @CreationTimestamp //when card gets created it will add the time automatically from the system

    private Date Createdate;
    @UpdateTimestamp //when card gets created it will add the time automatically from the system
    private Date updatedate;


    private CardStatus cardstatus; // it contain only fixed values - Active Deactive Blocked Expired


}
