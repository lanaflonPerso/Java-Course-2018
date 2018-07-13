class SynonymDictionaryTest {
	
	public static void main(String [] args) {
		
		SynonymDictionary dict = new SynonymDictionary();
		dict.addSynonyms("programa",new String[]{"razpisanie","plan","sistema","platforma","predstavlenie","spektakal"});
		dict.addSynonyms("zadacha",new String[]{"problem","zagadka","komandirovka","proekt","interes"});
		dict.addSynonyms("kolekciq",new String[]{"sbirka","podbor","galeriq","muzei"});
		dict.addSynonyms("kolega",new String[]{"drugar","sauchenik","sabrat","sauchastnik"});
		dict.addSynonyms("uchilishte",new String[]{"shkola","uchebno zavedenie","kolej","tehnikum"});
		
		System.out.println(dict);
		
		dict.addSynonym("programa","*softuer*");
		
		System.out.println(dict);
		
	}
	
	
}