package project1;

public class StringConvertion{
	public static void main(String[] args) {
String s1="hello";
StringBuffer sbr=new StringBuffer(s1);
sbr.reverse();
System.out.println(sbr);
StringBuilder sbl=new StringBuilder(s1);
sbl.append(" world");
System.out.println(sbl);

	}
}
