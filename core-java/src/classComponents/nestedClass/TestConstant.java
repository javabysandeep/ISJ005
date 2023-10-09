package classComponents.nestedClass;

public class TestConstant {
    public static void main(String[] args) {
        System.out.println("Mysql Dev database credentials");
        System.out.println("Username " + Constant.MySql.Development.USER_NAME);
        System.out.println("Password " + Constant.MySql.Development.PASSWORD);

        System.out.println("Mysql Test database credentials");
        System.out.println("Username " + Constant.MySql.Test.USER_NAME);
        System.out.println("Password " + Constant.MySql.Test.PASSWORD);

        System.out.println("Mysql Dev database credentials");
        System.out.println("Username " + Constant.MySql.Prod.USER_NAME);
        System.out.println("Password " + Constant.MySql.Prod.PASSWORD);
    }
}
