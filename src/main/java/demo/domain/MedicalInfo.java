package demo.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Embeddable;

/**
 * Created by vagrant on 4/4/17.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Embeddable
@Data
@RequiredArgsConstructor
public class MedicalInfo {
    //Required Args Constructor
    private long bfr;

    private long fmi;

    public MedicalInfo(long bfr, long fmi) {
        this.bfr = bfr;
        this.fmi = fmi;
    }
}
