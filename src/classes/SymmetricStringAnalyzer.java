package classes;

public class SymmetricStringAnalyzer {
	private String s; 
	public SymmetricStringAnalyzer(String s) {
		this.s = s; 
	}
	
	/**
	 * Determines if the string s is symmetric
	 * @return true if it is; false, otherwise. 
	 */
	public boolean isValidContent() { 
		// ADD MISSING CODE
		//nota que esta variable es de tipo SLLStack cuando deberia ser LLStack 
		//esto no es posible debido a la falta de una clase  de tipo  LLStack
		SLLStack<Character> stack = new SLLStack<>();
		if((s.length()%2)!=0) return false;
		for(int i=0; i<s.length();i++) {
			char c = s.charAt(i);
			if(Character.isLetter(c))
				if(Character.isUpperCase(c))
					stack.push(c);
				else if(stack.isEmpty())
					return false;
				else {
					char t = stack.top();
					 if(t==Character.toUpperCase(c))
						stack.pop();
					else return false;
				}
			else return false;
		}
			return true;  // need to change if necessary....
	}
	
	public String toString() { 
		return s; 
	}

	public String parenthesizedExpression() 
	throws StringIsNotSymmetricException 
	{
		// ADD MISSING CODE
		if(!this.isValidContent()) throw new StringIsNotSymmetricException("");
		String l = "";
		for(int i=0; i<s.length();i++) {
			char c = s.charAt(i);
			if(Character.isUpperCase(c)) {
				l+="<"+ c;
			}
			else l+= c + ">";
		}
		return l;  // need to change if necessary....
	}

}
