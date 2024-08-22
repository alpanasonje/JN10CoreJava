package com.tns.daynine;

public class StringFunctions {

	public static void main(String[] args) {
		String s="Java Programming";
		System.out.println(s);
		System.out.println(s.charAt(6));
		System.out.println(s.length());
		//System.out.println(s.charAt(40)); RTE
		System.out.println(s.concat(" Training"));
		System.out.println(s.isEmpty());
		System.out.println(s.startsWith("Java"));
		System.out.println(s.endsWith("."));
		s=s.replace("Java", "DotNet");
		System.out.println(s);
		System.out.println(s.substring(6));
		System.out.println(s.substring(6,14));
		System.out.println(s.indexOf("a"));
		System.out.println(s.indexOf("z"));
		s="    Hello   ";
		System.out.println(s);
		System.out.println(s.length());
		s=s.trim();
		System.out.println(s);
		System.out.println(s.length());
		
		StringBuffer sb=new StringBuffer(s);
		System.out.println(sb.append("training"));
		System.out.println(sb.replace(1, 5, "aaaaaa"));
		System.out.println(sb.reverse());
		
	}

}
