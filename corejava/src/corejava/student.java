package corejava;

class studentdata{
	int sid;
	String sname;
	String dept;
	int marks;
	
	public void displayprofile() {
		System.out.println(sid+"\n"+sname+"\n"+dept+"\n"+marks);
	}
}
public class student {

	public static void main(String[] args) {
		studentdata Gowtham=new studentdata();
		studentdata ram=new studentdata();
		
		
		Gowtham.sid=102;
		Gowtham.sname= "GowthamJaisankar";
		Gowtham.dept= "ECE";
		Gowtham.marks=100;
		
		ram.sid=103;
		ram.sname="ram kumar";
		ram.dept="E&I";
		ram.marks=99;
		
		Gowtham.displayprofile();
		ram.displayprofile();

	}

}


