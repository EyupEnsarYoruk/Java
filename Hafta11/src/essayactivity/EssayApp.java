package essayactivity;

public class EssayApp {

	public static void main(String[] args) {
		
		Essay termPaper= new Essay();
		
		termPaper.setScore(25.0, 18.0, 20.0, 25.0);
		
		System.out.println("Dönem Ödevi: ");
		System.out.println("Gramer Puaný: "+termPaper.getGrammer());
		System.out.println("Heceleme Puaný: "+termPaper.getSpelling());
		System.out.println("Doðru yazým uzunluk Puaný: "+ termPaper.getCorrectLength());
		System.out.println("Ýçerik Puaný: "+termPaper.getContent());
		System.out.println("Toplam Puan: "+termPaper.getScore());
		System.out.println("Harfli Baþarý Not:"+termPaper.getGrade());
	
	}
}
