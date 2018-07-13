import java.util.*;


class SynonymDictionary {
	private HashMap<String,ArrayList<String>> dictionary;
	
	public SynonymDictionary(){
		dictionary = new HashMap<>();
	}
	
	public void addSynonyms(String word, String[] synonyms){
		
		if(!dictionary.containsKey(word)){
			ArrayList<String> synonymList = new ArrayList<>(Arrays.asList(synonyms));
			dictionary.put(word,synonymList);
		} else {
			ArrayList<String> temp = dictionary.get(word);
			for(String synonym : synonyms) {
				temp.add(synonym);
			}
		}
		
	}
	
	public void addSynonym(String word, String synonym){
		if(!dictionary.containsKey(word)){
			ArrayList<String> synonymList = new ArrayList<>();
			synonymList.add(synonym);
			dictionary.put(word,synonymList);
		} else {
			dictionary.get(word).add(synonym);
		}
	}
	
	public String toString() {
		String str = "";
		
		for(String word:dictionary.keySet()) {
			str += word + " -> ";
			for(String synonym:dictionary.get(word)){
				str += synonym + " ";
			}
			str += "\n";
		}
		
		return str;
	}
}