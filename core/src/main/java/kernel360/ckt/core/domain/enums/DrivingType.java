package kernel360.ckt.core.domain.enums;

import lombok.Getter;

@Getter
public enum DrivingType {
    FOR_BUSINESS_USE("업무용"),
    FOR_COMMUTING("출퇴근용"),
    NOT_REGISTERED("미등록")
    ;

    private final String value;

    DrivingType(String value) {
        this.value = value;
    }
}
