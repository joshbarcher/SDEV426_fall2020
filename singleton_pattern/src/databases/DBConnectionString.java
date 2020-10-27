package databases;

public class DBConnectionString
{
    private String path; //location of the db
    private String dbType;
    private String dbName; //db name
    private String username; //credentials
    private String password;

    //a single object
    private static DBConnectionString connection;

    //we can only construct this class within the class
    private DBConnectionString(String path, String dbType,
                               String dbName, String username,
                               String password)
    {
        this.path = path;
        this.dbType = dbType;
        this.dbName = dbName;
        this.username = username;
        this.password = password;
    }

    public static DBConnectionString getConnection()
    {
        //lazy init version...
        if (connection == null)
        {
             connection = new DBConnectionString(
                "localhost", "mysql", "products",
                 "user1", "password"
            );
        }

        return connection;
    }

    @Override
    public String toString()
    {
        return "DBConnectionString{" +
                "path='" + path + '\'' +
                ", dbType='" + dbType + '\'' +
                ", dbName='" + dbName + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
