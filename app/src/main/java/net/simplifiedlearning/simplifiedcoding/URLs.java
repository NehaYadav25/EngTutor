package net.simplifiedlearning.simplifiedcoding;


public class URLs {

    private static final String ROOT_URL = "http://192.168.43.77/Api.php?apicall=";
    //change this IP with your localhost's IP.
    //Also, place Api.php file directly inside www folder of the server installation.
    //private static final String ROOT_URL = "localhost/androidproj/Api.php?apicall=";

    public static final String URL_REGISTER = ROOT_URL + "signup";
    public static final String URL_LOGIN= ROOT_URL + "login";

}
