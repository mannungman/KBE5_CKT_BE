package kernel360.ckt.collector.application.repository;

import java.util.Optional;
import kernel360.ckt.core.domain.entity.DrivingLogEntity;
import kernel360.ckt.core.domain.entity.RouteEntity;
import kernel360.ckt.core.domain.enums.RouteStatus;

public interface RouteRepository {
    RouteEntity save(RouteEntity route);
    Optional<RouteEntity> findFirstByDrivingLogAndStatusOrderByStartAtDesc(DrivingLogEntity drivingLog, RouteStatus routeStatus);
}
