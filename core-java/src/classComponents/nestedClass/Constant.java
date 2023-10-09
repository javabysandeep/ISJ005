package classComponents.nestedClass;

public class Constant {
    static class MySql {
        static class Development {
            public static final String USER_NAME = "Admin_Dev";
            public static final String PASSWORD = "Admin@123";
        }

        static class Test {
            public static final String USER_NAME = "Admin_Test";
            public static final String PASSWORD = "Admin@123";
        }

        static class Prod {
            public static final String USER_NAME = "Admin_Prod";
            public static final String PASSWORD = "Admin@123";
        }
    }

}
