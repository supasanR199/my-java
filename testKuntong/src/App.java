public class App {
    public static void main(String[] args) throws Exception {
        Kuntong a = new Kuntong("BOP");
        System.out.println(a.name);
        Kuntong b = new Kuntong("DOP");
        System.out.println(b.name);
        Kuntong c   =   a.fuckWithKuntong(b);
        System.out.println(c.name);
        c.eat(300);
        System.out.println(c.weightEat);
        int x = 1;	
		do {
			if(x%2==0){
				System.out.println(x+" is even number");
		             }
			x++;
		} while (x<=10);
        System.out.println("Countdown");
		for( int j=5 ; j > 0 ; j-- ){
			System.out.println(j);
		}
	    System.out.println("End");

        testJava aJava  =   new testJava();
        aJava.printloop(10);
        float y=3+5*6/3; 
        System.out.println(y);

    }
    
}
