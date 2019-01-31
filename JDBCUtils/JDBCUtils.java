public class JDBCUtils {
public static final StringDRIVER_CLASS_NAME ="com.mysql.jdbc.Driver";
public static final StringURL =
"jdbc:mysql://localhost:3306/gjp";
public static final StringUSERNAME =
"root";
public static final StringPASSWORD =
"root";

private static BasicDataSourcedataSource =
new BasicDataSource();
static {
dataSource.setDriverClassName(DRIVER_CLASS_NAME);
dataSource.setUrl(URL);
dataSource.setUsername(USERNAME);
dataSource.setPassword(PASSWORD);
}

public static DataSource getDataSource() {
return dataSource;
}
}
