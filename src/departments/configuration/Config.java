package departments.configuration;

import java.math.BigDecimal;

public class Config {

	public static final BigDecimal MANAGER_ALLOCATION = BigDecimal.valueOf(600);
	public static final BigDecimal DEVELOPER_ALLOCATION = BigDecimal.valueOf(2000);
	public static final BigDecimal QATESTER_ALLOCATION = BigDecimal.valueOf(1000);

	public static final int ACCOUNTING = 1;
	public static final int MARKETING = 2;
	

	public static final String DEV = "Developer";
	public static final String MGR = "Manager";
	public static final String QA = "QA Tester";

}

// This provides one central location to assign salary allocations for different roles