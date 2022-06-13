public class Var{
	public static void main(String[] args){
		HspMethod hm = new HspMethod();
		
		System.out.println(hm.showScores("milan",90.1,100,95,95.5,99.5));
	}
}

class HspMethod{

	public String showScores(String name , double... scorces){
		double totalscores = 0;
		for(int i = 0 ; i < scorces.length; i++){
			totalscores += scorces[i];
		}
		return name + "有" +scorces.length + "门课总分为" +totalscores;
	}
}