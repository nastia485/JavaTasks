package com.company;

import java.time.LocalDate;

public interface DriverLicense {
    Driver.LicenseCategory category();
    LocalDate expirationDate();
}
