package test.graphic;

public class GraphicApplication {

	public static void main(String[] args) {

		//A 그래픽카드를 사용하는 경우
		Graphic_A g1 = new Graphic_A();
		g1.brightness_A(100);
		g1.contrast_A(50.0);
		g1.display_A();
		
		Graphic_B g2= new Graphic_B();
		g2.brightness_B(100);
		g2.contrast_B(50.0);
		g2.display_B();
	}

}
