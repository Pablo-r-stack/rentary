package BackEnd.Rentary.Properties.DTOs;

import BackEnd.Rentary.Common.Address;
import BackEnd.Rentary.Properties.Enums.TypeOfProperty;
import jakarta.validation.constraints.NotNull;

public record PropertyRequestDto(
        @NotNull(message = "Este campo es necesario.")
        Address address,
        @NotNull(message = "Este campo es necesario.")
        TypeOfProperty typeOfProperty,
        String observations,
        @NotNull(message = "Este campo es necesario.")
        Long ownerId
) {}
