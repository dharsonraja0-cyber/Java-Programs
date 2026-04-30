class string {
    public static void main (String[] args) {


    String s = "    Dharson-ECE";
    String s1= new String(" Dhanaraj ");
    System.out.println(s);
    System.out.println(s1);
    System.out.println(s.length());
    System.out.println(s1.isBlank());
    System.out.println(s1.isEmpty());
    System.out.println(s.contains("ECE"));
    System.out.println(s.substring(8,11));
    System.out.println(s1.indexOf('a'));
    System.out.println(s1.lastIndexOf('j'));
    System.out.println(s.toUpperCase());
    System.out.println(s.toLowerCase());
    System.out.println(s.trim());
    s=s.trim();
    System.out.println(s);
    System.out.println(s1.strip());
    System.out.println(s1.repeat(3));
    System.out.println(s.compareTo(s1));

    
}
}