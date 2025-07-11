package kernel360.ckt.admin.ui;

import kernel360.ckt.admin.ui.dto.response.ControlTowerSummaryResponse;
import kernel360.ckt.admin.application.VehicleService;
import kernel360.ckt.admin.ui.dto.response.GpsPointResponse;
import kernel360.ckt.admin.ui.dto.response.RunningVehicleResponse;
import kernel360.ckt.core.common.response.CommonResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/api/v1/tracking")
@RestController
public class VehicleControlTowerController {

    private final VehicleService vehicleService;

    @GetMapping("/status")
    public CommonResponse<ControlTowerSummaryResponse> getControlTowerSummary() {
        return CommonResponse.success(vehicleService.getControlTowerSummary());
    }

    @GetMapping("/vehicles/location")
    public CommonResponse<List<RunningVehicleResponse>> getVehicleLocations() {
        return CommonResponse.success(vehicleService.getVehicleLocations());
    }

}
