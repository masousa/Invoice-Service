package br.ada.invoiceService.payload.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.math.BigDecimal;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PackageResponse {
  private String packageId;
  private BigDecimal packageValue;
  private BigDecimal dealValue;
// recebe do pacote
}