public static int NoOfVowels( String str) {
		
		int fromIndex=0;
		int count=0;
		int index=str.indexOf(' ', fromIndex);
		Set<Character> set=new HashSet<Character>();
		set.add('A');set.add('E');set.add('I');set.add('O');set.add('U');
		
		while(index!=-1)
		{
			char c= str.charAt((int)Math.ceil((index-1+fromIndex)/2));
			if(c>=97 && c<=122)
				c=(char)((int)c-32);
			if(set.contains(c))
				count++;
			fromIndex=index+1;
			index=str.indexOf(' ', fromIndex);
			
		}
		
		char c= str.charAt((int)Math.ceil((str.length()-1+fromIndex)/2));
		if(c>=97 && c<=122)
			c=(char)((int)c-32);
		if(set.contains(c))
			count++;
		return count;
	}
