package demo.rest;

import demo.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by vagrant on 4/6/17.
 */
@RestController
public class RunningBulkUploadController {

    @Autowired
    private LocationService locationService;



}
