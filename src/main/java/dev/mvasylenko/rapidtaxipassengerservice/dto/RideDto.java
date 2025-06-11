package dev.mvasylenko.rapidtaxipassengerservice.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;

import java.math.BigDecimal;
import java.util.Date;

public class RideDto {
    @NotNull
    private Long driverId;

    @NotNull
    private Long passengerId;

    @NotNull
    private Long pickupAddressId;

    @NotNull
    private Long dropOffAddressId;

    @PositiveOrZero
    private double distance;

    @PositiveOrZero
    private BigDecimal cost;

    @NotNull
    private Date date;

    public RideDto(Long driverId, Long passengerId, Long pickupAddressId, Long dropOffAddressId,
                   double distance, BigDecimal cost, Date date) {
        this.driverId = driverId;
        this.passengerId = passengerId;
        this.pickupAddressId = pickupAddressId;
        this.dropOffAddressId = dropOffAddressId;
        this.distance = distance;
        this.cost = cost;
        this.date = date;
    }

    public Long getDriverId() {
        return driverId;
    }

    public Long getPassengerId() {
        return passengerId;
    }

    public Long getPickupAddressId() {
        return pickupAddressId;
    }

    public Long getDropOffAddressId() {
        return dropOffAddressId;
    }

    public double getDistance() {
        return distance;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public Date getDate() {
        return date;
    }
}
