package de.htwb.utils;

public class Config {

	 /*
        required database settings with examples
     */

//    public static final String DB_USER = "postgres";
//    public static final String DB_PASS = "password123";
//    public static final String DB_NAME = "postgres";
//    public static final String DB_HOST = "localhost";
//
//    public static final String SCHEME_TEMP = "temp";
//    public static final String SCHEME_TEST = "test";
//    public static final String SCHEME_CACHE = "importedCache";
//    public static final String SCHEME_PRODUKTIVE = "ohdm";

    public static final String DB_USER = "";
    public static final String DB_PASS = "";
    public static final String DB_NAME = "";
    public static final String DB_HOST = "";

    public static final String SCHEME_TEMP = "";
    public static final String SCHEME_TEST = "";
    public static final String SCHEME_CACHE = "";
    public static final String SCHEME_PRODUKTIVE = "";

    /*
        required Postgres application settings with examples
     */

    // for macOS
    public static final String SHP_TO_PGSQL_FILE_PATH = "/Applications/Postgres.app/Contents/Versions/12/bin/shp2pgsql";
    public static final String PGSQL_FILE_PATH = "/Applications/Postgres.app/Contents/Versions/12/bin/psql";

    // for Windows
    //public static final String SHP_TO_PGSQL_FILE_PATH = "C:\\Program Files\\PostgreSQL\\12\\bin\\shp2pgsql.exe";
    //public static final String PGSQL_FILE_PATH = "C:\\Program Files\\PostgreSQL\\12\\bin\\psql.exe";

}
