package kernel360.ckt.admin.ui.dto.request;

import kernel360.ckt.admin.application.command.CreateCustomerCommand;

public record CustomerCreateRequest(
    String customerName,
    String phoneNumber,
    String licenseNumber,
    String zipCode,
    String address,
    String detailedAddress,
    String birthday,
    String memo
){

    // CustomerRequest -> CreateCustomerCommand
    public CreateCustomerCommand toCommand() {
        return new CreateCustomerCommand(
            customerName,
            phoneNumber,
            licenseNumber,
            zipCode,
            address,
            detailedAddress,
            birthday,
            memo
        );
    }
}
