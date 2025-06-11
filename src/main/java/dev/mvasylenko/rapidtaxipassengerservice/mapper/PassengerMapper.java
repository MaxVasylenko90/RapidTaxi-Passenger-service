package dev.mvasylenko.rapidtaxipassengerservice.mapper;

import dev.mvasylenko.rapidtaxipassengerservice.dto.PassengerDto;
import dev.mvasylenko.rapidtaxipassengerservice.model.Passenger;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PassengerMapper {
    PassengerMapper INSTANCE = Mappers.getMapper(PassengerMapper.class);

    Passenger passengerDtoToPassenger(PassengerDto dto);
    PassengerDto passengerToPassengerDto(Passenger passenger);
}
