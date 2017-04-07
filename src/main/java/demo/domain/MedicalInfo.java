package demo.domain;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Embeddable;

/**
 * Created by vagrant on 4/4/17.
 */
@Embeddable
@Data
@RequiredArgsConstructor
public class MedicalInfo {
    //Required Args Constructor
    private final long bfr;

    private final long fmi;

}
