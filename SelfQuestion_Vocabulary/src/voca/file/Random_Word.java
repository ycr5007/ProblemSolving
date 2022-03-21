package voca.file;

public class Random_Word implements File_Interface{
	
	public Word RandomWord() {
		Word Question = null;
		int sizeOfVoca = voca.size();
		int wordIndex = (int)(Math.random() * sizeOfVoca);
		Question = voca.get(wordIndex);
		return Question;
	}
	
	public void MeanQuestion() {
		Word Question = RandomWord();
		System.out.print(Question.getWord() + " : ");
		String Mean = sc.next();
		if(Mean.equals(Question.getMean())) {
			System.out.println("correct answer");
		}else {
			System.out.println("Wrong...");
			System.out.println("Answer : " + Question.getMean());
		}
	}
	
	public void WordQuestion() {
		Word Question = RandomWord();
		System.out.print(Question.getMean() + " : ");
		String Word = sc.next();
		if(Word.equals(Question.getWord())) {
			System.out.println("correct answer");
		}else {
			System.out.println("Wrong...");
			System.out.println("Answer : " + Question.getWord());
		}
	}
}
