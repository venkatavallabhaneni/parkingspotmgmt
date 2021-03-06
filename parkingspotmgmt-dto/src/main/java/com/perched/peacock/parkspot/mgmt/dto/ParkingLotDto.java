package com.perched.peacock.parkspot.mgmt.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(description = "A Parking Lot or an multi level parking premises")
public class ParkingLotDto implements Serializable {


    @ApiModelProperty(notes = "A lot ID", example = "1234")
    private Long id;

    @ApiModelProperty(notes = "Lot name or parking place name", example = "VOYAGER")
    private String name;


}
