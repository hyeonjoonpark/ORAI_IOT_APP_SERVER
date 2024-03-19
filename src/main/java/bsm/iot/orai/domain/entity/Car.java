package bsm.iot.orai.domain.entity;

import bsm.iot.orai.domain.types.CarType;
import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Car {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "car_id")
  private Long id;
  @Max(9999)
  @Min(1111)
  private int carNumber; // 차 뒷 네자리
  @Column(name = "car_type")
  private CarType types;
}
