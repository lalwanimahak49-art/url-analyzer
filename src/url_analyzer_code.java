package pr1;
import java.util.Scanner;

class UrlAnalyzerCode {

    public static void main(String[] args)
    {
        Scanner Input = new Scanner(System.in);
        String url = null;
        System.out.println("Enter the website url:");
        url = Input.nextLine();

        int pname;

        pname = url.indexOf(":");
        String protocol = url.substring(0, pname);

        if (protocol.equals("http"))
        {
            System.out.println("Hyper text markup protocol");
        }
        else if (protocol.equals("ftp"))
        {
            System.out.println("File transfer protocol");
        }
        else if (protocol.equals("smtp"))
        {
            System.out.println("Simple mail transfer protocol");
        }
        else {
            System.out.println("Unknown Protocol");
        }

        int lastIndex= url.lastIndexOf(".");
        String Ename = url.substring(lastIndex+1,url.length());
        System.out.println(Ename);

        if (Ename.equals("com"))
        {
            System.out.println("Commercial Website");
        }
        else if (Ename.equals("org"))
        {
            System.out.println("Organization Website");
        }

        int sPoint =url.indexOf('.')+1;
        int ePoint =url.lastIndexOf('.');
        String domain = url.substring(sPoint, ePoint);

        System.out.println("String Domin is:" +domain);
    }
}
