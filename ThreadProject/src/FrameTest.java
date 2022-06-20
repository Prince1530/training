import javax.swing.JFrame;
import javax.swing.JTextField;

public class FrameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        MyFrame mf =new MyFrame(300,200,100,100,"Frame");
        mf.setVisible(true);
	}

}
class MyFrame extends JFrame implements Runnable{
	JTextField jt= new JTextField(25);
	String title;
	MyFrame(int w,int h,int x,int y,String title) {

		super.setLocation(x,y);
		super.setTitle(title);
		super.setSize(w,h);
		super.setVisible(true);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		super.add(jt);
	}
		public void run() {
			for(int i=1; i<=100000;i++) {
				jt.setText(title+"is runing");
			}
		}
		
	}
	
